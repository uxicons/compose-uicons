package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SlotMachine: ImageVector? = null

val Icons.Sr.SlotMachine: ImageVector
    get() = _SlotMachine ?: UXIcon(name = "SlotMachine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 3.72f)
                verticalLineToRelative(5.28f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(21f, 3.72f)
                curveToRelative(-0.73f, -0.42f, -1.17f, -1.28f, -0.94f, -2.22f)
                curveToRelative(0.18f, -0.72f, 0.78f, -1.3f, 1.51f, -1.45f)
                curveToRelative(1.29f, -0.27f, 2.43f, 0.71f, 2.43f, 1.96f)
                curveToRelative(0f, 0.74f, -0.41f, 1.38f, -1f, 1.72f)
                close()
                moveTo(9f, 0f)
                curveTo(4.72f, 0f, 1.15f, 3.0f, 0.23f, 7f)
                lineTo(17.77f, 7f)
                curveTo(16.86f, 3.0f, 13.28f, 0f, 9f, 0f)
                close()
                moveTo(4f, 24f)
                lineTo(14f, 24f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-3f)
                lineTo(0f, 17f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
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
