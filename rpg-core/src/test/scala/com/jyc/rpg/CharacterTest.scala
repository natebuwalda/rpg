package com.jyc.rpg

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSuite, GivenWhenThen, FlatSpec}

@RunWith(classOf[JUnitRunner])
class CharacterTest extends FunSuite {

  test("Add body score") {
    val result = PlayerCharacter(1, 0, 0)
    assert(result.body === 1)
  }

  test("Add mind score") {
    val result = PlayerCharacter(0, 1, 0)
    assert(result.mind === 1)
  }

  test("Add social score") {
    val result = PlayerCharacter(0, 0, 1)
    assert(result.social === 1)
  }

}

@RunWith(classOf[JUnitRunner])
class CharacterAcceptanceTest extends FlatSpec with GivenWhenThen {

  behavior of "A Player Character"

  it must "have all attributes" in {
    given("the attribute scores")
    val body = 1
    val mind = 2
    val social = 3

    when("a new character is created by the player")
    val result = PlayerCharacter(body, mind, social)

    then("has all attributes populated")
    assert(body === result.body)
    assert(mind === result.mind)
    assert(social === result.social)
  }

}
