package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Beer: ImageVector? = null

val Icons.Sc.Beer: ImageVector
    get() = _Beer ?: UXIcon(name = "Beer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.02f, 12.7f)
                curveToRelative(-0.11f, -0.19f, -0.26f, -0.36f, -0.44f, -0.48f)
                curveToRelative(-0.27f, -0.19f, -1.53f, -1.04f, -2.9f, -1.28f)
                lineToRelative(0.05f, -0.76f)
                curveToRelative(-0.74f, -0.14f, -2.04f, -0.35f, -3.26f, -0.4f)
                verticalLineToRelative(2.33f)
                curveToRelative(0f, 2.06f, -1.68f, 3.73f, -3.74f, 3.73f)
                reflectiveCurveToRelative(-3.74f, -1.67f, -3.74f, -3.73f)
                verticalLineToRelative(-2.57f)
                curveToRelative(-3.64f, -0.13f, -5.51f, 0.66f, -6.12f, 0.99f)
                lineToRelative(0.7f, 10.91f)
                curveToRelative(0.03f, 0.44f, 0.34f, 0.81f, 0.77f, 0.91f)
                curveToRelative(0.12f, 0.03f, 2.86f, 0.65f, 6.95f, 0.65f)
                reflectiveCurveToRelative(6.84f, -0.62f, 6.96f, -0.65f)
                curveToRelative(0.43f, -0.1f, 0.75f, -0.47f, 0.77f, -0.91f)
                lineToRelative(0.09f, -1.39f)
                curveToRelative(1.18f, -0.02f, 2.24f, -0.3f, 2.39f, -0.34f)
                curveToRelative(0.31f, -0.09f, 0.59f, -0.27f, 0.79f, -0.53f)
                curveToRelative(0.09f, -0.12f, 0.93f, -1.25f, 1.2f, -3.09f)
                curveToRelative(0.29f, -1.93f, -0.34f, -3.16f, -0.47f, -3.39f)
                close()
                moveTo(19.52f, 15.65f)
                curveToRelative(-0.08f, 0.56f, -0.25f, 1.0f, -0.39f, 1.3f)
                curveToRelative(-0.25f, 0.04f, -0.54f, 0.08f, -0.83f, 0.1f)
                lineToRelative(0.19f, -3.07f)
                curveToRelative(0.33f, 0.11f, 0.69f, 0.29f, 1.0f, 0.46f)
                curveToRelative(0.06f, 0.25f, 0.11f, 0.67f, 0.03f, 1.21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.06f, 7.6f)
                curveToRelative(0.52f, 0.04f, 0.93f, 0.47f, 0.93f, 1.0f)
                verticalLineToRelative(3.52f)
                curveToRelative(0f, 0.95f, 0.78f, 1.73f, 1.74f, 1.73f)
                reflectiveCurveToRelative(1.74f, -0.78f, 1.74f, -1.73f)
                verticalLineToRelative(-3.33f)
                curveToRelative(0f, -0.53f, 0.42f, -0.97f, 0.95f, -1.0f)
                curveToRelative(1.69f, -0.08f, 3.75f, 0.26f, 4.76f, 0.45f)
                curveToRelative(0.01f, -0.16f, 0.0f, -0.32f, -0.02f, -0.48f)
                curveToRelative(-0.32f, -2.29f, -2.06f, -3.65f, -4.67f, -3.65f)
                curveToRelative(-0.14f, 0f, -0.27f, 0.01f, -0.41f, 0.02f)
                curveToRelative(-0.65f, -1.82f, -2.4f, -3.12f, -4.41f, -3.12f)
                curveToRelative(-2.25f, 0f, -4.14f, 1.6f, -4.58f, 3.71f)
                curveToRelative(-3.0f, 0.33f, -3.66f, 2.15f, -3.66f, 3.69f)
                curveToRelative(0f, 0.04f, 0f, 0.07f, 0.0f, 0.11f)
                curveToRelative(1.24f, -0.54f, 3.64f, -1.21f, 7.61f, -0.91f)
                close()
            }
        }.also { _Beer = it}
