package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramLeanCanvas: ImageVector? = null

val Icons.Br.DiagramLeanCanvas: ImageVector
    get() = _DiagramLeanCanvas ?: UXIcon(name = "DiagramLeanCanvas") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 1f)
            lineTo(5.5f, 1f)
            curveTo(2.47f, 1f, 0f, 3.47f, 0f, 6.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 6.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 6.5f)
            lineTo(21f, 15f)
            horizontalLineToRelative(-2f)
            lineTo(19f, 4.05f)
            curveToRelative(1.14f, 0.23f, 2f, 1.24f, 2f, 2.45f)
            close()
            moveTo(7f, 11.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-3.5f)
            close()
            moveTo(15f, 11.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-3.5f)
            close()
            moveTo(17f, 4f)
            verticalLineToRelative(4.5f)
            horizontalLineToRelative(-2f)
            lineTo(15f, 4f)
            horizontalLineToRelative(2f)
            close()
            moveTo(13f, 4f)
            lineTo(13f, 15f)
            horizontalLineToRelative(-2f)
            lineTo(11f, 4f)
            horizontalLineToRelative(2f)
            close()
            moveTo(9f, 4f)
            verticalLineToRelative(4.5f)
            horizontalLineToRelative(-2f)
            lineTo(7f, 4f)
            horizontalLineToRelative(2f)
            close()
            moveTo(5f, 4.05f)
            lineTo(5f, 15f)
            lineTo(3f, 15f)
            lineTo(3f, 6.5f)
            curveToRelative(0f, -1.21f, 0.86f, -2.22f, 2f, -2.45f)
            close()
            moveTo(5.5f, 20f)
            curveToRelative(-1.21f, 0f, -2.22f, -0.86f, -2.45f, -2f)
            horizontalLineToRelative(7.95f)
            verticalLineToRelative(2f)
            lineTo(5.5f, 20f)
            close()
            moveTo(18.5f, 20f)
            horizontalLineToRelative(-5.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(7.95f)
            curveToRelative(-0.23f, 1.14f, -1.24f, 2f, -2.45f, 2f)
            close()
        }
    }.also { _DiagramLeanCanvas = it }
