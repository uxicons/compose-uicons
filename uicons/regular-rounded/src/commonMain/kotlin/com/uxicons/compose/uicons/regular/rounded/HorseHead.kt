package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HorseHead: ImageVector? = null

val Icons.Rr.HorseHead: ImageVector
    get() = _HorseHead ?: UXIcon(name = "HorseHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(22.3f, 13.89f)
                curveToRelative(-0.21f, -0.19f, -0.41f, -0.37f, -0.56f, -0.53f)
                curveToRelative(-1.85f, -1.85f, -3.1f, -4.0f, -4.21f, -5.9f)
                curveToRelative(-0.87f, -1.5f, -1.64f, -2.81f, -2.53f, -3.61f)
                lineTo(15.0f, 0.81f)
                curveToRelative(0f, -0.54f, -0.52f, -0.93f, -1.04f, -0.79f)
                curveToRelative(-1.45f, 0.39f, -2.58f, 1.58f, -2.88f, 3.07f)
                curveTo(2.39f, 4.06f, 0f, 11.49f, 0f, 16f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.13f, 0.31f, -11f, 11f, -11f)
                curveToRelative(0.78f, 0f, 1.76f, 1.68f, 2.8f, 3.46f)
                curveToRelative(1.11f, 1.91f, 2.49f, 4.28f, 4.53f, 6.31f)
                curveToRelative(0.18f, 0.18f, 0.4f, 0.39f, 0.65f, 0.61f)
                curveToRelative(1.18f, 1.05f, 1.36f, 2.85f, 0.41f, 4.09f)
                lineToRelative(-0.08f, 0.11f)
                curveToRelative(-0.32f, 0.42f, -0.89f, 0.54f, -1.35f, 0.29f)
                curveToRelative(-0.35f, -0.19f, -0.79f, -0.41f, -1.27f, -0.66f)
                curveToRelative(-1.49f, -0.77f, -3.54f, -1.82f, -5.12f, -2.89f)
                curveToRelative(-0.6f, -0.41f, -1.39f, -0.37f, -1.95f, 0.09f)
                curveToRelative(-0.56f, 0.46f, -0.75f, 1.21f, -0.47f, 1.88f)
                curveToRelative(0.86f, 2.06f, 2.73f, 5.1f, 2.81f, 5.23f)
                curveToRelative(0.19f, 0.31f, 0.52f, 0.47f, 0.85f, 0.47f)
                curveToRelative(0.18f, 0f, 0.36f, -0.05f, 0.53f, -0.15f)
                curveToRelative(0.47f, -0.29f, 0.61f, -0.91f, 0.33f, -1.38f)
                curveToRelative(-0.01f, -0.02f, -1.26f, -2.04f, -2.14f, -3.82f)
                curveToRelative(1.44f, 0.88f, 3.03f, 1.69f, 4.25f, 2.33f)
                curveToRelative(0.47f, 0.24f, 0.9f, 0.46f, 1.24f, 0.65f)
                curveToRelative(1.33f, 0.71f, 2.96f, 0.36f, 3.88f, -0.83f)
                lineToRelative(0.08f, -0.11f)
                curveToRelative(1.59f, -2.07f, 1.3f, -5.06f, -0.67f, -6.8f)
                close()
            }
        }.also { _HorseHead = it}
