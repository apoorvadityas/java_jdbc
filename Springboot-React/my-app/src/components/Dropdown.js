import React, {useState,useEffect} from "react";
import { Link, useHistory, useParams } from "react-router-dom";
import DepartmentService from '../services/Department.service';

const Dropdown = () => {
    
    const[department, setDepartment] = useState([]);
    const history = useHistory();
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
      return (  
        <div className="form-group">
          <label><b>Department:</b> </label> &nbsp;&nbsp;
        <select >
                    <option selected>Please select</option>
          
               {
                    department.map((Dept) => (
                        <option value={Dept.deptid}>{Dept.dept}</option>
                    ))}

          </select>
          </div>)
                    
        
          
               
                   
}
export default Dropdown;
