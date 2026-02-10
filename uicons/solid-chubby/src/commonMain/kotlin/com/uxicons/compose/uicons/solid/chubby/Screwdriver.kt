package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screwdriver: ImageVector? = null

val Icons.Sc.Screwdriver: ImageVector
    get() = _Screwdriver ?: UXIcon(name = "Screwdriver") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.94f, 3.63f)
                curveToRelative(-0.45f, -1.15f, -1.3f, -2.01f, -2.53f, -2.55f)
                curveToRelative(-0.31f, -0.14f, -0.67f, -0.11f, -0.95f, 0.08f)
                lineToRelative(-3.83f, 2.5f)
                curveToRelative(-0.23f, 0.15f, -0.39f, 0.39f, -0.44f, 0.66f)
                curveToRelative(-0.17f, 0.93f, -0.21f, 1.75f, -0.16f, 2.52f)
                lineToRelative(-5.25f, 5.25f)
                curveToRelative(-0.45f, -0.23f, -0.95f, -0.41f, -1.52f, -0.56f)
                curveToRelative(-0.34f, -0.08f, -0.7f, 0.02f, -0.95f, 0.26f)
                curveToRelative(-0.73f, 0.73f, -1.43f, 1.47f, -2.06f, 2.14f)
                curveToRelative(-1.42f, 1.53f, -2.58f, 2.9f, -3.29f, 3.77f)
                curveToRelative(-0.9f, 1.06f, -1.71f, 2.49f, 0.05f, 4.25f)
                curveToRelative(1.45f, 1.5f, 2.9f, 1.22f, 4.24f, 0.07f)
                curveToRelative(1.35f, -1.11f, 2.6f, -2.2f, 3.81f, -3.32f)
                curveToRelative(0.67f, -0.62f, 1.38f, -1.3f, 2.11f, -2.03f)
                curveToRelative(0.25f, -0.25f, 0.35f, -0.61f, 0.26f, -0.95f)
                curveToRelative(-0.14f, -0.56f, -0.32f, -1.06f, -0.55f, -1.51f)
                lineToRelative(5.25f, -5.25f)
                curveToRelative(0.85f, 0.08f, 1.61f, 0f, 2.52f, -0.16f)
                curveToRelative(0.27f, -0.05f, 0.51f, -0.21f, 0.66f, -0.44f)
                lineToRelative(2.5f, -3.83f)
                curveToRelative(0.18f, -0.27f, 0.21f, -0.61f, 0.09f, -0.91f)
                close()
            }
        }.also { _Screwdriver = it}
