package week1b;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class TestSolution {
	
	
	@Test
	public void testImport(){
		Solution test = new Solution(new File("src/import.txt"));

				
	}
	
	

//	  @Test
//	  public void example(){
//	      assertEquals(WebLab.getData("example.out").trim(),Solution.run(getInputStream("example.in")).trim());
//	  }
//	  
	  public InputStream getInputStream(String id){
	    
	    return new ByteArrayInputStream(id.getBytes(StandardCharsets.UTF_8));
	  }

}
