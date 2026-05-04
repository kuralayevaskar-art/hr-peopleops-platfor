# HR/PeopleOps Platform MVP

A production-ready HR/PeopleOps platform built with Spring Boot and Angular.

## Project Structure

- `backend/`: Java 21, Spring Boot 3.4+, Spring Security, JPA, Flyway, PostgreSQL.
- `frontend/`: Angular 18+, SCSS, Angular Material, RxJS.
- `docs/`: API, Database, and Roadmap documentation.
- `docker-compose.yml`: Local infrastructure (PostgreSQL).

## Prerequisites & Environment Verification

Before running the project, ensure your environment meets the following requirements:

- **Java 21**: `java -version` should show Java 21.
- **Node.js 20+**: `node -v` should show v20 or higher.
- **Docker**: `docker --version` must work.
- **Docker Compose**: `docker compose version` or `docker-compose --version` must work.

## Local Run

### 1. Start Database
```bash
docker-compose up -d
```
This starts PostgreSQL on `localhost:5432` with database `hr_peopleops`.

### 2. Run Backend
```bash
cd backend
./mvnw spring-boot:run
```
The API will be available at `http://localhost:8080/api/v1`.

### 3. Run Frontend
```bash
cd frontend
npm install
npm start
```
The application will be available at `http://localhost:4200`.

## Documentation
- [API Documentation](docs/api.md)
- [Database Schema](docs/database.md)
- [Project Roadmap](docs/roadmap.md)
- [Implementation Plan](IMPLEMENTATION_PLAN.md)
