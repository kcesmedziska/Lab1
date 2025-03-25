import axios from 'axios';

const API_URL = 'http://localhost:8080/api';  // Your Spring Boot backend URL

export const getAccommodations = async () => {
    return await axios.get(`${API_URL}/accommodations`);
};

export const createAccommodation = async (accommodationData) => {
    return await axios.post(`${API_URL}/accommodations`, accommodationData);
};

export const updateAccommodation = async (id, accommodationData) => {
    return await axios.put(`${API_URL}/accommodations/${id}`, accommodationData);
};

export const deleteAccommodation = async (id) => {
    return await axios.delete(`${API_URL}/accommodations/${id}`);
};

export const markAsRented = async (id) => {
    return await axios.put(`${API_URL}/accommodations/${id}/rent`);
};

export const getHosts = async () => {
    return await axios.get(`${API_URL}/hosts`);
};

export const createHost = async (hostData) => {
    return await axios.post(`${API_URL}/hosts`, hostData);
};