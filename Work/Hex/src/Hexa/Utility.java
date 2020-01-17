package Hexa;

import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

public class Utility {
	public static byte[] hexStringToByteArray(String hex) {
		int l = hex.length();
		byte[] data = new byte[l / 2];
		for (int i = 0; i < l; i += 2) {
			data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4) + Character.digit(hex.charAt(i + 1), 16));
		}
		return data;
	}

	public static void usingOurCustomCode(String hexString) {

		byte[] bytes1 = hexStringToByteArray(hexString);
		String st = new String(bytes1, StandardCharsets.UTF_8);
		System.out.println("Decrypted String: " + st);
	}

	public static void usingLibrary(String hexString) {
		byte[] bytes = null;
		try {
			bytes = Hex.decodeHex(hexString.toCharArray());
			System.out.println("Decrypted String: " + new String(bytes, StandardCharsets.UTF_8));
		} catch (DecoderException e) {
			e.printStackTrace();
		}
	}
}
