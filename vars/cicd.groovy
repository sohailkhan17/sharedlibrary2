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
def newDelivery(ip,appname)
{
             input message: 'Approve Delivery of Code', submitter: 'srini'
               deploy adapters: [tomcat9(credentialsId: '91434be3-cdb5-4de6-b4c1-d2023c87be82', path: '', url: ${ip})], contextPath: ${appname}, war: '**/*.war'
}
