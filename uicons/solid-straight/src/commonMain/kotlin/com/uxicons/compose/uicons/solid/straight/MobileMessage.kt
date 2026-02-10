package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileMessage: ImageVector? = null

val Icons.Ss.MobileMessage: ImageVector
    get() = _MobileMessage ?: UXIcon(name = "MobileMessage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 18f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                lineTo(4f, 18f)
                close()
                moveTo(14f, 22f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(0f, 8.0f)
                verticalLineToRelative(6.0f)
                lineTo(4.87f, 14.0f)
                reflectiveCurveToRelative(2.45f, 1.69f, 2.45f, 1.69f)
                curveToRelative(0.69f, 0.46f, 1.67f, -0.04f, 1.67f, -0.92f)
                lineToRelative(0.0f, -6.77f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2.0f, -2.0f)
                lineToRelative(-5f, -0.0f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveTo(22f, 0f)
                horizontalLineToRelative(0f)
                lineToRelative(-5f, 0.0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2.0f, 2.0f)
                lineToRelative(0.0f, 6.77f)
                curveToRelative(-0.0f, 0.88f, 0.98f, 1.37f, 1.67f, 0.92f)
                lineToRelative(2.45f, -1.69f)
                horizontalLineToRelative(4.87f)
                lineTo(24.0f, 2f)
                curveTo(24f, 0.9f, 23.1f, 0f, 22f, 0f)
                close()
                moveTo(20f, 10.0f)
                verticalLineToRelative(6.0f)
                lineTo(10.79f, 16f)
                curveToRelative(0.13f, -0.34f, 0.21f, -0.84f, 0.21f, -1.22f)
                verticalLineToRelative(-6.77f)
                curveToRelative(0.0f, -1.07f, -0.41f, -2.07f, -1.17f, -2.83f)
                curveToRelative(-0.76f, -0.76f, -1.76f, -1.17f, -2.83f, -1.17f)
                horizontalLineToRelative(-3.0f)
                lineTo(4.0f, 0f)
                lineTo(13.56f, 0f)
                curveToRelative(-0.34f, 0.59f, -0.56f, 1.27f, -0.56f, 2.0f)
                lineToRelative(0.0f, 6.77f)
                curveToRelative(0f, 1.7f, 1.39f, 3.09f, 3.09f, 3.09f)
                curveToRelative(0.59f, 0f, 1.16f, -0.17f, 1.72f, -0.53f)
                lineToRelative(1.94f, -1.34f)
                horizontalLineToRelative(0.25f)
                close()
            }
        }.also { _MobileMessage = it}
