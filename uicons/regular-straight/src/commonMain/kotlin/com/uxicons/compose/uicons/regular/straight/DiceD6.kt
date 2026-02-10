package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD6: ImageVector? = null

val Icons.Rs.DiceD6: ImageVector
    get() = _DiceD6 ?: UXIcon(name = "DiceD6") {
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
                moveTo(11.48f, 2.14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.03f, 0f)
                lineToRelative(7.54f, 4.53f)
                lineTo(12f, 11.5f)
                lineTo(3.94f, 6.67f)
                close()
                moveTo(3f, 16.77f)
                lineTo(3f, 8.43f)
                lineToRelative(8f, 4.8f)
                verticalLineToRelative(8.33f)
                close()
                moveTo(13f, 21.57f)
                lineTo(13f, 13.23f)
                lineToRelative(8f, -4.8f)
                verticalLineToRelative(8.33f)
                close()
            }
        }.also { _DiceD6 = it}
