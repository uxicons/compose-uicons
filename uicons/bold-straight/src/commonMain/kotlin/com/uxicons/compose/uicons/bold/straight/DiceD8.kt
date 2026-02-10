package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD8: ImageVector? = null

val Icons.Bs.DiceD8: ImageVector
    get() = _DiceD8 ?: UXIcon(name = "DiceD8") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.4f, 0.99f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.8f, 0f)
                lineTo(0.01f, 12f)
                lineTo(9.6f, 23.01f)
                arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.8f, 0f)
                lineTo(23.99f, 12f)
                close()
                moveTo(19.27f, 11.15f)
                lineTo(13.5f, 12.86f)
                lineTo(13.5f, 4.52f)
                close()
                moveTo(10.5f, 4.52f)
                verticalLineToRelative(8.34f)
                lineToRelative(-5.77f, -1.7f)
                close()
                moveTo(6.4f, 14.77f)
                lineToRelative(4.1f, 1.21f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(13.5f, 19.48f)
                verticalLineToRelative(-3.5f)
                lineToRelative(4.1f, -1.21f)
                close()
            }
        }.also { _DiceD8 = it}
