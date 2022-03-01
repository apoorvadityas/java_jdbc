import httpClient from "../http-common";

const getAll = () => {
    return httpClient.get('/manager/');
}

const create = data => {
    return httpClient.post("/manager/add", data);
}

const get = id => {
    return httpClient.get(`/manager/${id}`);
}

const update = data => {
    return httpClient.put('/manager/update', data);
}

const remove = id => {
    return httpClient.delete(`/manager/${id}`);
}



export default { getAll, create, get, update, remove };