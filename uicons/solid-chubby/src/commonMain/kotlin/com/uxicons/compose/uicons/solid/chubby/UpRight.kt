package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpRight: ImageVector? = null

val Icons.Sc.UpRight: ImageVector
    get() = _UpRight ?: UXIcon(name = "UpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.01f, 22f)
                curveToRelative(-0.12f, 0f, -0.24f, -0.02f, -0.35f, -0.06f)
                curveToRelative(-0.14f, -0.05f, -1.39f, -0.55f, -3.19f, -2.35f)
                reflectiveCurveToRelative(-2.3f, -3.05f, -2.35f, -3.19f)
                curveToRelative(-0.12f, -0.33f, -0.06f, -0.71f, 0.16f, -0.98f)
                curveToRelative(0.13f, -0.16f, 3.2f, -3.91f, 5.49f, -6.2f)
                curveToRelative(0.43f, -0.43f, 0.92f, -0.9f, 1.45f, -1.38f)
                curveToRelative(-1.8f, -2.23f, -2.49f, -3.6f, -2.52f, -3.66f)
                curveToRelative(-0.3f, -0.56f, 0.06f, -1.31f, 0.69f, -1.43f)
                curveToRelative(4.46f, -0.93f, 8.89f, -0.93f, 13.15f, 0.0f)
                curveToRelative(0.38f, 0.08f, 0.68f, 0.38f, 0.76f, 0.76f)
                curveToRelative(0.94f, 4.26f, 0.94f, 8.68f, 0.0f, 13.15f)
                curveToRelative(-0.11f, 0.63f, -0.86f, 0.99f, -1.43f, 0.69f)
                curveToRelative(-0.06f, -0.03f, -1.43f, -0.73f, -3.66f, -2.52f)
                curveToRelative(-0.48f, 0.53f, -0.94f, 1.01f, -1.37f, 1.45f)
                curveToRelative(-2.29f, 2.29f, -6.04f, 5.36f, -6.2f, 5.49f)
                curveToRelative(-0.18f, 0.15f, -0.41f, 0.23f, -0.63f, 0.23f)
                close()
            }
        }.also { _UpRight = it}
