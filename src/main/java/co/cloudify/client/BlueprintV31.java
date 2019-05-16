package co.cloudify.client;

import java.util.Date;

public class BlueprintV31 {
    private Date created_at;
    private String description;
    private String id;
    private String main_file_name;
    private Date updated_at;

    /**
     * @return the created_at
     */
    public Date getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the main_file_name
     */
    public String getMain_file_name() {
        return main_file_name;
    }

    /**
     * @param main_file_name the main_file_name to set
     */
    public void setMain_file_name(String main_file_name) {
        this.main_file_name = main_file_name;
    }

    /**
     * @return the updated_at
     */
    public Date getUpdated_at() {
        return updated_at;
    }

    /**
     * @param updated_at the updated_at to set
     */
    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}