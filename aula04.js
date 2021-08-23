nomeCompleto = "Uilton de Oliveira"
apelido = ""
idade = 34
dataNascimento = "28/05/1987"
localNascimento = "São Paulo do Potengi"
altura = "1,78m"
trabalhando = false

apresentacao = "Meu nome é " + nomeCompleto + " (sou conhecido[a] como " + apelido + ") e tenho " + idade + " anos. Nasci no dia " + dataNascimento + ", na cidade de " + localNascimento + ". Tenho " + altura + "m de altura e atualmente estou " + (trabalhando ? "empregado" : "desempregado") + "."

console.log(apresentacao)