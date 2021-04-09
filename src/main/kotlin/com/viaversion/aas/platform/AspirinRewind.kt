package com.viaversion.aas.platform

import de.gerrygames.viarewind.api.ViaRewindPlatform
import org.slf4j.LoggerFactory
import us.myles.ViaVersion.sponge.util.LoggerWrapper
import java.util.logging.Logger

object AspirinRewind : ViaRewindPlatform {
    val log = LoggerWrapper(LoggerFactory.getLogger("ViaRewind"))
    override fun getLogger(): Logger = log
}