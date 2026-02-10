package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ItAlt: ImageVector? = null

val Icons.Ss.ItAlt: ImageVector
    get() = _ItAlt ?: UXIcon(name = "ItAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 9f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-7.85f)
                curveToRelative(1.43f, -1.19f, 2.35f, -2.99f, 2.35f, -5f)
                curveToRelative(0f, -2.7f, -1.65f, -5.02f, -4.0f, -6f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-2.35f, 0.98f, -4.0f, 3.3f, -4.0f, 6f)
                curveToRelative(0f, 2.01f, 0.91f, 3.81f, 2.35f, 5f)
                lineTo(0f, 22f)
                verticalLineToRelative(-13f)
                close()
                moveTo(14f, 12.99f)
                verticalLineToRelative(2.51f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2.51f)
                curveToRelative(-1.48f, 0.74f, -2.5f, 2.25f, -2.5f, 4.01f)
                curveToRelative(0f, 1.96f, 1.26f, 3.6f, 3f, 4.22f)
                verticalLineToRelative(2.78f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.78f)
                curveToRelative(1.74f, -0.62f, 3f, -2.27f, 3f, -4.22f)
                curveToRelative(0f, -1.76f, -1.02f, -3.27f, -2.5f, -4.01f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(4f)
                lineTo(0f, 7f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(5f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(9f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _ItAlt = it}
