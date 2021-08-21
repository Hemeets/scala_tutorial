package chapter06

object test16_traitselftype {
  def main(args: Array[String]): Unit = {
    val user = new RegisterUser("alice", "12")
    user.insert()
  }

}


// 用户类
class User(val name: String, val password: String)

trait UserDao {
  _: User =>  // 定义自身类型为上面的User。使用场景：特质trait想用到主类的属性/方法，又不想麻烦的继承主类，可以声明一个这个东西

  // 向数据库插入数据
  def insert(): Unit = {
    println(s"insert into db: ${this.name}")
  }
}

// 定义注册用户类
class RegisterUser(name: String, password: String) extends User(name, password) with UserDao