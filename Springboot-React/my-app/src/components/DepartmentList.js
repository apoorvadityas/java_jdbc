import { useEffect, useState } from 'react';
import { Link, useHistory, useParams } from "react-router-dom";
import DepartmentService from '../services/Department.service';

const DepartmentList = () => {
    
    const[Department, setDepartment] = useState([]);
    const[dept, setDept] = useState('');
    const history = useHistory();
    const init = () => {
        DepartmentService.getAll()
          .then(response => {
            console.log('Printing department data', response.data);
            setDepartment(response.data);
          })
          .catch(error => {
            console.log('Something went wrong', error);
          }) 
      }
      useEffect(() => {
        init();
      }, []);

      const saveDept = (e) => {
        e.preventDefault();
        
        
        const department = { dept};
        DepartmentService.create(department)
            .then(response => {
                console.log("department added successfully", response.data);
                history.push("/department");
            })
            .catch(error => {
                console.log('something went wrong', error);
            })
        }
        const handleDelete = (deptid) => {
            console.log('Printing department id', deptid);
            DepartmentService.remove(deptid)
              .then(response => {
                console.log('department deleted successfully', response.data);
                init();
              })
              .catch(error => {
                console.log('Something went wrong', error);
              })
          }
        
        return (
            <div className="container">
              <h3>List od Departments</h3>
              <hr/>
              <div>
                <Link to="/department/add" className="btn btn-primary mb-2">Add Department</Link>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;
                <Link to="/" className="btn btn-primary mb-2">Employee List</Link>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;
                <Link to="/manager/" className="btn btn-primary mb-2">Manager List</Link>
                <table className="table table-bordered table-striped">
                  <thead className="thead-dark">
                    <tr>
                      
                      <th>Department ID</th>
                      <th>Department</th>
                      <th>Delete</th>
                    </tr>
                  </thead>
                  <tbody>
                  {
                    Department.map(Dept => (
                      <tr key={Dept.deptid}>
                        <td>{Dept.deptid}</td>
                        <td>{Dept.dept}</td>
                        <td>
                          <button className="btn btn-danger ml-2" onClick={() => {
                            if(window.confirm('Are you sure?')){
                              handleDelete(Dept.deptid);
                            }
                            
                          }}>Delete</button>
                        </td>
                      </tr>
                    ))
                  }
                  </tbody>
                </table>
                
              </div>
              <h2>Add Department</h2>
              <p></p>
              <p></p>
              <div className="form-group">
             <label><b>Department Name:</b></label>
             &nbsp; &nbsp; &nbsp; &nbsp;
             
      <input 
            type="text" 
            required="required"
            name="dept"
            id="dept"
           onChange={(e) => setDept(e.target.value)}
            
            ></input>
         &nbsp; &nbsp;
         <button onClick={(e) => saveDept(e)} className="btn btn-primary mb-2" >Add</button>
        <hr/>
            <Link to="/">Back to Employees</Link>
         </div>
       
            </div>
          );
        }
        
        export default DepartmentList;
        