package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SewingMachine: ImageVector? = null

val Icons.Ss.SewingMachine: ImageVector
    get() = _SewingMachine ?: UXIcon(name = "SewingMachine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 19f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(3f, 14.06f)
                lineTo(1f, 14.06f)
                lineTo(1f, 5f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                lineTo(3f, 0f)
                horizontalLineToRelative(2f)
                lineTo(5f, 2f)
                horizontalLineToRelative(12f)
                lineTo(17f, 0f)
                horizontalLineToRelative(2f)
                lineTo(19f, 2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(12f)
                lineTo(14f, 17f)
                verticalLineToRelative(-7f)
                lineTo(7f, 10f)
                verticalLineToRelative(4.06f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.94f)
                lineTo(3f, 16f)
                verticalLineToRelative(-1.94f)
                close()
                moveTo(17f, 9.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(17f, 13.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _SewingMachine = it}
