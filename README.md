# alura-literatura2024
Com a resolução do desafio LiterAlura, você experimentará diretamente o papel de um desenvolvedor back-end no cotidiano criando uma aplicação com conexão a um banco de dados relacional. É imprescindível que você faça este desafio, pois é uma parte essencial do programa ONE, em que você terá a oportunidade de aplicar conceitos ....



Este arquivo fornecerá instruções detalhadas sobre como configurar e executar o projeto.

```markdown
# Spring Boot Docker Example

Este é um projeto de exemplo que utiliza Spring Boot 3.2.6, Spring Data JPA, PostgreSQL e Docker. Este projeto demonstra como criar uma aplicação Spring Boot que se conecta a um banco de dados PostgreSQL, tudo orquestrado usando Docker Compose.

## Pré-requisitos

Antes de começar, você precisará ter o seguinte instalado em sua máquina:

- [Git](https://git-scm.com/)
- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)

## Configuração do Projeto

### Clonar o Repositório

Clone este repositório na sua máquina local usando o seguinte comando:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
```

### Configurar as Variáveis de Ambiente

Crie um arquivo `.env` na raiz do projeto com o seguinte conteúdo:

```env
SPRING_DATASOURCE_URL=jdbc:postgresql://db:5432/mydatabase
SPRING_DATASOURCE_USERNAME=postgres
SPRING_DATASOURCE_PASSWORD=postgres
POSTGRES_DB=mydatabase
POSTGRES_USER=postgres
POSTGRES_PASSWORD=postgres
```

### Construir e Executar os Contêineres

Construa a imagem Docker e inicie os contêineres usando o Docker Compose:

```bash
docker-compose up --build
```

### Acessar a Aplicação

Depois que os contêineres estiverem em execução, a aplicação Spring Boot estará disponível em [http://localhost:8080](http://localhost:8080).

### Acessar o Banco de Dados

Você pode acessar o banco de dados PostgreSQL usando um cliente SQL, como [pgAdmin](https://www.pgadmin.org/) ou qualquer outra ferramenta de sua preferência. Use as seguintes credenciais:

- Host: `localhost`
- Port: `5432`
- Database: `mydatabase`
- Username: `postgres`
- Password: `postgres`

## Estrutura do Projeto

- `Dockerfile`: Define a imagem Docker para o aplicativo Spring Boot.
- `docker-compose.yml`: Orquestra os contêineres Docker para o aplicativo e o banco de dados PostgreSQL.
- `.env`: Arquivo de variáveis de ambiente (não incluído no repositório).
- `src/main/resources/application.properties`: Configurações do Spring Boot para conectar ao banco de dados usando variáveis de ambiente.

## Limpar os Recursos

Para parar e remover os contêineres Docker, você pode usar o seguinte comando:

```bash
docker-compose down
```

## Contribuição

Se você quiser contribuir para este projeto, por favor, abra um pull request ou crie uma issue para discutir a mudança que você gostaria de fazer.

## Licença

Este projeto é licenciado sob os termos da licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

```

Este arquivo `README.md` fornece todas as informações necessárias para que alguém possa clonar o repositório, configurar as variáveis de ambiente, construir e executar os contêineres Docker, e acessar tanto a aplicação Spring Boot quanto o banco de dados PostgreSQL. Além disso, inclui instruções sobre como parar e limpar os recursos Docker quando necessário.
