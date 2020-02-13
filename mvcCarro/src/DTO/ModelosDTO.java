/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

/**
 *
 * @author 110000636
 */
public class ModelosDTO {
    private int mod_cod;
    private String mod_desc;
    protected MarcaDTO marca = new MarcaDTO();
    public MarcaDTO getMarca(){
        return marca;
    }
    public void setMarca(MarcaDTO marca){
        this.marca = marca;
    }

    public int getMod_cod() {
        return mod_cod;
    }

    public void setMod_cod(int mod_cod) {
        this.mod_cod = mod_cod;
    }

    public String getMod_desc() {
        return mod_desc;
    }

    public void setMod_desc(String mod_desc) {
        this.mod_desc = mod_desc;
    }
    

}
