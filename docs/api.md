# API Documentation

## Base URL
`http://localhost:8080/api/v1`

## Response Format

### Success Response
```json
{
  "success": true,
  "data": { ... },
  "message": "Optional success message",
  "timestamp": "2026-05-04T12:00:00"
}
```

### Error Response
```json
{
  "success": false,
  "error": "ERROR_CODE",
  "message": "Human readable message",
  "details": ["Detailed error 1", "Detailed error 2"],
  "timestamp": "2026-05-04T12:00:00"
}
```

## Endpoints

### Health
`GET /health`
Returns the current status of the service.

### Authentication

#### Login
`POST /auth/login`
Authenticates a user and returns access and refresh tokens.

**Request:**
```json
{
  "email": "admin@demo.com",
  "password": "Admin123!"
}
```

**Response:**
```json
{
  "success": true,
  "data": {
    "accessToken": "ey...",
    "refreshToken": "...",
    "tokenType": "Bearer",
    "expiresIn": 1800,
    "user": {
      "id": "...",
      "companyId": "...",
      "email": "admin@demo.com",
      "roles": ["SUPER_ADMIN"]
    }
  }
}
```

#### Refresh Token
`POST /auth/refresh`
Obtains a new access token using a refresh token.

**Request:**
```json
{
  "refreshToken": "..."
}
```

#### Logout
`POST /auth/logout`
Revokes a refresh token.

**Request:**
```json
{
  "refreshToken": "..."
}
```

#### Get Current User
`GET /auth/me`
Returns the currently authenticated user's profile.

**Header:** `Authorization: Bearer <accessToken>`
