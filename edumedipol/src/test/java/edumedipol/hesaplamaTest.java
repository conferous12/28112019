package edumedipol;

import  org.junit.*;
public class hesaplamaTest {

	@org.junit.Test
	public void testCarp() {
		int sonuc=hesaplama.carp(6,7);
		
		
		Assert.assertEquals(42, sonuc);
			
		}
	}