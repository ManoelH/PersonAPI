# PersonAPI
A Java API Rest created using SpringBoot and JPA to management people

# Testing
<br />

POST PEOPLE
<br />
1* Open the application Postman
<br />
2* Create a new tab and choose the type POST
<br />
3* Copy and Paste this address: http://localhost:8081/api/v1/people 
<br />
4* Copy and Paste the JSON the 1º exemple in the body and click in SEND
<br />

<br />
Body:

<br />
Example:

<br />
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