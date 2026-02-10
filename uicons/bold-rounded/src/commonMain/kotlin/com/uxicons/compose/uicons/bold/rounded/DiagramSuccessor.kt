package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramSuccessor: ImageVector? = null

val Icons.Br.DiagramSuccessor: ImageVector
    get() = _DiagramSuccessor ?: UXIcon(name = "DiagramSuccessor") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 10f)
            horizontalLineToRelative(6f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-1.16f)
            curveToRelative(-0.75f, 0f, -1.12f, 0.91f, -0.59f, 1.43f)
            lineToRelative(2.66f, 2.66f)
            curveToRelative(0.33f, 0.33f, 0.86f, 0.33f, 1.19f, 0f)
            lineToRelative(2.66f, -2.66f)
            curveToRelative(0.53f, -0.53f, 0.15f, -1.43f, -0.59f, -1.43f)
            horizontalLineToRelative(-1.16f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            horizontalLineToRelative(-2.64f)
            curveToRelative(-0.45f, -1.72f, -2f, -3f, -3.86f, -3f)
            lineTo(4f, 0f)
            curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            close()
            moveTo(3f, 4f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            lineTo(4f, 7f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-2f)
            close()
            moveTo(24f, 18f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            lineTo(4f, 24f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            lineTo(20f, 14f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            close()
        }
    }.also { _DiagramSuccessor = it }
