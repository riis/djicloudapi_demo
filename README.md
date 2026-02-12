# DJI Cloud API Demo

This project is a modified version of the Cloud API Demo that DJI once maintained. The backend and frontend projects have been combined and support for running the project using Docker Compose was added to simplify getting started while still maintaining the ability to customize the underlying code for the two projects as needed. The original projects re still available on GitHub and can be found the the corresponding links below.

Original DJI Projects:

- Frontend - [Cloud-API-Demo-Web](https://github.com/dji-sdk/Cloud-API-Demo-Web)
- Backend - [DJI-Cloud-API-Demo](https://github.com/dji-sdk/DJI-Cloud-API-Demo)

## Building with Docker Compose

Ensure that you have Docker and the corresponding Compose plugin installed properly on your system.

> NOTE: Depending on your setup, you may not be able to run docker commands under your user context which may require you to run the commands using `sudo` or through other means. This document is written with the assumption that your user is properly added to the necessary docker user group and is able to run docker commands directly.

### Configure the Environment

Most configuration values have been supplied with reasonable defaults for the purpose of this demo so that it should work out of the box with little necessary configuration. In order to work with the DJI Cloud API however, it is necessary to register a developer account and to create a new application license under that account to proceed. Once the license is generated, the corresponding values should be provided to Docker Compose by creating a new `.env` file in the root of this project with the three required values set.

Example .env file:

```dotenv
DJI_CLOUD_API_APP_ID=<App ID from developer website>
DJI_CLOUD_API_APP_KEY=<App Key from developer website>
DJI_CLOUD_API_APP_LICENSE=<App License from developer website>
```

### Starting Up the Demo

Once the prerequisites are met and the environment configuration is complete, you can start up the demo by running the following command to start up the demo using Docker Compose.

```shell
docker compose up
```

This will start up the frontend, backend, and dependency database services. Once everything is started up, open a browser and navigate to http://localhost:8080/ to access the frontend for the demo.
