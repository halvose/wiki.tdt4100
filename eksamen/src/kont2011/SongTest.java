package kont2011;import junit.framework.TestCase;public class SongTest extends TestCase {	private static String vowels = "aeiouy���", consonants = "bcdfghjklmnpqrstvwxz";	public void testIsVowel() {		for (int i = 0; i < vowels.length(); i++) {			assertTrue(Song.isVowel(vowels.charAt(i)));		}		for (int i = 0; i < consonants.length(); i++) {			assertFalse(Song.isVowel(consonants.charAt(i)));		}	}			public void testComputeVerse() {		assertEquals("Ilfibit", Song.computeVerse("Alfabet", 'i'));	}		public void testWriteSong() {		Song.writeSong("Alfabet");	}}