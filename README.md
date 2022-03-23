# PW2: Rest Client

Exercício sobre Rest Client.

## Passos para a realização do exercício

  * Primeiro, faça um [*fork*](https://docs.github.com/pt/get-started/quickstart/fork-a-repo) do projeto para a sua conta no Github
  * Depois, realize um [clone](https://docs.github.com/pt/repositories/creating-and-managing-repositories/cloning-a-repository) para a sua máquina local
  * Logo, implemente as [issues](https://github.com/rpmhub/pw2-rest-client/issues) que foram estipuladas para esse projeto
  * Em seguida, realize um [push](https://docs.github.com/pt/desktop/contributing-and-collaborating-using-github-desktop/making-changes-in-a-branch/pushing-changes-to-github) da sua solução
  * Finalmente, verifique na aba `Actions` do seu repositório no Github se os testes passaram (correção automática)

🚨 Se você não souber como realizar operações como *fork*, *clone* e *push* no Github, por favor, assistam o [vídeo](https://www.youtube.com/watch?v=SDowGAvT0l0) com dicas de Git/Github.

## Tarefas

Existem três [issues](https://github.com/rpmhub/pw2-rest-client/issues) (questões/tarefas) abertas no Github que devem ser implementadas. 
Estas [issues](https://github.com/rpmhub/pw2-rest-client/issues) detalham o que deve ser desenvolvidos no sistema a fim de permitir 
que os testes automáticos (correção) possam ser realizado com sucesso. 

Assim, verifique cada [issues](https://github.com/rpmhub/pw2-rest-client/issues) para ter uma melhor compreensão do que deve 
ser desenvolvido nesse projeto.

## Dicas gerais sobre o projeto 💡

Se você desejar verificar se o seu projeto está correto, ou seja, os testes estão passando, execute o projeto `servicea` e pressione a tecla `r` do terminal para executar os testes que esse projeto possui. Assim, é possível testar a sua implementação do Rest Client sem a necessitade de rodar `serviceb`, pois, `servicea` possui um _Mock_ que simula `serviceb`.

Alternativamente, você também pode rodar os dois serviços ao mesmo tempo `servicea` e `serviceb` para verificar a sua solução. Nesse caso, observe que o `servicea` foi configurado para rodar na porta 3333 e o `serviceb` 4444.
