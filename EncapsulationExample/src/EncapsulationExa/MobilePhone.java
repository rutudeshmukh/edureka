package EncapsulationExa;

public class MobilePhone {
	private String model;
	private String brand;
	private String[] message = new String[10];
	private int messageCount=0;
	private String[] gallary = new String[10];
	private int photoCount = 0;
	
	//constructor
	public MobilePhone(String model, String brand) {
		this.model = model;
		this.brand = brand;
	}
	
	//getter and setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String[] getMessage() {
		return message;
	}

	public void setMessage(String[] message) {
		this.message = message;
	}

	public int getMessageCount() {
		return messageCount;
	}

	public void setMessageCount(int messageCount) {
		this.messageCount = messageCount;
	}

	public String[] getGallary() {
		return gallary;
	}

	public void setGallary(String[] gallary) {
		this.gallary = gallary;
	}

	public int getPhotoCount() {
		return photoCount;
	}

	public void setPhotoCount(int photoCount) {
		this.photoCount = photoCount;
	}
	
	public void makeCall(String phoneNumber,String string) {
		System.out.println("Calling "+ phoneNumber + "...");
	}
	
	public void receiveCall(String callerName) {
		System.out.println("Receiving a call from "+ callerName + "...");
	}
	
	public void sendMessage(String phoneNumber,String messages) {
		System.out.println("Sending message to "+ phoneNumber+":"+messages);
		if(messageCount< message.length) {
			
		}
	}
	
	public void readMessage(String photoName) {
		System.out.println("Clicking pictures:"+photoName);
		if(photoCount<gallary.length) {
			gallary[photoCount++]=photoName;
		}else {
			System.out.println("Gallery is full.");
		}
	}
	
	public void lookIntoGallary() {
		System.out.println("Looking into gallery...");
		for(int i=0;i<photoCount;i++) {
			
		}
	}
	
	
}
