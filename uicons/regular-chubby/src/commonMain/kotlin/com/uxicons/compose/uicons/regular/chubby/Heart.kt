package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Heart: ImageVector? = null

val Icons.Rc.Heart: ImageVector
    get() = _Heart ?: UXIcon(name = "Heart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.6f, 4.7f)
                curveToRelative(-1.22f, -1.14f, -2.81f, -1.75f, -4.38f, -1.69f)
                curveToRelative(-1.42f, 0.06f, -2.73f, 0.67f, -3.69f, 1.73f)
                lineToRelative(-0.52f, 0.57f)
                lineToRelative(-0.52f, -0.57f)
                curveToRelative(-0.96f, -1.05f, -2.27f, -1.67f, -3.69f, -1.73f)
                curveToRelative(-1.57f, -0.07f, -3.17f, 0.55f, -4.38f, 1.69f)
                curveToRelative(-1.13f, 1.05f, -2.43f, 3.19f, -2.4f, 5.74f)
                curveToRelative(0.03f, 2.58f, 1.35f, 5.05f, 3.93f, 7.33f)
                curveToRelative(0.86f, 0.76f, 1.87f, 1.47f, 3.1f, 2.16f)
                curveToRelative(1.22f, 0.69f, 2.6f, 1.05f, 3.98f, 1.05f)
                reflectiveCurveToRelative(2.75f, -0.36f, 3.98f, -1.05f)
                curveToRelative(1.22f, -0.69f, 2.24f, -1.4f, 3.09f, -2.16f)
                curveToRelative(2.57f, -2.28f, 3.9f, -4.75f, 3.93f, -7.33f)
                curveToRelative(0.03f, -2.56f, -1.27f, -4.69f, -2.4f, -5.74f)
                close()
                moveTo(17.74f, 16.28f)
                curveToRelative(-0.75f, 0.67f, -1.65f, 1.29f, -2.75f, 1.91f)
                curveToRelative(-1.85f, 1.04f, -4.14f, 1.04f, -5.98f, 0f)
                curveToRelative(-1.1f, -0.62f, -2.0f, -1.25f, -2.75f, -1.91f)
                curveToRelative(-2.13f, -1.89f, -3.23f, -3.87f, -3.26f, -5.86f)
                curveToRelative(-0.03f, -2.04f, 1.1f, -3.63f, 1.76f, -4.26f)
                curveToRelative(0.79f, -0.74f, 1.8f, -1.15f, 2.79f, -1.15f)
                curveToRelative(0.98f, 0f, 1.84f, 0.41f, 2.44f, 1.08f)
                lineToRelative(1.26f, 1.39f)
                curveToRelative(0.38f, 0.42f, 1.1f, 0.42f, 1.48f, 0f)
                lineToRelative(1.26f, -1.39f)
                curveToRelative(0.6f, -0.67f, 1.4f, -1.04f, 2.3f, -1.07f)
                curveToRelative(1.04f, -0.04f, 2.11f, 0.38f, 2.94f, 1.15f)
                curveToRelative(0.67f, 0.62f, 1.79f, 2.22f, 1.76f, 4.26f)
                curveToRelative(-0.03f, 2.0f, -1.12f, 3.97f, -3.26f, 5.86f)
                close()
            }
        }.also { _Heart = it}
