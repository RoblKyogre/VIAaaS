package com.viaversion.aas.codec.packet.status;

import com.viaversion.aas.codec.packet.Packet;
import io.netty.buffer.ByteBuf;
import org.jetbrains.annotations.NotNull;

public class StatusRequest implements Packet {
	@Override
	public void decode(@NotNull ByteBuf byteBuf, int protocolVersion) throws Exception {
	}

	@Override
	public void encode(@NotNull ByteBuf byteBuf, int protocolVersion) throws Exception {
	}
}