function a() {
    console.log('hello');
 }
console.log('Dojo');
/*Dojo*/

function a(){
    console.log('hello');
    return 15;
}
x = a();
console.log('x is', x);
/*hello, x is 15*/

function a(n){
    console.log('n is', n);
    return n+15;
}
x = a(3);
console.log('x is', x);
/* n is 3, x is 18*/

function a(n) {
    console.log('n is', n);
    y = n*2;
    return y;
}
x = a(3) + a(5);
console.log('x is', x);
/* n is 3, n is 5, x is 16 */

function op(a,b) {
c = a+b;
console.log('c is', c);
return c;
}
x = op(2,3) + op(3,5);
console.log('x is', x);
/* c is 5, c is 8, x is 13 */

function op(a,b) {
   c = a+b;
   console.log('c is', c);
   return c;
 }
 x = op(2,3) + op(3,op(2,1)) + op(op(2,1), op(2,3));
 console.log('x is', x)
/* c is 5, c is 3, c is 6, c is 3, c is 5, c is 8, x is 19*/


/* 15, 15 */

function multiply(x,y) {
    console.log(x);
    console.log(y);
}
b = multiply(2,3);
console.log(b);
/* 2,3,undefined */

function multiply(x,y) {
    return x*y;
}
b = multiply(2,3);
console.log(b);
console.log(multiply(5,2));
/* 6, 10 */

var x = [1,2,3,4,5,10];
for(var i=0; i<5; i++) {
   i = i + 3; 
   console.log(i);
}
/* 3,7 */

var x=15;
console.log(x);
function awesome(){
    var x=10;
    console.log(x);
}
console.log(x);
awesome();
console.log(x);
/* 15, 15, 10, 15 */

for(var i=0; i<15; i+=2) {
   console.log(i);
}
/* 0,2,4,6,8,10,12,14 */

for(var i=0; i<3; i++) {
   for(var j=0; j<2; j++) {     
       console.log(i*j);
   }
}
/* 0, 0, 0, 1, 0, 2 */

function looping(x,y) {
   for(var i=0; i<x; i++) {
      for(var j=0; j<x; j++) {  
          console.log(i*j);
      } 
   }
}
z = looping(3,3);
console.log(z);
/* 0,0,0,0,1,2,0,2,4,undefined */

function looping(x,y) {
   for(var i=0; i<x; i++) {
      for(var j=0; j<y; j++) {   
         console.log(i*j);
      } 
   }
   return x*y;
}
z = looping(3,5);
console.log(z);
/* 0,0,0,0,0,0,1,2,3,4,0,2,4,6,8,15 */

function printUpTo(x) {
    if(x <0){
      console.log("numero negativo");
      return false;
    }
    else{
      for(var i=1 ; i<= x; i++ ){
        console.log(i);
      }
  }
}
printUpTo(1000); // debería imprimir todos los enteros de 1 to 1000
y = printUpTo(-10); // debería imprimir false
console.log(y); // debería imprimir false

function printSum(x) {
  var sum = 0;
  for(var i=0; i<=x; i++){
    console.log(i);
    sum = sum + i;
    console.log(sum)
  }
  return sum
}
y = printSum(255) // debería imprimir todos los enteros de 0 a 255 y que cada entero imprima la suma parcial.
console.log(y) // // debería imprimir 32640

function printSumArray(x) {
  var sum = 0;
  for(var i=0; i<x.length; i++) {
    sum = sum + x[i];
  }
  return sum;
}
console.log( printSumArray([1,2,3]) ); // debería imprimir 6
