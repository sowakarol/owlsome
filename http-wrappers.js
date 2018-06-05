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

module.exports = { owlGet: owlGet }