package ace.jenkins

def call(String name, String surName){
   def helloWorld = "Hello!! greetings $name $surName"
   echo "$MAJOR_VERSION"
   return helloWorld
}