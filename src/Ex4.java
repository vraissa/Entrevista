public class Ex4 {
    // 4 - Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia.
    // O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de
    // Franca em direção a Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem na
    // rodovia, qual estará mais próximo a cidade de Ribeirão Preto?
    //
    //
    //
    //IMPORTANTE:
    //
    //a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.
    //
    //b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em cada um
    // deles e o carro possui tag de pedágio (Sem Parar)
    //
    //c) Explique como chegou no resultado.

    //Resposta:

    //Carro:
    //Tempo para percorrer os primeiros 45 km: 45 km ÷ 110 km/h = 0,409 horas = 24,5 minutos
    //Tempo para percorrer os 55 km restantes: 55 km ÷ 110 km/h = 0,5 horas = 30 minutos
    //Tempo total: 24,5 minutos + 30 minutos = 54,5 minutos
    //
    //Caminhão:
    //Tempo para percorrer os primeiros 45 km (com os pedágios): (45 km ÷ 80 km/h) + (2 × 5 minutos) =
    // 0,6875 horas = 41,25 minutos
    //Tempo para percorrer os 55 km restantes: 55 km ÷ 80 km/h = 0,6875 horas = 41,25 minutos
    //Tempo total: 41,25 minutos + 41,25 minutos = 1 hora e 22,5 minutos
    //
    //Como podemos ver, o carro leva 54,5 minutos para chegar ao ponto de encontro, enquanto o caminhão leva
    // 1 hora e 22,5 minutos. Portanto, o carro estará mais próximo da cidade de Ribeirão Preto quando os
    // veículos se cruzarem na rodovia.
}
