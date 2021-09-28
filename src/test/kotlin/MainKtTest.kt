import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun comission_forMasterCardAndMaestro() {
        val typeCard = "Mastercard"
        val sumTransfer = 50000_00.0
        val currentTransfer = 10000_00.0

        val result = comission(
            typeCard = typeCard,
            sumTransfer = sumTransfer,
            currentTransfer = currentTransfer
        )

        assertEquals(0.0, result, 0.0)
    }

    @Test
    fun comission_forMasterCardAndMaestro_underLimit() {
        val typeCard = "Mastercard"
        val sumTransfer = 75000_00.0
        val currentTransfer = 10000_00.0

        val result = comission(
            typeCard = typeCard,
            sumTransfer = sumTransfer,
            currentTransfer = currentTransfer
        )

        assertEquals(80_00.0, result, 0.0)
    }

    @Test
    fun comission_forVisaAndMir() {
        val typeCard = "Visa"
        val sumTransfer = 0.0
        val currentTransfer = 500_00.0

        val result = comission(
            typeCard = typeCard,
            sumTransfer = sumTransfer,
            currentTransfer = currentTransfer
        )

        assertEquals(35_00.0, result, 0.0)
    }

    @Test
    fun comission_forVisaAndMir_underLimit() {
        val typeCard = "Visa"
        val sumTransfer = 0.0
        val currentTransfer = 5000_00.0

        val result = comission(
            typeCard = typeCard,
            sumTransfer = sumTransfer,
            currentTransfer = currentTransfer
        )

        assertEquals(37_50.0, result, 0.0)
    }

    @Test
    fun comission_forVkPay() {
        val typeCard = "Vk Pay"
        val sumTransfer = 900000_00.0
        val currentTransfer = 5000_00.0

        val result = comission(
            typeCard = typeCard,
            sumTransfer = sumTransfer,
            currentTransfer = currentTransfer
        )

        assertEquals(10.0, result, 0.0)
    }
}