
package graphics;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Héctor Quej Cosgaya
 * @author Jose Aguilar Canepa
 * 
 * Esta clase necesita de tu ayuda!
 */
public class Rectangulo extends FiguraGrafica {
    
    private int x;
    private int y;
    private int base;
    private int altura;
    
    public Rectangulo(int x, int y, int base, int altura){
        this.x = x;
        this.y = y;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar(Graphics g) {
        g.fillRect(x, y, base, altura);
    }

    @Override
    public void encojer(Graphics g) {
        base -= 8;
        altura -= 5;
        if(base < 8) base=8;
        if(altura < 5) altura=5;
        this.dibujar(g);
    }

    @Override
    public void agrandar(Graphics g) {
        base +=8;
        altura +=5;
        if(base > 320) base = 320;
        if(altura > 200) altura=200;
        this.dibujar(g);
    }

    @Override
    public void cambiarColor(Graphics g, Color c) {
        g.setColor(c);
        this.dibujar(g);
    }

    @Override
    public void mover(Graphics g, String direccion) {
        switch(direccion){
            case "arriba": y-=5; break;
            case "abajo": y+=5; break;
            case"izquierda": x-=5; break;
            case "derecha": x+=5; break;
        }
        this.dibujar(g);
    }
    
}