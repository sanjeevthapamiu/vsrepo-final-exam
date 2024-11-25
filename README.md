**POST: http://localhost:8080/api/v1/employees**
<br/>**Postman**
![Create Employee](https://github.com/sanjeevthapamiu/vsrepo-final-exam/blob/main/screenshots/1.png)
**Request**
```
{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "phone": "1234567890",
  "hireDate": "2024-01-10"
}
```
**Response**
```
{
  "id": 1,
  "name": "John Doe",
  "email": "john.doe@example.com",
  "phone": "1234567890",
  "hireDate": "2024-01-10",
  "services": [ ]
}
```
<br/>**POST: http://localhost:8080/api/v1/services**
<br/>**Postman**
![Create Employee](https://github.com/sanjeevthapamiu/vsrepo-final-exam/blob/main/screenshots/2.png)
**Request**
```
{
  "employeeId": 1,
  "serviceName": "Oil Change",
  "cost": 120.00,
  "vehicleType": "Motorcycle"
}
```
**Response**
```
{
    "id": 1,
    "serviceName": "Oil Change",
    "cost": 120.0,
    "vehicleType": "Motorcycle"
}
```
<br/>**GET: http://localhost:8080/api/v1/employees**
<br/>**Postman**
![Create Employee](https://github.com/sanjeevthapamiu/vsrepo-final-exam/blob/main/screenshots/3.png)
**Response**
```
[
    {
        "id": 1,
        "name": "John Doe",
        "email": "john.newemail@example.com",
        "phone": "0987654321",
        "hireDate": "2024-01-10",
        "services": [
            {
                "id": 1,
                "serviceName": "Oil Change",
                "cost": 120.0,
                "vehicleType": "Motorcycle"
            }
        ]
    }
]
```
<br/>**POST: http://localhost:8080/api/v1/services**
<br/>**Postman**
![Create Employee](https://github.com/sanjeevthapamiu/vsrepo-final-exam/blob/main/screenshots/4.png)
**Request**
```
{
  "employeeId": 1,
  "serviceName": "Tire Replacement",
  "cost": 180.50,
  "vehicleType": "Truck"
}
```
**Response**
```
{
    "id": 2,
    "serviceName": "Tire Replacement",
    "cost": 180.5,
    "vehicleType": "Truck"
}
```
<br/>**GET: http://localhost:8080/api/v1/employees/1**
<br/>**Postman**
![Create Employee](https://github.com/sanjeevthapamiu/vsrepo-final-exam/blob/main/screenshots/5.png)

**Response**
```
{
    "id": 1,
    "name": "John Doe",
    "email": "john.doe@example.com",
    "phone": "1234567890",
    "hireDate": "2024-01-10",
    "services": [
        {
            "id": 1,
            "serviceName": "Oil Change",
            "cost": 120.0,
            "vehicleType": "Motorcycle"
        },
        {
            "id": 2,
            "serviceName": "Tire Replacement",
            "cost": 180.5,
            "vehicleType": "Truck"
        }
    ]
}
```
<br/>**GET: http://localhost:8080/api/v1/employees**
<br/>**Postman**
![Create Employee](https://github.com/sanjeevthapamiu/vsrepo-final-exam/blob/main/screenshots/6.png)

**Response**
```
[
    {
        "id": 1,
        "name": "John Doe",
        "email": "john.doe@example.com",
        "phone": "1234567890",
        "hireDate": "2024-01-10",
        "services": [
            {
                "id": 1,
                "serviceName": "Oil Change",
                "cost": 120.0,
                "vehicleType": "Motorcycle"
            },
            {
                "id": 2,
                "serviceName": "Tire Replacement",
                "cost": 180.5,
                "vehicleType": "Truck"
            }
        ]
    }
]
```
<br/>**PATCH: http://localhost:8080/api/v1/employees/1**
<br/>**Postman**
![Create Employee](https://github.com/sanjeevthapamiu/vsrepo-final-exam/blob/main/screenshots/7.png)
**Request**
```
{
  "email": "john.newemail@example.com",
  "phone": "0987654321"
}
```
**Response:**
```
{
    "id": 1,
    "name": "John Doe",
    "email": "john.newemail@example.com",
    "phone": "0987654321",
    "hireDate": "2024-01-10",
    "services": [
        {
            "id": 1,
            "serviceName": "Oil Change",
            "cost": 120.0,
            "vehicleType": "Motorcycle"
        },
        {
            "id": 2,
            "serviceName": "Tire Replacement",
            "cost": 180.5,
            "vehicleType": "Truck"
        }
    ]
}
```
