package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snake: ImageVector? = null

val Icons.Sc.Snake: ImageVector
    get() = _Snake ?: UXIcon(name = "Snake") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.99f, 7.5f)
                curveToRelative(1f, 1.23f, 2.17f, 1.5f, 3.0f, 1.5f)
                curveToRelative(2.49f, 0f, 6f, -1.24f, 6f, -4f)
                reflectiveCurveToRelative(-3.51f, -4f, -6f, -4f)
                curveToRelative(-0.84f, 0f, -2.01f, 0.28f, -3.01f, 1.51f)
                curveToRelative(-4.08f, 0.17f, -5.99f, 2.4f, -5.99f, 6.99f)
                curveToRelative(0f, 2.3f, 0.32f, 4.1f, 0.97f, 5.54f)
                curveToRelative(0.95f, -0.02f, 1.97f, -0.04f, 3.03f, -0.04f)
                curveToRelative(1.85f, 0f, 3.57f, 0.04f, 5.05f, 0.09f)
                curveToRelative(-2.89f, -0.5f, -4.05f, -2.29f, -4.05f, -6.09f)
                curveToRelative(0f, -1.44f, 0.67f, -1.5f, 0.99f, -1.5f)
                close()
                moveTo(18.5f, 3.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(23f, 20f)
                curveToRelative(0f, 0.27f, -0.02f, 0.53f, -0.07f, 0.79f)
                curveToRelative(-0.17f, 1.0f, -0.73f, 1.78f, -2.09f, 1.9f)
                curveToRelative(-1.62f, 0.14f, -4.89f, 0.31f, -8.85f, 0.31f)
                reflectiveCurveToRelative(-7.12f, -0.17f, -8.74f, -0.31f)
                curveToRelative(-1.36f, -0.12f, -2.02f, -0.9f, -2.19f, -1.9f)
                curveToRelative(-0.09f, -0.51f, -0.09f, -1.06f, 0f, -1.57f)
                curveToRelative(0.17f, -1.0f, 0.83f, -1.78f, 2.19f, -1.9f)
                curveToRelative(1.62f, -0.14f, 4.78f, -0.31f, 8.74f, -0.31f)
                reflectiveCurveToRelative(7.23f, 0.17f, 8.85f, 0.31f)
                curveToRelative(1.36f, 0.12f, 1.91f, 0.9f, 2.09f, 1.9f)
                curveToRelative(0.04f, 0.26f, 0.07f, 0.52f, 0.07f, 0.79f)
                close()
                moveTo(1f, 10f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.3f, 0.0f, 1.11f, -0.0f, 1.41f, 0.01f)
                curveToRelative(1.4f, 0.04f, 2.55f, 1.12f, 2.68f, 2.51f)
                curveToRelative(0.13f, 1.34f, 0.39f, 2.54f, 0.77f, 3.58f)
                curveToRelative(-1.35f, 0.05f, -2.48f, 0.12f, -3.35f, 0.19f)
                curveToRelative(-0.35f, -0.88f, -0.51f, -1.96f, -0.51f, -3.29f)
                curveToRelative(0f, -0.57f, -0.44f, -1.0f, -1.01f, -1.0f)
                curveToRelative(-0.55f, -0.01f, -0.99f, -0.45f, -0.99f, -1f)
                close()
            }
        }.also { _Snake = it}
