package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SlotMachine: ImageVector? = null

val Icons.Rs.SlotMachine: ImageVector
    get() = _SlotMachine ?: UXIcon(name = "SlotMachine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.74f, 0.41f, 1.38f, 1f, 1.72f)
                verticalLineToRelative(6.28f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                curveTo(18f, 4.04f, 13.96f, 0f, 9f, 0f)
                reflectiveCurveTo(0f, 4.04f, 0f, 9f)
                verticalLineToRelative(15f)
                lineTo(18f, 24f)
                lineTo(18f, 13f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(23f, 3.72f)
                curveToRelative(0.59f, -0.35f, 1f, -0.98f, 1f, -1.72f)
                close()
                moveTo(9f, 2f)
                curveToRelative(3.16f, 0f, 5.84f, 2.11f, 6.71f, 5f)
                lineTo(2.29f, 7f)
                curveToRelative(0.86f, -2.89f, 3.54f, -5f, 6.71f, -5f)
                close()
                moveTo(16f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                close()
                moveTo(2f, 14f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                lineTo(2f, 14f)
                close()
                moveTo(7f, 9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(5f)
                lineTo(7f, 14f)
                verticalLineToRelative(-5f)
                close()
                moveTo(2f, 22f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(6f)
                lineTo(2f, 22f)
                close()
            }
        }.also { _SlotMachine = it}
