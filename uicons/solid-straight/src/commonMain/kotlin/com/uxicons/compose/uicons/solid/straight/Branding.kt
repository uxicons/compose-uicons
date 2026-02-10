package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Branding: ImageVector? = null

val Icons.Ss.Branding: ImageVector
    get() = _Branding ?: UXIcon(name = "Branding") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.88f, 20.03f)
                curveToRelative(-0.66f, 0.66f, -1.52f, 0.98f, -2.38f, 0.98f)
                reflectiveCurveToRelative(-1.72f, -0.33f, -2.38f, -0.98f)
                lineToRelative(-3.96f, -3.96f)
                curveToRelative(-0.1f, 0.29f, -0.16f, 0.6f, -0.16f, 0.93f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.33f, -0.07f, -0.63f, -0.16f, -0.93f)
                lineToRelative(-3.96f, 3.96f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0.59f)
                lineToRelative(0f, 5.41f)
                lineToRelative(5.41f, 0f)
                lineToRelative(-5.41f, -5.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 0f)
                curveTo(0.9f, 0f, 0f, 0.9f, 0f, 2f)
                verticalLineToRelative(12f)
                lineToRelative(2f, 2f)
                lineToRelative(2f, -2f)
                verticalLineTo(2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 8f)
                verticalLineTo(0f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(10.03f)
                curveToRelative(0.84f, -0.64f, 1.87f, -1.03f, 3f, -1.03f)
                horizontalLineToRelative(7f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(-8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.47f, 18.62f)
                lineToRelative(4.14f, -4.14f)
                curveToRelative(-0.47f, -0.3f, -1.02f, -0.48f, -1.61f, -0.48f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.59f, 0f, -1.14f, 0.18f, -1.61f, 0.48f)
                lineToRelative(4.14f, 4.14f)
                curveToRelative(0.53f, 0.53f, 1.4f, 0.53f, 1.93f, 0f)
                close()
            }
        }.also { _Branding = it}
