import { BrowserRouter, Switch, Route } from 'react-router-dom';
import EmployeeList from './components/EmployeesList';
import ManagerList from './components/ManagerList';
import NotFound from './components/NotFound';
import 'bootstrap/dist/css/bootstrap.min.css';
import AddEmployee from './components/AddEmployee';
import DepartmentList from './components/DepartmentList';
import Dropdown from './components/Dropdown';

function App() {
  return (
    <BrowserRouter>
      <div>
        <div>
          <Switch>
            <Route exact path="/" component={EmployeeList} />
            <Route path="/add" component={AddEmployee} />
            <Route path="/employees/edit/:id" component={AddEmployee} />
            <Route path="/department" exact component={DepartmentList} />
            <Route path="/manager/" exact component={ManagerList} />
            <Route path="/dept" exact component={Dropdown} />
          </Switch>
        </div>
      </div>
    </BrowserRouter>
  );
}


export default App;
