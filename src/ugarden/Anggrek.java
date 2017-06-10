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
public class Anggrek extends UGarden{
     public boolean isTumbuh() {
        if (getStatusPemupukan() >= 4 && getStatusPenyiraman() >= 10) {
            return true;
        } else {
            return false;
        }
    }

    public void bertumbuh() {
        setStatusPemupukan((getStatusPemupukan() - 4));
        setStatusPenyiraman((getStatusPenyiraman() - 10));
        setStatusTumbuh(getStatusTumbuhInteger() + 1);
    }
}
