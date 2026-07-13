package org.example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MyModuleSuite extends AnyFlatSpec with Matchers:
  behavior of "MyModule"

  it should "have f()" in:
    "MyModule.f()" should compile

  it should "return 42" in:
    MyModule.f() shouldBe 42
