package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SystemCloud: ImageVector? = null

val Icons.Ss.SystemCloud: ImageVector
    get() = _SystemCloud ?: UXIcon(name = "SystemCloud") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                curveToRelative(-0.74f, 0f, -1.38f, -0.41f, -1.72f, -1f)
                horizontalLineToRelative(-4.28f)
                lineTo(16f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2.28f)
                curveToRelative(0.35f, -0.59f, 0.98f, -1f, 1.72f, -1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(13f, 20.28f)
                verticalLineToRelative(-6.28f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.28f)
                curveToRelative(-0.59f, 0.35f, -1f, 0.98f, -1f, 1.72f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.74f, -0.41f, -1.38f, -1f, -1.72f)
                close()
                moveTo(6f, 21f)
                lineTo(3.72f, 21f)
                curveToRelative(-0.35f, -0.59f, -0.98f, -1f, -1.72f, -1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(0.74f, 0f, 1.38f, -0.41f, 1.72f, -1f)
                horizontalLineToRelative(4.28f)
                lineTo(8f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                close()
                moveTo(18.34f, 4.84f)
                curveTo(17.09f, 1.92f, 14.2f, 0f, 11f, 0f)
                curveTo(6.59f, 0f, 3f, 3.59f, 3f, 8f)
                curveToRelative(0f, 0.32f, 0.02f, 0.65f, 0.06f, 0.98f)
                curveToRelative(-1.29f, 0.93f, -2.06f, 2.42f, -2.06f, 4.02f)
                curveToRelative(0f, 2.04f, 1.24f, 3.79f, 3f, 4.57f)
                verticalLineToRelative(-5.57f)
                lineTo(20f, 12f)
                verticalLineToRelative(4.84f)
                curveToRelative(1.8f, -1.21f, 3f, -3.26f, 3f, -5.59f)
                curveToRelative(0f, -2.95f, -1.89f, -5.52f, -4.66f, -6.41f)
                close()
            }
        }.also { _SystemCloud = it}
