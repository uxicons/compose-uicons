package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Baguette: ImageVector? = null

val Icons.Ss.Baguette: ImageVector
    get() = _Baguette ?: UXIcon(name = "Baguette") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.04f, 0.96f)
                curveToRelative(-1.19f, -1.19f, -3.35f, -1.28f, -6.09f, -0.25f)
                curveToRelative(-1.38f, 0.52f, -2.81f, 1.3f, -4.18f, 2.26f)
                lineToRelative(3.63f, 3.63f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.82f, -3.82f)
                curveToRelative(-0.5f, 0.42f, -0.98f, 0.86f, -1.45f, 1.32f)
                lineToRelative(-1.39f, 1.39f)
                lineToRelative(3.88f, 3.88f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.88f, -3.88f)
                lineToRelative(-1.39f, 1.39f)
                curveToRelative(-0.44f, 0.44f, -0.87f, 0.91f, -1.27f, 1.39f)
                lineToRelative(3.82f, 3.82f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.64f, -3.64f)
                curveToRelative(-0.98f, 1.39f, -1.78f, 2.85f, -2.31f, 4.25f)
                curveToRelative(-1.03f, 2.73f, -0.94f, 4.9f, 0.25f, 6.09f)
                curveToRelative(0.64f, 0.64f, 1.57f, 0.97f, 2.71f, 0.97f)
                curveToRelative(0.98f, 0f, 2.12f, -0.24f, 3.38f, -0.71f)
                curveToRelative(2.46f, -0.93f, 5.1f, -2.68f, 7.23f, -4.81f)
                lineToRelative(4.2f, -4.2f)
                curveToRelative(2.13f, -2.13f, 3.88f, -4.76f, 4.81f, -7.23f)
                curveToRelative(1.03f, -2.73f, 0.94f, -4.9f, -0.25f, -6.09f)
                close()
            }
        }.also { _Baguette = it}
