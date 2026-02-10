package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DropdownBar: ImageVector? = null

val Icons.Br.DropdownBar: ImageVector
    get() = _DropdownBar ?: UXIcon(name = "DropdownBar") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 0f)
            lineTo(3f, 0f)
            curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            lineTo(21f, 8f)
            curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
            lineTo(24f, 3f)
            curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
            close()
            moveTo(20.27f, 3.84f)
            lineToRelative(-1.86f, 1.82f)
            curveToRelative(-0.46f, 0.46f, -1.18f, 0.46f, -1.63f, 0f)
            lineToRelative(-1.86f, -1.82f)
            curveToRelative(-0.5f, -0.49f, -0.15f, -1.33f, 0.55f, -1.33f)
            horizontalLineToRelative(4.26f)
            curveToRelative(0.7f, 0f, 1.04f, 0.85f, 0.55f, 1.33f)
            close()
            moveTo(22f, 13f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(11.5f, 14.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(9f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(8f, 12f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            close()
            moveTo(22f, 21f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(11.5f, 22.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(9f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(8f, 20f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            close()
        }
    }.also { _DropdownBar = it }
