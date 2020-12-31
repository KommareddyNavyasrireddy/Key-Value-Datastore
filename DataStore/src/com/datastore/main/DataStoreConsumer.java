package com.datastore.main;
import org.json.simple.JSONObject;
public class DataStoreConsumer {
	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("firstName", "Navya");
		jsonObject.put("lastName", "Kommareddy");
		jsonObject.put("address", "Hyderabad");
		System.out.println("=============================================================");
		System.out.println("========================CREATE ==============================");
		System.out.println("=============================================================");
		// Create Operation
		// DataStore myDataStore = new DataStore();
		DataStore myDataStore = new DataStore("C:\\Users\\Navya Kommareddy\\Documents\\DataStore");
		System.out.println(myDataStore.create("1", jsonObject, 10));// success
		System.out.println(myDataStore.create("1", jsonObject));// failure
		System.out.println(myDataStore.create("1", jsonObject, 10));// failure
		System.out.println(myDataStore.create("2", jsonObject));// success
		System.out.println(myDataStore.create("helloDataStoreThisIsKeyNameValidation", new JSONObject()));// failure
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("====================AFTER WAIT===============");
		jsonObject.put("age", "25");
		System.out.println(myDataStore.create("1", jsonObject, 10));// success
		System.out.println(myDataStore.create("1", jsonObject));// failure
		System.out.println(myDataStore.create("1", jsonObject, 10));// failure
		System.out.println(myDataStore.create("2", jsonObject));// failure

		// Read Operation
		System.out.println("=============================================================");
		System.out.println("==========================READ===============================");
		System.out.println("=============================================================");
		System.out.println(myDataStore.read("1"));// success
		System.out.println(myDataStore.read("2"));// success
		System.out.println(myDataStore.read("3"));// failure
		System.out.println(myDataStore.read("helloDataStoreThisIsKeyNameValidation"));// failure
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("====================AFTER WAIT===============");
		System.out.println(myDataStore.read("1"));// failure
		System.out.println(myDataStore.read("2"));// success
		
		
		//Delete Operation
		System.out.println("=============================================================");
		System.out.println("========================DELETE ==============================");
		System.out.println("=============================================================");
		System.out.println(myDataStore.delete("1"));// failure
		System.out.println(myDataStore.delete("2"));// success
		System.out.println(myDataStore.delete("2"));// failure
		System.out.println(myDataStore.delete("3"));// failure
		System.out.println(myDataStore.delete("helloDataStoreThisIsKeyNameValidation"));// failure
		
	}
}
