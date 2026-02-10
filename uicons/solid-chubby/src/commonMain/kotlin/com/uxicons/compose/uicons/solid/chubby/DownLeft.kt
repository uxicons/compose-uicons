package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownLeft: ImageVector? = null

val Icons.Sc.DownLeft: ImageVector
    get() = _DownLeft ?: UXIcon(name = "DownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.02f, 22.0f)
                curveToRelative(-2.2f, 0f, -4.37f, -0.23f, -6.5f, -0.7f)
                curveToRelative(-0.38f, -0.08f, -0.68f, -0.38f, -0.76f, -0.76f)
                curveToRelative(-0.94f, -4.26f, -0.94f, -8.68f, -0.0f, -13.15f)
                curveToRelative(0.11f, -0.62f, 0.86f, -0.99f, 1.43f, -0.69f)
                curveToRelative(0.06f, 0.03f, 1.43f, 0.73f, 3.66f, 2.52f)
                curveToRelative(0.48f, -0.53f, 0.94f, -1.02f, 1.38f, -1.45f)
                curveToRelative(2.29f, -2.29f, 6.04f, -5.36f, 6.2f, -5.49f)
                curveToRelative(0.28f, -0.23f, 0.65f, -0.29f, 0.98f, -0.16f)
                curveToRelative(0.14f, 0.05f, 1.39f, 0.55f, 3.19f, 2.35f)
                reflectiveCurveToRelative(2.3f, 3.05f, 2.35f, 3.19f)
                curveToRelative(0.12f, 0.33f, 0.06f, 0.71f, -0.16f, 0.98f)
                curveToRelative(-0.13f, 0.16f, -3.2f, 3.91f, -5.49f, 6.2f)
                curveToRelative(-0.44f, 0.44f, -0.92f, 0.9f, -1.45f, 1.38f)
                curveToRelative(1.8f, 2.23f, 2.49f, 3.6f, 2.52f, 3.66f)
                curveToRelative(0.3f, 0.56f, -0.06f, 1.31f, -0.69f, 1.43f)
                curveToRelative(-2.23f, 0.47f, -4.45f, 0.7f, -6.65f, 0.7f)
                close()
            }
        }.also { _DownLeft = it}
