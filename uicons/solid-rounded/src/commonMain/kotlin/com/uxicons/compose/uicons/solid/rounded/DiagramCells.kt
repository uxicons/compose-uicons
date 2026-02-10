package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramCells: ImageVector? = null

val Icons.Sr.DiagramCells: ImageVector
    get() = _DiagramCells ?: UXIcon(name = "DiagramCells") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10f)
                lineTo(4f, 10f)
                curveTo(1.79f, 10f, 0f, 8.21f, 0f, 6f)
                verticalLineToRelative(-2f)
                curveTo(0f, 1.79f, 1.79f, 0f, 4f, 0f)
                lineTo(20f, 0f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(20f, 24f)
                lineTo(4f, 24f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                lineTo(20f, 14f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
            }
        }.also { _DiagramCells = it}
