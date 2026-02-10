package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Heart: ImageVector? = null

val Icons.Tc.Heart: ImageVector
    get() = _Heart ?: UXIcon(name = "Heart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.66f, 4.72f)
                curveToRelative(-1.17f, -1.1f, -2.69f, -1.69f, -4.21f, -1.63f)
                curveToRelative(-1.35f, 0.06f, -2.59f, 0.64f, -3.5f, 1.64f)
                lineToRelative(-0.95f, 1.05f)
                lineToRelative(-0.95f, -1.05f)
                curveToRelative(-0.91f, -1.0f, -2.15f, -1.58f, -3.5f, -1.64f)
                curveToRelative(-1.51f, -0.06f, -3.04f, 0.53f, -4.21f, 1.63f)
                curveToRelative(-1.1f, 1.03f, -2.38f, 3.12f, -2.34f, 5.64f)
                curveToRelative(0.03f, 2.56f, 1.36f, 5.02f, 3.94f, 7.31f)
                curveToRelative(0.87f, 0.77f, 1.9f, 1.5f, 3.15f, 2.21f)
                curveToRelative(1.2f, 0.68f, 2.55f, 1.04f, 3.9f, 1.04f)
                reflectiveCurveToRelative(2.7f, -0.36f, 3.9f, -1.04f)
                curveToRelative(1.25f, -0.71f, 2.29f, -1.43f, 3.15f, -2.21f)
                curveToRelative(2.58f, -2.3f, 3.91f, -4.76f, 3.94f, -7.31f)
                curveToRelative(0.03f, -2.51f, -1.24f, -4.61f, -2.34f, -5.64f)
                close()
                moveTo(18.39f, 16.92f)
                curveToRelative(-0.82f, 0.73f, -1.79f, 1.41f, -2.98f, 2.08f)
                curveToRelative(-2.1f, 1.19f, -4.72f, 1.19f, -6.82f, 0f)
                curveToRelative(-1.19f, -0.68f, -2.17f, -1.36f, -2.98f, -2.08f)
                curveToRelative(-2.36f, -2.1f, -3.58f, -4.32f, -3.6f, -6.58f)
                curveToRelative(-0.04f, -2.88f, 1.81f, -4.7f, 2.03f, -4.89f)
                curveToRelative(0.93f, -0.87f, 2.13f, -1.36f, 3.31f, -1.36f)
                reflectiveCurveToRelative(2.23f, 0.5f, 2.97f, 1.31f)
                lineToRelative(1.32f, 1.46f)
                curveToRelative(0.19f, 0.21f, 0.55f, 0.21f, 0.74f, 0f)
                lineToRelative(1.32f, -1.46f)
                curveToRelative(0.74f, -0.81f, 1.7f, -1.27f, 2.8f, -1.31f)
                curveToRelative(1.22f, -0.05f, 2.5f, 0.44f, 3.48f, 1.36f)
                horizontalLineToRelative(0f)
                curveToRelative(0.21f, 0.2f, 2.06f, 2.02f, 2.03f, 4.89f)
                curveToRelative(-0.03f, 2.27f, -1.24f, 4.48f, -3.6f, 6.58f)
                close()
            }
        }.also { _Heart = it}
