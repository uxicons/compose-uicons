package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleEnvelope: ImageVector? = null

val Icons.Ss.CircleEnvelope: ImageVector
    get() = _CircleEnvelope ?: UXIcon(name = "CircleEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.02f, 10.59f)
                lineToRelative(-2.59f, -2.59f)
                lineToRelative(7.16f, -0.01f)
                lineToRelative(-2.6f, 2.6f)
                curveToRelative(-0.53f, 0.53f, -1.45f, 0.53f, -1.98f, 0f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(18.99f, 8.99f)
                curveToRelative(0f, -0.46f, -0.11f, -0.89f, -0.29f, -1.28f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(-0.03f, -0.03f)
                curveToRelative(-0.29f, -0.59f, -0.77f, -1.07f, -1.36f, -1.36f)
                lineToRelative(-0.02f, -0.02f)
                lineToRelative(-0.01f, 0.01f)
                curveToRelative(-0.39f, -0.19f, -0.83f, -0.31f, -1.3f, -0.31f)
                lineToRelative(-7.99f, 0.01f)
                curveToRelative(-0.46f, 0f, -0.89f, 0.11f, -1.27f, 0.29f)
                horizontalLineToRelative(-0.0f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-1.01f, 0.48f, -1.72f, 1.51f, -1.72f, 2.7f)
                verticalLineToRelative(8f)
                lineToRelative(13.99f, -0.01f)
                verticalLineToRelative(-8f)
                close()
                moveTo(12.01f, 13f)
                curveToRelative(-0.91f, 0f, -1.76f, -0.35f, -2.4f, -0.99f)
                lineToRelative(-2.61f, -2.61f)
                verticalLineToRelative(5.6f)
                lineToRelative(9.99f, -0.01f)
                verticalLineToRelative(-5.57f)
                lineToRelative(-2.58f, 2.58f)
                curveToRelative(-0.64f, 0.64f, -1.49f, 0.99f, -2.4f, 0.99f)
                close()
            }
        }.also { _CircleEnvelope = it}
