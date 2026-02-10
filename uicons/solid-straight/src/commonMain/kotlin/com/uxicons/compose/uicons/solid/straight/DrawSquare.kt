package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawSquare: ImageVector? = null

val Icons.Ss.DrawSquare: ImageVector
    get() = _DrawSquare ?: UXIcon(name = "DrawSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 18.17f)
                lineTo(22f, 5.83f)
                curveToRelative(1.16f, -0.41f, 2f, -1.52f, 2f, -2.83f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                lineTo(5.83f, 2f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2f, -2.83f, -2f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                curveToRelative(0f, 1.3f, 0.84f, 2.42f, 2f, 2.83f)
                verticalLineToRelative(12.34f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.52f, -2f, 2.83f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                curveToRelative(1.3f, 0f, 2.42f, -0.84f, 2.83f, -2f)
                horizontalLineToRelative(12.34f)
                curveToRelative(0.41f, 1.16f, 1.52f, 2f, 2.83f, 2f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.3f, -0.84f, -2.42f, -2f, -2.83f)
                close()
                moveTo(18.17f, 20f)
                lineTo(5.83f, 20f)
                curveToRelative(-0.3f, -0.85f, -0.98f, -1.53f, -1.83f, -1.83f)
                lineTo(4f, 5.83f)
                curveToRelative(0.85f, -0.3f, 1.53f, -0.98f, 1.83f, -1.83f)
                horizontalLineToRelative(12.34f)
                curveToRelative(0.3f, 0.85f, 0.98f, 1.53f, 1.83f, 1.83f)
                verticalLineToRelative(12.34f)
                curveToRelative(-0.85f, 0.3f, -1.53f, 0.98f, -1.83f, 1.83f)
                close()
            }
        }.also { _DrawSquare = it}
