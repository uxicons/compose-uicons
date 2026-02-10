package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorOpen: ImageVector? = null

val Icons.Sr.DoorOpen: ImageVector
    get() = _DoorOpen ?: UXIcon(name = "DoorOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 22f)
                horizontalLineToRelative(-3f)
                lineTo(20f, 6f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-0.54f)
                curveToRelative(-0.24f, -0.41f, -0.55f, -0.78f, -0.93f, -1.09f)
                curveTo(13.61f, 0.15f, 12.4f, -0.16f, 11.22f, 0.08f)
                lineToRelative(-3.2f, 0.64f)
                curveToRelative(-2.33f, 0.47f, -4.02f, 2.53f, -4.02f, 4.9f)
                lineTo(4f, 22f)
                lineTo(1f, 22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(23f, 24f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(11.5f, 14f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18f, 22f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                lineTo(18f, 22f)
                close()
            }
        }.also { _DoorOpen = it}
