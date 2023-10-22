## Subir servidor keycloak 
bin\kc.bat start-dev --http-port 8180

Url
http://localhost:8180/realms/eazybankdev/.well-known/openid-configuration


## Passos para gerar o token quando utilizamos o authorization code grant type flow


### No browser inserir essa url
http://localhost:8180/realms/eazybankdev/protocol/openid-connect/auth?client_id=eazybankclient&response_type=code&scope=openid&redirect_uri=http://localhost:7080/sample&state=wewewe

Será redirecionado para redirect_url configurada.
Copiar o code que vem como parametro na url exemplo: ?code=xyz

### Com código copiado , inserir na requisição: 
http://localhost:8180/realms/eazybankdev/protocol/openid-connect/token
a propriedade 'code' o value copiado exemplo: code->xyz

### Na requisição ao recurso
Passar no Header a prop Authorization Bearer 'tokenGerado'
