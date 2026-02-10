package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fill: ImageVector? = null

val Icons.Rs.Fill: ImageVector
    get() = _Fill ?: UXIcon(name = "Fill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.61f, 15.03f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(-13.61f, -13.61f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.13f, 1.13f)
                lineToRelative(-1.55f, 1.55f)
                lineToRelative(-2.85f, -2.88f)
                lineToRelative(-1.42f, 1.41f)
                lineToRelative(2.86f, 2.89f)
                lineToRelative(-6.29f, 6.3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                lineToRelative(7.07f, 7.07f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineToRelative(9.26f, -9.26f)
                close()
                moveTo(10.78f, 21.71f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                lineToRelative(-7.07f, -7.07f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.41f)
                lineToRelative(6.29f, -6.29f)
                lineToRelative(4.71f, 4.76f)
                lineToRelative(1.42f, -1.4f)
                lineToRelative(-4.72f, -4.78f)
                lineToRelative(1.56f, -1.56f)
                lineToRelative(8.49f, 8.49f)
                close()
                moveTo(21.5f, 17f)
                reflectiveCurveToRelative(2.5f, 3.12f, 2.5f, 4.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 0f)
                curveToRelative(0f, -1.25f, 2.5f, -4.5f, 2.5f, -4.5f)
                close()
            }
        }.also { _Fill = it}
