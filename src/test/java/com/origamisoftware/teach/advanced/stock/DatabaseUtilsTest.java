package com.origamisoftware.teach.advanced.stock;

import com.origamisoftware.teach.advanced.stock.database.DatabaseException;
import com.origamisoftware.teach.advanced.stock.database.DatabaseUtils;
import org.hibernate.metamodel.relational.Database;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Statement;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 *  Tests for the DatabaseUtils class
 */
public class DatabaseUtilsTest {

//    @Test
//    public void testGoodInitFile() throws Exception {
//        DatabaseUtils.initializeDatabase(DatabaseUtils.initializationFile);
//    }
//
//    @Test(expected = DatabaseException.class)
//    public void testBadInitFile() throws Exception {
//        DatabaseUtils.initializeDatabase("bogus");
//    }
//
//    @Test
//    public void testGetConnection() throws Exception{
//        Connection connection = DatabaseUtils.getConnection();
//        assertNotNull("verify that we can get a connection ok",connection);
//    }
//
//    @Test
//    public void testGetConnectionWorks() throws Exception{
//        Connection connection = DatabaseUtils.getConnection();
//        Statement statement = connection.createStatement();
//        boolean execute = statement.execute("select * from quotes");
//        assertTrue("verify that we can execute a statement",execute);
//    }

}