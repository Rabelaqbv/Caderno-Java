//criar uma função passando um parâmetro 
 fun meuNome(nome:String){
  println("Seu nome é: "+nome)
 }
 //crie uma função que retorna true ou false,passando parametro x na chamada da funcao
fun veroufalso(x:Boolean){
   println(x)
}
 //crie uma função que veritica a idade passada como parametro, se é maior de idade
 fun seramaior(y:Int){
    if(y>=18){
   println("È maior de idade: " + y)
    }else{
   println("É menor de idade: " + y)
    }
 }
 
 //crie uma finçãoque passa dois parâmetros inteiros a e b, a função retorna a soma dos dois valores
 
  fun soma(a: Int, b: Int): Int {
     return (a + b)
  }

    
 //função principal kotlin
  fun main() {
   meuNome("Isabelly")
   veroufalso(true)
   veroufalso(false)

   seramaior(15)
   seramaior(19)

 var resultado = soma(3, 5)
 println(resultado)
   
}