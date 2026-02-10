package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsAltV: ImageVector? = null

val Icons.Sc.ArrowsAltV: ImageVector
    get() = _ArrowsAltV ?: UXIcon(name = "ArrowsAltV") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.0f, 15.53f)
                curveToRelative(-0.82f, -0.22f, -1.66f, -0.36f, -2.5f, -0.44f)
                lineToRelative(0.0f, -6.17f)
                curveToRelative(0.84f, -0.08f, 1.68f, -0.22f, 2.5f, -0.44f)
                curveToRelative(0.53f, -0.14f, 0.85f, -0.68f, 0.71f, -1.21f)
                curveTo(15.69f, 3.25f, 12.56f, 1.17f, 12.53f, 1.15f)
                curveToRelative(-0.1f, -0.06f, -0.22f, -0.11f, -0.33f, -0.13f)
                curveToRelative(-0.24f, -0.05f, -0.5f, -0.01f, -0.72f, 0.13f)
                curveToRelative(-0.03f, 0.02f, -3.17f, 2.1f, -4.19f, 6.11f)
                curveToRelative(-0.14f, 0.53f, 0.18f, 1.07f, 0.71f, 1.21f)
                curveToRelative(0.82f, 0.22f, 1.66f, 0.36f, 2.5f, 0.44f)
                lineToRelative(-0.0f, 6.17f)
                curveToRelative(-0.84f, 0.08f, -1.68f, 0.22f, -2.5f, 0.44f)
                curveToRelative(-0.53f, 0.14f, -0.85f, 0.68f, -0.71f, 1.21f)
                curveToRelative(1.02f, 4.01f, 4.16f, 6.09f, 4.19f, 6.11f)
                curveToRelative(0.1f, 0.06f, 0.22f, 0.11f, 0.33f, 0.13f)
                curveToRelative(0.24f, 0.05f, 0.5f, 0.01f, 0.72f, -0.13f)
                curveToRelative(0.03f, -0.02f, 3.17f, -2.1f, 4.19f, -6.11f)
                curveToRelative(0.14f, -0.53f, -0.18f, -1.07f, -0.71f, -1.21f)
                close()
            }
        }.also { _ArrowsAltV = it}
