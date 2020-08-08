import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

//EmployeeDaoImpl.java
public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jdbcTemplate;
	
	public EmployeeDaoImpl() {
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public void save(final Employee emp)
	{	jdbcTemplate.update(new PreparedStatementCreator()
		{
         public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
        String query = "INSERT INTO employee_jdbc(eno, ename, desig, sal)"
		                                     + "  VALUES (?,?,?,?)";
				PreparedStatement pstmt =con.prepareStatement(query);
				pstmt.setInt(1, emp.getEno());
				pstmt.setString(2, emp.getEname());
				pstmt.setString(3, emp.getDesig());
				pstmt.setDouble(4, emp.getSal());
				return pstmt;
			}
		});  
		
		
	} //save close

	@Override
	public void delete(int eno) {
		 
		
	}

	@Override
	public Employee get(int eno) {
		 
		return null;
	}

	@Override
	public void update(Employee e) {
		 
		
	}

	
}

