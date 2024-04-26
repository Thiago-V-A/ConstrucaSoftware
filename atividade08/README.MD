1. Crie uma classe que aceite a digitação de dois números e faça a divisão entre eles exibindo seu resultado. Sua classe deve tratar as seguintes exceções:

  ArithmeticException quando ocorrer uma divisão por zero.
  InputMismatchException quando o valor informado não é numérico.


2. Crie uma classe que crie um vetor de inteiros de 10 posições. Feito isso, permita que o usuário digite valores inteiros a fim de preencher este vetor. Não implemente nenhum tipo controle referente ao tamanho do vetor, deixe que o usuário digite valores até que a entrada 0 (zero) seja digitada.

Uma vez digitado o valor 0, o mesmo deve ser inserido no vetor e a digitação de novos elementos deve ser interrompida. Feita toda a coleta dos dados, exiba-os em tela.

Sua classe deve tratar as seguintes exceções:

ArrayIndexOutOfBoundsException quando o usuário informar mais que 10 valores.
InputMismatchException quando o usuário informar um valor que não é numérico.


3. Crie uma classe chamada Login, que possua os atributos usuario e senha (do tipo String) e um método chamado fazer_login(usuario, senha), que retorna uma boolean. Uma exceção do tipo LoginInvalidoException deve ser lançada quando o usuário ou a senha não estiverem corretos. Esta classe de exceção deve ser criada por você. O Tratamento da exceção deverá ser feito em uma classe de teste (executável).



4. Crie uma classe chamada ContaBancaria, que possua o atributo saldo do tipo Double, além dos métodos depositar(Double Valor) e sacar(Double valor). Uma exceção do tipo SaldoInsuficienteException deve ser lançada quando se deseja fazer um saque de um valor superior ao saldo disponível. Esta classe de exceção deve ser criada por você. O Tratamento da exceção deverá ser feito em uma classe de teste (executável).


