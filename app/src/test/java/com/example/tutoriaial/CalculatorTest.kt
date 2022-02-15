package com.example.tutoriaial

import org.junit.Assert.*
import org.assertj.core.api.Assertions.*
import org.junit.Before
import org.junit.Test

class CalculatorTest {
    lateinit var sut: Calculator

    @Before
    fun setUp() {
        sut = Calculator()
    }
    @Test
    fun multiplyで2と3を掛けたら6が取得できる() {
        val actual = sut.multiply(2,3)
        val expected = 6

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun multiplyで0と3を掛けたら0が取得できる() {
        val actual = sut.multiply(0,3)
        val expected = 0

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun divideで6を2で割った結果を取得できる() {
        val actual = sut.divide(6,2)
        val expected = 3.0

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun divideで3を2で割った結果を取得できる() {
        val actual = sut.divide(3,2)
        val expected = 1.5

        assertThat(actual).isEqualTo(expected)
    }

    @Test(expected = IllegalArgumentException::class)
    fun divideで3を0で割るとIllegalArgumentExceptionが送出される() {
        val actual = sut.divide(3,0)
    }

    @Test
    fun method() {
    }
}