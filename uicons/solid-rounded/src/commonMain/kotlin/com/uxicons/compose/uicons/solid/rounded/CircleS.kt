package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleS: ImageVector? = null

val Icons.Sr.CircleS: ImageVector
    get() = _CircleS ?: UXIcon(name = "CircleS") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(13.81f, 18f)
                horizontalLineToRelative(-3.31f)
                curveToRelative(-0.98f, 0f, -2.62f, 0f, -3.4f, -1.55f)
                curveToRelative(-0.25f, -0.49f, -0.05f, -1.09f, 0.45f, -1.34f)
                curveToRelative(0.49f, -0.24f, 1.09f, -0.05f, 1.34f, 0.45f)
                curveToRelative(0.19f, 0.38f, 0.59f, 0.45f, 1.6f, 0.45f)
                horizontalLineToRelative(3.31f)
                curveToRelative(0.66f, 0f, 1.19f, -0.53f, 1.19f, -1.19f)
                curveToRelative(0f, -0.53f, -0.35f, -1.0f, -0.86f, -1.14f)
                lineToRelative(-4.83f, -1.42f)
                curveToRelative(-1.35f, -0.38f, -2.31f, -1.64f, -2.31f, -3.06f)
                curveToRelative(0f, -1.76f, 1.43f, -3.19f, 3.19f, -3.19f)
                horizontalLineToRelative(3.31f)
                curveToRelative(0.98f, 0f, 2.62f, 0f, 3.4f, 1.55f)
                curveToRelative(0.25f, 0.49f, 0.05f, 1.09f, -0.45f, 1.34f)
                curveToRelative(-0.49f, 0.25f, -1.09f, 0.05f, -1.34f, -0.45f)
                curveToRelative(-0.19f, -0.38f, -0.59f, -0.45f, -1.6f, -0.45f)
                horizontalLineToRelative(-3.31f)
                curveToRelative(-0.65f, 0f, -1.19f, 0.53f, -1.19f, 1.19f)
                curveToRelative(0f, 0.53f, 0.35f, 1.0f, 0.86f, 1.14f)
                lineToRelative(4.84f, 1.43f)
                curveToRelative(1.35f, 0.39f, 2.3f, 1.65f, 2.3f, 3.06f)
                curveToRelative(0f, 1.76f, -1.43f, 3.19f, -3.19f, 3.19f)
                close()
            }
        }.also { _CircleS = it}
