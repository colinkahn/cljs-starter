var Server = require('frontend-dev-server');
var server = new Server({
  root: ['./resources/public'],
  port: 8081,
  proxy: {
    '/api/': 'https://localhost:3000',
  },
});

server.start();
