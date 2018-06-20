var request = require('request');

async function owlGet(url, config) {
    return new Promise((resolve, reject) => {
        const lib = url.startsWith('https') ? require('https') : require('http');
        const request = lib.get(url, (response) => {
            if (response.statusCode < 200 || response.statusCode > 299) {
                reject(new Error('Failed to load page, status code: ' + response.statusCode));
            }

            const body = []; 
            response.on('data', (chunk) => body.push(chunk)); 
            response.on('end', () => resolve(body.join(''))); 
        });
        request.on('error', (err) => reject(err))
    })
}

async function owlPost(url, data) {
    return new Promise((resolve, reject) => {
        request({
            url: url,
            method: "POST",
            json: true,
            body: data
        }, function (error, response, body) {
            if (error) {
                reject(error);
            }
            resolve(body);
        });
    })
}

async function owlPut(url, data) {
    return new Promise((resolve, reject) => {
        request({
            url: url,
            method: "PUT",
            json: true,
            body: data
        }, function (error, response, body) {
            if (error) {
                reject(error);
            }
            resolve(body);
        });
    })
}

async function owlDelete(url) {
    return new Promise((resolve, reject) => {
        request({
            url: url,
            method: "DELETE"            
        }, function (error, response, body) {
            if (error) {
                reject(error);
            }
            resolve(body);
        });
    })
}

module.exports = { 
    owlGet: owlGet,
    owlPost: owlPost,
    owlPut: owlPut,
    owlDelete: owlDelete
 }