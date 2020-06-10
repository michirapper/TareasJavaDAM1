//import java.util.Date;
//
///**
// * Extract class
// * This class is intended to be used as a refactoring playground
// * @author PELLO_ALTADILL
// */
//public class Customer3 {
//	private String name;
//	private String dni;
//	private CreditCard creditCard;
//
//	public Customer3(String name, String dni) {
//		this.name = name;
//		this.dni = dni;
//		this.creditCard = new CreditCard();
//	}
//
//	public boolean isCardExpired () {
//		return creditCard.creditCardDate.before(new Date());
//	}
//
//	public boolean isValid () {
//		boolean result = false;
//		// Some code here...
//		return result;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getDni() {
//		return dni;
//	}
//
//	public void setDni(String dni) {
//		this.dni = dni;
//	}
//
//	public String getCreditCard() {
//		return creditCard.creditCard;
//	}
//
//	public void setCreditCard(String creditCard) {
//		this.creditCard.creditCard = creditCard;
//	}
//
//	public Date getCreditCardDate() {
//		return creditCard.creditCardDate;
//	}
//
//	public void setCreditCardDate(Date creditCardDate) {
//		this.creditCard.creditCardDate = creditCardDate;
//	}
//
//	public int getCreditCardControlNumber() {
//		return creditCard.creditCardControlNumber;
//	}
//
//	public void setCreditCardControlNumber(int creditCardControlNumber) {
//		this.creditCard.creditCardControlNumber = creditCardControlNumber;
//	}
//
//}