package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorClosed: ImageVector? = null

val Icons.Rs.DoorClosed: ImageVector
    get() = _DoorClosed ?: UXIcon(name = "DoorClosed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 22f)
                lineTo(20f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(7f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(4f, 22f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                lineTo(24f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(6f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(18f, 22f)
                lineTo(6f, 22f)
                lineTo(6f, 3f)
                close()
                moveTo(16f, 12f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _DoorClosed = it}
