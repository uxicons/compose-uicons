package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD8: ImageVector? = null

val Icons.Rs.DiceD8: ImageVector
    get() = _DiceD8 ?: UXIcon(name = "DiceD8") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.11f, 0.87f)
                arcTo(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.85f, 0.92f)
                lineTo(0.03f, 12f)
                lineTo(9.89f, 23.13f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 24f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.15f, -0.92f)
                lineTo(23.96f, 12f)
                close()
                moveTo(20.74f, 11.38f)
                lineTo(13f, 13.66f)
                lineTo(13f, 2.63f)
                close()
                moveTo(11f, 2.62f)
                lineTo(11f, 13.66f)
                lineTo(3.25f, 11.37f)
                close()
                moveTo(4.25f, 13.75f)
                lineTo(11f, 15.75f)
                verticalLineToRelative(5.63f)
                close()
                moveTo(13f, 21.38f)
                lineTo(13f, 15.75f)
                lineToRelative(6.74f, -1.99f)
                close()
            }
        }.also { _DiceD8 = it}
