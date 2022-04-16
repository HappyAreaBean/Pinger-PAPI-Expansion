package cc.happyareabean.papiexpansion.pinger;

import br.com.azalim.mcserverping.MCPing;
import br.com.azalim.mcserverping.MCPingOptions;
import br.com.azalim.mcserverping.MCPingResponse;

import java.io.IOException;

public class Pinger {
	private String address;
	private int port;
	private int timeout;
	private int pingVersion;
	private int protocolVersion;
	private String gameVersion;
	private String motd;
	private int playersOnline;
	private int maxPlayers;

	public Pinger(final String address, final int port) {
		this.address = "localhost";
		this.port = 25565;
		this.timeout = 2000;
		this.pingVersion = -1;
		this.protocolVersion = -1;
		this.playersOnline = -1;
		this.maxPlayers = -1;
		this.setAddress(address);
		this.setPort(port);
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}

	public void setPort(final int port) {
		this.port = port;
	}

	public int getPort() {
		return this.port;
	}

	public void setTimeout(final int timeout) {
		this.timeout = timeout;
	}

	public int getTimeout() {
		return this.timeout;
	}

	private void setPingVersion(final int pingVersion) {
		this.pingVersion = pingVersion;
	}

	public int getPingVersion() {
		return this.pingVersion;
	}

	private void setProtocolVersion(final int protocolVersion) {
		this.protocolVersion = protocolVersion;
	}

	public int getProtocolVersion() {
		return this.protocolVersion;
	}

	private void setGameVersion(final String gameVersion) {
		this.gameVersion = gameVersion;
	}

	public String getGameVersion() {
		return this.gameVersion;
	}

	private void setMotd(final String motd) {
		this.motd = motd;
	}

	public String getMotd() {
		return this.motd;
	}

	private void setPlayersOnline(final int playersOnline) {
		this.playersOnline = playersOnline;
	}

	public int getPlayersOnline() {
		return this.playersOnline;
	}

	private void setMaxPlayers(final int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public int getMaxPlayers() {
		return this.maxPlayers;
	}

	public boolean fetchData() {
		try {
			MCPingOptions options = MCPingOptions.builder()
					.hostname(address)
					.port(port)
					.build();
			MCPingResponse data = MCPing.getPing(options);

			this.setMaxPlayers(data.getPlayers().getMax());
			this.setPlayersOnline(data.getPlayers().getOnline());
			this.setMotd(data.getDescription().getText());
			this.setProtocolVersion(data.getVersion().getProtocol());
			this.setGameVersion(data.getVersion().getName());
		} catch (IOException e) {
			return false;
		}
		return true;
	}
}
