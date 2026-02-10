package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleS: ImageVector? = null

val Icons.Ts.CircleS: ImageVector
    get() = _CircleS ?: UXIcon(name = "CircleS") {
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
                moveTo(8f, 8.9f)
                curveToRelative(0f, 0.85f, 0.57f, 1.6f, 1.38f, 1.83f)
                lineToRelative(5.51f, 1.56f)
                curveToRelative(1.24f, 0.36f, 2.1f, 1.51f, 2.1f, 2.79f)
                curveToRelative(0f, 1.6f, -1.3f, 2.91f, -2.91f, 2.91f)
                horizontalLineToRelative(-4.39f)
                curveToRelative(-1.61f, 0f, -2.7f, -1.1f, -2.7f, -2.75f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 1.1f, 0.64f, 1.75f, 1.7f, 1.75f)
                horizontalLineToRelative(4.39f)
                curveToRelative(1.05f, 0f, 1.91f, -0.85f, 1.91f, -1.91f)
                curveToRelative(0f, -0.85f, -0.57f, -1.6f, -1.38f, -1.83f)
                lineToRelative(-5.51f, -1.56f)
                curveToRelative(-1.24f, -0.35f, -2.11f, -1.5f, -2.11f, -2.79f)
                curveToRelative(0f, -1.6f, 1.3f, -2.9f, 2.9f, -2.9f)
                horizontalLineToRelative(4.4f)
                curveToRelative(1.49f, 0f, 2.7f, 1.23f, 2.7f, 2.75f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -0.96f, -0.76f, -1.75f, -1.7f, -1.75f)
                horizontalLineToRelative(-4.4f)
                curveToRelative(-1.05f, 0f, -1.9f, 0.85f, -1.9f, 1.9f)
                close()
            }
        }.also { _CircleS = it}
