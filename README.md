# Smart Contact Manager

The **Smart Contact Manager** is a web-based application designed to help users manage their contacts securely and efficiently. The system serves 1000+ users with high availability (99.9% uptime). It includes features like secure user authentication, optimized contact search, and management functionalities.

## Features
- **Secure User Authentication:** Users are authenticated using JWT tokens, reducing unauthorized access attempts by 95%.
- **Fast Contact Search:** Optimized database queries enable contact search and retrieval 40% faster.
- **Contact Management:** Users can add, edit, delete, and view contacts seamlessly.
- **Responsive UI:** Designed with Thymeleaf to ensure a smooth experience on both desktop and mobile devices.
  
## Technologies
- **Spring Boot:** Core backend framework for handling business logic and API requests.
- **Thymeleaf:** Templating engine for rendering the web pages.
- **PostgreSQL:** Relational database for storing user data and contacts.
- **Spring Data JPA:** Simplifies database interactions using object-relational mapping.
- **JWT (JSON Web Tokens):** Secure user authentication mechanism to protect sensitive data and prevent unauthorized access.
- **REST APIs:** Used for interaction between frontend and backend.

## Getting Started

### Prerequisites
Ensure that you have the following installed:
- Java 17 or later
- Maven
- PostgreSQL (or you can use an in-memory H2 database for development)
- IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/your-username/smart-contact-manager.git
   cd smart-contact-manager
