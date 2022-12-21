package ru.miit.kisproject.model;

/**
 * Table: sys_options
 */
public class Options {
    /**
     * Column: option_name
     * Type: varchar(50)
     */
    private String optName;

    /**
     * Column: option_value
     * Type: varchar(50)
     */
    private String optValue;

    public String getOptName() {
        return optName;
    }

    public void setOptName(String optName) {
        this.optName = optName == null ? null : optName.trim();
    }

    public String getOptValue() {
        return optValue;
    }

    public void setOptValue(String optValue) {
        this.optValue = optValue == null ? null : optValue.trim();
    }
}