package controller;

import java.sql.SQLException;

import dao.SkillDAO;
//import model.Skill;

public class Main{
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Skill skill=new  Skill(null, null);
		SkillDAO skillDAO=new SkillDAO();
		System.out.println("List of All Skills");
		skillDAO.listAllSkills();
	}
}