package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD4: ImageVector? = null

val Icons.Sr.DiceD4: ImageVector
    get() = _DiceD4 ?: UXIcon(name = "DiceD4") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 24f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.63f, -0.64f)
                lineTo(1.71f, 18.52f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -5.54f)
                lineTo(8.85f, 1.41f)
                arcTo(4.04f, 4.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 0f)
                close()
                moveTo(23.29f, 12.97f)
                lineTo(15.15f, 1.41f)
                lineTo(15.12f, 1.36f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 0f)
                verticalLineTo(24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.63f, -0.64f)
                lineToRelative(7.73f, -4.88f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.29f, 12.97f)
                close()
            }
        }.also { _DiceD4 = it}
