def newDownload(repo)
{
  git "https://github.com/prasadcloud/${repo}"
}
def newBuild()
{
  sh 'mvn package'
}
