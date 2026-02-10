package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bell: ImageVector? = null

val Icons.Sc.Bell: ImageVector
    get() = _Bell ?: UXIcon(name = "Bell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.73f, 20.5f)
                curveToRelative(0.39f, 1.44f, 1.71f, 2.5f, 3.27f, 2.5f)
                reflectiveCurveToRelative(2.87f, -1.06f, 3.27f, -2.5f)
                curveToRelative(-0.89f, 0.12f, -1.95f, 0.19f, -3.27f, 0.19f)
                reflectiveCurveToRelative(-2.38f, -0.07f, -3.27f, -0.2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.67f, 12.44f)
                curveToRelative(-0.19f, -0.41f, -0.41f, -0.83f, -0.65f, -1.27f)
                curveToRelative(-0.21f, -0.39f, -0.32f, -0.85f, -0.32f, -1.35f)
                horizontalLineToRelative(0f)
                curveToRelative(0.01f, -1.07f, -0.06f, -2.15f, -0.2f, -3.23f)
                curveToRelative(-0.41f, -3.08f, -3.3f, -5.59f, -6.54f, -5.59f)
                curveToRelative(-3.14f, 0f, -6.04f, 2.51f, -6.44f, 5.59f)
                curveToRelative(-0.14f, 1.07f, -0.21f, 2.15f, -0.2f, 3.22f)
                curveToRelative(0.0f, 0.5f, -0.11f, 0.96f, -0.32f, 1.35f)
                curveToRelative(-0.24f, 0.43f, -0.46f, 0.86f, -0.65f, 1.27f)
                curveToRelative(-0.47f, 1.0f, -0.51f, 2.12f, -0.11f, 3.16f)
                curveToRelative(0.4f, 1.03f, 1.19f, 1.83f, 2.22f, 2.24f)
                curveToRelative(1.28f, 0.52f, 2.71f, 0.86f, 5.56f, 0.86f)
                curveToRelative(2.88f, 0f, 4.26f, -0.33f, 5.57f, -0.86f)
                curveToRelative(1.02f, -0.42f, 1.81f, -1.21f, 2.21f, -2.24f)
                curveToRelative(0.4f, -1.03f, 0.36f, -2.15f, -0.11f, -3.15f)
                close()
            }
        }.also { _Bell = it}
