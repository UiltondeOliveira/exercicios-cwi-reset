/* CÁLCULO DO IMC COM MSG */


  peso = 92.0 // Peso em quilogramas
  altura = 1.52 // Altura em metros

  imc = (peso/(altura ** 2))

  if (imc < 18.50){
    
    console.log("Seu IMC é " + imc + " classificado como MAGREZA.")
  }
  else if(imc >= 18.50 && imc <= 24.99){
    console.log("Seu IMC é " + imc + " classificado como NORMAL.")
  }
  else if(imc >= 25 && imc <= 29.99){
    console.log("Seu IMC é " + imc + " classificado como SOBREPESO. Cuidado!! Você está acima do peso recomendado pela OMS.")
  }
  else if(imc >= 30.0 && imc <= 39.99){
    console.log("Seu IMC é " + imc + " classificado como OBESIDADE. Cuidado!! Você está acima do peso recomendado pela OMS.")
  }
  else{
      console.log("Seu IMC é " + imc + " classificado como OBESIDADE GRAVE. Cuidado!! Você está acima do peso recomendado pela OMS. É importate procurar um médico para avaliar sua saúde.")
  }

