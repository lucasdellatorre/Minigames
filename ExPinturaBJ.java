/**
 * Lucas Dellatorre de Freitas
 */
public class ExPinturaBJ
{
    public static void main(String args[])
    {
        //cor do background
        Square backgroundL = new Square();
        backgroundL.makeVisible();
        backgroundL.changeColor("black");
        backgroundL.changeSize(200);
        backgroundL.moveHorizontal(-200);
        
        Square backgroundTop = new Square();
        backgroundTop.makeVisible();
        backgroundTop.changeColor("black");
        backgroundTop.changeSize(400);
        backgroundTop.moveVertical(-394);
        backgroundTop.moveHorizontal(-100);
        
        Square backgroundBot = new Square();
        backgroundBot.makeVisible();
        backgroundBot.changeColor("black");
        backgroundBot.changeSize(400);
        backgroundBot.moveVertical(114);
        backgroundBot.moveHorizontal(-100);
            
        Square backgroundR = new Square();
        backgroundR.makeVisible();
        backgroundR.changeColor("black");
        backgroundR.changeSize(200);
        backgroundR.moveHorizontal(118);
        
        //a figura é 19x20 pixels
        int p = 6; //6 = 1 pixel
        
        //cada case é uma coluna (exceto a 1)
        for(int cont = 1; cont<=19; cont++)
        {
            switch (cont)
            {
                case 1:
                    
                    for(int cont1 = 1,  soma = 0; cont1<=20; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                    }
                    for(int cont1 = 1,  soma = 0; cont1<=3; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    for(int cont1 = 1,  soma = p*15; cont1<=5; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    break;
                    
                case 2:
                
                    Square quadrado1 = new Square();
                    quadrado1.makeVisible();
                    quadrado1.changeColor("black");
                    quadrado1.changeSize(p);
                    quadrado1.moveHorizontal(2*p);
                    
                    Square quadrado2 = new Square();
                    quadrado2.makeVisible();
                    quadrado2.changeColor("black");
                    quadrado2.changeSize(6);
                    quadrado2.moveVertical(p*19);
                    quadrado2.moveHorizontal(2*p);
                    
                    Square quadrado3 = new Square();
                    quadrado3.makeVisible();
                    quadrado3.changeColor("black");
                    quadrado3.changeSize(6);
                    quadrado3.moveHorizontal(2*p);
                    quadrado3.moveVertical(6*8);
                    break;
                    
                case 3:
                    
                    Square quadrado4 = new Square();
                    quadrado4.makeVisible();
                    quadrado4.changeColor("black");
                    quadrado4.changeSize(6);
                    quadrado4.moveHorizontal(cont*p);
                    quadrado4.moveVertical(p);
                    
                    Square quadrado5 = new Square();
                    quadrado5.makeVisible();
                    quadrado5.changeColor("black");
                    quadrado5.changeSize(p);
                    quadrado5.moveVertical(p*18);
                    quadrado5.moveHorizontal(cont*p);
                    
                    Square quadrado6 = new Square();
                    quadrado6.makeVisible();
                    quadrado6.changeColor("black");
                    quadrado6.changeSize(p);
                    quadrado6.moveVertical(p*5);
                    quadrado6.moveHorizontal(cont*p);
                    
                    Square quadrado7 = new Square();
                    quadrado7.makeVisible();
                    quadrado7.changeColor("black");
                    quadrado7.changeSize(p);
                    quadrado7.moveVertical(p*9);
                    quadrado7.moveHorizontal(cont*p);
                    break;
                
                case 4:
                
                    for(int cont1 = 1,  soma = p*7; cont1<=3; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    for(int cont1 = 1,  soma = p*16; cont1<=4; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    break;
                    
                case 5:
                
                    Square quadrado8 = new Square();
                    quadrado8.makeVisible();
                    quadrado8.changeColor("black");
                    quadrado8.changeSize(p);
                    quadrado8.moveVertical(p*7);
                    quadrado8.moveHorizontal(cont*p);
                    
                    Square quadrado9 = new Square();
                    quadrado9.makeVisible();
                    quadrado9.changeColor("black");
                    quadrado9.changeSize(p);
                    quadrado9.moveVertical(p*9);
                    quadrado9.moveHorizontal(cont*p);
                    
                    for(int cont1 = 1,  soma = p*16; cont1<=4; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    break;
                    
                case 6:
                
                    Square quadrado10 = new Square();
                    quadrado10.makeVisible();
                    quadrado10.changeColor("black");
                    quadrado10.changeSize(p);
                    quadrado10.moveVertical(p*5);
                    quadrado10.moveHorizontal(cont*p);
                    
                    Square quadrado11 = new Square();
                    quadrado11.makeVisible();
                    quadrado11.changeColor("black");
                    quadrado11.changeSize(p);
                    quadrado11.moveVertical(p*9);
                    quadrado11.moveHorizontal(cont*p);
                    break;
                
                case 7:
                
                    Square quadrado12 = new Square();
                    quadrado12.makeVisible();
                    quadrado12.changeColor("black");
                    quadrado12.changeSize(p);
                    quadrado12.moveVertical(p*8);
                    quadrado12.moveHorizontal(cont*p);
                    
                    Square quadrado13 = new Square();
                    quadrado13.makeVisible();
                    quadrado13.changeColor("black");
                    quadrado13.changeSize(p);
                    quadrado13.moveVertical(p*18);
                    quadrado13.moveHorizontal(cont*p);
                    break;
                
                case 8:
                    Square quadrado14 = new Square();
                    quadrado14.makeVisible();
                    quadrado14.changeColor("black");
                    quadrado14.changeSize(p);
                    quadrado14.moveVertical(p*1);
                    quadrado14.moveHorizontal(cont*p);
                    
                    for(int cont1 = 1,  soma = p*16; cont1<=4; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    break;
                    
                case 9:
                
                    for(int cont1 = 1,  soma = p*16; cont1<=4; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    break;
                
                case 10:
                
                    for(int cont1 = 1,  soma = 0; cont1<=4; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    for(int cont1 = 1,  soma = p*16; cont1<=4; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    break;
                    
                case 11:
                
                    for(int cont1 = 1,  soma = 0; cont1<=5; cont1++, soma+=p)
                    {
                       Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    for(int cont1 = 1,  soma = p*16; cont1<=4; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    break;
                    
                case 12:
                
                    for(int cont1 = 1,  soma = 0; cont1<=6; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    break;
                    
                case 13:
                
                    Square quadrado15 = new Square();
                    quadrado15.makeVisible();
                    quadrado15.changeColor("black");
                    quadrado15.changeSize(p);
                    quadrado15.moveVertical(p*18);
                    quadrado15.moveHorizontal(cont*p);
                    
                    for(int cont1 = 1,  soma = 0; cont1<=7; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    break;
                    
                case 14:
                
                    for(int cont1 = 1,  soma = 0; cont1<=7; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    for(int cont1 = 1,  soma = p*16; cont1<=4; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    break;
                    
                case 15:
                
                    for(int cont1 = 1,  soma = 0; cont1<=8; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    for(int cont1 = 1,  soma = p*16; cont1<=4; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    break;
                    
                case 16:
                
                    for(int cont1 = 1,  soma = 0; cont1<=8; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    break;
                    
                case 17:
                
                    for(int cont1 = 1,  soma = 0; cont1<=8; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    for(int cont1 = 1,  soma = p*18; cont1<=2; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    break;
                    
                case 18:
                
                    for(int cont1 = 1,  soma = 0; cont1<=5; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    for(int cont1 = 1,  soma = p*14; cont1<=7; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    break;
                    
                case 19:
                
                    for(int cont1 = 1,  soma = 0; cont1<=19; cont1++, soma+=p)
                    {
                        Square quadrado = new Square();
                        quadrado.makeVisible();
                        quadrado.changeColor("black");
                        quadrado.changeSize(p);
                        quadrado.moveVertical(soma);
                        quadrado.moveHorizontal(cont*p);
                    }
                    break;
            }
        }
        
    }
}
