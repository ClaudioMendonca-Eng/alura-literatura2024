# Alura - ONE Oracle Next Education T6
##  Challenge Literatura 2024
| ![Alura - ONE Oracle Next Education T6](/docs/src/img/logo_alura_one.png) |
|:---:|
| Curso ONE Oracle Next Education T6, uma parceria entre a Oracle e a Alura, onde estou me dedicando a resolução do desafio LiterAlura, você experimentará diretamente o papel de um desenvolvedor back-end no cotidiano criando uma aplicação com conexão a um banco de dados relacional. É imprescindível que você faça este desafio, pois é uma parte essencial do programa ONE, em que você terá a oportunidade de aplicar conceitos ....|
| <a href="https://cursos.alura.com.br/user/claudioeduardoo" target="_blank"><img style="margin: 10px" height="700" width="605" src="/docs/src/img/apresentacao.gif" alt="Imagem Apresentação"/></a> |

<a href="https://spring.io/"><img height="35" src="https://img.shields.io/badge/Spring-008000?style=for-the-badge&logo=spring&logoColor=white"></a>
<a href="https://docs.oracle.com/en/java/javase/20/"><img height= "35" src= "https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"></a>
<a href="https://www.postgresql.org/"><img height="35" src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white"></a>


## Índice
<a id="topo"></a>

- [Apresentação](#apresentacao)
- [Funcionalidades](#funcionalidades)
- [Executar](#executar)
- [Conclusão](#conclusao)
- [Badge](#badge)
- [Licença](#licenca)


## <a name="apresentacao"> Apresentação </a>

Este é um projeto desenvolvido durante o curso de Java ofertado pela Alura para as turmas da Oracle ONE.
O projeto do Literalura utiliza a API externa Gutendex, que fornece informações do catálogo de livros do Project Gutenberg, uma biblioteca online de e-books gratuitos.
O Literalura permite que o usuário busque títulos do Project Gutenberg, por meio da interação com o terminal, salvando seus livros e autores em um banco de dados local.


## <a name="funcionalidades"> Funcionalidades </a>

A aplicação oferece as seguintes funcionalidades:
- **Buscar livro pelo título:** *Permite ao usuário buscar um livro pelo título e armazená-lo no banco de dados.*
- **Listar livros registrados:** *Lista todos os livros registrados no banco de dados.*
- **Listar autores registrados:** *Lista todos os autores registrados no banco de dados.*
- **Listar autores vivos em um determinado ano:** *Lista os autores que estavam vivos em um ano específico e que foram registrados no banco de dados.*
- **Listar livros em determinado idioma:** *Lista os livros disponíveis no banco de dados em um idioma específico.*
- **Listar Top 10 livros mais baixados:** *Mostra os 10 livros mais baixados no Gutendex.*
- **Buscar autor:** *Permite ao usuário buscar informações sobre um autor. Caso o autor não seja encontrado no banco de dados, será realizada uma busca de um livro de sua autoria que será inserido no banco de dados.*
- **Media de downloads por autor:** *Mostra a media de downloads por autor.*

<p align="right">
  <a href="#topo" style="text-decoration: none; background-color: #007bff; color: white; padding: 10px 20px; border-radius: 5px;">Voltar ao Topo</a>
</p>

## <a name="executar"> Executar </a>

Para executar o projeto localmente, siga estas etapas:

1. Clone este repositório para o seu ambiente local.
2. Certifique-se de ter o JDK (Java Development Kit) e Maven instalados em sua máquina.
3. Abra o prompt no diretório principal e execute o comando:
   ```sh
   mvn clean install
   ```
4. Configure o ambiente de banco de dados de acordo com as configurações do projeto. (Este projeto utiliza PostgreSQL).
5. Configure as variáveis de ambiente corretamente:
   - `JAVA_HOME`: Caminho para o diretório do seu JDK
   - `M2_HOME`: Caminho para o diretório do seu Maven
   - Adicione ambos ao `PATH` incluindo `\bin` no final.

### Configuração POSTGRES

Defina as seguintes variáveis de ambiente:

- `DB_HOST`: Host do PostgreSQL (se estiver rodando localmente, será `localhost`)
- `DB_NAME`: Nome do banco de dados criado
- `DB_USER`: Seu usuário PostgreSQL
- `DB_PASSWORD`: Sua senha PostgreSQL

No arquivo de configuração, utilize as variáveis da seguinte maneira:

```properties
spring.datasource.url=jdbc:postgresql://${DB_HOST}/${DB_NAME}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
```

<p align="right">
  <a href="#topo" style="text-decoration: none; background-color: #007bff; color: white; padding: 10px 20px; border-radius: 5px;">Voltar ao Topo</a>
</p>


## <a name="conclusao"> Conclusão </a>

Este é um projeto desenvolvido durante o curso de Java ofertado pela Alura para as turmas da Oracle ONE.
Exploramos o desenvolvimento de projetos utilizando Spring Boot e Maven, aprendendo a gerenciar dependências e a manipular dados JSON. Revisamos conceitos importantes como funções lambda, a API de Streams do Java, interfaces, generics e manipulação de datas.
A aplicação do Literalura utiliza a API externa Gutendex, que fornece informações do catálogo de livros do Project Gutenberg, uma biblioteca online de e-books gratuitos.
O Literalura permite que o usuário busque títulos do Project Gutenberg, por meio da interação com o terminal, salvando seus livros e autores em um banco de dados local.

## <a name="badge"></a>Badge

- Badge

[![Badge](docs/src/img/bag.png)](https://cursos.alura.com.br)



<p align="right">
  <a href="#topo" style="text-decoration: none; background-color: #007bff; color: white; padding: 10px 20px; border-radius: 5px;">Voltar ao Topo</a>
</p>

## <a name="licenca"> Licença </a>

<a href="https://www.buymeacoffee.com/claudiomendonca" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" style="height: 60px !important;width: 217px !important;" ></a>

Copyright © 2024 <a href="https://www.claudiomendonca.eng.br" target="_blank">ClaudioMendonca.eng.br</a> . 