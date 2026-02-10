package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pretzel: ImageVector? = null

val Icons.Br.Pretzel: ImageVector
    get() = _Pretzel ?: UXIcon(name = "Pretzel") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16f, 2f)
            curveToRelative(-1.49f, 0f, -2.87f, 0.47f, -4f, 1.26f)
            curveToRelative(-1.14f, -0.79f, -2.51f, -1.26f, -4f, -1.26f)
            curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
            curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
            close()
            moveTo(12f, 19f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
            curveToRelative(0.7f, 0f, 1.36f, 0.18f, 1.94f, 0.5f)
            curveToRelative(-0.6f, 1.03f, -0.94f, 2.23f, -0.94f, 3.5f)
            curveToRelative(0f, 1.27f, 0.35f, 2.47f, 0.95f, 3.51f)
            curveToRelative(-0.48f, 0.27f, -1.01f, 0.45f, -1.58f, 0.5f)
            curveToRelative(-0.82f, 0.07f, -1.43f, 0.8f, -1.36f, 1.63f)
            reflectiveCurveToRelative(0.79f, 1.43f, 1.63f, 1.36f)
            curveToRelative(1.24f, -0.11f, 2.4f, -0.56f, 3.37f, -1.25f)
            curveToRelative(0.97f, 0.69f, 2.12f, 1.13f, 3.37f, 1.25f)
            curveToRelative(0.83f, 0.07f, 1.55f, -0.53f, 1.63f, -1.36f)
            reflectiveCurveToRelative(-0.53f, -1.55f, -1.36f, -1.63f)
            curveToRelative(-0.57f, -0.05f, -1.11f, -0.23f, -1.58f, -0.5f)
            curveToRelative(0.6f, -1.04f, 0.95f, -2.24f, 0.95f, -3.51f)
            curveToRelative(0f, -1.27f, -0.34f, -2.47f, -0.94f, -3.5f)
            curveToRelative(0.57f, -0.32f, 1.24f, -0.5f, 1.94f, -0.5f)
            curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
            curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
            close()
        }
    }.also { _Pretzel = it }
