package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fill: ImageVector? = null

val Icons.Ss.Fill: ImageVector
    get() = _Fill ?: UXIcon(name = "Fill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.45f, 13.86f)
                lineToRelative(-9.26f, 9.26f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.24f, 0f)
                lineToRelative(-7.07f, -7.07f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.24f)
                lineToRelative(6.3f, -6.3f)
                lineToRelative(-2.86f, -2.89f)
                lineToRelative(1.42f, -1.41f)
                lineToRelative(8.97f, 9.08f)
                lineToRelative(1.54f, -1.53f)
                lineToRelative(-6.12f, -6.2f)
                lineToRelative(0.01f, -0.02f)
                lineToRelative(-1.1f, -1.1f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(13.58f, 13.58f)
                lineToRelative(-1.42f, 1.42f)
                close()
                moveTo(19f, 21.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
                curveToRelative(0f, -1.38f, -2.5f, -4.5f, -2.5f, -4.5f)
                reflectiveCurveToRelative(-2.5f, 3.25f, -2.5f, 4.5f)
                close()
            }
        }.also { _Fill = it}
