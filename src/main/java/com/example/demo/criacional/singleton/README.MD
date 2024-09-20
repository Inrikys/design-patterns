# Propósito
É um padrão criacional que tem como objetivo prover para a classe o poder de gerar apenas UMA INSTÂNCIA

Ela é usada quando é necessário controlar a criação de um recurso compartilhado, garantindo estado global como:
- Sessão
- Objeto de base de dados
- Cache global
- Arquivos de logs
- Gerenciamento de configurações

obs: Deve ser tomado cuidado com multithreads

Referência: 
https://refactoring.guru/pt-br/design-patterns/singleton