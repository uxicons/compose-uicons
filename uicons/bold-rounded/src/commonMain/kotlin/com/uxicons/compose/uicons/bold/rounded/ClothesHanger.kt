package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClothesHanger: ImageVector? = null

val Icons.Br.ClothesHanger: ImageVector
    get() = _ClothesHanger ?: UXIcon(name = "ClothesHanger") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.6f, 16.69f)
            lineToRelative(-8.18f, -6.02f)
            curveToRelative(2.1f, -1.84f, 3.05f, -3.18f, 2.45f, -5.83f)
            curveToRelative(-0.42f, -1.83f, -1.88f, -3.29f, -3.71f, -3.71f)
            curveToRelative(-1.52f, -0.35f, -3.08f, 0.0f, -4.27f, 0.96f)
            curveToRelative(-1.2f, 0.95f, -1.88f, 2.38f, -1.88f, 3.91f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -0.61f, 0.28f, -1.18f, 0.75f, -1.56f)
            curveToRelative(0.49f, -0.39f, 1.1f, -0.53f, 1.74f, -0.38f)
            curveToRelative(0.71f, 0.16f, 1.29f, 0.74f, 1.45f, 1.45f)
            curveToRelative(0.29f, 1.28f, 0.23f, 1.48f, -2.87f, 4.07f)
            lineTo(1.38f, 16.7f)
            curveToRelative(-0.86f, 0.66f, -1.38f, 1.7f, -1.38f, 2.79f)
            curveToRelative(0f, 1.93f, 1.57f, 3.51f, 3.51f, 3.51f)
            horizontalLineToRelative(16.99f)
            curveToRelative(1.93f, 0f, 3.51f, -1.57f, 3.51f, -3.51f)
            curveToRelative(0f, -1.09f, -0.52f, -2.13f, -1.4f, -2.8f)
            close()
            moveTo(20.49f, 20f)
            lineTo(3.51f, 20f)
            curveToRelative(-0.28f, 0f, -0.51f, -0.23f, -0.51f, -0.51f)
            curveToRelative(0f, -0.16f, 0.07f, -0.31f, 0.18f, -0.39f)
            lineToRelative(8.82f, -6.49f)
            lineToRelative(8.8f, 6.47f)
            curveToRelative(0.12f, 0.1f, 0.2f, 0.25f, 0.2f, 0.4f)
            curveToRelative(0f, 0.28f, -0.23f, 0.51f, -0.51f, 0.51f)
            close()
        }
    }.also { _ClothesHanger = it }
