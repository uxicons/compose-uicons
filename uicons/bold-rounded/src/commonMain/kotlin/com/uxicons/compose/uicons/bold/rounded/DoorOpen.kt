package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorOpen: ImageVector? = null

val Icons.Br.DoorOpen: ImageVector
    get() = _DoorOpen ?: UXIcon(name = "DoorOpen") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 21f)
            horizontalLineToRelative(-1.5f)
            lineTo(21f, 6.5f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            horizontalLineToRelative(-1.26f)
            curveToRelative(-0.24f, -0.36f, -0.54f, -0.69f, -0.89f, -0.98f)
            curveTo(13.31f, 0.16f, 11.95f, -0.18f, 10.62f, 0.09f)
            lineToRelative(-3.6f, 0.72f)
            curveToRelative(-2.33f, 0.47f, -4.02f, 2.53f, -4.02f, 4.9f)
            verticalLineToRelative(15.29f)
            lineTo(1.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            lineTo(22.5f, 24f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(18f, 6.5f)
            verticalLineToRelative(14.5f)
            horizontalLineToRelative(-2f)
            lineTo(16f, 5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(6f, 5.71f)
            curveToRelative(0f, -0.95f, 0.68f, -1.77f, 1.61f, -1.96f)
            lineToRelative(3.6f, -0.72f)
            curveToRelative(0.44f, -0.09f, 0.9f, 0.03f, 1.25f, 0.31f)
            curveToRelative(0.35f, 0.28f, 0.55f, 0.71f, 0.55f, 1.16f)
            lineTo(13.0f, 21f)
            lineTo(6f, 21f)
            lineTo(6f, 5.71f)
            close()
            moveTo(12f, 12.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _DoorOpen = it }
