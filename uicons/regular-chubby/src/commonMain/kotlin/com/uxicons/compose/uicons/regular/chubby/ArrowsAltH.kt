package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsAltH: ImageVector? = null

val Icons.Rc.ArrowsAltH: ImageVector
    get() = _ArrowsAltH ?: UXIcon(name = "ArrowsAltH") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.47f, 16.0f)
                curveToRelative(0.26f, -0.98f, 0.42f, -1.99f, 0.49f, -3.0f)
                lineToRelative(6.08f, 0.0f)
                curveToRelative(0.07f, 1.01f, 0.23f, 2.02f, 0.49f, 3.0f)
                curveToRelative(0.14f, 0.53f, 0.68f, 0.85f, 1.21f, 0.71f)
                curveToRelative(4.01f, -1.02f, 6.09f, -4.16f, 6.11f, -4.19f)
                curveToRelative(0.17f, -0.28f, 0.23f, -0.68f, 0f, -1.05f)
                curveToRelative(-0.02f, -0.03f, -2.1f, -3.17f, -6.11f, -4.19f)
                curveToRelative(-0.53f, -0.14f, -1.07f, 0.18f, -1.21f, 0.71f)
                curveToRelative(-0.26f, 0.98f, -0.42f, 1.99f, -0.49f, 3.0f)
                lineToRelative(-6.08f, -0.0f)
                curveToRelative(-0.07f, -1.01f, -0.23f, -2.02f, -0.49f, -3.0f)
                curveToRelative(-0.14f, -0.53f, -0.68f, -0.85f, -1.21f, -0.71f)
                curveTo(3.25f, 8.31f, 1.17f, 11.44f, 1.15f, 11.47f)
                curveToRelative(-0.17f, 0.28f, -0.23f, 0.68f, 0f, 1.05f)
                curveToRelative(0.02f, 0.03f, 2.1f, 3.17f, 6.11f, 4.19f)
                curveToRelative(0.53f, 0.14f, 1.07f, -0.18f, 1.21f, -0.71f)
                close()
            }
        }.also { _ArrowsAltH = it}
