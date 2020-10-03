package com.xiaolun.yellowchicken.common

/**
 * 1、使用样例类来构建协议，样例类默认实现了序列化
 * 2、客户端发给服务器协议(序列化的对象)
 * 3、构建样例类中的参数(mes: String)，默认会成为该样例类
 * 的一个私有书属性
 */
case class ClientMessage(mes: String)

//服务端发给客户端的协议(样例类对象)
case class ServerMessage(mes: String)
