#### Artefato: fake-api-service-balanca
#### Name: Fake API Service - ControladorBalanca
#### Descrição: Fake API do Serviço Controlador da Balanca de Bioimpedância

---

## Sumário:

- ### a) Informações do projeto
- ### b) Motivação
- ### c) Arquitetura do Projeto
- ### d) Como configurar
- ### e) Como executar em uma máquina Windows

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

Para uma inicialização direta, não é necessário nenhuma configuração, apenas sendo necessário installar o plugin do **Lombok** no marketplace da sua IDE.

---

### e) Como executar em uma máquina Windows

#### Pré requisito:

- JRE 8 instalado

---

#### Passos para a execução:

Toda estrutura que será mencionada abaixo se encontra no diretório **dist** do projeto.

Basicamente há 2 maneiras de executar a aplicação pelo Windows:
- Via **execução do JAR** no Java **(Passo #2)** --> **executor-jar.bat**
- Via **serviço do Windows (Passo #3 ou Passo #4)** --> **install-fake-api-service-balanca.bat** / **wrapper-service.exe**

## # 1. Geração e realocação do JAR da aplicação

1. Execute o comando maven: **mvn:package**
2. Verifique no diretório **./target** se foi criado o **.jar** do projeto com o nome **'fake-api-service-balanca-X.X-spring-boot.jar'**
3. Copie ou mova este **.jar** para o diretório **./dist**

## # 2. Executando a aplicação diretamente pelo JAR via BAT

Execute o arquivo **executor-jar.bat**

Garanta que dentro deste **.bat**, esteja referenciando o nome do **.jar** corretamente e que
o jar esteja no mesmo diretório do **.bat** em questão.

## # 3. Executando BAT como Administrador e instalando o Serviço 'fake-api-service-balanca'

Execute o arquivo **install-fake-api-service-balanca.bat**
Garanta que na mesma pasta dele, esteja:

- fake-api-service-balanca.jar
- wrapper-service.exe
- wrapper-service.xml

Esse **.bat** tentará ser iniciado como **ADMINISTRADOR** para ser executado.

## # 4. Instalação do Serviço 'fake-api-service-balanca' Windows manualmente

Caso o passo 3 esteja com algum problema e queria fazê-lo passo a passo, segue:

### a) Criando o serviço Windows.

Igualmente ao passo 2, garanta a existência dos **3 arquivos mencionados** no mesmo diretório.

As configurações de **'wrapper-service.xml'** já estão prontas, caso você não altere o nome de nada,
sendo assim, agora é necessário **ABRIR UM PROMPT DE COMANDO COMO ADMINISTRADOR** e executar **'wrapper-service.exe install'**,

**Espere uma mensagem do tipo:**
> 2019-03-26 16:48:30,896 INFO  - Installing the service with id 'fake-api-service-balanca'

Obs.: Caso você queria desinstalar este serviço por algum motivo, basta executar 'wrapper-service.exe uninstall', espere por:
> 2019-03-26 16:49:43,481 INFO  - Uninstalling the service with id 'fake-api-service-balanca'

### c) Iniciando o serviço.

Uma vez com o arquivo instalado no windows, basta abrir o **'Serviços' do Windows**, procurar pelo serviço **'fake-api-service-balanca'** e clicar em Iniciar.

### d) Acompanhando Log:

Uma vez com o serviço iniciado, será gerado alguns logs no diretório **logs** partindo do diretório do **.jar**, dentre eles o **'wrapper-service.out.log'**, responsável por conter o log da aplicação.

### e) Localizando serviço e Matando processo:

Caso dê algum conflito de porta e você precise matar o processo, use:

**Template:**
>   netstat -o -a -n | findstr :[PORT]

Exemplo com a porta 1717:
>   **netstat -o -a -n | findstr :1717**

E mate o serviço através do comando:

**Template:**
>   taskkill -PID [PID] -f

Exemplo com o processo de PID 2550:
>   **taskkill -PID 2550 -f**

## # 5. Desinstalando o Serviço 'fake-api-service-balanca'

Segue a mesma ideia do passo 3 e 4, sendo possível rodar via BAT ou manualmente.   
Trata-se do arquivo: **uninstall-fake-api-service-balanca.bat**
