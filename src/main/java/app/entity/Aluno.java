
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela ALUNO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"ALUNO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Aluno")
@EntityListeners({cronapi.database.HistoryListener.class})
@CronappTable(role=CronappTableRole.CLASS)
public class Aluno implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Name")
    @Column(name = "name", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String name;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Matrcula")
    @Column(name = "Matrcula", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String Matrcula;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Data Nascimento")
    @Column(name = "DataNascimento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date DataNascimento;


    /**
    * Construtor
    * @generated
    */
    public Aluno(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Aluno setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém name
    * return name
    * @generated
    */
    public java.lang.String getName() {
        return this.name;
    }

    /**
    * Define name
    * @param name name
    * @generated
    */
    public Aluno setName(java.lang.String name) {
        this.name = name;
        return this;
    }
    /**
    * Obtém Matrcula
    * return Matrcula
    * @generated
    */
    public java.lang.String getMatrcula() {
        return this.Matrcula;
    }

    /**
    * Define Matrcula
    * @param Matrcula Matrcula
    * @generated
    */
    public Aluno setMatrcula(java.lang.String Matrcula) {
        this.Matrcula = Matrcula;
        return this;
    }
    /**
    * Obtém DataNascimento
    * return DataNascimento
    * @generated
    */
    public java.util.Date getDataNascimento() {
        return this.DataNascimento;
    }

    /**
    * Define DataNascimento
    * @param DataNascimento DataNascimento
    * @generated
    */
    public Aluno setDataNascimento(java.util.Date DataNascimento) {
        this.DataNascimento = DataNascimento;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Aluno object = (Aluno)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}