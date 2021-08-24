//Variáveis
colaboradores = ['Rhoger', 
                  'Cléverson', 
                  'Gleysberto', 
                  'Nádio', 
                  'Rosiméri', 
                  'Regislane', 
                  'Agripino', 
                  'Wellison']
idades = [69,66,58,61,60,64,59,55]
temposDeTrabalho = [31,29,30,26,25,24,26,29]

nome = "Uilton" //Nome a ser analizado


//Funções
function verificarAposentadoria(nome){
  
  verificar = false // Define se o nome existe ou não
  msg = "" //Mensagem a ser exibida

    //Laço que percorre o array de nomes e verfica se ele existe
    for(indice = 0; indice < colaboradores.length; indice++){
      if(nome == colaboradores[indice]){

        verificar = true // informa que o nome existe no array

          if(verificar == true && idades[indice] >= 65){
            msg = "Parabéns, já pode sair de férias eternas :)"
          }else if(verificar == true && temposDeTrabalho[indice]>= 30){
            msg = "Parabéns, já pode sair de férias eternas :)"
          }else if(verificar == true && idades[indice] >= 60 && temposDeTrabalho[indice] >= 25){
            msg = "Parabéns, já pode sair de férias eternas :)"
          }else{
            msg = "Infelizmente para você, ainda falta um tempo :("
          }
        break  
      }else{
        verificar = false // informa que o nome não existe no array
        msg = "Colaborador inválido :|"                
      }
    }    
    return msg    
}

//Operações
console.log(verificarAposentadoria(nome))