import httpClient from "../http-common";

const getAll = () => {
    return httpClient.get('/department');
}

const create = data => {
    return httpClient.post("/department/add", data);
}

const get = id => {
    return httpClient.get(`/department/${id}`);
}

const remove = id => {
    return httpClient.delete(`/department/${id}`);
}

export default { getAll, create, get, remove };
