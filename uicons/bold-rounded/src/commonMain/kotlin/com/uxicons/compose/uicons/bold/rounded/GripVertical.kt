package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GripVertical: ImageVector? = null

val Icons.Br.GripVertical: ImageVector
    get() = _GripVertical ?: UXIcon(name = "GripVertical") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(9.5f, 0f)
            horizontalLineToRelative(-4f)
            curveTo(3.02f, 0f, 1f, 2.02f, 1f, 4.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(11f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(4f, 10f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-4f)
            close()
            moveTo(5.5f, 3f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(5.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-2.5f)
            close()
            moveTo(18.5f, 0f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            lineTo(23f, 4.5f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(16f, 10f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-4f)
            close()
            moveTo(18.5f, 3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(-4f)
            lineTo(16f, 3f)
            horizontalLineToRelative(2.5f)
            close()
            moveTo(18.5f, 21f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _GripVertical = it }
