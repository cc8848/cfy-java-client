package co.cloudify.client;

import java.util.Date;
import java.util.Map;

public class DeploymentV31 {
    private String blueprint_id;
    private Date created_at;
    private Date updated_at;
    private String created_by;
    private String description;
    private String id;
    private Map<String, Object> outputs;
    private Map<String, Object> capabilities;
    private String tenant_name;

    /**
     * @return the blueprint_id
     */
    public String getBlueprint_id() {
        return blueprint_id;
    }

    /**
     * @param blueprint_id the blueprint_id to set
     */
    public void setBlueprint_id(String blueprint_id) {
        this.blueprint_id = blueprint_id;
    }

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

    /**
     * @return the created_by
     */
    public String getCreated_by() {
        return created_by;
    }

    /**
     * @param created_by the created_by to set
     */
    public void setCreated_by(String created_by) {
        this.created_by = created_by;
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
     * @return the outputs
     */
    public Map<String, Object> getOutputs() {
        return outputs;
    }

    /**
     * @param outputs the outputs to set
     */
    public void setOutputs(Map<String, Object> outputs) {
        this.outputs = outputs;
    }

    /**
     * @return the capabilities
     */
    public Map<String, Object> getCapabilities() {
        return capabilities;
    }

    /**
     * @param capabilities the capabilities to set
     */
    public void setCapabilities(Map<String, Object> capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * @return the tenant_name
     */
    public String getTenant_name() {
        return tenant_name;
    }

    /**
     * @param tenant_name the tenant_name to set
     */
    public void setTenant_name(String tenant_name) {
        this.tenant_name = tenant_name;
    }
}