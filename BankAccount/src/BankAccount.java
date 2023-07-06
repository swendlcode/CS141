/**
 * Each BankAccount object models the account
 * information for  a single user of the somebank.
 * @author Pavel Stepanov
 * @version 1.0v (Jun 7 2022)
 */


public class BankAccount {

    /** The iD of this BankAccount */
    private int iD;

    /** The balance of this BankAccount */
    private double balance;

    /** The name of this BankAccount */
    private String name;



    /** Default Construct ID (0), Balance (0), Name (unknown) */
    public BankAccount() {
        this.iD = 0;
        this.balance = 0;
        this.name = "unknown";
    }

    /** Construct and initialize a data at the specified iD balance and name
     * @param iD the iD  of the newly constructed BankAccount
     * @param balance the balance  of the newly constructed BankAccount
     * @param name the name  of the newly constructed BankAccount
     */
    public BankAccount(int iD, double balance, String name) {
        this.iD = iD;
        this.balance = balance;
        this.name = name;
    }

    /** Returns a string representation of this name and balance.
     * @return a string representation of this point
     */
    @Override
    public String toString() {
        return name + "[" + iD + "] = $" + balance;
    }

    /** Access the Name  of this BankAccount object and return in int precision
     * @return the Name of this BankAccount object
     */
    public String getName() {
        return this.name;
    }

    /** Access the Balance  of this BankAccount object and return in int precision
     * @return the Balance of this BankAccount object
     */
    public double getBalance() {
        return this.balance;
    }

    /** Access the ID  of this BankAccount object and return in int precision
     * @return the ID of this BankAccount object
     */
    public int getID() {
        return this.iD;
    }

    /** Sets the name  of this object to the specified string.
     * @param newName the name string of the new name
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /** Update the balance
     * @param x the other BankAccount object
     */
    public void changeBalance(double x) {
        this.balance = this.balance + x;

        if (this.balance < 0) {
            this.balance = 0;
        }
    }
}
