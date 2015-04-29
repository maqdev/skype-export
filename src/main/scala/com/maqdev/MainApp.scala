package com.maqdev

object MainApp extends App {

  val driver = Class.forName("org.sqlite.JDBC")

  val path: String = if (args.isEmpty) {
    println("Please specify path to the Skype DB")
    System.exit(0)
    throw new RuntimeException
  }
  else
    args(0)

  val skypeDb = new SkypeDb(path)
  println("path = " + path)

  for (conversation ← skypeDb.getConversations) {
    println("---------------------------------")
    println(s"CHAT-GROUP: ${conversation.name}")
    println("---------------------------------")

    for (message ← skypeDb.getMessages(conversation.id)) {
      println(s"${message.sent} ${message.authorName}/${message.author}: ${message.message}")
    }
  }
}
