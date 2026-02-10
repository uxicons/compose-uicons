package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD4: ImageVector? = null

val Icons.Bs.DiceD4: ImageVector
    get() = _DiceD4 ?: UXIcon(name = "DiceD4") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.75f, 1.39f)
                arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, 0f)
                lineTo(0.02f, 15.22f)
                lineTo(12f, 24f)
                lineToRelative(12f, -8.78f)
                close()
                moveTo(19.91f, 14.49f)
                lineTo(13.5f, 19.18f)
                lineTo(13.5f, 4.92f)
                close()
                moveTo(10.5f, 4.92f)
                lineTo(10.5f, 19.18f)
                lineTo(4.11f, 14.5f)
                close()
            }
        }.also { _DiceD4 = it}
