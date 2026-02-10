package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleEnvelope: ImageVector? = null

val Icons.Rs.CircleEnvelope: ImageVector
    get() = _CircleEnvelope ?: UXIcon(name = "CircleEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.71f, 7.71f)
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
                curveToRelative(0f, -0.46f, -0.11f, -0.89f, -0.29f, -1.28f)
                lineToRelative(0.01f, -0.01f)
                close()
                moveTo(15.59f, 7.99f)
                lineToRelative(-2.6f, 2.6f)
                curveToRelative(-0.53f, 0.53f, -1.45f, 0.53f, -1.98f, 0f)
                lineToRelative(-2.59f, -2.59f)
                lineToRelative(7.16f, -0.01f)
                close()
                moveTo(16.99f, 14.99f)
                lineToRelative(-9.99f, 0.01f)
                verticalLineToRelative(-5.6f)
                lineToRelative(2.61f, 2.61f)
                curveToRelative(0.64f, 0.64f, 1.5f, 0.99f, 2.4f, 0.99f)
                reflectiveCurveToRelative(1.76f, -0.35f, 2.4f, -0.99f)
                lineToRelative(2.58f, -2.58f)
                verticalLineToRelative(5.57f)
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
