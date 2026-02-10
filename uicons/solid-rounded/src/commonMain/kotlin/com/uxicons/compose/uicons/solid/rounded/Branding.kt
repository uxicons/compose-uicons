package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Branding: ImageVector? = null

val Icons.Sr.Branding: ImageVector
    get() = _Branding ?: UXIcon(name = "Branding") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0.3f)
                curveToRelative(0.7f, 0.24f, 1.34f, 0.63f, 1.88f, 1.17f)
                lineToRelative(1.66f, 1.66f)
                curveToRelative(0.54f, 0.54f, 0.92f, 1.18f, 1.17f, 1.88f)
                horizontalLineToRelative(-4.7f)
                lineTo(19f, 0.3f)
                close()
                moveTo(10.53f, 17.62f)
                curveToRelative(0.52f, 0.52f, 1.42f, 0.52f, 1.93f, 0f)
                lineToRelative(4.14f, -4.14f)
                curveToRelative(-0.47f, -0.3f, -1.02f, -0.48f, -1.61f, -0.48f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.59f, 0f, -1.14f, 0.18f, -1.61f, 0.48f)
                lineToRelative(4.14f, 4.14f)
                close()
                moveTo(13.88f, 19.03f)
                curveToRelative(-0.66f, 0.66f, -1.52f, 0.98f, -2.38f, 0.98f)
                reflectiveCurveToRelative(-1.72f, -0.33f, -2.38f, -0.98f)
                lineToRelative(-3.96f, -3.96f)
                curveToRelative(-0.1f, 0.29f, -0.16f, 0.6f, -0.16f, 0.93f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.33f, -0.07f, -0.63f, -0.16f, -0.93f)
                lineToRelative(-3.96f, 3.96f)
                close()
                moveTo(0f, 2f)
                curveTo(0f, 0.9f, 0.9f, 0f, 2f, 0f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(10.44f)
                curveToRelative(0f, 1f, -0.4f, 1.96f, -1.1f, 2.67f)
                lineToRelative(-0.9f, 0.9f)
                lineToRelative(-0.9f, -0.9f)
                curveTo(0.4f, 14.4f, 0f, 13.44f, 0f, 12.44f)
                lineTo(0f, 2f)
                close()
                moveTo(19f, 7f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                lineTo(17f, 0f)
                horizontalLineToRelative(-7f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(7.42f)
                curveToRelative(0.61f, -0.27f, 1.29f, -0.42f, 2f, -0.42f)
                horizontalLineToRelative(7f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(5f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(24f, 7f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _Branding = it}
