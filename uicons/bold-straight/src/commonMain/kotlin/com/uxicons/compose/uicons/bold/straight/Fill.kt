package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fill: ImageVector? = null

val Icons.Bs.Fill: ImageVector
    get() = _Fill ?: UXIcon(name = "Fill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.87f, 15.99f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-13.87f, -13.87f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(0.93f, 0.93f)
                lineToRelative(-1.88f, 1.88f)
                lineToRelative(-2.99f, -2.99f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(2.99f, 2.99f)
                lineToRelative(-3.89f, 3.89f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.95f)
                lineToRelative(7.07f, 7.07f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, 0f)
                lineToRelative(7.89f, -7.89f)
                close()
                moveTo(10.94f, 20.84f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, 0f)
                lineToRelative(-7.07f, -7.07f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -0.71f)
                lineToRelative(3.89f, -3.89f)
                lineToRelative(4.39f, 4.39f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-4.39f, -4.39f)
                lineToRelative(1.88f, -1.88f)
                lineToRelative(7.78f, 7.78f)
                close()
                moveTo(24f, 21.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 0f)
                curveToRelative(0f, -1.25f, 2.5f, -4.5f, 2.5f, -4.5f)
                reflectiveCurveToRelative(2.5f, 3.12f, 2.5f, 4.5f)
                close()
            }
        }.also { _Fill = it}
