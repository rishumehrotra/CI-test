/**
 * 
 */
package sampleCI;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author rishumehrotra
 *
 */
public class HelloTest {
	
	@Test
	public static void sayHello() throws Exception {
		
		String str=new HelloWorld().sayHello();
		Assert.assertEquals(str,"Hello World");
	}

}
