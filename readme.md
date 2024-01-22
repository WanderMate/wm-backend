# This is readme file for WanderMate project

### Steps to configure the project

1. Clone the project from git
2. Create postgres db. Use below command to create db in docker
```bash
docker run --platform linux/amd64 --name wandermate-db -p 5431:5432 -e POSTGRES_DB=wandermate -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -d postgres:15.1
```
3. Build the project and run it