fun main() {
    val player = Player("Madrigal")
    player.castFireball()

    val auraColor = player.auraColor()
    player.auraColor()

    printPlayerStatus(player)
}
private  fun  printPlayerStatus(player: Player){
    println("光環顏色:${player.auraColor()}" + "     走運嗎?${if (player.isBlessed) "是的" else "否，他很背"}")
    println("${player.name} ${player.formatHealthStatus()}")
}