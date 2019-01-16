# fake-api-service-balanca (Fake API Service - ControladorBalanca)

## Sumário:

- ### a) Informações do projeto
- ### b) Motivação
- ### c) Arquitetura do Projeto

---

### a) Informações do projeto:

1. **Java 8**

2. **Spring Boot - 2.0.6.RELEASE:**
   1. **spring-boot-starter-actuator**
   2. **spring-boot-starter-web**
   3. **spring-boot-devtools**
   4. **spring-boot-configuration-processor**

3. **Lombok - (Utilitário)**

4. **Porta padrão: 1717**

5. **CORS: Permite tudo**

---

### b) Motivação: 

Para evoluir e realizar manutenções no projeto da balança de Bioimpedância, é necessário diversas integrações que são:
**Zillyon Web, Treino Web, ZW API, Autoatendimento, Serviço Controlador da Balança em Delphi e a própria balança**. 

Como as partes "**Serviço Controlador da Balança em Delphi e a própria balança**" não é possível ter um "controle", este projeto foi criado e customizado para *"simular/mockar"* todo o comportamento das partes mencionadas.

---

### c) Arquitetura do Projeto:

Foi adotado a arquitetura básica **Controller/DTOs - Service**.
Este projeto não possui a camada **Repository**, pois não há necessidade de interação com o **banco de dados**.

Para organizar e configurar os possíveis cenários que as partes **Serviço Controlador da Balança em Delphi e a própria balança** poderiam exercer, foi criado a interface **BalancaService**.

Através do **FactoryBean do Spring** e do **FakeBalancaServiceProperties** criado, é possível configurar uma implementação de **BalancaService** no **application.properties**, desta maneira fica flexível e fácil separar e organizar cenários dinstintos.

Consulte a documentação da propriedade **fake.balanca.service.option** para saber as implementações disponíveis.

---

### d) Como configurar:

Para uma inicialização direta, não é necessário nenhuma configuração.