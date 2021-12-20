package ru.samsung.itacademy.mdev.simplecalctemplate

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class CalculatorTest {
    private var calculator: Calculator? = null
    @Before
    fun setUp() {
        calculator = Calculator()
    }
    @Test
    fun addition_isCorrect() {
        assertEquals(4, calculator?.add(2, 2))
    }
    @Test
    fun subtract_isCorrect() {
        assertEquals(5, calculator?.subtract(10, 5))
    }
    @Test
    fun multiply_isCorrect() {
        assertEquals(16, calculator?.multiply(4, 4))
    }
    @Test
    fun divide_isCorrect() {
        assertEquals(2, calculator?.divide(10, 5))
    }
    @Test
    fun divide_zero_isCorrect() {
        assertEquals(0, calculator?.divide(10, 0))
    }
    @Test
    fun all_isCorrect() {
        assertEquals(0, calculator?.divide(2, 0),)
        assertEquals(0, calculator?.add(2, 0),)
        assertEquals(0, calculator?.subtract(2, 0),)
        assertEquals(0, calculator?.multiply(2, 0),)
    }

}