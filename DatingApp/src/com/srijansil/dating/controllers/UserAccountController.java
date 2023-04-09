package com.srijansil.dating.controllers;

import com.srijansil.dating.DAO.UserAccountDAO;
import com.srijansil.dating.DAO.UserAccountDAOImpl;
import com.srijansil.dating.model.Interest;
import com.srijansil.dating.model.UserAccount;

public class UserAccountController {

	public static void main(String[] args) {
		UserAccountController userAccountController = new UserAccountController();
		// userAccountController.registerUser();
		// userAccountController.findAllUsers();
		userAccountController.findMAtches();

	}

	public void registerUser() {

		UserAccountDAO dao = new UserAccountDAOImpl();
		UserAccount userAccount = new UserAccount();
		userAccount.setId(1);
		userAccount.setAge(26);
		userAccount.setCity("Nepal");
		userAccount.setEmail("boharasrijanil@gmail.com");
		userAccount.setGender("M");
		userAccount.setPassword("123456789");
		userAccount.setPhoneNumber("9748285695");
		userAccount.setUserName("Srijansil Bohara");
		Interest interest = new Interest();
		interest.setId(1);
		interest.setHobbies("Coding,Learning,Spritual");
		interest.setLikes("watching movies");
		userAccount.setInterest(interest);

		dao.save(userAccount);
		System.out.println(dao.findAll());

	}

	public void findAllUsers() {
		UserAccountDAO dao = new UserAccountDAOImpl();
		createUsers(dao);

		dao.delete(1);

		System.out.println(dao.findAll());

	}

	public void findMAtches() {
		UserAccountDAO dao = new UserAccountDAOImpl();
		createUsers(dao);
		System.out.println(dao.findMatches(26, "Nepal"));

	}

	private void createUsers(UserAccountDAO dao) {
		UserAccount userAccount1 = new UserAccount();
		userAccount1.setId(1);
		userAccount1.setAge(26);
		userAccount1.setCity("Nepal");
		userAccount1.setEmail("boharasrijanil@gmail.com");
		userAccount1.setGender("M");
		userAccount1.setPassword("123456789");
		userAccount1.setPhoneNumber("9748285695");
		userAccount1.setUserName("Srijansil Bohara");

		dao.save(userAccount1);

		UserAccount userAccount2 = new UserAccount();
		userAccount2.setId(2);
		userAccount2.setAge(27);
		userAccount2.setCity("Nepal");
		userAccount2.setEmail("boharasrijanil@gmail.com");
		userAccount2.setGender("F");
		userAccount2.setPassword("123456789");
		userAccount2.setPhoneNumber("9748285695");
		userAccount2.setUserName("Aarati Khadka");

		dao.save(userAccount2);
	}

}
