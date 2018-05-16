package ${config.java.package.cmd}.${table.prefix};

import ${config.java.package.vo}.CmdSign;
import ${config.java.package.cmd}.ARcHttpCmd;
import ${config.java.package.code}.CmdCode;
import ${config.java.package.vo}.${table.prefix}.${table.upperCamelName}VO;
import ${config.java.package.service}.${table.prefix}.I${table.upperCamelName}Service;
import ${config.java.package.cmd}.ACmd;


public class ${table.upperCamelName}DelCmd extends ARcHttpCmd<CmdSign> {

    @Override
    public CmdSign req() throws Exception {
        return super.buildCmdSignPb();
    }

    @Override
    public void resp(CmdSign sign) throws Exception {
    }


    @Override
    public void onError(CmdSign sign) {

    }

    @Override
    public String getCmdCode() {
        return CmdCode.${table.upperTableName}_DEL;
    }
}
