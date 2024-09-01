# MongoLicenses
This project is a simple example of how to use MongoDB with Java and Spring Boot. It is a simple CRUD application that allows you to create, read, update, and delete licenses.

## Requirements
- Java 17 or higher
- MongoDB 5.0.3 or higher

## How to run
1. Clone the repository
2. Run the MongoDB server
3. Run the application
4. Access the application at `http://localhost:8080`
5. Enjoy!

## Endpoints
- `GET /api/v1/licenses`: Get all licenses
- `GET /api/v1/licenses/{id}/create`: Get a license by id
- `POST /api/v1/licenses`: Create a new license
- `GET /api/v1/licenses/{id}/validate`: Validate a license by id*
- `PUT /api/v1/licenses/{id}`: Update a license by id
- `DELETE /api/v1/licenses/{id}`: Delete a license by id

**Any endpoint without a star needs proper authentication.**

## Authentication
This project uses the In-Memory Authentication provided by Spring Security. The default credentials are:
- Username: `admin`
- Password: `m[paN>!@+H,37:u;T](zF?`

## Built with
- Java 17
- Spring Boot
- Lombok 1.18.22
- 💝 (love)

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.