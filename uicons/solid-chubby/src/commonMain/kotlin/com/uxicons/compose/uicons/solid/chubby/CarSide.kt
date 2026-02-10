package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarSide: ImageVector? = null

val Icons.Sc.CarSide: ImageVector
    get() = _CarSide ?: UXIcon(name = "CarSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.65f, 9.5f)
                curveToRelative(-1.81f, -0.22f, -4.6f, -0.48f, -7.65f, -0.48f)
                reflectiveCurveToRelative(-5.84f, 0.26f, -7.65f, 0.49f)
                curveToRelative(-1.9f, 0.23f, -3.34f, 1.85f, -3.35f, 3.77f)
                quadToRelative(0f, 0.05f, 0.17f, 2.6f)
                curveToRelative(0.03f, 0.46f, 0.37f, 0.84f, 0.83f, 0.92f)
                curveToRelative(0.19f, 0.03f, 4.68f, 0.8f, 10.0f, 0.8f)
                reflectiveCurveToRelative(9.81f, -0.77f, 10.0f, -0.8f)
                curveToRelative(0.46f, -0.08f, 0.8f, -0.46f, 0.83f, -0.92f)
                quadToRelative(0.17f, -2.55f, 0.17f, -2.6f)
                curveToRelative(-0.0f, -1.92f, -1.44f, -3.54f, -3.35f, -3.77f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.45f, 21.77f)
                curveToRelative(1.38f, 0f, 2.54f, -0.95f, 2.86f, -2.24f)
                curveToRelative(-2.36f, -0.1f, -4.41f, -0.32f, -5.8f, -0.5f)
                curveToRelative(0.11f, 1.53f, 1.39f, 2.74f, 2.94f, 2.74f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.55f, 21.77f)
                curveToRelative(1.55f, 0f, 2.83f, -1.21f, 2.94f, -2.74f)
                curveToRelative(-1.39f, 0.18f, -3.44f, 0.4f, -5.8f, 0.5f)
                curveToRelative(0.32f, 1.29f, 1.48f, 2.24f, 2.86f, 2.24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.28f, 7.08f)
                verticalLineTo(2.3f)
                curveToRelative(-2.8f, 0.23f, -4.34f, 0.93f, -4.42f, 0.96f)
                curveToRelative(-0.24f, 0.11f, -0.43f, 0.32f, -0.52f, 0.57f)
                curveToRelative(-0.03f, 0.09f, -0.57f, 1.63f, -0.95f, 3.82f)
                curveToRelative(0.24f, -0.06f, 0.48f, -0.11f, 0.72f, -0.14f)
                curveToRelative(1.31f, -0.16f, 3.12f, -0.34f, 5.17f, -0.44f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.46f, 7.46f)
                curveToRelative(-1.17f, -2.38f, -2.51f, -4.03f, -2.58f, -4.12f)
                curveToRelative(-0.12f, -0.15f, -0.28f, -0.26f, -0.46f, -0.32f)
                curveToRelative(-0.1f, -0.03f, -2.36f, -0.76f, -5.14f, -0.8f)
                verticalLineTo(7.02f)
                curveToRelative(0.24f, -0.0f, 0.48f, -0.01f, 0.72f, -0.01f)
                curveToRelative(2.91f, 0f, 5.6f, 0.23f, 7.46f, 0.45f)
                close()
            }
        }.also { _CarSide = it}
