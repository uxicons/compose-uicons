package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD20: ImageVector? = null

val Icons.Rs.DiceD20: ImageVector
    get() = _DiceD20 ?: UXIcon(name = "DiceD20") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.54f, 0.43f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.09f, 0f)
                lineTo(1f, 6.1f)
                lineTo(1f, 17.9f)
                lineToRelative(9.46f, 5.67f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.09f, 0f)
                lineTo(23f, 17.9f)
                lineTo(23f, 6.1f)
                close()
                moveTo(8.8f, 11f)
                lineTo(15.2f, 11f)
                lineTo(12f, 16.11f)
                close()
                moveTo(12.05f, 3.15f)
                lineTo(15.3f, 9f)
                lineTo(8.72f, 9f)
                close()
                moveTo(17.23f, 8.36f)
                lineTo(14.41f, 3.28f)
                lineTo(20.06f, 6.67f)
                close()
                moveTo(6.78f, 8.37f)
                lineToRelative(-2.84f, -1.7f)
                lineTo(9.72f, 3.2f)
                close()
                moveTo(5.74f, 10.08f)
                lineTo(3f, 14.09f)
                lineTo(3f, 8.43f)
                close()
                moveTo(6.96f, 11.83f)
                lineTo(10.01f, 16.7f)
                lineToRelative(-5.99f, -0.55f)
                close()
                moveTo(17.05f, 11.81f)
                lineTo(20.08f, 16.14f)
                lineTo(14f, 16.68f)
                close()
                moveTo(18.27f, 10.07f)
                lineTo(21f, 8.43f)
                verticalLineToRelative(5.54f)
                close()
                moveTo(5.55f, 18.3f)
                lineTo(11f, 18.8f)
                verticalLineToRelative(2.77f)
                close()
                moveTo(13f, 21.57f)
                lineTo(13f, 18.78f)
                lineToRelative(5.45f, -0.48f)
                close()
            }
        }.also { _DiceD20 = it}
