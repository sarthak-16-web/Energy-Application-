# Energy App (Dockerized)

## Requirements
- Java 17
- Maven
- Docker

## Steps to Run

### 1. Clone Repo
git clone <repo-url>
cd energyapp

### 2. Build JAR
mvn clean package -DskipTests

### 3. Build Docker Image
docker build -t energyapp .

### 4. Run Container
docker run -d -p 8080:8080 energyapp

### 5. Open App
http://localhost:8080
