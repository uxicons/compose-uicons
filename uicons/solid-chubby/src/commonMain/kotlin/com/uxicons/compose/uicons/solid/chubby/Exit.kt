package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exit: ImageVector? = null

val Icons.Sc.Exit: ImageVector
    get() = _Exit ?: UXIcon(name = "Exit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.4f, 11.45f)
                curveToRelative(-0.06f, -0.16f, -1.59f, -3.87f, -7.21f, -6.58f)
                curveToRelative(-0.74f, -0.36f, -1.64f, -0.05f, -2.0f, 0.7f)
                curveToRelative(-0.36f, 0.75f, -0.05f, 1.64f, 0.7f, 2.0f)
                curveToRelative(1.97f, 0.95f, 3.31f, 2.03f, 4.2f, 2.94f)
                horizontalLineTo(8.28f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(9.82f)
                curveToRelative(-0.88f, 0.9f, -2.23f, 1.97f, -4.21f, 2.94f)
                curveToRelative(-0.75f, 0.36f, -1.06f, 1.26f, -0.7f, 2.0f)
                curveToRelative(0.26f, 0.54f, 0.8f, 0.85f, 1.35f, 0.85f)
                curveToRelative(0.22f, 0f, 0.44f, -0.05f, 0.65f, -0.15f)
                curveToRelative(5.44f, -2.63f, 7.04f, -6.16f, 7.2f, -6.56f)
                curveToRelative(0.15f, -0.36f, 0.15f, -0.77f, 0.01f, -1.14f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.66f, 20.01f)
                curveToRelative(-1.39f, -0.18f, -2.57f, -0.42f, -3.31f, -0.58f)
                curveToRelative(-0.31f, -1.32f, -0.86f, -4.11f, -0.86f, -7.43f)
                reflectiveCurveToRelative(0.55f, -6.11f, 0.86f, -7.43f)
                curveToRelative(0.73f, -0.17f, 1.9f, -0.4f, 3.3f, -0.58f)
                curveToRelative(0.82f, -0.11f, 1.4f, -0.86f, 1.29f, -1.68f)
                curveToRelative(-0.11f, -0.82f, -0.86f, -1.4f, -1.68f, -1.29f)
                curveToRelative(-2.62f, 0.34f, -4.46f, 0.85f, -4.54f, 0.87f)
                curveToRelative(-0.5f, 0.14f, -0.89f, 0.52f, -1.04f, 1.01f)
                curveToRelative(-0.05f, 0.16f, -1.19f, 4.03f, -1.19f, 9.11f)
                reflectiveCurveToRelative(1.15f, 8.95f, 1.19f, 9.11f)
                curveToRelative(0.15f, 0.5f, 0.55f, 0.88f, 1.05f, 1.02f)
                curveToRelative(0.08f, 0.02f, 1.94f, 0.52f, 4.53f, 0.86f)
                curveToRelative(0.07f, 0.01f, 0.13f, 0.01f, 0.2f, 0.01f)
                curveToRelative(0.74f, 0f, 1.39f, -0.55f, 1.49f, -1.3f)
                curveToRelative(0.11f, -0.82f, -0.47f, -1.57f, -1.29f, -1.68f)
                close()
            }
        }.also { _Exit = it}
