package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {
	
	//Lists of data to draw from
	ArrayList<Hobby> hobbies = new ArrayList<Hobby>();
	ArrayList<Friend> friends = new ArrayList<Friend>();
	
	//Variables about myself
	String myName = "Karleen";
	int myAge = 26;
	Hobby[] myHobbies = new Hobby[2];
	Friend[] myFriends = new Friend[2];
	
	//Method to create data
	public void createData(){
		inputHobbies();
		inputFriends();
		myHobbies[0] = hobbies.get(1);
		myHobbies[1] = hobbies.get(2);
		myFriends[0] = friends.get(0);
		myFriends[1] = friends.get(1);
	}
	
	//Method to create all hobbies
	private void inputHobbies(){
		hobbies.add(new Hobby("fishing", "sea"));				//0
		hobbies.add(new Hobby("listening to music", "home"));	//1
		hobbies.add(new Hobby("cycling", "mountain roads"));	//2
		hobbies.add(new Hobby("dancing", "arts centre"));		//3
	}
	
	//Method to create all friends
	private void inputFriends(){
		Hobby[] bobsHobbies = {hobbies.get(2)};
		friends.add(new Friend("Bob", 18, bobsHobbies));
		Hobby[] fredsHobbies = {hobbies.get(0), hobbies.get(3)};
		friends.add(new Friend("Fred", 36, fredsHobbies));
	}
	
	//Serialize data
	public void saveData(){
		//Massive object to store all our objects
		ArrayList<Object> data = new ArrayList<Object>();
		data.add(myName);
		data.add(myAge);
		data.add(myHobbies);
		data.add(myFriends);
		
		try {
			FileOutputStream fileOut = new FileOutputStream("data.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(data);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in data.ser");
			
		} catch(IOException i){
			i.printStackTrace();
		}
	}
	
	//Deserialize data
	public void loadData(){
		//create arraylist to store deserialized objects
		ArrayList<Object> deserialized = new ArrayList<Object>();
		
		try {
			FileInputStream fileIn = new FileInputStream("data.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			deserialized = (ArrayList<Object>)in.readObject();
			in.close();
			fileIn.close();
		} catch(IOException i){
			i.printStackTrace();
			return;
		} catch(ClassNotFoundException c){
			c.printStackTrace();
			return;
		}
		
		//Separate all the objects in the one deserialized object
		String retrievedName = (String)deserialized.get(0);
		int retrievedAge = (int)deserialized.get(1);
		Hobby[] retrievedHobbies = (Hobby[])deserialized.get(2);
		Friend[] retrievedFriends = (Friend[])deserialized.get(3);
		
		//Print everything to console
		System.out.println("My name: " + retrievedName);
		System.out.println("My age: " + retrievedAge);
		
		for(int i=0; i<retrievedHobbies.length; i++){
			System.out.println("Hobby " + i + ": " + retrievedHobbies[i].getName() + " at " + retrievedHobbies[i].getLocation());
		}
		
		for(int i=0; i<retrievedFriends.length; i++){
			System.out.println("Friend " + i + ": " + retrievedFriends[i].getName() + " aged " + retrievedFriends[i].getAge());
			
			for(int j=0; j<retrievedFriends[i].getHobbies().length; j++){
				System.out.println("Friend's Hobby " + j + retrievedFriends[i].getHobbies()[j].getName() + 
						" at " + retrievedFriends[i].getHobbies()[j].getLocation());
			}
		}
		
	}
	
}
