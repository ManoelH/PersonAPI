# PersonAPI
A Java API Rest created using SpringBoot and JPA to management people

# Testing

Open the application Postman

<strong>POST PEOPLE</strong>


1* Create a new tab and choose the type POST

2* Copy and Paste this address: http://localhost:8081/api/v1/people 

3* Copy and Paste the JSON the 1º exemple in the body and click in SEND

Body:

Example:

<br />


    {
        "firstName": "Manoel Henrique",
        "lastName": "Amorim dos Santos",
        "cpf": "123.456.789-09",
        "birthDate": "1998-10-29",
        "phones": [
  	        {
  		    "type": "MOBILE",
  		    "number": "(82)99999-9999"
	        }
        ]  
    }

<strong>GETTING ALL PEOPLE</strong>

1* Create a new tab and choose the type GET

2* Copy and Paste this address: http://localhost:8081/api/v1/people/

3* Click in the SEND button

<strong>GET PERSON BY ID</strong>

1* Create a new tab and choose the type GET

2* Copy and Paste this address: http://localhost:8081/api/v1/people/{id}

3* Replace the text "{id}" for the value "1" or other id that was saved

3* Click in the SEND button

<strong>DELETE PERSON BY ID</strong>

1* Create a new tab and choose the type DELETE

2* Copy and Paste this address: http://localhost:8081/api/v1/people/{id}

3* Replace the text "{id}" for the value "1" or other id that was saved

3* Click in the SEND button