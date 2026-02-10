package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleX: ImageVector? = null

val Icons.Ts.CircleX: ImageVector
    get() = _CircleX ?: UXIcon(name = "CircleX") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(12.65f, 12.0f)
                lineToRelative(4.18f, 5.75f)
                horizontalLineToRelative(-1.24f)
                lineToRelative(-3.56f, -4.9f)
                lineToRelative(-3.63f, 4.9f)
                horizontalLineToRelative(-1.24f)
                lineToRelative(4.26f, -5.75f)
                lineToRelative(-4.19f, -5.75f)
                horizontalLineToRelative(1.24f)
                lineToRelative(3.57f, 4.91f)
                lineToRelative(3.49f, -4.91f)
                horizontalLineToRelative(1.23f)
                lineToRelative(-4.11f, 5.75f)
                close()
            }
        }.also { _CircleX = it}
