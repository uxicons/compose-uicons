package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Thunderstorm: ImageVector? = null

val Icons.Ss.Thunderstorm: ImageVector
    get() = _Thunderstorm ?: UXIcon(name = "Thunderstorm") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.59f, 24f)
                lineTo(11f, 19f)
                horizontalLineTo(7.92f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.88f, -1.19f)
                lineTo(9.7f, 10f)
                horizontalLineTo(14f)
                lineToRelative(-1.96f, 5f)
                horizontalLineToRelative(3.06f)
                arcToRelative(0.91f, 0.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.76f, 1.41f)
                lineTo(10.79f, 24f)
                close()
                moveTo(17.44f, 5.06f)
                curveTo(13.53f, -4.12f, -0.04f, 0.31f, 2.27f, 10.05f)
                curveToRelative(-3.84f, 2.63f, -2.45f, 8.98f, 2.07f, 9.82f)
                lineToRelative(1.39f, 0.1f)
                curveToRelative(-0.05f, -0.06f, -0.11f, -0.1f, -0.15f, -0.16f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.45f, -2.59f)
                lineTo(8.27f, 8f)
                horizontalLineToRelative(8.67f)
                lineToRelative(-1.96f, 5f)
                horizontalLineToRelative(0.12f)
                arcToRelative(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.42f, 4.51f)
                lineToRelative(-1.65f, 2.48f)
                lineToRelative(1.27f, -0.02f)
                curveTo(26.03f, 19.05f, 26.3f, 6.31f, 17.44f, 5.06f)
                close()
            }
        }.also { _Thunderstorm = it}
