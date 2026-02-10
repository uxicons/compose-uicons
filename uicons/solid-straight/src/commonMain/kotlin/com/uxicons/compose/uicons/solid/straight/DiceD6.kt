package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD6: ImageVector? = null

val Icons.Ss.DiceD6: ImageVector
    get() = _DiceD6 ?: UXIcon(name = "DiceD6") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.85f, 5.59f)
                lineTo(10.46f, 0.43f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.09f, 0f)
                lineTo(22.07f, 5.54f)
                lineTo(12f, 11.51f)
                close()
                moveTo(11f, 13.24f)
                lineTo(1f, 7.41f)
                lineTo(1f, 18.09f)
                lineToRelative(9.46f, 5.67f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 24f)
                close()
                moveTo(13f, 13.24f)
                lineTo(13f, 24f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.54f, -0.23f)
                lineTo(23f, 18.09f)
                lineTo(23f, 7.31f)
                close()
            }
        }.also { _DiceD6 = it}
