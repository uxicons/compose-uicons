package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scythe: ImageVector? = null

val Icons.Sc.Scythe: ImageVector
    get() = _Scythe ?: UXIcon(name = "Scythe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.02f, 3.32f)
                curveToRelative(-0.85f, 3.56f, -3.32f, 12.54f, -7.78f, 19.03f)
                curveToRelative(-0.47f, 0.69f, -1.41f, 0.85f, -2.09f, 0.39f)
                curveToRelative(-0.68f, -0.47f, -0.86f, -1.4f, -0.39f, -2.09f)
                curveToRelative(1.01f, -1.46f, 1.91f, -3.09f, 2.71f, -4.75f)
                curveToRelative(-0.94f, -0.09f, -1.72f, -0.22f, -2.19f, -0.31f)
                curveToRelative(-0.81f, -0.16f, -1.35f, -0.94f, -1.19f, -1.76f)
                curveToRelative(0.16f, -0.81f, 0.94f, -1.35f, 1.76f, -1.19f)
                curveToRelative(0.57f, 0.11f, 1.65f, 0.28f, 2.92f, 0.34f)
                curveToRelative(0.68f, -1.65f, 1.25f, -3.26f, 1.73f, -4.73f)
                curveToRelative(-2.79f, -0.24f, -4.97f, -0.25f, -5.0f, -0.25f)
                curveToRelative(-5.74f, 0f, -9.1f, 1.71f, -10.57f, 5.37f)
                curveToRelative(-0.15f, 0.39f, -0.53f, 0.63f, -0.93f, 0.63f)
                curveToRelative(-0.57f, 0.01f, -1.04f, -0.49f, -1.0f, -1.06f)
                curveToRelative(0.52f, -8.37f, 4.56f, -11.94f, 13.5f, -11.94f)
                curveToRelative(-0.06f, 0f, 3.9f, 0.0f, 7.41f, 0.51f)
                curveToRelative(0.81f, 0.19f, 1.3f, 1.0f, 1.11f, 1.81f)
                close()
            }
        }.also { _Scythe = it}
