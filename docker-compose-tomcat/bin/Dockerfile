FROM centos:latest
 
ARG DEBIAN_FRONTEND=noninteractive


# Mirror
#ADD sources.list /etc/apt/
RUN curl -o /etc/yum.repos.d/CentOS-Base.repo https://mirrors.aliyun.com/repo/Centos-8.repo && \
   yum makecache
#RUN yum install -y gnupg2 
#RUN yum adv --keyserver keyserver.ubuntu.com --recv-keys 40976EAF437D05B5
#RUN yum adv --keyserver keyserver.ubuntu.com --recv-keys 3B4FE6ACC0B21F32

# Update
RUN yum -y update && \
    yum install -y net-tools autoconf automake wget java mysql-server


#RUN systemctl start  mysqld.service
#CMD mysql -uroot -p \
#    && ALTER USER 'root'@'localhost' IDENTIFIED BY 'yb123456'; 

RUN curl -o /opt/tomcat.tar.gz http://ftp.tc.edu.tw/pub/Apache/tomcat/tomcat-8/v8.5.57/bin/apache-tomcat-8.5.57.tar.gz \
    && tar -xvf /opt/tomcat.tar.gz
#RUN /opt/tomcat/bin/startup.sh
