package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD8: ImageVector? = null

val Icons.Sr.DiceD8: ImageVector
    get() = _DiceD8 ?: UXIcon(name = "DiceD8") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.1f, 10.76f)
                arcToRelative(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1.98f)
                lineTo(9.01f, 1.2f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 0f)
                lineTo(11f, 13.66f)
                close()
                moveTo(13f, 13.66f)
                lineTo(22.89f, 10.76f)
                arcToRelative(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.02f, -2f)
                lineTo(14.99f, 1.21f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 0f)
                close()
                moveTo(11f, 15.74f)
                lineTo(1f, 12.81f)
                arcToRelative(5.08f, 5.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.13f, 2.43f)
                lineToRelative(6.9f, 7.54f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 23.99f)
                close()
                moveTo(13f, 15.74f)
                lineTo(13f, 24f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.01f, -1.21f)
                lineToRelative(6.9f, -7.58f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 12.81f)
                close()
            }
        }.also { _DiceD8 = it}
