# Desafio

* Cadastrar um carro/cliente
* Editar um carro/cliente
* Deletar um carro/cliente
* Listar os carros/clientes
* Obter informações de um carro/cliente por ID

### Entidade Operator

- ✅ **id** → Identificador do Operator  
- ✅ **login** → Login único do operador  
- ✅ **name** → Nome do operador  
- ✅ **password** → Senha de acesso


### Entidade Client

- ✅ **id** → Identificador único do cliente (UUID, PK)  
- ✅ **name** → Nome completo do cliente  
- ✅ **email** → Endereço de e-mail (único)  
- ✅ **phoneNumber** → Número de telefone (único)  
- ✅ **cpf** → CPF do cliente (único)  
- ✅ **birthDate** → Data de nascimento  
- ✅ **operator** → FK para a entidade **Operator**

### Entidade Vehicle

- ✅ **id** → Identificador único do veículo (PK, Long)  
- ✅ **model** → Modelo do veículo (ex.: Corolla, Gol)  
- ✅ **typeVehicle** → Tipo do veículo (enum: SUV, Sedan, Hatch, etc.)  
- ✅ **brand** → Marca do veículo (enum: Toyota, Volkswagen, etc.)  
- ✅ **year** → Ano de fabricação  
- ✅ **licensePlate** → Placa do veículo (única)  
- ✅ **rentalPricePerDay** → Valor da diária de aluguel  
- ✅ **operator** → FK para a entidade **Operator**

### Entidade VehicleRent

- ✅ **id** → Identificador único do aluguel (UUID, PK)  
- ✅ **rentDate** → Data e hora do início do aluguel  
- ✅ **returnDate** → Data e hora da devolução do veículo  
- ✅ **priceForDayRent** → Valor da diária aplicada no aluguel  
- ✅ **vehicle** → FK para a entidade **Vehicle**  
- ✅ **client** → FK para a entidade **Client**  
- ✅ **operator** → FK para a entidade **Operator**


## Diagrama Entidade Relacionamento

<img src="https://github.com/YorranPetrick/Imagens-Projetos/blob/master/RentApi/Diagrama%20Entidade%20Relacionamento%20RentApi.png" alt="Diagrama ER RentApi" width=500>
