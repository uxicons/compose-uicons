package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownRight: ImageVector? = null

val Icons.Sc.DownRight: ImageVector
    get() = _DownRight ?: UXIcon(name = "DownRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.03f, 22.0f)
                curveToRelative(-2.19f, 0f, -4.42f, -0.23f, -6.65f, -0.7f)
                curveToRelative(-0.63f, -0.11f, -0.99f, -0.86f, -0.69f, -1.43f)
                curveToRelative(0.03f, -0.06f, 0.73f, -1.43f, 2.52f, -3.66f)
                curveToRelative(-0.53f, -0.48f, -1.01f, -0.94f, -1.45f, -1.37f)
                curveToRelative(-2.29f, -2.29f, -5.36f, -6.04f, -5.49f, -6.2f)
                curveToRelative(-0.23f, -0.28f, -0.29f, -0.65f, -0.16f, -0.98f)
                curveToRelative(0.05f, -0.14f, 0.55f, -1.39f, 2.35f, -3.19f)
                reflectiveCurveToRelative(3.05f, -2.3f, 3.19f, -2.35f)
                curveToRelative(0.33f, -0.12f, 0.71f, -0.06f, 0.98f, 0.16f)
                curveToRelative(0.16f, 0.13f, 3.91f, 3.2f, 6.2f, 5.49f)
                curveToRelative(0.44f, 0.44f, 0.9f, 0.92f, 1.38f, 1.45f)
                curveToRelative(2.23f, -1.8f, 3.6f, -2.49f, 3.66f, -2.52f)
                curveToRelative(0.56f, -0.3f, 1.31f, 0.06f, 1.43f, 0.69f)
                curveToRelative(0.93f, 4.47f, 0.93f, 8.89f, -0.0f, 13.15f)
                curveToRelative(-0.08f, 0.38f, -0.38f, 0.68f, -0.76f, 0.76f)
                curveToRelative(-2.13f, 0.47f, -4.3f, 0.7f, -6.5f, 0.7f)
                close()
            }
        }.also { _DownRight = it}
