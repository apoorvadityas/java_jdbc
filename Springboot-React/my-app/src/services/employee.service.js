import httpClient from "../http-common";

const getAll = () => {
    return httpClient.get('/');
}

const create = data => {
    return httpClient.post("/employees", data);
}

const get = id => {
    return httpClient.get(`/employees/${id}`);
}

const update = data => {
    return httpClient.put('/employees', data);
}

const remove = id => {
    return httpClient.delete(`/employees/${id}`);
}

const gets = () => {
    return httpClient.get('/department');
}


export default { getAll, create, get, update, remove ,gets};