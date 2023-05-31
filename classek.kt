fun main(args: Array<String>) {
class Carro {
  var marca = ""
  var modelo = ""
  var ano = 0
} 
// criar um objeto(instanciar) 
val fuca = Carro()

// Access the properties and add some values to it
fuca.marca = "Wolks"
fuca.modelo = "Fusca"
fuca.ano = 1975

println(fuca.marca)  //Mostra Wolks
println(fuca.modelo)  //Montra Fusca
println(fuca.ano)  // Mostra 1975

//instanciar outro carro imprimir os atributos

  var must=Carro()

  must.marca="Ford"
  must.modelo="Mustang"
  must.ano=1969

  println(must.marca)
  println(must.modelo)
  println(must.ano)
  

}
  