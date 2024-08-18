fun main() {

    println("------ Descubra a Pegada de Carbono! ------")
    println()

   do {
       println("Qual o tipo de energia você irá digitar primeiro? ")
       println()
       println("1 - Para Eletricidade;")
       println("2 - Para Gás.")
       println()
       print("Digite: ")
       var escolha = readlnOrNull()?.toInt() ?:0

               if (escolha == 1){
               println(escolha1())
               }

           if  (escolha == 2){
               println(escolha2())
           }

       println("----------------------------------------------------------------------------------------------------------------------")
       print("Para calcular novamente digite (S) - Para  finalizar  o programa digite (N): ")
       var resp = readLine()
       println()

   } while (resp == "S" || resp == "s")
   println("Programa Finalizado!")
}

fun escolha1 () {
    println()
    println("Calculando a eletricidade:")
    println("-------------------------------------------------------------")

    print("Digite o consumo de eletricidade:  ")
    var consumo = readlnOrNull() ?.toDouble() ?: 0.0
    println("Você digitou um consumo de $consumo kWh/m³")

    var eletricidade = consumo *  0.475

    println( "Eletricidade: $eletricidade Kg CO2")
    println("-------------------------------------------------------------")

    println()

    println("Calculando o Gás:")
    println("-------------------------------------------------------------")

    print("Digite o consumo de gás:  ")
    var consumo1 = readlnOrNull()?.toDouble() ?: 0.0
    println("Você digitou um consumo de $consumo1 kWh/m³")

    var gas = consumo1 * 2.0

    println("Gás: $gas Kg CO2")
    println("-------------------------------------------------------------")

    var total = eletricidade + gas
    println("Resultado: ")
    println()
    println( "Eletricidade: $eletricidade Kg CO2")
    println("Gás: $gas Kg CO2")
    println("Total: $total Kg CO2")
}

fun escolha2() {
    println()
    println("Calculando o Gás:")
    println("-------------------------------------------------------------")

    print("Digite o consumo de gás:  ")
    var consumo1 = readlnOrNull()?.toDouble() ?: 0.0
    println("Você digitou um consumo de $consumo1 kWh/m³")

    var gas = consumo1 * 2.0

    println("Gás: $gas Kg CO2")
    println("-------------------------------------------------------------")

    println()

    println("Calculando a eletricidade:")
    println("-------------------------------------------------------------")

    print("Digite o consumo de eletricidade:  ")
    var consumo = readlnOrNull() ?.toDouble() ?: 0.0
    println("Você digitou um consumo de $consumo kWh/m³")

    var eletricidade = consumo *  0.475

    println( "Eletricidade: $eletricidade Kg CO2")
    println("-------------------------------------------------------------")

    var total = eletricidade + gas
    println("Resultado: ")
    println()
    println("Gás: $gas Kg CO2")
    println( "Eletricidade: $eletricidade Kg CO2")
    println("Total: $total Kg CO2")
}
