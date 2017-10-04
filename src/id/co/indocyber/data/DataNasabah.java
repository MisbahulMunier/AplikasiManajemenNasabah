/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.data;

/**
 *
 * @author Misbahul Munir
 */
public class DataNasabah implements Comparable<DataNasabah>{  

    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the married
     */
    public Boolean getMarried() {
        return married;
    }

    /**
     * @param married the married to set
     */
    public void setMarried(Boolean married) {
        this.married = married;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the salary
     */
    
    /**
     * @return the noTeleponNasabah
     */
    public String getNoTeleponNasabah() {
        return noTeleponNasabah;
    }

    /**
     * @param noTeleponNasabah the noTeleponNasabah to set
     */
    public void setNoTeleponNasabah(String noTeleponNasabah) {
        this.noTeleponNasabah = noTeleponNasabah;
    }

    /**
     * @return the noHpNasabah
     */
    public String getNoHpNasabah() {
        return noHpNasabah;
    }

    /**
     * @param noHpNasabah the noHpNasabah to set
     */
    public void setNoHpNasabah(String noHpNasabah) {
        this.noHpNasabah = noHpNasabah;
    }

    /**
     * @return the alamatNasabah
     */
    public String getAlamatNasabah() {
        return alamatNasabah;
    }

    /**
     * @param alamatNasabah the alamatNasabah to set
     */
    public void setAlamatNasabah(String alamatNasabah) {
        this.alamatNasabah = alamatNasabah;
    }
    private String kode;
    private String name;
    private String gender;
    private Boolean married;
    private Integer age;
    private String noTeleponNasabah;
    private String noHpNasabah;
    private String alamatNasabah;

    public DataNasabah() {
    }
    
     public DataNasabah(String kode, String name) {
        this.kode = kode;
        this.name = name;
        
    }
    
    public DataNasabah(String kode, String name, String gender, Boolean married, Integer age, String noTeleponNasabah, String noHpNasabah, String alamatNasabah) {
        this.kode = kode;
        this.name = name;
        this.gender = gender;
        this.married = married;
        this.age = age;
        this.noTeleponNasabah = noTeleponNasabah;
        this.noHpNasabah = noHpNasabah;
        this.alamatNasabah = alamatNasabah;
    }
    public DataNasabah(String gender, Boolean married, Integer age, String noTeleponNasabah, String noHpNasabah, String alamatNasabah) {

        this.gender = gender;
        this.married = married;
        this.age = age;
        this.noTeleponNasabah = noTeleponNasabah;
        this.noHpNasabah = noHpNasabah;
        this.alamatNasabah = alamatNasabah;
    }

    @Override
    public int compareTo(DataNasabah o) {
        return kode.compareTo(o.kode);//To change body of generated methods, choose Tools | Templates.
    }

    
    
}
