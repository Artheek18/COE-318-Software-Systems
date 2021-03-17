/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arthe
 */
public class UserInterFaceTest {
    
    public UserInterFaceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of start method, of class UserInterFace.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        UserInterFace instance = new UserInterFaceImpl();
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class UserInterFace.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        UserInterFace instance = new UserInterFaceImpl();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class UserInterFace.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        UserInterFace instance = new UserInterFaceImpl();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of spice method, of class UserInterFace.
     */
    @Test
    public void testSpice() {
        System.out.println("spice");
        UserInterFace instance = new UserInterFaceImpl();
        instance.spice();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of end method, of class UserInterFace.
     */
    @Test
    public void testEnd() {
        System.out.println("end");
        UserInterFace instance = new UserInterFaceImpl();
        instance.end();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UserInterFaceImpl implements UserInterFace {

        public void start() {
        }

        public void run() {
        }

        public void display() {
        }

        public void spice() {
        }

        public void end() {
        }
    }
    
}
