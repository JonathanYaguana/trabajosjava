/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author edu_r
 */
public class n_usuario
{

    public void soloNumeros(JTextField a)
    {
        a.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                if (Character.isLetter(c))
                {
                    e.consume();
                }

            }

        });

    }

    public void soloLetras(JTextField a)
    {
        a.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                char c = e.getKeyChar();
                if (Character.isDigit(c))
                {
                    e.consume();
                }

            }

        });

    }

    public void limitar_caracteres(JTextField a, int nmax)
    {
        a.addKeyListener(new KeyAdapter()
        {
            public void keyTyped(KeyEvent e)
            {
                if (a.getText().length() == nmax)
                {
                    e.consume();
                }
            }
        });
    }

}
