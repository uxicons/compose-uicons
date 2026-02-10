package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleEnvelope: ImageVector? = null

val Icons.Br.CircleEnvelope: ImageVector
    get() = _CircleEnvelope ?: UXIcon(name = "CircleEnvelope") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.23f, 7.1f)
            curveToRelative(0.24f, -0.06f, 0.5f, -0.1f, 0.76f, -0.1f)
            horizontalLineToRelative(5.99f)
            curveToRelative(0.27f, 0f, 0.54f, 0.03f, 0.79f, 0.1f)
            lineToRelative(-3.14f, 3.14f)
            curveToRelative(-0.34f, 0.34f, -0.93f, 0.34f, -1.27f, 0f)
            lineToRelative(-3.14f, -3.14f)
            close()
            moveTo(14.76f, 12.36f)
            curveToRelative(-0.85f, 0.85f, -2.04f, 1.26f, -3.26f, 1.11f)
            curveToRelative(-0.9f, -0.11f, -1.72f, -0.58f, -2.36f, -1.22f)
            lineToRelative(-3.04f, -3.04f)
            curveToRelative(-0.07f, 0.25f, -0.1f, 0.52f, -0.1f, 0.79f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            lineToRelative(6.99f, -0.0f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -0.27f, -0.04f, -0.52f, -0.1f, -0.77f)
            lineToRelative(-3.13f, 3.13f)
            close()
            moveTo(24f, 12f)
            curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
            reflectiveCurveTo(0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            close()
            moveTo(21f, 12f)
            curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
            reflectiveCurveTo(3f, 16.96f, 3f, 12f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            close()
        }
    }.also { _CircleEnvelope = it }
