# BBPix

Biblioteca feita para facilitar a geração e consulta de arrecadação via PIX no Banco do Brasil.

## Uso da Biblioteca

Para usar a biblioteca basta configurar a dependência no arquivo do maven.

```
<dependency>
    <groupId>com.m2r</groupId>
    <artifactId>bbpix</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

## Geração de Arrecadação via PIX

Para gerar uma arrecadação via PIX é necessário 4 informações:

* CLIENT_ID: Credencial fornecida pelo banco.
* CLIENT_SECRET: Senha da credencial fornecida pelo banco.
* NUMERO_CONVENIO: Número do convênio de arrecadação do cliente.
* CODIGO_SOLICITACAO_BANCO_CENTRAL: Código de solictação junto ao Banco Central.

## Exemplo de garação

```
BBPixFactory factory = BBPixFactory.builder()
        .ambiente(AmbienteEnum.HOMOLOGACAO)
        .clientId(Const.CLIENT_ID)
        .clientSecret(Const.CLIENT_SECRET)
        .build();

BBPix pix = factory.create();

ArrecadacaoPostRequest payload = ArrecadacaoPostRequest.builder()
        .numeroConvenio(Const.NUMERO_CONVENIO)
        .codigoSolicitacaoBancoCentralBrasil(Const.CODIGO_SOLICITACAO_BANCO_CENTRAL)
        .emailDevedor("contato@bb.com.br")
        .descricaoSolicitacaoPagamento("teste")
        .valorOriginalSolicitacao(new BigDecimal("10.00"))
        .dataVencimentoSolicitacao("20.03.2021")
        .build();

ArrecadacaoPostResponse result = pix.gerarPixArrecadacao(payload);

System.out.println("Código de conciliação: " + result.getCodigoConciliacaoSolicitante());
System.out.println("QRCode: " + result.getQrCode());
```

## Consulta de Arrecadação via PIX

Para realizar consultar uma arrecadação via PIX é necessário 5 parâmetros:

* CLIENT_ID: Credencial fornecida pelo banco.
* CLIENT_SECRET: Senha da credencial fornecida pelo banco.
* NUMERO_CONVENIO: Número do convênio de arrecadação do cliente.
* CODIGO_SOLICITACAO_BANCO_CENTRAL: Código de solictação junto ao Banco Central.
* codigoConciliacaoSolicitante: Código de uma arrecadação via PIX gerada anteriormente.

## Exemplo de consulta

```
BBPixFactory factory = BBPixFactory.builder()
        .ambiente(AmbienteEnum.HOMOLOGACAO)
        .clientId(Const.CLIENT_ID)
        .clientSecret(Const.CLIENT_SECRET)
        .build();

BBPix pix = factory.create();

Integer numeroConvenio = Const.NUMERO_CONVENIO;
String codigoConciliacaoSolicitante = "8XUeAEZlWeYaYv0x0trfWw6a6KDLvZyI5xh";
ArrecadacaoGetResponse result = pix.obterPixArrecadacao(numeroConvenio, codigoConciliacaoSolicitante);

System.out.println("Código de conciliação: " + codigoConciliacaoSolicitante);
System.out.println("QRCode: " + result.getQrCode());
System.out.println("Situação: " + result.getEstadoSolicitacao());
System.out.println("Valor Pago: " + result.getValorPagamento());
```