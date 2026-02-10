package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spoon: ImageVector? = null

val Icons.Rs.Spoon: ImageVector
    get() = _Spoon ?: UXIcon(name = "Spoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.92f, 1.08f)
                curveToRelative(-2.58f, -2.58f, -8.74f, -0.04f, -11.1f, 2.32f)
                arcToRelative(6.22f, 6.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.65f, 8.02f)
                lineTo(0.04f, 22.54f)
                lineToRelative(1.41f, 1.41f)
                lineTo(12.58f, 12.83f)
                arcToRelative(6.22f, 6.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.02f, -0.65f)
                curveTo(22.96f, 9.82f, 25.5f, 3.66f, 22.92f, 1.08f)
                close()
                moveTo(19.19f, 10.77f)
                arcToRelative(4.21f, 4.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.96f, -5.96f)
                arcToRelative(11.49f, 11.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.66f, -2.83f)
                arcToRelative(2.24f, 2.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.61f, 0.51f)
                curveTo(22.95f, 3.94f, 21.04f, 8.91f, 19.19f, 10.77f)
                close()
            }
        }.also { _Spoon = it}
