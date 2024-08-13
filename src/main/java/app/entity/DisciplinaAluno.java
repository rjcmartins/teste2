
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
* Classe que representa a tabela DISCIPLINAALUNO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"DISCIPLINAALUNO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.DisciplinaAluno")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class DisciplinaAluno implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_disciplina", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Disciplina disciplina;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_aluno", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Aluno aluno;


    /**
    * Construtor
    * @generated
    */
    public DisciplinaAluno(){
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
    public DisciplinaAluno setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém disciplina
    * return disciplina
    * @generated
    */
    public Disciplina getDisciplina() {
        return this.disciplina;
    }

    /**
    * Define disciplina
    * @param disciplina disciplina
    * @generated
    */
    public DisciplinaAluno setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
        return this;
    }
    /**
    * Obtém aluno
    * return aluno
    * @generated
    */
    public Aluno getAluno() {
        return this.aluno;
    }

    /**
    * Define aluno
    * @param aluno aluno
    * @generated
    */
    public DisciplinaAluno setAluno(Aluno aluno) {
        this.aluno = aluno;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
DisciplinaAluno object = (DisciplinaAluno)obj;
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