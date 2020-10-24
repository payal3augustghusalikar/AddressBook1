package addressbook;

public class Person {
String firstName;
String lastName;
String city;
String state;
long phone;
int zip;
public Person(String firstName, String lastName, String city, String state, long phone, int zip) {

	this.firstName = firstName;
	this.lastName = lastName;
	this.city = city;
	this.state = state;
	this.phone = phone;
	this.zip = zip;
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getlastName() {
	return lastName;
}
public void setlastName(String lastName) {
	this.lastName = lastName;
}
public String getcity() {
	return city;
}
public void setcity(String city) {
	this.city = city;
}
public String getstate() {
	return state;
}
public void setstate(String state) {
	this.state = state;
}
public long getphone() {
	return phone;
}
public void setphone(long phone) {
	this.phone = phone;
}
public int getzip() {
	return zip;
}
public void setzip(int zip) {
	this.zip = zip;
}
}