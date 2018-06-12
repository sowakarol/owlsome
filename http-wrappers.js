var request = require('request');

async function owlGet(url, config) {
    return new Promise((resolve, reject) => {
        const lib = url.startsWith('https') ? require('https') : require('http');
        const request = lib.get(url, (response) => {
            // handle http errors
            if (response.statusCode < 200 || response.statusCode > 299) {
                reject(new Error('Failed to load page, status code: ' + response.statusCode));
            }

            const body = []; // temporary data holder            
            response.on('data', (chunk) => body.push(chunk)); // on every content chunk, push it to the data array            
            response.on('end', () => resolve(body.join(''))); // we are done, resolve promise with those joined chunks
        });
        // handle connection errors of the request
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