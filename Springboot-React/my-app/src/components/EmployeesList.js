import { useEffect, useState } from 'react';
import { Link, useHistory } from 'react-router-dom';
import employeeService from '../services/employee.service';

const EmployeeList = () => {

  const [employees, setEmployees] = useState([]);

  const init = () => {
    employeeService.getAll()
      .then(response => {
        console.log('Printing employees data', response.data);
        setEmployees(response.data);
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
    employeeService.remove(id)
      .then(response => {
        console.log('employee deleted successfully', response.data);
        init();
      })
      .catch(error => {
        console.log('Something went wrong', error);
      })
  }

  return (
    <div className="container">
      <h3>List of Employees</h3>
      <hr/>
      <div>
        <Link to="/add" className="btn btn-primary mb-2">Add Employee</Link>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;
        <Link to="/manager/" className="btn btn-primary mb-2">Manager List</Link>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;
        <Link to="/department" className="btn btn-primary mb-2">Department List</Link>
        <table className="table table-bordered table-striped">
          <thead className="thead-dark">
            <tr>
              
              <th>Name</th>
              <th>Gender</th>
              <th>Department</th>
              <th>Designation</th>
              <th>Basic</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody>
          {
            employees.map(employee => (
              <tr key={employee.id}>
                <td>{employee.name}</td>
                <td>{employee.gender}</td>
                <td>{employee.dept}</td>
                <td>{employee.desig}</td>
                <td>{employee.basic}</td>
                <td>
                  <Link className="btn btn-info" to={`/employees/edit/${employee.id}`}>Update</Link>
                  
                  <button className="btn btn-danger ml-2" onClick={() => {
                    if(window.confirm('Are you sure?')){
                      handleDelete(employee.id);
                    }
                    
                  }}>Delete</button>
                </td>
              </tr>
            ))
          }
          </tbody>
        </table>
        
      </div>
    </div>
  );
}

export default EmployeeList;
