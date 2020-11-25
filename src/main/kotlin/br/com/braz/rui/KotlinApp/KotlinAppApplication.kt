package br.com.braz.rui.KotlinApp

import br.com.braz.rui.KotlinApp.domain.Promocao
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.concurrent.ConcurrentHashMap
import kotlin.math.sqrt
import kotlin.random.Random

@SpringBootApplication
class KotlinAppApplication {
    companion object {
        val initialPromocoes = arrayOf(
                Promocao(1, "Maravilhosa viagem Cancun", "Cancun", true, 7, 4199.99),
                Promocao(2, "Maravilhosa radical Chapada", "Chapada", true, 12, 5199.99),
                Promocao(3, "Viagem Simples Cancun", "Cancun", false, 7, 4199.99),
                Promocao(4, "Viagem Simples Chapada", "Chapada", false, 12, 5199.99),

                )
    }
    @Bean
    fun promocoes() = ConcurrentHashMap<Long, Promocao>(initialPromocoes.associateBy(Promocao::id))

}

fun main(args: Array<String>) {
    runApplication<KotlinAppApplication>(*args)
}


