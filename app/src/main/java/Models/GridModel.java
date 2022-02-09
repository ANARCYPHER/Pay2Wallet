package Models;

public class GridModel {
    String fieldName;
    Integer fieldImage;

    public GridModel(String fieldName, Integer fieldImage) {
        this.fieldName = fieldName;
        this.fieldImage = fieldImage;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Integer getFieldImage() {
        return fieldImage;
    }

    public void setFieldImage(Integer fieldImage) {
        this.fieldImage = fieldImage;
    }


}
