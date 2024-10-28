# ScreenmatchA
Full-stack application for listing series and movies, with a Spring Boot back-end and PostgreSQL database.



🎬 Series and Movies Listing Application
A full-stack application for listing series and movies, built with Spring Boot for the back-end and a simple web interface for the front-end. This project allows users to browse through a catalog of series and movies stored in a PostgreSQL database.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

📋 Project Description
This application was created to demonstrate skills in full-stack development, including:

Back-end: Developed a RESTful API using Spring Boot to handle CRUD (Create, Read, Update, Delete) operations for series and movies.
Database: Configured a PostgreSQL database to store data for each series and movie, including details like title, genre, release year, and synopsis.
Front-end: Created a user-friendly web interface for browsing the catalog.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

🚀 Features
CRUD Operations: Create, read, update, and delete entries for series and movies.
Search and Filter: Browse through the catalog by selecting specific genres and categories.
Data Persistence: The database stores information about each series and movie, and data is retained across sessions.
Basic Security: Configured basic security settings for API endpoints.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

🛠️ Technologies Used
Java
Spring Boot (back-end framework)
PostgreSQL (database)
HTML/CSS (front-end)
JPA/Hibernate (ORM for database interactions)
Maven (dependency management)

📦 Installation
Clone the repository:
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
git clone https://github.com/yourusername/series-movies-listing-app.git
cd series-movies-listing-app

Configure PostgreSQL Database:

Create a PostgreSQL database (e.g., series_movies_db).
Update the application.properties file with your database credentials:

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


spring.datasource.url=jdbc:postgresql://localhost:5432/series_movies_db
spring.datasource.username=your_username
spring.datasource.password=your_password

Open your browser and go to http://localhost:8080.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

🔍 API Endpoints
GET /api/movies: Retrieve all movies.
POST /api/movies: Add a new movie.
PUT /api/movies/{id}: Update an existing movie.
DELETE /api/movies/{id}: Delete a movie.
GET /api/series: Retrieve all series.
POST /api/series: Add a new series.
PUT /api/series/{id}: Update an existing series.
DELETE /api/series/{id}: Delete a series.
🖥️ Front-end Features
The front-end includes:
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Catalog View: Displays a list of all movies and series.
Details View: Shows detailed information about each movie or series.
Responsive Design: Optimized for both desktop and mobile.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

📝 Future Improvements
Search Functionality: Add a search bar to filter series and movies by title.
User Authentication: Implement user login to restrict editing and deleting functionality.
Advanced Filtering: Enable filtering by multiple criteria (e.g., genre, year).

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

🤝 Contributions
Contributions are welcome! Feel free to submit a pull request or open an issue for bug reports or feature requests.
