package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramNext: ImageVector? = null

val Icons.Br.DiagramNext: ImageVector
    get() = _DiagramNext ?: UXIcon(name = "DiagramNext") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 18f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineTo(4f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            horizontalLineTo(20f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            close()
            moveTo(20f, 0f)
            horizontalLineTo(4f)
            curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(6.5f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-1.16f)
            curveToRelative(-0.75f, 0f, -1.12f, 0.91f, -0.59f, 1.43f)
            lineToRelative(2.66f, 2.66f)
            curveToRelative(0.33f, 0.33f, 0.86f, 0.33f, 1.19f, 0f)
            lineToRelative(2.66f, -2.66f)
            curveToRelative(0.53f, -0.53f, 0.15f, -1.43f, -0.59f, -1.43f)
            horizontalLineToRelative(-1.16f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(6.5f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
        }
    }.also { _DiagramNext = it }
