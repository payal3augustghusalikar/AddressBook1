package addressbook;

import java.util.Scanner;
	public class AddressBookMain implements AddressBookManagerInterface {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in); 
			int loop = 0;
			while (loop == 0) {
				AddressBookManagerImplementation addressbookmanager = newAddressBookManagerImplementation ();
				System.out.println("Address Book"
						+ "1. Create newAddressBook"
						+ "2. Open existing AddressBook"
						+ "3. Save Address Book"
						+ "4. Save as AddressBook"
						+ "5. Close AddressBook"
						+ "6. Quit");

				int choice=c.nextInt();
				switch (choice) {
				case 1:
					addressbookmanager.newadressbook();
					break;
				case 2:
					addressbookmanager.openadressbook();
					break;
				case 3:
					addressbookmanager.saveadressbook();
				break;
				case 4:
					addressbookmanager.saveasaddressbook();
				break;
				case 5:
					addressbookmanager.closeaddressbook();
				case 6:
					loop=1;
				break;
				default:
					System.out.println("please enter right choice");
				}
			}
		}
	AddressBookImplementation A1 = new AddressBookImplementation();
}