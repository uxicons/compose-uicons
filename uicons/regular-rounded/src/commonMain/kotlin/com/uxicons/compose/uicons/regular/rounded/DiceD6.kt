package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD6: ImageVector? = null

val Icons.Rr.DiceD6: ImageVector
    get() = _DiceD6 ?: UXIcon(name = "DiceD6") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.57f, 4.31f)
                lineToRelative(-6f, -3.6f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.14f, 0f)
                lineToRelative(-6f, 3.6f)
                arcTo(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 8.6f)
                verticalLineToRelative(6.8f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.43f, 4.29f)
                lineToRelative(6f, 3.6f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.14f, 0f)
                lineToRelative(6f, -3.6f)
                arcTo(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 15.4f)
                lineTo(23f, 8.6f)
                arcTo(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.57f, 4.31f)
                close()
                moveTo(10.46f, 2.43f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.09f, 0f)
                lineToRelative(6f, 3.6f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.46f, 0.34f)
                lineToRelative(-8f, 4.8f)
                lineToRelative(-8f, -4.8f)
                arcToRelative(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.46f, -0.34f)
                close()
                moveTo(4.46f, 17.97f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 15.4f)
                lineTo(3f, 8.6f)
                arcToRelative(2.88f, 2.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.04f, -0.47f)
                lineTo(11f, 12.9f)
                verticalLineToRelative(8.93f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.54f, -0.26f)
                close()
                moveTo(21f, 15.4f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.46f, 2.57f)
                lineToRelative(-6f, 3.6f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.54f, 0.26f)
                lineTo(13f, 12.9f)
                lineToRelative(7.96f, -4.78f)
                arcTo(2.88f, 2.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 8.6f)
                close()
            }
        }.also { _DiceD6 = it}
