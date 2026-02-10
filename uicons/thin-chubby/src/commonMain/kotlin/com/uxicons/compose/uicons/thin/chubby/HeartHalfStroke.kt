package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHalfStroke: ImageVector? = null

val Icons.Tc.HeartHalfStroke: ImageVector
    get() = _HeartHalfStroke ?: UXIcon(name = "HeartHalfStroke") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.45f, 3f)
                curveToRelative(-1.33f, 0.06f, -2.47f, 0.6f, -3.39f, 1.62f)
                lineToRelative(-1.04f, 1.29f)
                lineToRelative(-1.09f, -1.32f)
                curveToRelative(-0.9f, -1.01f, -2.04f, -1.55f, -3.4f, -1.6f)
                curveToRelative(-3.71f, 0.02f, -6.4f, 3.04f, -6.53f, 7.34f)
                curveToRelative(0.03f, 2.58f, 1.36f, 5.07f, 3.94f, 7.39f)
                curveToRelative(0.88f, 0.79f, 1.91f, 1.51f, 3.15f, 2.23f)
                curveToRelative(1.18f, 0.68f, 2.53f, 1.03f, 3.91f, 1.03f)
                reflectiveCurveToRelative(2.73f, -0.36f, 3.91f, -1.03f)
                curveToRelative(1.25f, -0.71f, 2.28f, -1.44f, 3.15f, -2.23f)
                curveToRelative(2.58f, -2.32f, 3.9f, -4.81f, 3.94f, -7.41f)
                curveToRelative(-0.13f, -4.29f, -2.81f, -7.3f, -6.55f, -7.32f)
                close()
                moveTo(18.39f, 16.99f)
                curveToRelative(-0.82f, 0.74f, -1.8f, 1.43f, -2.98f, 2.11f)
                curveToRelative(-1.03f, 0.59f, -2.22f, 0.89f, -3.41f, 0.89f)
                verticalLineToRelative(-12.45f)
                reflectiveCurveToRelative(1.82f, -2.26f, 1.82f, -2.26f)
                curveToRelative(0.73f, -0.81f, 1.6f, -1.23f, 2.65f, -1.27f)
                curveToRelative(3.2f, 0.02f, 5.42f, 2.57f, 5.54f, 6.33f)
                curveToRelative(-0.03f, 2.29f, -1.24f, 4.54f, -3.61f, 6.66f)
                close()
            }
        }.also { _HeartHalfStroke = it}
