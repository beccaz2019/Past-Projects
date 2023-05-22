//////////
// ANDREI MODIGA 
// REBECCA ZALDIVAR
/////////

public class VendingMachine {
public int price;
public int quantity;
public int MachineTotal;
public int UserTotal = 0;

public VendingMachine(int p, int q) {
this.price = p;
this.quantity = q;
}
public boolean input(int inp) {
boolean i = false;
if (inp == 5) {
i = true;
UserTotal += inp;
}
else if (inp == 10){
i = true;
UserTotal += inp;
}
else if (inp == 25) {
i = true;
UserTotal += inp;
}
return i;
}
public int vend() {
int sum = 0;
if (UserTotal < price) {
sum = UserTotal - price;
}
else if (UserTotal > price){
sum = UserTotal - price;
}
else if (UserTotal == price()) {
quantity -= 1;
MachineTotal = UserTotal;
}
reset();
return sum;
}
public int reset() {
int store = 0;
if (UserTotal == price()) {
UserTotal = 0;
}
else if (UserTotal > price()) {
store = UserTotal - price();
}
else if (UserTotal < price()) {
store = UserTotal;
}
return store;
}
public int price() {
return price;
}
public int quantity() {
vend();
return quantity;
}
public int total() {
return MachineTotal;
}
}