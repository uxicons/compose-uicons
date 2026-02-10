package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountains: ImageVector? = null

val Icons.Tc.Mountains: ImageVector
    get() = _Mountains ?: UXIcon(name = "Mountains") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.37f, 7.73f)
                curveToRelative(2.04f, 0f, 3.03f, -1.0f, 3.03f, -3.05f)
                reflectiveCurveToRelative(-0.99f, -3.05f, -3.03f, -3.05f)
                reflectiveCurveToRelative(-3.03f, 1.0f, -3.03f, 3.05f)
                curveToRelative(0f, 2.74f, 1.73f, 3.05f, 3.03f, 3.05f)
                close()
                moveTo(16.37f, 2.62f)
                curveToRelative(1.29f, 0f, 2.03f, 0.34f, 2.03f, 2.05f)
                reflectiveCurveToRelative(-0.74f, 2.05f, -2.03f, 2.05f)
                reflectiveCurveToRelative(-2.03f, -0.34f, -2.03f, -2.05f)
                reflectiveCurveToRelative(0.74f, -2.05f, 2.03f, -2.05f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.91f, 11.12f)
                curveToRelative(0.22f, -0.17f, 0.27f, -0.48f, 0.1f, -0.7f)
                curveToRelative(-1.66f, -2.21f, -3.28f, -3.51f, -3.35f, -3.57f)
                curveToRelative(-0.18f, -0.15f, -0.45f, -0.15f, -0.63f, 0.01f)
                curveToRelative(-0.25f, 0.21f, -6.16f, 5.19f, -8.02f, 13.74f)
                curveToRelative(-0.06f, 0.25f, 0.09f, 0.51f, 0.34f, 0.58f)
                curveToRelative(2.19f, 0.68f, 4.45f, 1.08f, 6.72f, 1.19f)
                curveToRelative(0.01f, 0f, 0.02f, 0f, 0.02f, 0f)
                curveToRelative(0.27f, 0f, 0.49f, -0.21f, 0.5f, -0.48f)
                curveToRelative(0.01f, -0.28f, -0.2f, -0.51f, -0.48f, -0.52f)
                curveToRelative(-2.03f, -0.1f, -4.06f, -0.44f, -6.03f, -1.01f)
                curveToRelative(1.64f, -6.85f, 6.06f, -11.33f, 7.27f, -12.46f)
                curveToRelative(0.54f, 0.48f, 1.69f, 1.57f, 2.85f, 3.11f)
                curveToRelative(0.17f, 0.22f, 0.48f, 0.27f, 0.7f, 0.1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.99f, 20.93f)
                curveToRelative(-1.32f, -6.04f, -5.5f, -9.57f, -5.68f, -9.71f)
                curveToRelative(-0.19f, -0.15f, -0.45f, -0.15f, -0.64f, 0f)
                curveToRelative(-0.18f, 0.15f, -4.35f, 3.67f, -5.67f, 9.71f)
                curveToRelative(-0.06f, 0.25f, 0.09f, 0.51f, 0.34f, 0.58f)
                curveToRelative(1.85f, 0.57f, 3.75f, 0.86f, 5.66f, 0.86f)
                reflectiveCurveToRelative(3.81f, -0.29f, 5.65f, -0.86f)
                curveToRelative(0.25f, -0.08f, 0.4f, -0.33f, 0.34f, -0.58f)
                close()
                moveTo(12.08f, 20.7f)
                curveToRelative(1.12f, -4.5f, 3.96f, -7.5f, 4.91f, -8.41f)
                curveToRelative(0.96f, 0.91f, 3.79f, 3.9f, 4.92f, 8.41f)
                curveToRelative(-3.22f, 0.91f, -6.6f, 0.91f, -9.82f, 0f)
                close()
            }
        }.also { _Mountains = it}
