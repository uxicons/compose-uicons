package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fish: ImageVector? = null

val Icons.Sc.Fish: ImageVector
    get() = _Fish ?: UXIcon(name = "Fish") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.49f, 12.44f)
                curveToRelative(0.02f, 2.64f, -0.44f, 5.81f, -2.26f, 8.31f)
                curveToRelative(0.53f, -0.18f, 1.0f, -0.43f, 1.42f, -0.74f)
                curveToRelative(2.71f, -2.05f, 2.5f, -5.99f, 1.82f, -6.89f)
                curveToRelative(-0.19f, -0.25f, -0.54f, -0.48f, -0.98f, -0.68f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.43f, 5.49f)
                curveToRelative(-0.14f, -0.47f, -0.32f, -0.84f, -0.54f, -1.06f)
                curveToRelative(-0.54f, -0.52f, -1.92f, -0.74f, -2.9f, -0.73f)
                curveToRelative(-1.17f, 0.02f, -2.85f, 0.32f, -4.16f, 1.68f)
                curveToRelative(-0.85f, 0.88f, -1.28f, 2.01f, -1.47f, 3.12f)
                curveToRelative(2.1f, -1.97f, 5.2f, -3.01f, 9.0f, -3.01f)
                curveToRelative(0.02f, 0f, 0.05f, 0f, 0.07f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.74f, 6.9f)
                curveToRelative(-0.98f, -1.34f, -2.13f, -2.0f, -3.61f, -2.07f)
                curveToRelative(-0.06f, -1.48f, -0.73f, -2.63f, -2.06f, -3.62f)
                curveToRelative(-0.2f, -0.15f, -0.61f, -0.35f, -1.22f, -0.1f)
                curveToRelative(-0.87f, 0.37f, -2.56f, 2.06f, -2.85f, 4.12f)
                curveToRelative(-0.12f, 0.9f, 0.0f, 1.68f, 0.22f, 2.33f)
                curveToRelative(-2.83f, -0.26f, -7.05f, -0.09f, -9.67f, 2.54f)
                curveToRelative(-0.2f, 0.2f, -0.38f, 0.4f, -0.54f, 0.6f)
                curveToRelative(5.51f, 1.32f, 8.85f, 4.71f, 10.17f, 10.34f)
                curveToRelative(0.23f, -0.19f, 0.46f, -0.39f, 0.68f, -0.61f)
                curveToRelative(2.63f, -2.63f, 2.79f, -6.86f, 2.54f, -9.7f)
                curveToRelative(0.47f, 0.16f, 1.01f, 0.27f, 1.62f, 0.27f)
                curveToRelative(0.23f, 0f, 0.46f, -0.01f, 0.7f, -0.05f)
                curveToRelative(2.05f, -0.28f, 3.74f, -1.98f, 4.11f, -2.85f)
                curveToRelative(0.26f, -0.6f, 0.05f, -1.02f, -0.1f, -1.22f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.91f, 12.52f)
                curveToRelative(-1.72f, 3.81f, -0.49f, 8.39f, 0.35f, 9.24f)
                curveToRelative(0.68f, 0.68f, 2.89f, 1.24f, 4.92f, 1.24f)
                horizontalLineToRelative(0f)
                curveToRelative(1.2f, 0f, 2.71f, -0.18f, 4.2f, -0.84f)
                curveToRelative(-1.1f, -5.56f, -4.04f, -8.55f, -9.48f, -9.64f)
                close()
                moveTo(5.57f, 19.96f)
                curveToRelative(-0.84f, 0f, -1.52f, -0.68f, -1.52f, -1.52f)
                reflectiveCurveToRelative(0.68f, -1.52f, 1.52f, -1.52f)
                reflectiveCurveToRelative(1.52f, 0.68f, 1.52f, 1.52f)
                reflectiveCurveToRelative(-0.68f, 1.52f, -1.52f, 1.52f)
                close()
            }
        }.also { _Fish = it}
