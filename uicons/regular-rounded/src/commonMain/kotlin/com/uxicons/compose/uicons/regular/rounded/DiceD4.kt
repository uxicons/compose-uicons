package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD4: ImageVector? = null

val Icons.Rr.DiceD4: ImageVector
    get() = _DiceD4 ?: UXIcon(name = "DiceD4") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.29f, 12.97f)
                lineTo(15.15f, 1.54f)
                curveToRelative(-0.01f, -0.02f, -0.02f, -0.03f, -0.04f, -0.05f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.28f, 0.05f)
                lineTo(0.7f, 12.98f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 5.54f)
                lineToRelative(7.67f, 4.73f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.25f, 0f)
                lineToRelative(7.73f, -4.78f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.29f, 12.97f)
                close()
                moveTo(2.82f, 16.86f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.48f, -2.73f)
                lineToRelative(8.1f, -11.38f)
                arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 2.27f)
                lineTo(11f, 21.83f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.58f, -0.28f)
                close()
                moveTo(21.24f, 16.82f)
                lineTo(13.58f, 21.55f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.58f, 0.28f)
                lineTo(13f, 2.27f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.54f, 0.46f)
                lineToRelative(8.1f, 11.38f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.24f, 16.82f)
                close()
            }
        }.also { _DiceD4 = it}
