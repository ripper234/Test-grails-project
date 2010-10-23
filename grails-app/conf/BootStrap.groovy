import test1.Book

class BootStrap {

  def init = { servletContext ->
    // Create some test data
    new Book(author: "Stephen King", title: "The Shining").save()
    new Book(author: "James Patterson", title: "Along Came a Spider").save()
  }
  def destroy = {
  }
}
