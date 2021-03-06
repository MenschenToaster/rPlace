package de.d151l.place.api.player

import java.util.UUID

/**
 * @created 15/04/2022 - 02:15
 * @project R-Place
 * @author  D151l
 */
interface PlacePlayer {

    fun getUUID(): UUID

    fun getName(): String

    fun getBlockCount(): Int

    fun setBlockToCount(count: Int)

    fun addBlockToCount()

    fun getLastBlockRePlace(): Long

    fun setLastBlockRePlace(time: Long)

    fun getRanking(): Int

    fun setRanking(ranking: Int)
}