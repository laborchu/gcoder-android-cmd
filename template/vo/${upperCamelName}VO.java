package ${config.java.package.vo};

import ${config.java.package.vo}.BaseVO;

import java.util.List;
import java.util.Map;
import java.math.BigDecimal;
import java.util.Date;

public class ${table.upperCamelName}VO extends BaseVO{
    <%table.fieldArray.filter(function(field){return !field.ignore}).forEach(function(field){%>
    /**
     * ${field.comment}
     */
    private ${field.javaType} ${field.lowerCamelName};<%})%>

    <%table.fieldArray.filter(function(field){return !field.ignore}).forEach(function(field){%>
    public ${field.javaType} get${field.upperCamelName}() {
        return ${field.lowerCamelName};
    }
    public void set${field.upperCamelName}(${field.javaType} ${field.lowerCamelName}) {
        this.${field.lowerCamelName} = ${field.lowerCamelName};
    }<%})%>
}