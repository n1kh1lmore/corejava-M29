package encapsulation;

public class EncapsulationDemo {
	public static void main(String[] args) {
		
		HdfcBank h =new HdfcBank();
		h.setCardNo(33435324343L);
		h.setCardType("Debit Card");
		h.setCvvNo(555);
		h.setPinNo(5346);
		
		System.out.println(h.getCardNo());
		System.out.println(h.getCardType());
		System.out.println(h.getCvvNo());
		System.out.println(h.getPinNo());

	}
}
