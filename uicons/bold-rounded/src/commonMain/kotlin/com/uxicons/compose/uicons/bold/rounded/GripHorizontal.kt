package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GripHorizontal: ImageVector? = null

val Icons.Br.GripHorizontal: ImageVector
    get() = _GripHorizontal ?: UXIcon(name = "GripHorizontal") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 13f)
            lineTo(1.5f, 13f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(15f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(14f, 16f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            close()
            moveTo(3f, 18.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(2.5f)
            close()
            moveTo(19.5f, 1f)
            lineTo(4.5f, 1f)
            curveTo(2.02f, 1f, 0f, 3.02f, 0f, 5.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(21f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(14f, 4f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            close()
            moveTo(3f, 5.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(4f)
            lineTo(3f, 8f)
            verticalLineToRelative(-2.5f)
            close()
            moveTo(21f, 8f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2.5f)
            close()
        }
    }.also { _GripHorizontal = it }
