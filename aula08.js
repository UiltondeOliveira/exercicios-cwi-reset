////////// Exercício 01 //////////////////////

arrayUm = ["Domingo","Segunda","Terça","Quarta","Quinta"]

for(i=0; i < arrayUm.length; i++){
  console.log(arrayUm[i])
}

//////// Exercício 02 ///////////////////////

console.log("")

notas = [1,2,3,5,8,13,21,23,34,55]
soma =  0
n = 0

while(n < notas.length){
  soma += notas[n]
  n++
}
media = (soma / notas.length)
console.log(media)

//////// Exercício 03 //////////////////////

console.log("")

meuNome = "Uilton"
nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia", "Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia", "Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina", "Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia", "Vinícius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda", "Leonardo", "Isadora", "Noah", "Lorena", "Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória"]

resultado = false

for(i = 0; i < nomesComuns.length; i++){

    if(meuNome == nomesComuns[i]){
      resultado = true
      break
    }
}
  if(resultado){
    console.log("É, nome comum :P")
  }else{
    console.log("Diferentão Hein? XD")
  }  


