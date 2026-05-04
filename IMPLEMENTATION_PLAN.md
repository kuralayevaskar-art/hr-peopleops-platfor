# HR/PeopleOps Platform MVP - Implementation Plan

This document outlines the strategy for building the HR/PeopleOps Platform MVP.

## Project Overview
A modular monolith HR platform providing essential PeopleOps features like employee management, departments, positions, and basic attendance tracking.

## Tech Stack
- **Frontend**: Angular 18+, Angular Material, SCSS, RxJS
- **Backend**: Java 21, Spring Boot 3.4+, Spring Security, Spring Data JPA
- **Database**: PostgreSQL 16+
- **Migrations**: Flyway
- **Local Run**: Docker Compose

## Phase 1: Foundation & Project Initialization (Status: COMPLETED)
Goal: Set up the repository structure and ensure both frontend and backend can start.

### 1. Repository Structure
- `hr-peopleops-platform/` (Root)
  - `frontend/` - Angular application
  - `backend/` - Spring Boot application
  - `docs/` - Documentation (API, DB, Roadmap)
  - `docker-compose.yml` - Infrastructure (PostgreSQL)
  - `README.md` - Getting started guide

### 2. Backend Initialization (Spring Boot)
- Dependencies: Web, JPA, Security, PostgreSQL, Flyway, Lombok, Validation.
- Configuration: Java 21, Maven.

### 3. Frontend Initialization (Angular)
- Framework: Angular 18+, SCSS, Angular Material.

### 4. Infrastructure
- `docker-compose.yml` with:
  - `postgres` (port 5432, container: hr_peopleops_postgres, db: hr_peopleops)

## Phase 1 Verification Results
- [x] **Monorepo Structure**: SUCCESS
- [x] **Frontend Build**: SUCCESS
- [ ] **Backend Compile**: BLOCKED_BY_ENVIRONMENT (Java 21 not found in local path)
- [ ] **Docker Compose**: BLOCKED_BY_ENVIRONMENT (Docker not found in local path)

---

## Phase 2: Backend Core (Status: SOURCE_READY)
Goal: Establish the core backend architecture and baseline entities.

### Phase 2 Checklist
- [x] Common API response wrapper: SUCCESS
- [x] Global exception handler: SUCCESS
- [x] Base JPA entity with auditing: SUCCESS
- [x] Core enums: SUCCESS
- [x] Core entities: SUCCESS
- [x] Repositories: SUCCESS
- [x] Flyway migrations (Init + Seed): SUCCESS
- [x] Basic health endpoint: SUCCESS
- [x] Update docs: SUCCESS
- [ ] Backend compile: BLOCKED_BY_ENVIRONMENT

## Phase 3: Auth & JWT (Status: SOURCE_READY)
Goal: Implement production-ready authentication foundation.

### Phase 3 Checklist
- [x] JWT dependencies in pom.xml: SUCCESS
- [x] Auth DTOs (Login, Refresh, Me): SUCCESS
- [x] RefreshToken entity & repository: SUCCESS
- [x] JwtService (Token generation/validation): SUCCESS
- [x] RefreshTokenService (Hashing & rotation): SUCCESS
- [x] AuthService (Login/Logout/Refresh logic): SUCCESS
- [x] SecurityConfig (Stateless, BCrypt, Filter): SUCCESS
- [x] JwtAuthenticationFilter: SUCCESS
- [x] AuthController (POST/GET endpoints): SUCCESS
- [x] Migration V6 (refresh_tokens table): SUCCESS
- [x] API docs updated: SUCCESS
- [ ] Backend compile: BLOCKED_BY_ENVIRONMENT

## Phase 4: Employee Management (Pending)
...
