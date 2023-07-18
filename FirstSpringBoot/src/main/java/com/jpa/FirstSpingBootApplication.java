package com.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.dao.UserRepository;
import com.jpa.entities.User;

@SpringBootApplication
public class FirstSpingBootApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(FirstSpingBootApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
	
		//creating and insert --------------------
//		User user1=new User();
//		user1.setName("Kaka");
//		user1.setCity("Rio");
//		user1.setStatus("Footballer");
//		
//		User user=new User();
//		user.setName("Messi");
//		user.setCity("Ayars");
//		user.setStatus("Footballer");
//		
//		List<User> users=List.of(user1,user);
//		//here inserting through iterable
//		Iterable<User> resultIterable=userRepository.saveAll(users);

		
	//Update User-----------------------------
		
//		Optional<User> optional= userRepository.findById(3);
//		User user=optional.get();
//		user.setName("DMaria");
//		user.setStatus("Retired");
//		
//		User result=	userRepository.save(user);
//		//if others need to be set then do
//		
//		System.out.println("Show:"+result);

		
		//GetAll-------------------------
//		Iterable<User> itr=userRepository.findAll();
//		itr.forEach(user->{System.out.println(user);});
		
		
	//Delete User--------------------------------------
		
		//single delete
//		userRepository.deleteById(1);
//		System.out.println("Deleted");
		
		//All Delete
		
//		Iterable<User> itr=userRepository.findAll();
//		itr.forEach(user->System.out.println(user));
//		userRepository.deleteAll();
		
//-----------------//---------------------------------------------
		
		//Custom Finder Methods
		
//	List<User> users=userRepository.findByName("Messi");
//	for (User user : users) {
//		System.out.println(user);
//	}
//		
//		
		//findByName,age less than,greater than
		// greaterthan equal, namelike,startswith,endswith,contains))
		
		
		//getAllUser()
//		List<User> alluser=userRepository.getAllUsers();
//		
//		for (User user : alluser) {
//			System.out.println(user);
//			
//		}
//		
		
		List<User> user=userRepository.getUserByNameandCity("Kaka", "Rio");
		for (User user2 : user) {
			System.out.println(user2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
