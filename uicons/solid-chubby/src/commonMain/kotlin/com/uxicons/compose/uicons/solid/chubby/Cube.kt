package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cube: ImageVector? = null

val Icons.Sc.Cube: ImageVector
    get() = _Cube ?: UXIcon(name = "Cube") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.26f, 6.34f)
                curveToRelative(-3.05f, -2.19f, -5.82f, -3.4f, -9.67f, -5.08f)
                lineToRelative(-0.19f, -0.09f)
                curveToRelative(-0.26f, -0.11f, -0.55f, -0.11f, -0.8f, 0f)
                lineToRelative(-0.2f, 0.09f)
                curveTo(7.56f, 2.94f, 4.78f, 4.15f, 1.74f, 6.34f)
                curveToRelative(-0.04f, 0.03f, -0.07f, 0.06f, -0.11f, 0.09f)
                curveToRelative(3.19f, 2.21f, 6.25f, 3.56f, 10.37f, 5.36f)
                curveToRelative(4.12f, -1.8f, 7.18f, -3.15f, 10.37f, -5.36f)
                curveToRelative(-0.03f, -0.03f, -0.07f, -0.06f, -0.11f, -0.09f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 13.16f)
                curveToRelative(0f, 3.81f, 0.31f, 4.96f, 0.37f, 5.16f)
                curveToRelative(0.07f, 0.21f, 0.21f, 0.4f, 0.39f, 0.53f)
                curveToRelative(2.96f, 2.0f, 6.47f, 3.54f, 9.24f, 4.07f)
                verticalLineTo(13.53f)
                curveToRelative(-3.85f, -1.68f, -6.79f, -2.99f, -9.83f, -5.0f)
                curveToRelative(-0.08f, 1.02f, -0.17f, 2.56f, -0.17f, 4.64f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.83f, 8.53f)
                curveToRelative(-3.04f, 2.02f, -5.99f, 3.33f, -9.83f, 5.0f)
                verticalLineToRelative(9.38f)
                curveToRelative(2.77f, -0.53f, 6.28f, -2.07f, 9.24f, -4.07f)
                curveToRelative(0.19f, -0.13f, 0.33f, -0.31f, 0.39f, -0.53f)
                curveToRelative(0.06f, -0.19f, 0.37f, -1.35f, 0.37f, -5.16f)
                curveToRelative(0f, -2.07f, -0.08f, -3.61f, -0.17f, -4.64f)
                close()
            }
        }.also { _Cube = it}
