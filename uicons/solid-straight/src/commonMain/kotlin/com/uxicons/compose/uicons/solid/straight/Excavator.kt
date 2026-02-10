package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Excavator: ImageVector? = null

val Icons.Ss.Excavator: ImageVector
    get() = _Excavator ?: UXIcon(name = "Excavator") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2.91f)
                lineToRelative(5f, -5f)
                verticalLineToRelative(-4.25f)
                lineToRelative(-6f, 5.65f)
                verticalLineToRelative(1.51f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(2.0f, 14f)
                curveTo(0.9f, 14f, 0.0f, 13.11f, 0.0f, 12.0f)
                lineToRelative(-0.0f, -2.0f)
                horizontalLineToRelative(13.6f)
                lineTo(22.11f, 2f)
                horizontalLineToRelative(1.89f)
                close()
                moveTo(10.66f, 2.77f)
                curveToRelative(-0.48f, -1.08f, -1.56f, -1.77f, -2.74f, -1.77f)
                horizontalLineToRelative(-2.92f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(8f)
                lineToRelative(-2.34f, -5.23f)
                close()
                moveTo(16f, 20f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(4f, 24f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(8f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(6f, 20f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(13f, 20f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _Excavator = it}
