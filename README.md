# Кредитный калькулятор

Необходимо написать "кридитный калькулятор" для нужд Банка

1. Должен быть Web интерфейс для пользователя.
2. База данных для хранения исходных данных.
3. Сам калькулятор. 

# База Данных 
В качестве БД используем PostgreSQL.

# Требовани к API
Для поддержки сторонних проложений необходимо реализовать REST API.
Реализуеться метод GET.
Формат запроса:
<curl -H "Content-Type:application/json" -X GET	-H "Client_name: ${Client_name}" 
												-H "Client_surname: ${Client_surname}"
												-H "Client_salary: ${Client_salary}"
												-H "Client_credit_value: ${Client_credit_value}"
												"https://api.bank_calc.ru/v2/CalculationAPI">
