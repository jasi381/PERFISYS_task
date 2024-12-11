1. [Registration System](https://www.notion.so/Table-of-Contents-1590af801be080048004ce4a2712fd0c?pvs=21)
2. [Authentication System](https://www.notion.so/Table-of-Contents-1590af801be080048004ce4a2712fd0c?pvs=21)
3. [Core Features](https://www.notion.so/Table-of-Contents-1590af801be080048004ce4a2712fd0c?pvs=21)
4. [User Interface Components](https://www.notion.so/Table-of-Contents-1590af801be080048004ce4a2712fd0c?pvs=21)
5. [Data Management](https://www.notion.so/Table-of-Contents-1590af801be080048004ce4a2712fd0c?pvs=21)

### Technical Components

[![](https://mermaid.ink/img/pako:eNpdkcFugzAMhl_Fyrl9AQ6bBqXtqnWq1q7SFnqIgoGokFQmaELQd18a6Iaak-3_k3877pg0KbKAZaX5kYUgC4cw0eDeC_-skSDWltoTzOdPEHa-cmgveB2Y8Fbv97ZJUdseIj6G8IG5qi0Jq4w-TdkDClkg9bDgY_jIDnTkHWP-ZqQX4ChKlU77LQZiSGKfLHmkbAtHJJUpOYWXXl_xndK3hSEqUJ5HbeW1dffvAPtGSqzr53HNtR_9C-seXvmOTKZK14Jw6jAw76aHDY-JDMHWdRA5jvrmPi6bsQqpEip1397dxITZAitMWODCVNA5YYm-Ok401uxbLVlgqcEZI9PkBQsyUdYuay5uWlwokZOo7shF6G9jqj8IU2UNbYcj-1tffwG-96Em?type=png)](https://mermaid-js.github.io/mermaid-live-editor/edit#pako:eNpdkcFugzAMhl_Fyrl9AQ6bBqXtqnWq1q7SFnqIgoGokFQmaELQd18a6Iaak-3_k3877pg0KbKAZaX5kYUgC4cw0eDeC_-skSDWltoTzOdPEHa-cmgveB2Y8Fbv97ZJUdseIj6G8IG5qi0Jq4w-TdkDClkg9bDgY_jIDnTkHWP-ZqQX4ChKlU77LQZiSGKfLHmkbAtHJJUpOYWXXl_xndK3hSEqUJ5HbeW1dffvAPtGSqzr53HNtR_9C-seXvmOTKZK14Jw6jAw76aHDY-JDMHWdRA5jvrmPi6bsQqpEip1397dxITZAitMWODCVNA5YYm-Ok401uxbLVlgqcEZI9PkBQsyUdYuay5uWlwokZOo7shF6G9jqj8IU2UNbYcj-1tffwG-96Em)

### Updated Student Auth Flow
[![](https://mermaid.ink/img/pako:eNp9k81u2zAMx19F0KkD2hfIYcOW9NBDswLOCmxyDqzNVEJksZDkBIWTd5--7CRFWh9o8s8fBYqSBt5Qi3zGN5r2jQTr2WpRGxa-yofoRqTf-hu7u_vOniQZvDfevotg0WaBLfvuBe06l52YVFKhaX-vnkT8s-CwnQJWPVaFLumEPoNWLXgM8TD6seSY0bN0xA8PZheVw7jGdeo5M3OJzfaPQzsscc-i86Msm-2UT0V_0YUS0hob_2A2JIofZtK3aDyLou3AKzJlI2d0HhVaRwb0Aj0o7cZ5FZUVeZzZJZwWmGtw7rI6SR9Kz7E8cNhh6jk6Vxod8wlegJMvBLYV484mZf35eJZ0OHHn2CSWo7c71aAbfjbBuik-jkefw7xbCV5Ew_bKS7ZCaOR0pS7IFeitiIZ5-or7RbQV0TDIQ7oGzam3DnN_orSZNbfmt7zDMDvVhucxxOKae4kd1nwW3Bbstua1OQYOek_Vu2n4zNseb7ml_lXy2Qa0C1H_Fi_kQsGrhW5S38D8IzrF2CpP9jG_xvQoj_8BBFM3HQ?type=png)](https://mermaid-js.github.io/mermaid-live-editor/edit#pako:eNp9k81u2zAMx19F0KkD2hfIYcOW9NBDswLOCmxyDqzNVEJksZDkBIWTd5--7CRFWh9o8s8fBYqSBt5Qi3zGN5r2jQTr2WpRGxa-yofoRqTf-hu7u_vOniQZvDfevotg0WaBLfvuBe06l52YVFKhaX-vnkT8s-CwnQJWPVaFLumEPoNWLXgM8TD6seSY0bN0xA8PZheVw7jGdeo5M3OJzfaPQzsscc-i86Msm-2UT0V_0YUS0hob_2A2JIofZtK3aDyLou3AKzJlI2d0HhVaRwb0Aj0o7cZ5FZUVeZzZJZwWmGtw7rI6SR9Kz7E8cNhh6jk6Vxod8wlegJMvBLYV484mZf35eJZ0OHHn2CSWo7c71aAbfjbBuik-jkefw7xbCV5Ew_bKS7ZCaOR0pS7IFeitiIZ5-or7RbQV0TDIQ7oGzam3DnN_orSZNbfmt7zDMDvVhucxxOKae4kd1nwW3Bbstua1OQYOek_Vu2n4zNseb7ml_lXy2Qa0C1H_Fi_kQsGrhW5S38D8IzrF2CpP9jG_xvQoj_8BBFM3HQ)

### Entry Point

- All users begin at phone number input
- Single entry point simplifies user journey and reduces friction

### OTP Authentication Layer

1. **Phone Verification**
    - Collect phone number as primary identifier
    - Immediate SMS OTP dispatch
    - Rate limiting recommended for SMS sending
2. **OTP Validation**
    - Circular validation process
    - Invalid attempts return to OTP entry
    - Session token generation upon success

### User Type Bifurcation

- System checks user existence in database
- Automatic path determination:
    - New users → Registration flow
    - Existing users → Direct dashboard access

### New User Registration Path

1. **Information Collection**
    - Personal details capture
    - Class preferences/requirements
    - Student-specific information
2. **Data Persistence**
    - Save user profile
    - Create necessary database entries
    - Initialize user preferences

### Dashboard & Services Hub

- Centralized access point post-authentication
- Core service offerings:
    - Teacher communication channels (Chat/Talk)
    - Class booking system
    - Course content access
    - Student resources

## Authentication System

### Overview

Multi-factor authentication system with OTP and future WhatsApp integration.

### Technical Components

[![](https://mermaid.ink/img/pako:eNplUV1vgyAU_SuE5_YP-LDEVl2XdJmxzZZM-kDwqmQKDCGLUf_7ENzWZDydc8-53K8JM1kBjnDdyS_WUm3QuSACuReXZ9lwgQr4tDCYG9rvH9Bhiq1pQRjOqOFSoOuoYAkJh9Ux560UMKNj6QF6uea3ezntKe9mlJQe_JMza6x26Wn51lIzxEqhOH9ylmA6-iay6RU0r8c1e6udBCGQ9IcEmvmfL5YxGIYZPW5zbYHbvSlzPfn6p7IAo10FtU65eU5hBUTgHe5BuwEqt7lpFQl2W-mB4MjBiuoPgolYnI9aIy-jYDgy2sIOa2mbFkc17QbHrKqogYTTRtP-N6qoeJfyj0PFjdTP4VD-Xss3Yu-LKg?type=png)](https://mermaid-js.github.io/mermaid-live-editor/edit#pako:eNplUV1vgyAU_SuE5_YP-LDEVl2XdJmxzZZM-kDwqmQKDCGLUf_7ENzWZDydc8-53K8JM1kBjnDdyS_WUm3QuSACuReXZ9lwgQr4tDCYG9rvH9Bhiq1pQRjOqOFSoOuoYAkJh9Ux560UMKNj6QF6uea3ezntKe9mlJQe_JMza6x26Wn51lIzxEqhOH9ylmA6-iay6RU0r8c1e6udBCGQ9IcEmvmfL5YxGIYZPW5zbYHbvSlzPfn6p7IAo10FtU65eU5hBUTgHe5BuwEqt7lpFQl2W-mB4MjBiuoPgolYnI9aIy-jYDgy2sIOa2mbFkc17QbHrKqogYTTRtP-N6qoeJfyj0PFjdTP4VD-Xss3Yu-LKg)

### Implementation Details

1. **OTP System**
    - Phone OTP generation and validation
    - Email OTP integration
    - Session management
    - Rate limiting implementation
2. **Security Measures**
    - OTP expiration timing
    - Maximum retry attempts
    - Security logging

## Core Features

### Overview

Essential functionality including course management and maps integration.

### Technical Components

[![](https://mermaid.ink/img/pako:eNp9kc9OwzAMh18lynl7gR6QaGFsYxOHcaLpwWq8NlprT04ihKa9O6F_YLuQQxR_38-S5Vx0zRZ1po8df9YtSFDvuSGVzmNZsKBaIYQo6Cu1XD6oPMEoHtUeCBrskUI1xQdflEUH3qd4ooZGlQ_qeW7dOR8cNdWtXM3ygCB1e-deZpczn8bGUReDXpdv1DnC6hZuyjX392hbFmlalAmO92ZQr-WOawiOSeXg0U6R7X9yGsKQXugepQdn0xovP9Do0KbVGJ2lpwU5GW3omnIQAx--qNZZkIgLLRybVmdH6Hyq4tlCwCcHjUD_S89AH8x_NVoXWPbjrw2fd_0GVQmMUg?type=png)](https://mermaid-js.github.io/mermaid-live-editor/edit#pako:eNp9kc9OwzAMh18lynl7gR6QaGFsYxOHcaLpwWq8NlprT04ihKa9O6F_YLuQQxR_38-S5Vx0zRZ1po8df9YtSFDvuSGVzmNZsKBaIYQo6Cu1XD6oPMEoHtUeCBrskUI1xQdflEUH3qd4ooZGlQ_qeW7dOR8cNdWtXM3ygCB1e-deZpczn8bGUReDXpdv1DnC6hZuyjX392hbFmlalAmO92ZQr-WOawiOSeXg0U6R7X9yGsKQXugepQdn0xovP9Do0KbVGJ2lpwU5GW3omnIQAx--qNZZkIgLLRybVmdH6Hyq4tlCwCcHjUD_S89AH8x_NVoXWPbjrw2fd_0GVQmMUg)

## Implementation Details

### 1. Course System

### Course Management

- Course creation with distinct identifiers
- Course description and syllabus management
- Teacher assignment and scheduling

### Course Listing

- Category-wise organization
- Dynamic sorting options
- Course availability status

### Course Booking

- Slot-based booking system
- Payment integration
- Booking confirmation workflow
- Schedule management

### 2. Class Types and Location Integration

### Online Classes

- Video conferencing integration
- Online attendance tracking

### Home Classes

- Location validation system
- Home visit scheduling system

### Center Classes (Need some clarifications)

- Center location management
- Classroom capacity tracking
- Center-wise course scheduling
- Facility management integration
- Multiple center support

### Location-Based Services

- Geolocation API integration
- City-wise teacher availability
- Service area boundary management
- Location verification system

## User Interface Components

### Overview

Standardized UI components and interactive elements.

### Technical Components
[![](https://mermaid.ink/img/pako:eNpVkcFOwzAMhl_Fynl9gR6Q1pbBEJWQykAi7cE0WRuRxlGSCsG0dydr1wI5xf78x7_jE2tJSJayo6bPtkcX4DmrDcSz5Yc95DRYMtIE30CS3EDGd2QCVAGNQCfUNwZFprkqppKcP1KnDDyRHa3_hwqea_QeKqllexXOPJv4LX-V73DpsOjm_I5vrV3zM8kncsdLEqihkF51i48Z3fPoMkgo0WAnhzjDqi2mgj0vRx1U4ic3cNg3f-kDX13CC2ollknZhg3SDahE_LbTRVKz0McGNUvjNX7LR81qc451OAaqvkzL0uBGuWGOxq5n6RG1j9Fo45uyUNg5HNasRfNG9BtLoQK5ct7StKzzD5F8iwU?type=png)](https://mermaid-js.github.io/mermaid-live-editor/edit#pako:eNpVkcFOwzAMhl_Fynl9gR6Q1pbBEJWQykAi7cE0WRuRxlGSCsG0dydr1wI5xf78x7_jE2tJSJayo6bPtkcX4DmrDcSz5Yc95DRYMtIE30CS3EDGd2QCVAGNQCfUNwZFprkqppKcP1KnDDyRHa3_hwqea_QeKqllexXOPJv4LX-V73DpsOjm_I5vrV3zM8kncsdLEqihkF51i48Z3fPoMkgo0WAnhzjDqi2mgj0vRx1U4ic3cNg3f-kDX13CC2ollknZhg3SDahE_LbTRVKz0McGNUvjNX7LR81qc451OAaqvkzL0uBGuWGOxq5n6RG1j9Fo45uyUNg5HNasRfNG9BtLoQK5ct7StKzzD5F8iwU)

### Implementation Details

1. **Font System**
    - Standardized font implementation
    - Cross-platform consistency
    - Responsive typography
2. **Interactive Components**
    - Login popup system
    - Multi-class selection interface
    - Teacher profile components

## Data Management

### Overview

Comprehensive data tracking and management system.

### Technical Components

[![](https://mermaid.ink/img/pako:eNpVkcFugzAMhl8lyrl9AQ6T2tJ17Yo0je2ywMFKQogKSWWcTajquy_AVFhOsb8_vx37xqVXmie8avyPrAGJnd8Lx-LZiBQIWAYOjG61o5Kt109sK3IKKoZsI8l-W-rLP_2Id-INfWUbvXy4FKRi46Dpycou5ieyHcle7FWQQNY7NpQul_BZHB1p1B2xDwR5sc784weRxUrQsJyAwmy9G-nLo6sDWlUu0XFAJhp3S-NJkY6Kkzh7Yx1b9j3TV_HZxX-yTBNOjK94q7EFq-Jcb4O24FTHSRQ8iVcFeCl44e5RB4F83jvJE8KgVxx9MDVPKmi6GIWrAtKpBYPQPrJXcF_ez7FWljxm0xrHbd5_Ae-qlhg?type=png)](https://mermaid-js.github.io/mermaid-live-editor/edit#pako:eNpVkcFugzAMhl8lyrl9AQ6T2tJ17Yo0je2ywMFKQogKSWWcTajquy_AVFhOsb8_vx37xqVXmie8avyPrAGJnd8Lx-LZiBQIWAYOjG61o5Kt109sK3IKKoZsI8l-W-rLP_2Id-INfWUbvXy4FKRi46Dpycou5ieyHcle7FWQQNY7NpQul_BZHB1p1B2xDwR5sc784weRxUrQsJyAwmy9G-nLo6sDWlUu0XFAJhp3S-NJkY6Kkzh7Yx1b9j3TV_HZxX-yTBNOjK94q7EFq-Jcb4O24FTHSRQ8iVcFeCl44e5RB4F83jvJE8KgVxx9MDVPKmi6GIWrAtKpBYPQPrJXcF_ez7FWljxm0xrHbd5_Ae-qlhg)

### Implementation Details

1. **Activity Tracking**
    - Educational progress monitoring
    - Interest analysis
    - Mental status tracking
    - Privacy compliance
2. **Analytics System**
    - Login frequency analysis
    - Usage pattern tracking
    - Performance metrics
    - Data visualization

## Technical Requirements

### Security Requirements

- End-to-end encryption for sensitive data
- Regular security audits
- GDPR compliance
- Data backup and recovery protocols

### Monitoring and Maintenance

- Error tracking and logging
- Performance monitoring
- Regular backup scheduling
- Version control and deployment strategy

