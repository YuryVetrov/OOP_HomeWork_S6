package PhoneBook;

import java.io.*;
import java.util.*;
public class MyPhoneBook {
   
	public static void main(String[] args ) throws IOException {
   
   Scanner scanner = new Scanner(System.in);
	PhoneBook phoneBook = new PhoneBook();
   
   while(true){
	System.out.print("\nВведите нужную команду\nadd - добавить контакт\nfind - найти контакт\nstatus - просмотр статуса\ndelete - удалить контакт\nload - загрузить контакт\nsave - сохранить контакт\nexit - выход\n");
   
   String command = scanner.next();
   
   if(command.equals("add")){
	String name = scanner.next();
	String number = scanner.next();
	phoneBook.add(name, number);
	}
	else if(command.equals("find")){
	String name = scanner.next();
	phoneBook.find(name);
	}
	else if(command.equals("status")){
	phoneBook.status();
	}
	else if(command.equals("delete")){
	String name = scanner.next();
	phoneBook.delete_entry(name);
	}
	else if(command.equals("load")){
	String fileName = scanner.next();
	phoneBook.loadFile(fileName);
	}
	else if(command.equals("save")){
	String fileName = scanner.next();
	phoneBook.saveFile(fileName);
	}
	else if(command.equals("exit")){
	break;
	}
	}
	scanner.close();
	}
	}