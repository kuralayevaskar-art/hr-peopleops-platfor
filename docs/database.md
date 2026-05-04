# Database Schema

## Overview
The platform uses PostgreSQL 16 with UUID (v4) as primary keys. All entities inherit from `BaseEntity` providing `id`, `created_at`, and `updated_at` fields.

## Tables
- `companies`: Main company information and settings.
- `roles`: RBAC roles (SUPER_ADMIN, HR_ADMIN, etc.).
- `users`: Authentication accounts.
- `user_roles`: Many-to-many join table for users and roles.
- `employees`: Core employee profiles.
- `departments`: Organizational units.
- `positions`: Job roles within departments.
- `document_types`: Configuration for document requirements.
- `files_metadata`: Tracking for uploaded files.
- `employee_documents`: Links employees to their documents.
- `employee_requests`: Leave, sick leave, and other requests.
- `attendance_logs`: Daily attendance records.

## Enums
- `CompanyStatus`: ACTIVE, BLOCKED, ARCHIVED
- `UserStatus`: ACTIVE, BLOCKED, DISABLED
- `EmployeeStatus`: ACTIVE, ON_PROBATION, ON_LEAVE, BLOCKED, DISMISSED, ARCHIVED
- `EmploymentType`: FULL_TIME, PART_TIME, CONTRACTOR, INTERN
- `DirectoryStatus`: ACTIVE, ARCHIVED
- `DocumentStatus`: ACTIVE, EXPIRED, DELETED
- `RequestType`: LEAVE, SICK_LEAVE, REMOTE_WORK, BUSINESS_TRIP, DOCUMENT, OTHER
- `RequestStatus`: DRAFT, SUBMITTED, APPROVED_BY_MANAGER, APPROVED_BY_HR, REJECTED, CANCELLED, COMPLETED
- `AttendanceStatus`: PRESENT, LATE, ABSENT, REMOTE, ON_LEAVE, SICK_LEAVE, BUSINESS_TRIP, DAY_OFF
- `AttendanceSource`: MANUAL, IMPORT, DEVICE, API

## Seed Data
The database is initialized with:
- Default roles.
- A "Demo Company".
- Demo users with password `Admin123!`.
- Initial organizational structure (HR, IT, Sales, Finance).
