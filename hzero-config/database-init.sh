#!/usr/bin/env bash
mkdir -p tool-jar
if [ ! -f tool-jar/choerodon-tool-liquibase.jar ]
then
    curl https://nexus.choerodon.com.cn/repository/choerodon-release/io/choerodon/choerodon-tool-liquibase/0.10.0.RELEASE/choerodon-tool-liquibase-0.10.0.RELEASE.jar -o ./tool-jar/choerodon-tool-liquibase.jar
fi

service=hzero_platform
schema=$service
dir=groovy/$service


java -Dspring.datasource.url="jdbc:mysql://db.hzero.org:3306/hzero_governance?useUnicode=true&characterEncoding=utf-8&useSSL=false" \
     -Dspring.datasource.username=hzero \
     -Dspring.datasource.password=hzero \
     -Ddata.drop=false \
	 -Ddata.init=true \
     -Ddata.dir=src/main/resources \
	 -Ddata.update.exclusion=iam_role,fd_organization,iam_user,hiam_user_info,iam_member_role,oauth_client,oauth_ldap,oauth_password_policy \
	 -Dlogging.level.root=info \
     -jar tool-jar/choerodon-tool-liquibase.jar



	 