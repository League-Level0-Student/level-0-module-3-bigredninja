void setup(){
       size(400,600);

    }
    
void draw(){

for (int i = 0 ; i < 10; i++){
  if (i % 2 == 0){
    fill(255,0,0);
  }
  else {
    fill(0,0,0);
  }
  ellipse(200, 300, 200-i*20, 200-i*20);
   
}
}
