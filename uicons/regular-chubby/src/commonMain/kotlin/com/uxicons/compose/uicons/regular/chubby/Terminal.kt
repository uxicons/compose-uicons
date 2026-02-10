package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Terminal: ImageVector? = null

val Icons.Rc.Terminal: ImageVector
    get() = _Terminal ?: UXIcon(name = "Terminal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.97f, 20.74f)
                curveToRelative(-0.13f, 0.54f, -0.69f, 0.86f, -1.21f, 0.73f)
                curveToRelative(-0.02f, -0.01f, -1.94f, -0.47f, -4.76f, -0.47f)
                reflectiveCurveToRelative(-4.74f, 0.47f, -4.76f, 0.47f)
                curveToRelative(-0.54f, 0.13f, -1.08f, -0.19f, -1.21f, -0.73f)
                curveToRelative(-0.13f, -0.54f, 0.19f, -1.08f, 0.73f, -1.21f)
                curveToRelative(0.09f, -0.02f, 2.15f, -0.53f, 5.24f, -0.53f)
                reflectiveCurveToRelative(5.16f, 0.51f, 5.24f, 0.53f)
                curveToRelative(0.54f, 0.13f, 0.86f, 0.68f, 0.73f, 1.21f)
                close()
                moveTo(2.55f, 3.16f)
                curveToRelative(-0.46f, -0.3f, -1.08f, -0.17f, -1.38f, 0.29f)
                curveToRelative(-0.3f, 0.46f, -0.17f, 1.08f, 0.29f, 1.38f)
                curveToRelative(2.98f, 1.95f, 5.45f, 4.36f, 7.35f, 7.16f)
                curveToRelative(-1.9f, 2.81f, -4.37f, 5.21f, -7.35f, 7.16f)
                curveToRelative(-0.46f, 0.3f, -0.59f, 0.92f, -0.29f, 1.38f)
                curveToRelative(0.3f, 0.47f, 0.93f, 0.59f, 1.38f, 0.29f)
                curveToRelative(3.41f, -2.23f, 6.2f, -5.02f, 8.29f, -8.3f)
                curveToRelative(0.21f, -0.33f, 0.21f, -0.75f, 0f, -1.08f)
                curveToRelative(-2.1f, -3.28f, -4.89f, -6.07f, -8.29f, -8.3f)
                close()
            }
        }.also { _Terminal = it}
