//Ex 01
/*Função para imprimir na tela*/
function imprimir(i){
    console.log(i);
  }
  /*Imprimir na tela o resultado*/
  imprimir("Uilton de Oliveira Rodrigues")
  
  //Ex 02
  
  /*Função para imprimir na tela*/
  function imprimir(i){
    console.log(i);
  }
  
  /*A função nomesIguais verfica os 2 argumentos */
  function nomesIguais(nomeFulano,nomeBeltrano){
    return nomeFulano == nomeBeltrano;  
  }  
 
  /*Imprimir na tela o resultado*/
  imprimir(nomesIguais("CWI","CWI"));
  
  //Ex 03
  
  /* A função verificar idade recebe o parâmetro idade*/
  function verificarIdade(idade){
  
    //Verifica se a idade é maior ou igual a 18 anos
    if(idade >= 18){
      maiorIdade = "É adulto";
    }else{
      maiorIdade = "É menor";
    }
    //Retorna o resultado
    return maiorIdade;
  }
  
  /*A variável maiorIdade recebe o resultado da função verificar idade com o argumento a ser verificado*/
  //var maiorIdade = verificarIdade(5);
  
  /*Imprime o resultado */
  imprimir(verificarIdade(5));
  
  //Ex 04
  
  /*A função jurosAtraso recebe o argumento valor para análise*/
  function jurosAtraso(valor){
    /*Retorno o valor acrescido de 10% de juros*/
    return valor * 1.1;
  }
  
  /*A variável ValorComJuros recebe o resultado da função jurosAtraso */
  //var valorComJuros = jurosAtraso(984.5);
  
  /*Imprime a variável valorComJuros */
  imprimir(jurosAtraso(984.5))
  
  
  //Ex 05
  /*A função média recebe o array de notas e calcula sua média aritmética */
  function mAritmetica(notas){  
    n = 0; //Define o indice de contagem das notas
    soma = 0; //Recebe a soma das notas
  
    /*Executa o laço para a soma das notas do array notas*/
      while(n < notas.length){
      soma += notas[n]; // adiciona a nota na posição n a variável soma
      n++ // adiciona mais 1 ao índice
      }
  
      /*for(n = 0; n < notas.length; n++){
      soma += notas[n];
      }*/
  
    return soma / notas.length; //retorna a média aritmética
  }
  /*A variável notas recebe as notas indicadas */
  notas = [1,2,3,4,5]; // array com as notas
  //resultado = mAritmetica(notas); // passa o array notas para a função média
  
  /*Imprime a variável notas*/
  imprimir(mAritmetica(notas));
  
  
  
  //Ex 06
  /*Recebe os dois argumeentos para o cáculo */
  function mBruta(recLiq,cProd){
    
    lBruto = recLiq - cProd; //realiza o cáculo do lucro bruto
  
    return (lBruto / recLiq) * 100; //realiza o cálculo da margem bruta
  
  }
  
  recLiq = 528459.11; //Receita Líquida
  cProd = 632501.87; //Custo dos produtos vendidos
  
  //resultado = mBruta(recLiq,cProd) + "%"; //recebe o resultado do cálculo de margem bruta
  
  imprimir(mBruta(recLiq,cProd) + "%"); // imprime na tela