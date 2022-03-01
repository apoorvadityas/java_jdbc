import React from "react";


const ReadOnlyRow = ({ manager, handleEditClick, handleDeleteClick }) => {
  return (
    <tr>
     <td>Manager Name</td>
     <td>Employee ID</td>
     <td>Employee Name</td>
     <td>Manager Gender</td>
     <td>Manager Department</td>
      <td>
        <button
          type="button"
          onClick={(event) => handleEditClick(event, manager)}
        >
          Edit
        </button>
        <button type="button" onClick={() => handleDeleteClick(manager.mgrid)}>
          Delete
        </button>
      </td>
    </tr>
  );
};

export default ReadOnlyRow;