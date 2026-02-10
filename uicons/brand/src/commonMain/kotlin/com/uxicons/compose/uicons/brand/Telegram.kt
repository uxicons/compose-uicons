package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Telegram: ImageVector? = null

val Icons.Brand.Telegram: ImageVector
    get() = _Telegram ?: UXIcon(name = "Telegram") {
        path(
            fill = SolidColor(Color.Black),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12f, 0f)
            curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
            reflectiveCurveToRelative(5.37f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.37f, 12f, -12f)
            reflectiveCurveTo(18.63f, 0f, 12f, 0f)
            close()
            moveTo(17.56f, 8.16f)
            curveToRelative(-0.18f, 1.9f, -0.96f, 6.5f, -1.36f, 8.63f)
            curveToRelative(-0.17f, 0.9f, -0.5f, 1.2f, -0.82f, 1.23f)
            curveToRelative(-0.7f, 0.06f, -1.23f, -0.46f, -1.9f, -0.9f)
            curveToRelative(-1.06f, -0.69f, -1.65f, -1.12f, -2.68f, -1.8f)
            curveToRelative(-1.19f, -0.78f, -0.42f, -1.21f, 0.26f, -1.91f)
            curveToRelative(0.18f, -0.18f, 3.25f, -2.98f, 3.31f, -3.23f)
            curveToRelative(0.01f, -0.03f, 0.01f, -0.15f, -0.06f, -0.21f)
            reflectiveCurveToRelative(-0.17f, -0.04f, -0.25f, -0.02f)
            curveToRelative(-0.11f, 0.02f, -1.79f, 1.14f, -5.06f, 3.35f)
            curveToRelative(-0.48f, 0.33f, -0.91f, 0.49f, -1.3f, 0.48f)
            curveToRelative(-0.43f, -0.01f, -1.25f, -0.24f, -1.86f, -0.44f)
            curveToRelative(-0.75f, -0.24f, -1.35f, -0.37f, -1.3f, -0.79f)
            curveToRelative(0.03f, -0.22f, 0.32f, -0.44f, 0.89f, -0.66f)
            curveToRelative(3.5f, -1.52f, 5.83f, -2.53f, 7.0f, -3.02f)
            curveToRelative(3.33f, -1.39f, 4.03f, -1.63f, 4.48f, -1.64f)
            curveTo(17.47f, 7.21f, 17.61f, 7.68f, 17.56f, 8.16f)
            close()
        }
    }.also { _Telegram = it }
