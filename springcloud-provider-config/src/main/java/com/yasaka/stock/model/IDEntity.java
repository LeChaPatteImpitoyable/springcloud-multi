/**
 * 
 */
package com.yasaka.stock.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author nelson
 *
 */
@MappedSuperclass
public abstract class IDEntity implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @GenericGenerator(name="idGenerator", strategy="uuid")
    @GeneratedValue(generator="idGenerator")
    protected String id;
    
    /**
     * 空构造
     */
    public IDEntity() {
    }

    /**
     * @param id
     */
    public IDEntity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
