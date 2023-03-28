def newDownload(repo)
{
  git "https://github.com/sohailkhan17/${repo}"
}
def newBuild()
{
  sh 'mvn package'
}
def newDeploy(jobname,ip,appname)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
def newTesting(jobname1)
{
  sh "java -jar  /var/lib/jenkins/workspace/${jobname1}/testing.jar"
}
def newTestDownload(repo1)
{
  git "https://github.com/prasadcloud/${repo1}"
}
def newDelivery(jobname,ip,appname)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
