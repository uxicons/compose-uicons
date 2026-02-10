package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorOpen: ImageVector? = null

val Icons.Rs.DoorOpen: ImageVector
    get() = _DoorOpen ?: UXIcon(name = "DoorOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 22f)
                lineTo(20f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-1.17f)
                curveToRelative(-0.18f, -0.51f, -0.5f, -0.97f, -0.93f, -1.32f)
                curveTo(14.21f, 0.11f, 13.3f, -0.12f, 12.41f, 0.06f)
                lineTo(6.41f, 1.26f)
                curveToRelative(-1.4f, 0.28f, -2.41f, 1.52f, -2.41f, 2.94f)
                lineTo(4f, 22f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                lineTo(24f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(18f, 5f)
                lineTo(18f, 22f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 4f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(6f, 4.2f)
                curveToRelative(0f, -0.47f, 0.34f, -0.89f, 0.8f, -0.98f)
                lineToRelative(6f, -1.2f)
                curveToRelative(0.29f, -0.06f, 0.6f, 0.02f, 0.83f, 0.21f)
                curveToRelative(0.23f, 0.19f, 0.37f, 0.47f, 0.37f, 0.77f)
                lineTo(14f, 22f)
                lineTo(6f, 22f)
                lineTo(6f, 4.2f)
                close()
                moveTo(12f, 12f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _DoorOpen = it}
