/*
  AnalogReadSerial
 Reads an analog input on pin 0, prints the result to the serial monitor 
 
 This example code is in the public domain.
 */

void setup() {
  Serial.begin(9600);
  char input[];
  char convert[];
  char post[];

}

void loop() {
  if (Serial.available() > 0) {
   char press = Serial.read();
   Serial.print("Button: ");
   Serial.println(press);
     for (i=0; i<sizeof(input); i++)
       input[i] = press;
      }
   for (i=0; i<sizeof(input); i++)
     int j=1;
     
     input[i] = char temp;
       if (temp == "+" || "-" || "*" || "/ "){
         input[i-1] = convert[i];
         input[i+1] = convert[j];
         j++;
         
        
     }
    
    // 3+3 = 33+
    // 4+3+5 = 435++
}
