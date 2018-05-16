package ${config.java.package.cmd};

import ${config.java.package.vo}.CmdSign;
import ${config.java.package.cmd}.ARcHttpCmd;
import ${config.java.package.code}.CmdCode;

public class ${table.upperCamelName}PostCmd extends ARcHttpCmd<CmdSign> {

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
        return CmdCode.${table.upperTableName}_POST;
    }

}
