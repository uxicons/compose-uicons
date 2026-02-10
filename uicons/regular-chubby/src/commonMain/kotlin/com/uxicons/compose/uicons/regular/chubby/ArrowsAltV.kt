package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsAltV: ImageVector? = null

val Icons.Rc.ArrowsAltV: ImageVector
    get() = _ArrowsAltV ?: UXIcon(name = "ArrowsAltV") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.0f, 15.53f)
                curveToRelative(-0.98f, -0.26f, -1.99f, -0.42f, -3.0f, -0.49f)
                lineToRelative(0.0f, -6.08f)
                curveToRelative(1.01f, -0.07f, 2.02f, -0.23f, 3.0f, -0.49f)
                curveToRelative(0.53f, -0.14f, 0.85f, -0.68f, 0.71f, -1.21f)
                curveTo(15.69f, 3.25f, 12.56f, 1.17f, 12.53f, 1.15f)
                curveToRelative(-0.28f, -0.17f, -0.68f, -0.23f, -1.05f, 0f)
                curveToRelative(-0.03f, 0.02f, -3.17f, 2.1f, -4.19f, 6.11f)
                curveToRelative(-0.14f, 0.53f, 0.18f, 1.07f, 0.71f, 1.21f)
                curveToRelative(0.98f, 0.26f, 1.99f, 0.42f, 3.0f, 0.49f)
                lineToRelative(-0.0f, 6.08f)
                curveToRelative(-1.01f, 0.07f, -2.02f, 0.23f, -3.0f, 0.49f)
                curveToRelative(-0.53f, 0.14f, -0.85f, 0.68f, -0.71f, 1.21f)
                curveToRelative(1.02f, 4.01f, 4.16f, 6.09f, 4.19f, 6.11f)
                curveToRelative(0.28f, 0.17f, 0.68f, 0.23f, 1.05f, 0f)
                curveToRelative(0.03f, -0.02f, 3.17f, -2.1f, 4.19f, -6.11f)
                curveToRelative(0.14f, -0.53f, -0.18f, -1.07f, -0.71f, -1.21f)
                close()
            }
        }.also { _ArrowsAltV = it}
