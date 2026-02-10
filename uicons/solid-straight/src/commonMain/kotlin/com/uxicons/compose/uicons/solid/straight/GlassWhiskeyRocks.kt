package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassWhiskeyRocks: ImageVector? = null

val Icons.Ss.GlassWhiskeyRocks: ImageVector
    get() = _GlassWhiskeyRocks ?: UXIcon(name = "GlassWhiskeyRocks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.0f, 14f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(14.19f, 11.53f)
                lineToRelative(-1.19f, 1.19f)
                verticalLineToRelative(1.29f)
                curveToRelative(0f, 0.5f, -0.18f, 0.95f, -0.48f, 1.3f)
                lineToRelative(1.67f, 1.67f)
                curveToRelative(0.04f, 0.03f, 0.09f, 0.04f, 0.13f, 0f)
                lineToRelative(2.66f, -2.66f)
                verticalLineToRelative(-0.13f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-0.03f, -0.03f, -0.09f, -0.04f, -0.13f, 0f)
                close()
                moveTo(23.99f, 1f)
                lineToRelative(-1.93f, 19.3f)
                curveToRelative(-0.15f, 1.54f, -1.44f, 2.7f, -2.98f, 2.7f)
                lineTo(4.8f, 23f)
                curveToRelative(-1.56f, 0f, -2.84f, -1.17f, -2.99f, -2.72f)
                lineTo(0.02f, 1f)
                horizontalLineToRelative(23.97f)
                close()
                moveTo(19f, 14.25f)
                curveToRelative(0f, -0.56f, -0.22f, -1.08f, -0.61f, -1.48f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-0.74f, -0.74f, -1.91f, -0.8f, -2.73f, -0.18f)
                curveToRelative(-0.04f, -1.07f, -0.92f, -1.93f, -2.0f, -1.93f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3.38f)
                lineToRelative(2.39f, 2.39f)
                curveToRelative(0.41f, 0.41f, 0.94f, 0.61f, 1.48f, 0.61f)
                reflectiveCurveToRelative(1.07f, -0.2f, 1.48f, -0.61f)
                lineToRelative(2.66f, -2.66f)
                curveToRelative(0.4f, -0.4f, 0.61f, -0.92f, 0.61f, -1.48f)
                close()
            }
        }.also { _GlassWhiskeyRocks = it}
