package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Curling: ImageVector? = null

val Icons.Sc.Curling: ImageVector
    get() = _Curling ?: UXIcon(name = "Curling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.23f, 20.89f)
                curveToRelative(0.15f, 0.27f, 0.42f, 0.46f, 0.72f, 0.51f)
                curveToRelative(0.17f, 0.03f, 4.23f, 0.66f, 9.04f, 0.66f)
                reflectiveCurveToRelative(8.87f, -0.63f, 9.04f, -0.66f)
                curveToRelative(0.31f, -0.05f, 0.58f, -0.24f, 0.73f, -0.52f)
                curveToRelative(0.05f, -0.09f, 1.01f, -1.91f, 1.23f, -4.46f)
                horizontalLineTo(1f)
                curveToRelative(0.22f, 2.56f, 1.19f, 4.38f, 1.24f, 4.46f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.37f, 7.1f)
                curveToRelative(-0.1f, -0.59f, -0.18f, -0.93f, -0.18f, -0.96f)
                curveToRelative(-0.08f, -0.33f, -0.31f, -0.6f, -0.63f, -0.71f)
                curveToRelative(-0.1f, -0.04f, -2.61f, -0.96f, -5.56f, -0.96f)
                curveToRelative(-1.51f, 0f, -2.92f, 0.25f, -3.95f, 0.5f)
                lineToRelative(0.15f, -0.88f)
                lineToRelative(0.62f, -0.18f)
                curveToRelative(1.57f, -0.47f, 3.26f, -0.52f, 4.86f, -0.17f)
                curveToRelative(0.54f, 0.12f, 1.07f, -0.22f, 1.19f, -0.76f)
                curveToRelative(0.12f, -0.54f, -0.22f, -1.07f, -0.76f, -1.19f)
                curveToRelative(-1.94f, -0.43f, -3.96f, -0.36f, -5.86f, 0.2f)
                lineToRelative(-1.22f, 0.36f)
                curveToRelative(-0.36f, 0.11f, -0.64f, 0.41f, -0.7f, 0.79f)
                curveToRelative(0f, 0f, -0.61f, 3.39f, -0.71f, 3.98f)
                curveToRelative(1.69f, -0.16f, 3.94f, -0.32f, 6.37f, -0.32f)
                reflectiveCurveToRelative(4.69f, 0.16f, 6.37f, 0.32f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.77f, 9.95f)
                curveToRelative(-0.15f, -0.27f, -0.42f, -0.46f, -0.72f, -0.51f)
                curveToRelative(-0.17f, -0.03f, -4.23f, -0.66f, -9.04f, -0.66f)
                reflectiveCurveToRelative(-8.87f, 0.63f, -9.04f, 0.66f)
                curveToRelative(-0.31f, 0.05f, -0.58f, 0.24f, -0.73f, 0.52f)
                curveToRelative(-0.05f, 0.09f, -1.01f, 1.91f, -1.23f, 4.46f)
                horizontalLineTo(23f)
                curveToRelative(-0.22f, -2.57f, -1.19f, -4.38f, -1.24f, -4.46f)
                close()
            }
        }.also { _Curling = it}
