# Product Catalog

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![React](https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)

A full-stack **Product Catalog** application built with **Java Spring Boot** and **React.js**.  
Users can browse, add, update, and filter products through a responsive UI powered by RESTful backend services.

---

## 🚀 Features

- 📦 View all products with category-based filtering
- ➕ Add, update, and delete products (CRUD)
- 🔍 Search products by name or category
- 📱 Responsive React frontend
- 🔗 RESTful API with Spring Boot backend
- 🗄️ MySQL database with Spring Data JPA & Hibernate

---

## 🛠️ Tech Stack

| Layer      | Technology                  |
|------------|-----------------------------|
| Frontend   | React.js, Axios, CSS        |
| Backend    | Java, Spring Boot, REST API |
| Database   | MySQL, Spring Data JPA      |
| Build Tool | Maven                       |

---

## ⚙️ Getting Started

### Prerequisites
- Java 17+
- Node.js & npm
- MySQL

### Backend Setup
```bash
# Clone the repository
git clone https://github.com/beherachinmay/product-catalog.git

# Navigate to backend
cd backend

# Configure MySQL in application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/productdb
spring.datasource.username=root
spring.datasource.password=yourpassword

# Run the Spring Boot app
mvn spring-boot:run
```

### Frontend Setup
```bash
cd frontend
npm install
npm start
```

## 📁 Project Structure

<details>
<summary>Click to expand</summary>

<sub>

```
product-catalog/
├── backend/
│   ├── src/main/java/
│   │   ├── controller/
│   │   ├── service/
│   │   ├── repository/
│   │   └── model/
│   └── application.properties
└── frontend/
    ├── src/
    │   ├── components/
    │   └── App.js
    └── package.json
```

</sub>

</details>

## 📬 API Endpoints

| Method | Endpoint              | Description          |
|--------|-----------------------|----------------------|
| GET    | /api/products         | Get all products     |
| GET    | /api/products/{id}    | Get product by ID    |
| POST   | /api/products         | Add new product      |
| PUT    | /api/products/{id}    | Update product       |
| DELETE | /api/products/{id}    | Delete product       |

---

## 👨‍💻 Author

**Chinmay** – [GitHub](https://github.com/beherachinmay) | [LinkedIn](https://www.linkedin.com/in/chinmay-behera08/)
