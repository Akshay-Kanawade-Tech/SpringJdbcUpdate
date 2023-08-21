package org.mahagan.software.service.dao;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

import javax.sql.DataSource;
import java.sql.Types;

public class ProjectDao {

    private DataSource dataSource;
    private ProjectDbUpdate projectDbUpdate;

    private final String sqlForUpdateData= "Update project set title=? where projectNo=?";


    /**
     * Constructor of datasource
     * @param dataSource
     *
     */
    public ProjectDao(DataSource dataSource) {
        this.dataSource = dataSource;

        projectDbUpdate = new ProjectDbUpdate(dataSource,sqlForUpdateData);
    }

    public int updateProjects(int projectNo , String title) {
        return projectDbUpdate.update(new Object[]{title,projectNo});

    }

    private final class ProjectDbUpdate extends SqlUpdate{

public ProjectDbUpdate(DataSource dataSource ,String sqlQuery){
    super(dataSource, sqlQuery);
    declareParameter(new SqlParameter(java.sql.Types.VARCHAR));
    declareParameter(new SqlParameter(java.sql.Types.INTEGER));
    compile();
}

}

}
