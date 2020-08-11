package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void main(String[] args) {
		new _00_Horoscope().horoscopeDisplay(Zodiac.AQUARIUS);
	}
	// 3. Make a main method to test your method
	void horoscopeDisplay(Zodiac z) {
		switch(z) {
		case ARIES:{
			JOptionPane.showMessageDialog(null, "Your fun loving approach will be admired and appreciated by others.");
			break;
		}
		case TAURUS:{
			JOptionPane.showMessageDialog(null, "You will have the stamina and the know how to raise your earning power.");
			break;
		}
		case GEMINI:{
			JOptionPane.showMessageDialog(null, "Assist a relative or good friend by setting of a budget for them.");
			break;
		}
		case CANCER:{
			JOptionPane.showMessageDialog(null, "You have a tendency to think that no one else will do things properly.");
			break;
		}
		case LEO:{
			JOptionPane.showMessageDialog(null, "Try to spend some time on your own.");
			break;
		}
		case VIRGO:{
			JOptionPane.showMessageDialog(null, "It might be best to keep your ideas to yourself today.");
			break;
		}
		case LIBRA:{
			JOptionPane.showMessageDialog(null, "You can make headway in the workforce if you put your mind to it.");
			break;
		}
		case SCORPIO:{
			JOptionPane.showMessageDialog(null, "You will be in a high cycle regarding work.");
			break;
		}
		case SAGITTARIUS:{
			JOptionPane.showMessageDialog(null, "Opportunities to make advancements through good business sense are apparent.");
			break;
		}
		case CAPRICORN:{
			JOptionPane.showMessageDialog(null, "You will find their philosophies worth exploring.");
			break;
		}
		case AQUARIUS:{
			JOptionPane.showMessageDialog(null, "Hidden assets can be doubled if you play your cards correctly.");
			break;
		}
		case PISCES:{
			JOptionPane.showMessageDialog(null, "Be sure that the person you're drawn to is not already involved.");
			break;
		}
		}
	}
}
