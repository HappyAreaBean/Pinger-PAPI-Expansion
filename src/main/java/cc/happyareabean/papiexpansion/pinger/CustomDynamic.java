package cc.happyareabean.papiexpansion.pinger;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class CustomDynamic {

	@Getter
	public static Map<String, CustomDynamic> dynamicMap = new HashMap<String, CustomDynamic>();

	private String type;
	private String online;
	private String offline;

	public CustomDynamic(String type, String online, String offline) {
		this.type = type;
		this.online = online;
		this.offline = offline;
	}

	@Override
	public String toString() {
		return "CustomDynamic{" +
				"type='" + type + '\'' +
				", online='" + online + '\'' +
				", offline='" + offline + '\'' +
				'}';
	}
}
