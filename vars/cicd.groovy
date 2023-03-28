def newDownload(repo)
{
  git "https://github.com/sohailkhan17/${repo}"
}
def newBuild()
{
  sh 'mvn package'
}
