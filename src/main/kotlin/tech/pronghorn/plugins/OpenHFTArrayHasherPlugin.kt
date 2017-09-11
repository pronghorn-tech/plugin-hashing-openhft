package tech.pronghorn.plugins

import net.openhft.hashing.LongHashFunction
import tech.pronghorn.plugins.arrayHash.ArrayHasherPlugin

object OpenHFTArrayHasherPlugin : ArrayHasherPlugin {
    private val hasher = LongHashFunction.farmNa()
    override fun get(): (ByteArray) -> Long = hasher::hashBytes
}
