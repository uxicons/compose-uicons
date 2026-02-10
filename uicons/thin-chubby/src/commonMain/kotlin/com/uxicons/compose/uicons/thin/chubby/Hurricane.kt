package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hurricane: ImageVector? = null

val Icons.Tc.Hurricane: ImageVector
    get() = _Hurricane ?: UXIcon(name = "Hurricane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8.27f)
                curveToRelative(-1.6f, 0f, -3.74f, 0.39f, -3.74f, 3.73f)
                reflectiveCurveToRelative(2.13f, 3.73f, 3.74f, 3.73f)
                reflectiveCurveToRelative(3.74f, -0.39f, 3.74f, -3.73f)
                reflectiveCurveToRelative(-2.13f, -3.73f, -3.74f, -3.73f)
                close()
                moveTo(12f, 14.73f)
                curveToRelative(-1.69f, 0f, -2.74f, -0.46f, -2.74f, -2.73f)
                reflectiveCurveToRelative(1.05f, -2.73f, 2.74f, -2.73f)
                reflectiveCurveToRelative(2.74f, 0.46f, 2.74f, 2.73f)
                reflectiveCurveToRelative(-1.05f, 2.73f, -2.74f, 2.73f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.48f, 6.16f)
                curveToRelative(-1.65f, -1.39f, -3.57f, -1.72f, -4.83f, -1.75f)
                lineToRelative(2.38f, -2.37f)
                curveToRelative(0.14f, -0.13f, 0.18f, -0.33f, 0.12f, -0.51f)
                reflectiveCurveToRelative(-0.22f, -0.31f, -0.41f, -0.34f)
                curveToRelative(-0.35f, -0.05f, -8.69f, -1.16f, -12.93f, 2.53f)
                curveToRelative(-1.59f, 1.39f, -2.4f, 3.27f, -2.4f, 5.59f)
                curveToRelative(0f, 3.83f, 1.03f, 6.66f, 3.05f, 8.41f)
                curveToRelative(1.68f, 1.45f, 3.65f, 1.81f, 4.92f, 1.87f)
                lineToRelative(-2.41f, 2.4f)
                curveToRelative(-0.14f, 0.13f, -0.18f, 0.33f, -0.12f, 0.52f)
                reflectiveCurveToRelative(0.22f, 0.31f, 0.41f, 0.34f)
                curveToRelative(0.13f, 0.02f, 1.36f, 0.17f, 3.08f, 0.17f)
                curveToRelative(2.91f, 0f, 7.22f, -0.45f, 9.89f, -2.79f)
                curveToRelative(1.57f, -1.38f, 2.36f, -3.23f, 2.36f, -5.51f)
                curveToRelative(0f, -3.94f, -1.04f, -6.82f, -3.1f, -8.55f)
                close()
                moveTo(19.57f, 19.47f)
                curveToRelative(-3.06f, 2.68f, -8.78f, 2.62f, -11.13f, 2.47f)
                lineToRelative(2.54f, -2.53f)
                curveToRelative(0.15f, -0.15f, 0.19f, -0.39f, 0.09f, -0.58f)
                curveToRelative(-0.1f, -0.19f, -0.31f, -0.3f, -0.52f, -0.27f)
                curveToRelative(-0.03f, 0.0f, -3.12f, 0.42f, -5.45f, -1.6f)
                curveToRelative(-1.79f, -1.55f, -2.7f, -4.12f, -2.7f, -7.64f)
                curveToRelative(0f, -2.02f, 0.69f, -3.64f, 2.05f, -4.83f)
                curveTo(7.54f, 1.81f, 13.23f, 1.91f, 15.57f, 2.08f)
                lineToRelative(-2.55f, 2.54f)
                curveToRelative(-0.15f, 0.15f, -0.19f, 0.39f, -0.09f, 0.58f)
                curveToRelative(0.1f, 0.19f, 0.31f, 0.3f, 0.53f, 0.26f)
                curveToRelative(0.03f, -0.0f, 3.08f, -0.49f, 5.39f, 1.47f)
                curveToRelative(1.82f, 1.54f, 2.74f, 4.16f, 2.74f, 7.78f)
                curveToRelative(0f, 1.98f, -0.68f, 3.58f, -2.02f, 4.75f)
                close()
            }
        }.also { _Hurricane = it}
