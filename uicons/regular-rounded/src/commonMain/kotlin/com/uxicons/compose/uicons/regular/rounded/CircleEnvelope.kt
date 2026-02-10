package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleEnvelope: ImageVector? = null

val Icons.Rr.CircleEnvelope: ImageVector
    get() = _CircleEnvelope ?: UXIcon(name = "CircleEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.99f, 5.99f)
                horizontalLineToRelative(-0.0f)
                lineToRelative(-5.99f, 0.01f)
                curveToRelative(-2.2f, 0.0f, -4.0f, 1.8f, -4.0f, 4f)
                verticalLineToRelative(3.0f)
                curveToRelative(0f, 1.07f, 0.42f, 2.07f, 1.17f, 2.83f)
                reflectiveCurveToRelative(1.76f, 1.17f, 2.83f, 1.17f)
                horizontalLineToRelative(0.0f)
                lineToRelative(5.99f, -0.0f)
                curveToRelative(2.2f, -0.0f, 4.0f, -1.8f, 4.0f, -4f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.07f, -0.42f, -2.07f, -1.17f, -2.83f)
                curveToRelative(-0.76f, -0.75f, -1.76f, -1.17f, -2.83f, -1.17f)
                close()
                moveTo(9.0f, 8.0f)
                lineToRelative(5.99f, -0.01f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.18f, 0f, 0.36f, 0.02f, 0.53f, 0.07f)
                lineToRelative(-2.53f, 2.53f)
                curveToRelative(-0.53f, 0.53f, -1.45f, 0.53f, -1.98f, 0f)
                lineToRelative(-2.53f, -2.53f)
                curveToRelative(0.16f, -0.04f, 0.33f, -0.07f, 0.5f, -0.07f)
                close()
                moveTo(16.99f, 12.99f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2.0f, 2f)
                lineToRelative(-5.99f, 0.0f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.53f, 0f, -1.04f, -0.21f, -1.41f, -0.58f)
                reflectiveCurveToRelative(-0.59f, -0.88f, -0.59f, -1.42f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0f, -0.18f, 0.03f, -0.36f, 0.07f, -0.53f)
                lineToRelative(2.54f, 2.54f)
                curveToRelative(0.64f, 0.64f, 1.5f, 0.99f, 2.4f, 0.99f)
                reflectiveCurveToRelative(1.76f, -0.35f, 2.4f, -0.99f)
                lineToRelative(2.52f, -2.52f)
                curveToRelative(0.04f, 0.16f, 0.07f, 0.33f, 0.07f, 0.51f)
                verticalLineToRelative(3f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
            }
        }.also { _CircleEnvelope = it}
