package src.main.java;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.After;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ScriptTest {
    Script scriptpage =new Script();
    
    @Test
    public void testA() throws InterruptedException{
    	scriptpage.loadPage("Chrome","https://www.brainpop.com/");
    	scriptpage.TestA();

    }
    
    @Test
    public void testB(){
    	scriptpage.TestB();
    }
    
    @Test
    public void testC(){
    	scriptpage.TestC();
    }
    
    @Test
    public void testD(){
    	scriptpage.TestD();
    }
    /*
    @Test
    public void testE(){
    	scriptpage.TestE();
    }
    */
    
    @Test
    public void testF(){
    	scriptpage.TestF();
    }
    
    @Test
    public void testG(){
    	scriptpage.TestG();
    }
    

}
