import { useState } from "react";
import { Link, useHistory, useParams } from "react-router-dom";
import { useEffect } from "react/cjs/react.development";
import employeeService from "../services/employee.service";
import DepartmentService from '../services/Department.service';


const AddEmployee = () => {
    const[name, setName] = useState('');
    const[gender, setGender] = useState('');
    const[dept, setDept] = useState('');
    const[desig, setDesig] = useState('');
    const[basic, setBasic] = useState('');
    const history = useHistory();

    const {id} = useParams();
    
    const saveEmployee = (e) => {
        e.preventDefault();
        
        const employee = {name, gender, dept,desig,basic, id};
       
        
        
        if (id) {
            //update
            employeeService.update(employee)
                .then(response => {
                    console.log('Employee data updated successfully', response.data);
                    history.push('/');
                })
                .catch(error => {
                    console.log('Something went wrong', error);
                }) 
        } else {
            //create
            employeeService.create(employee)
            .then(response => {
                console.log("employee added successfully", response.data);
                history.push("/");
            })
            .catch(error => {
                console.log('something went wrong', error);
            })
        }
    }
    
    
        const[department, setDepartment] = useState([]);
        
        const init = () => {
            DepartmentService.getAll()
              .then(response => {
                console.log('Printing department data in dropdown list', response.data);
                setDepartment(response.data);
              })
              .catch(error => {
                console.log('Something went wrong', error);
              }) 
          }
          useEffect(() => {
            init();
          }, []);
    useEffect(() => {
        if (id) {
            
            employeeService.get(id)
                .then(employee => {
                    setName(employee.data.name);
                    setGender(employee.data.gender);
                    setDept(employee.data.dept);
                    setDesig(employee.data.desig);
                    setBasic(employee.data.basic);
                    
                })
                .catch(error => {
                    console.log('Something went wrong', error);
                })
        }
    }, [])

    return(
        <div className="container">
            <h3>Add Employee</h3>
            <hr/>
            <form>
                <div className="form-group">
                <label><b>Name : </b>  </label> &nbsp;&nbsp; <input 
                        type="text" 
                        className="form-control col-4"
                        id="name"
                        value={name}
                        onChange={(e) => setName(e.target.value)}
                        
                    />

                </div>
                <div className="form-group"  onChange={(e) => setGender(e.target.value)}>
                   <label><b>Gender : </b> </label> &nbsp;&nbsp;
                    
                    <input type="radio" value="MALE" name="gender"  id="gender" /> Male &nbsp; &nbsp; &nbsp;
                    <input type="radio" value="FEMALE" name="gender"  id="gender" /> Female
                   
                </div>
                
                
                     
                
                <div className="form-group"  >
                <label><b>Department:</b> </label> &nbsp;&nbsp;
                 <select  onChange={(e) => setDept(e.target.value)}>
                    <option defaultValue>Please select</option>
          
             
                    {
                    department.map((Dept) => (
                        <option value={Dept.dept}>{Dept.dept}</option>
                    ))}

          </select>
          </div>
                    
                    
               
                
                <div className="form-group">
                    <input 
                        type="text" 
                        className="form-control col-4"
                        id="desig"
                        value={desig}
                        onChange={(e) => setDesig(e.target.value)}
                        placeholder="Enter Designation"
                    />

                </div>
                <div className="form-group">
                    <input 
                        type="text" 
                        className="form-control col-4"
                        id="basic"
                        value={basic}
                        onChange={(e) => setBasic(e.target.value)}
                        placeholder="Enter Basic"
                    />
                    </div>
                <div >
                    <button onClick={(e) => saveEmployee(e)} className="btn btn-primary">Save</button>
                </div>
            </form>
            <hr/>
            <Link to="/">Back to List</Link>
        </div>
    )
                
}

export default AddEmployee;