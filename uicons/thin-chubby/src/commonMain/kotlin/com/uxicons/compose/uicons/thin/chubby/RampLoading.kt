package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RampLoading: ImageVector? = null

val Icons.Tc.RampLoading: ImageVector
    get() = _RampLoading ?: UXIcon(name = "RampLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.5f, 12.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -4.17f, 0.78f, -7.89f, 1.01f, -8.9f)
                curveToRelative(0.9f, -0.27f, 4.03f, -1.1f, 7.99f, -1.1f)
                curveToRelative(3.92f, 0f, 7.08f, 0.83f, 7.99f, 1.1f)
                curveToRelative(0.23f, 1.01f, 1.01f, 4.73f, 1.01f, 8.9f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -5.0f, -1.06f, -9.24f, -1.11f, -9.41f)
                curveToRelative(-0.04f, -0.17f, -0.17f, -0.3f, -0.33f, -0.35f)
                curveToRelative(-0.15f, -0.05f, -3.75f, -1.23f, -8.56f, -1.23f)
                curveToRelative(-4.86f, 0f, -8.42f, 1.18f, -8.57f, 1.23f)
                curveToRelative(-0.16f, 0.05f, -0.28f, 0.19f, -0.32f, 0.35f)
                curveToRelative(-0.04f, 0.18f, -1.11f, 4.41f, -1.11f, 9.42f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.73f, 11.8f)
                curveToRelative(-0.05f, -0.11f, -0.13f, -0.19f, -0.23f, -0.24f)
                curveToRelative(-0.09f, -0.04f, -2.25f, -1.1f, -5.5f, -1.1f)
                reflectiveCurveToRelative(-5.41f, 1.06f, -5.5f, 1.1f)
                curveToRelative(-0.1f, 0.05f, -0.19f, 0.14f, -0.23f, 0.24f)
                lineToRelative(-4.22f, 9.5f)
                curveToRelative(-0.06f, 0.14f, -0.06f, 0.3f, 0.01f, 0.43f)
                reflectiveCurveToRelative(0.2f, 0.23f, 0.35f, 0.26f)
                curveToRelative(0.05f, 0.01f, 5.34f, 1.01f, 9.59f, 1.01f)
                curveToRelative(4.29f, 0f, 9.54f, -1.0f, 9.59f, -1.01f)
                curveToRelative(0.15f, -0.03f, 0.28f, -0.12f, 0.35f, -0.26f)
                curveToRelative(0.07f, -0.14f, 0.08f, -0.29f, 0.01f, -0.43f)
                lineToRelative(-4.22f, -9.5f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-3.31f, 0f, -7.28f, -0.62f, -8.78f, -0.88f)
                lineToRelative(3.88f, -8.74f)
                curveToRelative(0.53f, -0.23f, 2.38f, -0.93f, 4.9f, -0.93f)
                reflectiveCurveToRelative(4.37f, 0.7f, 4.9f, 0.93f)
                lineToRelative(3.89f, 8.74f)
                curveToRelative(-1.5f, 0.26f, -5.45f, 0.88f, -8.78f, 0.88f)
                close()
            }
        }.also { _RampLoading = it}
