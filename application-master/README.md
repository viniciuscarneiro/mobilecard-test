application
==============
##Informações
O sistema foi testado em mac os X, linux e windows.

Foi utilizado o Java 6 e o banco MySQL no desenvolvimento do projeto.
O script está no diretório do projeto num arquivo de nome create-database.sql.

É preciso que a variável de ambiente $JAVA_HOME esteja apontando para uma instalação de Java 6.
É preciso ter um Jboss 7.1 instalado e criar um datasource para aplicação no arquivo standalone.xml

Os parâmetros necessários para compilar a aplicação ficam em um arquivo separado, de nome 'build.properties', onde deverá ser alterado de acordo com a configuraão da máquina que será instalada a aplicação.


##Execução
Para executar a aplicação, use o ant do eclipse importando o arquivo build.xml para a janela do ant e execute "install-undeploy-and-deploy".

Assim que o servidor for iniciado, o usuário deve digitar no browser a seguinte url: 'http://localhost:8080/application/client/'.

Irá abrir a página de cadastro de clientes.

Existe um link para  a tela de consulta dos clientes na tela de cadastro de clientes onde poderá editar e excluir o clienteß.