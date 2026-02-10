package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exit: ImageVector? = null

val Icons.Tc.Exit: ImageVector
    get() = _Exit ?: UXIcon(name = "Exit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.53f, 11.82f)
                curveToRelative(-0.06f, -0.16f, -1.61f, -3.85f, -7.48f, -6.66f)
                curveToRelative(-0.25f, -0.12f, -0.55f, -0.01f, -0.67f, 0.23f)
                curveToRelative(-0.12f, 0.25f, -0.01f, 0.55f, 0.23f, 0.67f)
                curveToRelative(4.04f, 1.93f, 5.89f, 4.29f, 6.61f, 5.44f)
                horizontalLineTo(5.6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(15.63f)
                curveToRelative(-0.72f, 1.15f, -2.59f, 3.52f, -6.6f, 5.45f)
                curveToRelative(-0.25f, 0.12f, -0.35f, 0.42f, -0.23f, 0.67f)
                curveToRelative(0.09f, 0.18f, 0.27f, 0.28f, 0.45f, 0.28f)
                curveToRelative(0.07f, 0f, 0.15f, -0.02f, 0.22f, -0.05f)
                curveToRelative(5.79f, -2.77f, 7.41f, -6.49f, 7.47f, -6.65f)
                curveToRelative(0.05f, -0.12f, 0.05f, -0.26f, 0.0f, -0.38f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.11f, 22.0f)
                curveToRelative(-2.16f, -0.28f, -3.87f, -0.67f, -4.51f, -0.83f)
                curveToRelative(-0.27f, -1.0f, -1.17f, -4.66f, -1.17f, -9.17f)
                reflectiveCurveTo(3.33f, 3.82f, 3.6f, 2.83f)
                curveToRelative(0.64f, -0.16f, 2.33f, -0.55f, 4.51f, -0.83f)
                curveToRelative(0.27f, -0.04f, 0.47f, -0.29f, 0.43f, -0.56f)
                curveToRelative(-0.04f, -0.27f, -0.3f, -0.47f, -0.56f, -0.43f)
                curveToRelative(-2.84f, 0.37f, -4.83f, 0.91f, -4.91f, 0.93f)
                curveToRelative(-0.17f, 0.04f, -0.3f, 0.17f, -0.35f, 0.34f)
                curveToRelative(-0.05f, 0.17f, -1.28f, 4.29f, -1.28f, 9.73f)
                reflectiveCurveToRelative(1.23f, 9.56f, 1.28f, 9.73f)
                curveToRelative(0.05f, 0.17f, 0.18f, 0.29f, 0.35f, 0.34f)
                curveToRelative(0.08f, 0.02f, 2.09f, 0.55f, 4.91f, 0.92f)
                curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.07f, 0.0f)
                curveToRelative(0.25f, 0f, 0.46f, -0.18f, 0.49f, -0.43f)
                curveToRelative(0.04f, -0.27f, -0.16f, -0.53f, -0.43f, -0.56f)
                close()
            }
        }.also { _Exit = it}
