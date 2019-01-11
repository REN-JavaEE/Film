package com.lls.erpweb.id;

import java.util.UUID;

public class GetID {
	public static String getId() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
