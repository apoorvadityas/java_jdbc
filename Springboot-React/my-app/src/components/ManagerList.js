import { useEffect, useState } from 'react';
import { nanoid } from "nanoid";
import ManagerService from '../services/Manager.service';


import { Link, useHistory, useParams } from "react-router-dom";


const ManagerList = () => {
    const [manager, setManager] = useState([]);
    const[mgrname, setMgrname] = useState('');
    const[id, setId] = useState('');
    const[name, setName] = useState('');
    const[gender, setGender] = useState('');
    const[dept, setDept] = useState('');
    const history = useHistory();
    const {mgrid} = useParams();
    const [addFormData, setAddFormData] = useState({
    mgrname: "",
    id: "",
    name: "",
    gender: "",
    dept:"",

  });
  


    const init = () => {
        ManagerService.getAll()
          .then(response => {
            console.log('Printing manager data', response.data);
            setManager(response.data);
          })
          .catch(error => {
            console.log('Something went wrong', error);
          }) 
      }
    
      useEffect(() => {
        init();
      }, []);
      const handleDelete = (id) => {
        console.log('Printing id', id);
        ManagerService.remove(id)
          .then(response => {
            console.log('employee deleted successfully', response.data);
            init();
          })
          .catch(error => {
            console.log('Something went wrong', error);
          })
      }
      const saveManager = (e) => {
        e.preventDefault();
        
        const manager = {mgrname,id,name, gender, dept, mgrid};
        ManagerService.create(manager)
            .then(response => {
                console.log("manager added successfully", response.data);
                history.push("/manager/");
            })
            .catch(error => {
                console.log('something went wrong', error);
            })
        }

  return (
    <div className="container">
  
      <h3>Managers List</h3>
      <hr/>
      
      <div>
        
        <table className="table table-bordered table-striped">
          <thead className="thead-dark">
            <tr>
              
              <th>Manager Name</th>
              <th>Employee ID</th>
              <th>Employee Name</th>
              <th>Manager Gender</th>
              <th>Manager Department</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody>
          {
              
            manager.map(mgr => (
              <tr key={mgr.mgrid}>
                <td>{mgr.mgrname}</td>
                <td>{mgr.id}</td>
                <td>{mgr.name}</td>
                <td>{mgr.gender}</td>
                <td>{mgr.dept}</td>
                <td>
                  <Link className="btn btn-info" to={`/manager/edit/${mgr.mgrid}`}>Update</Link>
                  
                  <button className="btn btn-danger ml-2" onClick={() => {
                    if(window.confirm('Are you sure?')){
                     handleDelete(mgr.mgrid);
                    }
                    
                  }}>Delete</button>
                </td>
              </tr>
            ))
            
          }
          
          </tbody>
        </table>
        
      </div>
      <h2>Add Manager</h2>
      
      <input 
            type="text" 
            required="required"
            name="mgrname"
            id="mgrname"
           onChange={(e) => setMgrname(e.target.value)}
            placeholder="Manager Name"
            ></input>
         &nbsp; &nbsp;
        <input
          type="text"
          required="required"
         
          id="id"
          placeholder="Enter Employee ID."
          name="id"
         
         onChange={(e) => setId(e.target.value)}
        
        >
        </input>
        &nbsp; &nbsp;
        <input
          type="text"
          required="required"
         
          placeholder="Enter Employee Name"
          name="name"
          id="name"
         
         onChange={(e) => setName(e.target.value)}
        ></input>
        &nbsp; &nbsp;
        <input
          type="text"
          required="required"
          placeholder="Enter the Gender"
          name="gender"
          id="gender"
          
         onChange={(e) => setGender(e.target.value)}
        ></input>
        &nbsp; &nbsp;
        <input
          type="text"
          required="required"
          placeholder="Enter the Department"
          name="department"
          id="dept"
          
         onChange={(e) => setDept(e.target.value)}
        ></input>
        &nbsp; &nbsp;
        <button onClick={(e) => saveManager(e)} className="btn btn-primary mb-2" >Add</button>
        <hr/>
            <Link to="/">Back to Employees</Link>
    </div>
  );
}

export default ManagerList;
