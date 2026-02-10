package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD4: ImageVector? = null

val Icons.Rs.DiceD4: ImageVector
    get() = _DiceD4 ?: UXIcon(name = "DiceD4") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.42f, 1.23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.84f, 0f)
                lineTo(0f, 15.24f)
                lineToRelative(12f, 8.75f)
                lineToRelative(12f, -8.75f)
                close()
                moveTo(21.25f, 14.76f)
                lineTo(13f, 20.78f)
                lineTo(13f, 2.69f)
                close()
                moveTo(11f, 2.69f)
                lineTo(11f, 20.78f)
                lineTo(2.75f, 14.76f)
                close()
            }
        }.also { _DiceD4 = it}
