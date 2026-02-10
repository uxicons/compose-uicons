package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exit: ImageVector? = null

val Icons.Rc.Exit: ImageVector
    get() = _Exit ?: UXIcon(name = "Exit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.49f, 11.63f)
                curveToRelative(-0.06f, -0.16f, -1.61f, -3.86f, -7.36f, -6.62f)
                curveToRelative(-0.5f, -0.24f, -1.09f, -0.03f, -1.33f, 0.47f)
                reflectiveCurveToRelative(-0.03f, 1.09f, 0.47f, 1.33f)
                curveToRelative(2.95f, 1.42f, 4.62f, 3.06f, 5.5f, 4.19f)
                horizontalLineTo(6.75f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(13.01f)
                curveToRelative(-0.9f, 1.14f, -2.57f, 2.79f, -5.49f, 4.19f)
                curveToRelative(-0.5f, 0.24f, -0.71f, 0.84f, -0.47f, 1.33f)
                curveToRelative(0.17f, 0.36f, 0.53f, 0.57f, 0.9f, 0.57f)
                curveToRelative(0.14f, 0f, 0.29f, -0.03f, 0.43f, -0.1f)
                curveToRelative(5.58f, -2.68f, 7.19f, -6.21f, 7.35f, -6.6f)
                curveToRelative(0.1f, -0.24f, 0.1f, -0.52f, 0.01f, -0.76f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.37f, 21.01f)
                curveToRelative(-1.75f, -0.23f, -3.18f, -0.53f, -3.92f, -0.7f)
                curveToRelative(-0.31f, -1.23f, -1.01f, -4.43f, -1.01f, -8.3f)
                reflectiveCurveToRelative(0.7f, -7.07f, 1.01f, -8.3f)
                curveToRelative(0.74f, -0.17f, 2.16f, -0.48f, 3.92f, -0.71f)
                curveToRelative(0.55f, -0.07f, 0.93f, -0.57f, 0.86f, -1.12f)
                curveToRelative(-0.07f, -0.55f, -0.57f, -0.94f, -1.12f, -0.86f)
                curveToRelative(-2.74f, 0.36f, -4.66f, 0.88f, -4.74f, 0.9f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.35f, -0.69f, 0.68f)
                curveToRelative(-0.05f, 0.17f, -1.24f, 4.16f, -1.24f, 9.42f)
                reflectiveCurveToRelative(1.19f, 9.25f, 1.24f, 9.42f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.59f, 0.7f, 0.68f)
                curveToRelative(0.08f, 0.02f, 2.02f, 0.54f, 4.73f, 0.89f)
                curveToRelative(0.04f, 0.01f, 0.09f, 0.01f, 0.13f, 0.01f)
                curveToRelative(0.49f, 0f, 0.93f, -0.37f, 0.99f, -0.87f)
                curveToRelative(0.07f, -0.55f, -0.31f, -1.05f, -0.86f, -1.12f)
                close()
            }
        }.also { _Exit = it}
