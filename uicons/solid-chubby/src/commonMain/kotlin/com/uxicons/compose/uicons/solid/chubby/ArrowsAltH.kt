package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsAltH: ImageVector? = null

val Icons.Sc.ArrowsAltH: ImageVector
    get() = _ArrowsAltH ?: UXIcon(name = "ArrowsAltH") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.85f, 11.47f)
                curveToRelative(-0.02f, -0.03f, -2.1f, -3.16f, -6.11f, -4.19f)
                curveToRelative(-0.53f, -0.13f, -1.07f, 0.18f, -1.21f, 0.71f)
                curveToRelative(-0.22f, 0.82f, -0.36f, 1.66f, -0.44f, 2.5f)
                horizontalLineToRelative(-6.17f)
                curveToRelative(-0.08f, -0.84f, -0.22f, -1.68f, -0.44f, -2.5f)
                curveToRelative(-0.14f, -0.53f, -0.68f, -0.85f, -1.21f, -0.71f)
                curveTo(3.25f, 8.31f, 1.17f, 11.44f, 1.15f, 11.47f)
                curveToRelative(-0.06f, 0.1f, -0.11f, 0.22f, -0.13f, 0.33f)
                curveToRelative(-0.05f, 0.24f, -0.01f, 0.5f, 0.13f, 0.72f)
                curveToRelative(0.02f, 0.03f, 2.1f, 3.16f, 6.11f, 4.19f)
                curveToRelative(0.08f, 0.02f, 0.17f, 0.03f, 0.25f, 0.03f)
                curveToRelative(0.44f, 0f, 0.85f, -0.3f, 0.97f, -0.74f)
                curveToRelative(0.22f, -0.82f, 0.36f, -1.66f, 0.44f, -2.5f)
                horizontalLineToRelative(6.17f)
                curveToRelative(0.08f, 0.84f, 0.22f, 1.68f, 0.44f, 2.5f)
                curveToRelative(0.12f, 0.45f, 0.52f, 0.74f, 0.97f, 0.74f)
                curveToRelative(0.08f, 0f, 0.17f, -0.01f, 0.25f, -0.03f)
                curveToRelative(4.01f, -1.02f, 6.09f, -4.16f, 6.11f, -4.19f)
                curveToRelative(0.06f, -0.1f, 0.11f, -0.22f, 0.13f, -0.33f)
                curveToRelative(0.05f, -0.24f, 0.01f, -0.5f, -0.13f, -0.72f)
                close()
            }
        }.also { _ArrowsAltH = it}
