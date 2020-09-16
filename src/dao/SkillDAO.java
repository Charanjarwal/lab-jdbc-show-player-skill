package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	
	public List<Skill> listAllSkills () throws ClassNotFoundException, SQLException {

		String sql="select * from skill";
		
		PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();

		
		while(rs.next()) {
			// Retrieve by column name and displaying
			long skillId=rs.getLong(1);
			String skillname=rs.getString(2);
			Skill s=new Skill(skillId,skillname);
			
			
			System.out.println(skillname);
			System.out.println(skillId);
		}
		ConnectionManager.getConnection().close();
		return null;
		
	}
}