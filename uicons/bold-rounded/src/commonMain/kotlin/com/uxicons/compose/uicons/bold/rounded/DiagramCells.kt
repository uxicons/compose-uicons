package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramCells: ImageVector? = null

val Icons.Br.DiagramCells: ImageVector
    get() = _DiagramCells ?: UXIcon(name = "DiagramCells") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 0f)
            lineTo(4f, 0f)
            curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            lineTo(20f, 10f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
            moveTo(21f, 6f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            lineTo(4f, 7f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            lineTo(20f, 3f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(2f)
            close()
            moveTo(20f, 14f)
            lineTo(4f, 14f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            lineTo(20f, 24f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
            moveTo(21f, 20f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            lineTo(4f, 21f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            lineTo(20f, 17f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(2f)
            close()
        }
    }.also { _DiagramCells = it }
