package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleX: ImageVector? = null

val Icons.Tr.CircleX: ImageVector
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
                moveTo(16.65f, 6.81f)
                lineToRelative(-4.01f, 5.19f)
                lineToRelative(4.01f, 5.19f)
                curveToRelative(0.17f, 0.22f, 0.13f, 0.53f, -0.09f, 0.7f)
                curveToRelative(-0.09f, 0.07f, -0.2f, 0.1f, -0.31f, 0.1f)
                curveToRelative(-0.15f, 0f, -0.3f, -0.07f, -0.4f, -0.19f)
                lineToRelative(-3.85f, -4.99f)
                lineToRelative(-3.85f, 4.99f)
                curveToRelative(-0.1f, 0.13f, -0.25f, 0.19f, -0.4f, 0.19f)
                curveToRelative(-0.11f, 0f, -0.21f, -0.03f, -0.31f, -0.1f)
                curveToRelative(-0.22f, -0.17f, -0.26f, -0.48f, -0.09f, -0.7f)
                lineToRelative(4.01f, -5.19f)
                lineToRelative(-4.01f, -5.19f)
                curveToRelative(-0.17f, -0.22f, -0.13f, -0.53f, 0.09f, -0.7f)
                curveToRelative(0.22f, -0.17f, 0.53f, -0.13f, 0.7f, 0.09f)
                lineToRelative(3.85f, 4.99f)
                lineToRelative(3.85f, -4.99f)
                curveToRelative(0.17f, -0.22f, 0.48f, -0.26f, 0.7f, -0.09f)
                curveToRelative(0.22f, 0.17f, 0.26f, 0.48f, 0.09f, 0.7f)
                close()
            }
        }.also { _CircleX = it}
