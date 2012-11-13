package com.jyc.rpg

trait Character

case class PlayerCharacter(body: Int, mind: Int, social: Int) extends Character