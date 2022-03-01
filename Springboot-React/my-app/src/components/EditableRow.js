import React from "react";

const EditableRow = ({
  editFormData,
  handleEditFormChange,
  handleCancelClick,
}) => {
  return (
    <tr>
      <td>
         <input 
            type="text" 
            required="required"
           
            id="mgrname"
            value={editFormData.mgrname}
            onChange={handleEditFormChange}
            placeholder=">Manager Name"
            ></input>
      </td>
      <td>
        <input
          type="text"
          required="required"
         
          id="id"
          placeholder="Enter Employee ID."
          name="Employee ID"
          value={editFormData.id}
          onChange={handleEditFormChange}
        ></input>
      </td>
      <td>
        <input
          type="text"
          required="required"
          
          placeholder="Enter Employee Name"
          name="name"
          id="name"
          value={editFormData.name}
          onChange={handleEditFormChange}
        ></input>
      </td>
      <td>
        <input
          type="text"
          required="required"
          placeholder="Enter the Gender"
          name="gender"
          id="gender"
          value={editFormData.gender}
          onChange={handleEditFormChange}
        ></input>
      </td>
      <td>
        <input
          type="text"
          required="required"
          placeholder="Enter the Department"
          name="department"
          id="dept"
          value={editFormData.dept}
          onChange={handleEditFormChange}
        ></input>
      </td>
      <td>
        <button type="submit">Save</button>
        <button type="button" onClick={handleCancelClick}>
          Cancel
        </button>
      </td>
    </tr>
  );
};

export default EditableRow;