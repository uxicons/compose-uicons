package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPump: ImageVector? = null

val Icons.Sc.GasPump: ImageVector
    get() = _GasPump ?: UXIcon(name = "GasPump") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.69f, 6.35f)
                curveToRelative(0.35f, 0f, 0.68f, 0.03f, 0.98f, 0.08f)
                lineToRelative(1.05f, -1.15f)
                curveToRelative(0.37f, -0.41f, 1.01f, -0.43f, 1.41f, -0.06f)
                curveToRelative(0.41f, 0.37f, 0.43f, 1.01f, 0.06f, 1.41f)
                lineToRelative(-0.67f, 0.73f)
                curveToRelative(0.56f, 0.62f, 0.85f, 1.52f, 0.85f, 2.7f)
                horizontalLineToRelative(3.97f)
                curveToRelative(-0.15f, -4.23f, -0.73f, -7.18f, -0.76f, -7.32f)
                curveToRelative(-0.08f, -0.38f, -0.36f, -0.68f, -0.74f, -0.77f)
                curveToRelative(-0.12f, -0.03f, -2.89f, -0.69f, -6.17f, -0.69f)
                reflectiveCurveTo(2.65f, 1.94f, 2.53f, 1.97f)
                curveToRelative(-0.38f, 0.09f, -0.66f, 0.39f, -0.74f, 0.77f)
                curveToRelative(-0.03f, 0.14f, -0.61f, 3.12f, -0.76f, 7.32f)
                horizontalLineToRelative(3.97f)
                curveToRelative(0.0f, -2.46f, 1.24f, -3.71f, 3.69f, -3.71f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.01f, 10.06f)
                horizontalLineToRelative(3.38f)
                curveToRelative(0f, -1.45f, -0.44f, -1.71f, -1.69f, -1.71f)
                reflectiveCurveToRelative(-1.69f, 0.26f, -1.69f, 1.71f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.49f, 3.07f)
                curveToRelative(-0.62f, -0.55f, -1.57f, -0.49f, -2.12f, 0.13f)
                lineToRelative(-2.4f, 2.71f)
                curveToRelative(-0.24f, 0.27f, -0.38f, 0.63f, -0.38f, 0.99f)
                verticalLineToRelative(1.95f)
                curveToRelative(0f, 3.56f, -0.29f, 6.53f, -0.45f, 7.95f)
                curveToRelative(-0.26f, 0.07f, -0.59f, 0.14f, -0.99f, 0.19f)
                curveToRelative(0.12f, -1.4f, 0.22f, -3.08f, 0.22f, -4.93f)
                horizontalLineTo(1f)
                curveToRelative(0.01f, 5.22f, 0.76f, 9.04f, 0.79f, 9.21f)
                curveToRelative(0.08f, 0.38f, 0.37f, 0.68f, 0.74f, 0.77f)
                curveToRelative(0.12f, 0.03f, 2.89f, 0.68f, 6.16f, 0.68f)
                reflectiveCurveToRelative(6.04f, -0.66f, 6.16f, -0.68f)
                curveToRelative(0.38f, -0.09f, 0.67f, -0.39f, 0.74f, -0.77f)
                curveToRelative(0.01f, -0.05f, 0.1f, -0.49f, 0.21f, -1.23f)
                curveToRelative(2.06f, -0.15f, 3.24f, -0.7f, 3.39f, -0.78f)
                curveToRelative(0.44f, -0.22f, 0.74f, -0.64f, 0.81f, -1.12f)
                curveToRelative(0.02f, -0.16f, 0.6f, -4.07f, 0.6f, -9.29f)
                verticalLineToRelative(-1.38f)
                lineToRelative(2.02f, -2.28f)
                curveToRelative(0.55f, -0.62f, 0.49f, -1.57f, -0.13f, -2.12f)
                close()
            }
        }.also { _GasPump = it}
