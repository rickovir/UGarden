/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugarden;

/**
 *
 * @author hp431
 */
public class Kaktus extends UGarden {
    public boolean isTumbuh() {
        if (getStatusPemupukan() >= 1 && getStatusPenyiraman() >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public void bertumbuh() {
        setStatusPemupukan((getStatusPemupukan() - 1));
        setStatusPenyiraman((getStatusPenyiraman() - 2));
        setStatusTumbuh(getStatusTumbuhInteger() + 1);
    }
}
