package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawSquare: ImageVector? = null

val Icons.Br.DrawSquare: ImageVector
    get() = _DrawSquare ?: UXIcon(name = "DrawSquare") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 18.18f)
            lineTo(22f, 5.82f)
            curveToRelative(1.16f, -0.41f, 2f, -1.51f, 2f, -2.82f)
            curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
            curveToRelative(-1.3f, 0f, -2.4f, 0.84f, -2.82f, 2f)
            lineTo(5.82f, 2f)
            curveToRelative(-0.41f, -1.16f, -1.51f, -2f, -2.82f, -2f)
            curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
            curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
            verticalLineToRelative(12.37f)
            curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            curveToRelative(1.3f, 0f, 2.4f, -0.84f, 2.82f, -2f)
            horizontalLineToRelative(12.37f)
            curveToRelative(0.41f, 1.16f, 1.51f, 2f, 2.82f, 2f)
            curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
            curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
            close()
            moveTo(5f, 18.78f)
            lineTo(5f, 5.22f)
            curveToRelative(0.08f, -0.07f, 0.15f, -0.14f, 0.22f, -0.22f)
            horizontalLineToRelative(13.56f)
            curveToRelative(0.07f, 0.08f, 0.14f, 0.15f, 0.22f, 0.22f)
            verticalLineToRelative(13.56f)
            curveToRelative(-0.08f, 0.07f, -0.15f, 0.14f, -0.22f, 0.22f)
            lineTo(5.22f, 19.0f)
            curveToRelative(-0.07f, -0.08f, -0.14f, -0.15f, -0.22f, -0.22f)
            close()
        }
    }.also { _DrawSquare = it }
