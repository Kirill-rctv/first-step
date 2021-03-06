package signature

val roman = """
10 52
a 10
          
          
 .oooo.   
`P  )88b  
 .oP"888  
d8(  888  
`Y888""8o 
          
          
          
b 11
 .o8       
"888       
 888oooo.  
 d88' `88b 
 888   888 
 888   888 
 `Y8bod8P' 
           
           
           
c 10
          
          
 .ooooo.  
d88' `"Y8 
888       
888   .o8 
`Y8bod8P' 
          
          
          
d 11
      .o8  
     "888  
 .oooo888  
d88' `888  
888   888  
888   888  
`Y8bod88P" 
           
           
           
e 10
          
          
 .ooooo.  
d88' `88b 
888ooo888 
888    .o 
`Y8bod8P' 
          
          
          
f 8
 .o88o. 
 888 `" 
o888oo  
 888    
 888    
 888    
o888o   
        
        
        
g 11
           
           
 .oooooooo 
888' `88b  
888   888  
`88bod8P'  
`8oooooo.  
d"     YD  
"Y88888P'  
           
h 12
oooo        
`888        
 888 .oo.   
 888P"Y88b  
 888   888  
 888   888  
o888o o888o 
            
            
            
i 6
 o8o  
 `"'  
oooo  
`888  
 888  
 888  
o888o 
      
      
      
j 8
    o8o 
    `"' 
   oooo 
   `888 
    888 
    888 
    888 
    888 
.o. 88P 
`Y888P  
k 12
oooo        
`888        
 888  oooo  
 888 .8P'   
 888888.    
 888 `88b.  
o888o o888o 
            
            
            
l 6
oooo  
`888  
 888  
 888  
 888  
 888  
o888o 
      
      
      
m 18
                  
                  
ooo. .oo.  .oo.   
`888P"Y88bP"Y88b  
 888   888   888  
 888   888   888  
o888o o888o o888o 
                  
                  
                  
n 12
            
            
ooo. .oo.   
`888P"Y88b  
 888   888  
 888   888  
o888o o888o 
            
            
            
o 10
          
          
 .ooooo.  
d88' `88b 
888   888 
888   888 
`Y8bod8P' 
          
          
          
p 11
           
           
oo.ooooo.  
 888' `88b 
 888   888 
 888   888 
 888bod8P' 
 888       
o888o      
           
q 11
           
           
 .ooooo oo 
d88' `888  
888   888  
888   888  
`V8bod888  
      888. 
      8P'  
      "    
r 9
         
         
oooo d8b 
`888""8P 
 888     
 888     
d888b    
         
         
         
s 9
         
         
 .oooo.o 
d88(  "8 
`"Y88b.  
o.  )88b 
8""888P' 
         
         
         
t 8
    .   
  .o8   
.o888oo 
  888   
  888   
  888 . 
  "888" 
        
        
        
u 12
            
            
oooo  oooo  
`888  `888  
 888   888  
 888   888  
 `V88V"V8P' 
            
            
            
v 12
            
            
oooo    ooo 
 `88.  .8'  
  `88..8'   
   `888'    
    `8'     
            
            
            
w 17
                 
                 
oooo oooo    ooo 
 `88. `88.  .8'  
  `88..]88..8'   
   `888'`888'    
    `8'  `8'     
                 
                 
                 
x 12
            
            
oooo    ooo 
 `88b..8P'  
   Y888'    
 .o8"'88b   
o88'   888o 
            
            
            
y 12
            
            
oooo    ooo 
 `88.  .8'  
  `88..8'   
   `888'    
    .8'     
.o..P'      
`Y8P'       
            
z 11
           
           
  oooooooo 
 d'""7d8P  
   .d8P'   
 .d8P'  .P 
d8888888P  
           
           
           
A 16
      .o.       
     .888.      
    .8"888.     
   .8' `888.    
  .88ooo8888.   
 .8'     `888.  
o88o     o8888o 
                
                
                
B 13
oooooooooo.  
`888'   `Y8b 
 888     888 
 888oooo888' 
 888    `88b 
 888    .88P 
o888bood8P'  
             
             
             
C 13
  .oooooo.   
 d8P'  `Y8b  
888          
888          
888          
`88b    ooo  
 `Y8bood8P'  
             
             
             
D 14
oooooooooo.   
`888'   `Y8b  
 888      888 
 888      888 
 888      888 
 888     d88' 
o888bood8P'   
              
              
              
E 13
oooooooooooo 
`888'     `8 
 888         
 888oooo8    
 888    "    
 888       o 
o888ooooood8 
             
             
             
F 13
oooooooooooo 
`888'     `8 
 888         
 888oooo8    
 888    "    
 888         
o888o        
             
             
             
G 14
  .oooooo.    
 d8P'  `Y8b   
888           
888           
888     ooooo 
`88.    .88'  
 `Y8bood8P'   
              
              
              
H 14
ooooo   ooooo 
`888'   `888' 
 888     888  
 888ooooo888  
 888     888  
 888     888  
o888o   o888o 
              
              
              
I 6
ooooo 
`888' 
 888  
 888  
 888  
 888  
o888o 
      
      
      
J 8
   oooo 
   `888 
    888 
    888 
    888 
    888 
.o. 88P 
`Y888P  
        
        
K 13
oooo    oooo 
`888   .8P'  
 888  d8'    
 88888[      
 888`88b.    
 888  `88b.  
o888o  o888o 
             
             
             
L 13
ooooo        
`888'        
 888         
 888         
 888         
 888       o 
o888ooooood8 
             
             
             
M 17
ooo        ooooo 
`88.       .888' 
 888b     d'888  
 8 Y88. .P  888  
 8  `888'   888  
 8    Y     888  
o8o        o888o 
                 
                 
                 
N 15
ooooo      ooo 
`888b.     `8' 
 8 `88b.    8  
 8   `88b.  8  
 8     `88b.8  
 8       `888  
o8o        `8  
               
               
               
O 13
  .oooooo.   
 d8P'  `Y8b  
888      888 
888      888 
888      888 
`88b    d88' 
 `Y8bood8P'  
             
             
             
P 13
ooooooooo.   
`888   `Y88. 
 888   .d88' 
 888ooo88P'  
 888         
 888         
o888o        
             
             
             
Q 16
  .oooooo.      
 d8P'  `Y8b     
888      888    
888      888    
888      888    
`88b    d88b    
 `Y8bood8P'Ybd' 
                
                
                
R 13
ooooooooo.   
`888   `Y88. 
 888   .d88' 
 888ooo88P'  
 888`88b.    
 888  `88b.  
o888o  o888o 
             
             
             
S 12
 .oooooo..o 
d8P'    `Y8 
Y88bo.      
 `"Y8888o.  
     `"Y88b 
oo     .d8P 
8""88888P'  
            
            
            
T 14
ooooooooooooo 
8'   888   `8 
     888      
     888      
     888      
     888      
    o888o     
              
              
              
U 14
ooooo     ooo 
`888'     `8' 
 888       8  
 888       8  
 888       8  
 `88.    .8'  
   `YbodP'    
              
              
              
V 16
oooooo     oooo 
 `888.     .8'  
  `888.   .8'   
   `888. .8'    
    `888.8'     
     `888'      
      `8'       
                
                
                
W 25
oooooo   oooooo     oooo 
 `888.    `888.     .8'  
  `888.   .8888.   .8'   
   `888  .8'`888. .8'    
    `888.8'  `888.8'     
     `888'    `888'      
      `8'      `8'       
                         
                         
                         
X 15
ooooooo  ooooo 
 `8888    d8'  
   Y888..8P    
    `8888'     
   .8PY888.    
  d8'  `888b   
o888o  o88888o 
               
               
               
Y 14
oooooo   oooo 
 `888.   .8'  
  `888. .8'   
   `888.8'    
    `888'     
     888      
    o888o     
              
              
              
Z 14
 oooooooooooo 
d'""${'"'}${'"'}${'"'}${'"'}d888' 
      .888P   
     d888'    
   .888P      
  d888'    .P 
.8888888888P  
              
              
              
""".trimIndent()