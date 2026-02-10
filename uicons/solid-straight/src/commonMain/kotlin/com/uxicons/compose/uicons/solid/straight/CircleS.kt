package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleS: ImageVector? = null

val Icons.Ss.CircleS: ImageVector
    get() = _CircleS ?: UXIcon(name = "CircleS") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(13.9f, 18f)
                horizontalLineToRelative(-3.9f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3.9f)
                curveToRelative(0.66f, 0f, 1.19f, -0.53f, 1.19f, -1.19f)
                curveToRelative(0f, -0.53f, -0.35f, -1.0f, -0.86f, -1.14f)
                lineToRelative(-5.01f, -1.42f)
                curveToRelative(-1.36f, -0.39f, -2.31f, -1.65f, -2.31f, -3.06f)
                curveToRelative(0f, -1.76f, 1.43f, -3.19f, 3.19f, -3.19f)
                horizontalLineToRelative(3.91f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.91f)
                curveToRelative(-0.65f, 0f, -1.19f, 0.53f, -1.19f, 1.19f)
                curveToRelative(0f, 0.53f, 0.35f, 1.0f, 0.86f, 1.14f)
                lineToRelative(5.01f, 1.42f)
                curveToRelative(1.36f, 0.39f, 2.31f, 1.65f, 2.31f, 3.06f)
                curveToRelative(0f, 1.76f, -1.43f, 3.19f, -3.19f, 3.19f)
                close()
            }
        }.also { _CircleS = it}
