package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Train: ImageVector? = null

val Icons.Rc.Train: ImageVector
    get() = _Train ?: UXIcon(name = "Train") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.33f, 21.59f)
                curveToRelative(-0.78f, -1.73f, -1.92f, -3.06f, -2.98f, -4.02f)
                curveToRelative(0.17f, -0.14f, 0.29f, -0.32f, 0.35f, -0.54f)
                curveToRelative(0.03f, -0.12f, 0.78f, -3.1f, 0.78f, -7.06f)
                curveToRelative(0f, -4.02f, -0.76f, -6.54f, -0.79f, -6.64f)
                curveToRelative(-0.07f, -0.23f, -0.22f, -0.43f, -0.43f, -0.56f)
                curveToRelative(-0.12f, -0.07f, -2.92f, -1.78f, -6.25f, -1.78f)
                reflectiveCurveToRelative(-6.13f, 1.71f, -6.25f, 1.78f)
                curveToRelative(-0.21f, 0.13f, -0.36f, 0.33f, -0.43f, 0.56f)
                curveToRelative(-0.03f, 0.11f, -0.79f, 2.66f, -0.79f, 6.64f)
                reflectiveCurveToRelative(0.74f, 6.94f, 0.78f, 7.06f)
                curveToRelative(0.05f, 0.21f, 0.18f, 0.4f, 0.35f, 0.53f)
                curveToRelative(-1.07f, 0.96f, -2.21f, 2.28f, -2.98f, 4.02f)
                curveToRelative(-0.23f, 0.5f, 0f, 1.1f, 0.51f, 1.32f)
                curveToRelative(0.13f, 0.06f, 0.27f, 0.09f, 0.41f, 0.09f)
                curveToRelative(0.38f, 0f, 0.75f, -0.22f, 0.91f, -0.59f)
                curveToRelative(0.81f, -1.82f, 2.13f, -3.11f, 3.2f, -3.93f)
                curveToRelative(1.04f, 0.32f, 2.47f, 0.6f, 4.3f, 0.6f)
                curveToRelative(1.84f, 0f, 3.28f, -0.28f, 4.31f, -0.59f)
                curveToRelative(1.07f, 0.82f, 2.38f, 2.11f, 3.19f, 3.93f)
                curveToRelative(0.17f, 0.37f, 0.53f, 0.59f, 0.91f, 0.59f)
                curveToRelative(0.14f, 0f, 0.27f, -0.03f, 0.41f, -0.09f)
                curveToRelative(0.5f, -0.23f, 0.73f, -0.82f, 0.51f, -1.32f)
                close()
                moveTo(7.13f, 4.3f)
                curveToRelative(0.76f, -0.4f, 2.72f, -1.3f, 4.87f, -1.3f)
                reflectiveCurveToRelative(4.11f, 0.9f, 4.87f, 1.3f)
                curveToRelative(0.11f, 0.47f, 0.3f, 1.37f, 0.44f, 2.61f)
                curveToRelative(-0.54f, 0.9f, -2.61f, 4.02f, -5.32f, 4.02f)
                curveToRelative(-2.68f, 0f, -4.75f, -3.11f, -5.29f, -4.02f)
                curveToRelative(0.14f, -1.24f, 0.33f, -2.15f, 0.44f, -2.62f)
                close()
                moveTo(16.85f, 16.14f)
                curveToRelative(-0.64f, 0.31f, -2.25f, 0.94f, -4.85f, 0.94f)
                curveToRelative(-2.57f, 0f, -4.2f, -0.63f, -4.85f, -0.94f)
                curveToRelative(-0.19f, -0.91f, -0.61f, -3.21f, -0.62f, -6.08f)
                curveToRelative(1.25f, 1.4f, 3.13f, 2.88f, 5.46f, 2.88f)
                curveToRelative(2.36f, 0f, 4.23f, -1.47f, 5.48f, -2.87f)
                curveToRelative(-0.01f, 2.84f, -0.43f, 5.16f, -0.62f, 6.07f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.27f, 6.61f)
                horizontalLineToRelative(3.46f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.46f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 13.84f)
                curveToRelative(-0.55f, 0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }.also { _Train = it}
