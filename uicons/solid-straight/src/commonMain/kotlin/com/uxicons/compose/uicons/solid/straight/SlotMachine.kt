package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SlotMachine: ImageVector? = null

val Icons.Ss.SlotMachine: ImageVector
    get() = _SlotMachine ?: UXIcon(name = "SlotMachine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 3.72f)
                verticalLineToRelative(6.28f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(21f, 3.72f)
                curveToRelative(-0.59f, -0.35f, -1f, -0.98f, -1f, -1.72f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.74f, -0.41f, 1.38f, -1f, 1.72f)
                close()
                moveTo(9f, 0f)
                curveTo(4.72f, 0f, 1.15f, 3.0f, 0.23f, 7f)
                lineTo(17.77f, 7f)
                curveTo(16.86f, 3.0f, 13.28f, 0f, 9f, 0f)
                close()
                moveTo(0f, 24f)
                lineTo(18f, 24f)
                verticalLineToRelative(-7f)
                lineTo(0f, 17f)
                verticalLineToRelative(7f)
                close()
                moveTo(11f, 15f)
                verticalLineToRelative(-6f)
                lineTo(7f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                close()
                moveTo(5f, 9f)
                lineTo(0f, 9f)
                verticalLineToRelative(6f)
                lineTo(5f, 15f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _SlotMachine = it}
