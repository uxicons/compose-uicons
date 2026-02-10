package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleEnvelope: ImageVector? = null

val Icons.Sr.CircleEnvelope: ImageVector
    get() = _CircleEnvelope ?: UXIcon(name = "CircleEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 8.07f)
                curveToRelative(0.16f, -0.04f, 0.33f, -0.07f, 0.5f, -0.07f)
                lineToRelative(5.99f, -0.01f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.18f, 0f, 0.35f, 0.03f, 0.52f, 0.08f)
                lineToRelative(-2.52f, 2.52f)
                curveToRelative(-0.53f, 0.53f, -1.45f, 0.53f, -1.98f, 0f)
                lineToRelative(-2.52f, -2.52f)
                close()
                moveTo(14.41f, 12.01f)
                curveToRelative(-0.64f, 0.64f, -1.49f, 0.99f, -2.4f, 0.99f)
                reflectiveCurveToRelative(-1.76f, -0.35f, -2.4f, -0.99f)
                lineToRelative(-2.53f, -2.53f)
                curveToRelative(-0.05f, 0.17f, -0.08f, 0.34f, -0.08f, 0.52f)
                verticalLineToRelative(3.0f)
                curveToRelative(0f, 0.54f, 0.21f, 1.04f, 0.59f, 1.42f)
                reflectiveCurveToRelative(0.88f, 0.58f, 1.41f, 0.58f)
                horizontalLineToRelative(0f)
                lineToRelative(5.99f, -0.0f)
                curveToRelative(1.1f, 0f, 2.0f, -0.9f, 2.0f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.17f, -0.03f, -0.34f, -0.07f, -0.5f)
                lineToRelative(-2.51f, 2.51f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(18.99f, 9.99f)
                curveToRelative(0f, -1.07f, -0.42f, -2.07f, -1.17f, -2.83f)
                curveToRelative(-0.76f, -0.75f, -1.76f, -1.17f, -2.83f, -1.17f)
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
                close()
            }
        }.also { _CircleEnvelope = it}
