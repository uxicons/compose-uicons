package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camera: ImageVector? = null

val Icons.Sc.Camera: ImageVector
    get() = _Camera ?: UXIcon(name = "Camera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.52f, 3.98f)
                curveToRelative(-0.55f, -1.24f, -1.23f, -2.01f, -1.27f, -2.06f)
                curveToRelative(-0.11f, -0.12f, -0.24f, -0.21f, -0.39f, -0.27f)
                curveToRelative(-0.07f, -0.03f, -1.75f, -0.65f, -4.86f, -0.65f)
                reflectiveCurveToRelative(-4.79f, 0.63f, -4.86f, 0.65f)
                curveToRelative(-0.15f, 0.06f, -0.29f, 0.15f, -0.4f, 0.28f)
                curveToRelative(-0.04f, 0.04f, -0.71f, 0.82f, -1.26f, 2.05f)
                curveToRelative(1.71f, -0.23f, 4.01f, -0.46f, 6.51f, -0.46f)
                reflectiveCurveToRelative(4.81f, 0.23f, 6.52f, 0.46f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 11.42f)
                curveToRelative(-1.88f, 0f, -2.84f, 0.44f, -2.84f, 2.84f)
                reflectiveCurveToRelative(0.95f, 2.84f, 2.84f, 2.84f)
                reflectiveCurveToRelative(2.84f, -0.44f, 2.84f, -2.84f)
                reflectiveCurveToRelative(-0.95f, -2.84f, -2.84f, -2.84f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.73f, 7.04f)
                curveToRelative(-0.12f, -0.31f, -0.39f, -0.54f, -0.72f, -0.61f)
                curveToRelative(-0.17f, -0.04f, -4.22f, -0.91f, -9.01f, -0.91f)
                reflectiveCurveToRelative(-8.84f, 0.88f, -9.01f, 0.91f)
                curveToRelative(-0.33f, 0.07f, -0.6f, 0.3f, -0.72f, 0.61f)
                curveToRelative(-0.05f, 0.13f, -1.21f, 3.17f, -1.21f, 7.21f)
                curveToRelative(0f, 4.08f, 1.16f, 7.09f, 1.21f, 7.22f)
                curveToRelative(0.12f, 0.31f, 0.39f, 0.54f, 0.72f, 0.61f)
                curveToRelative(0.17f, 0.04f, 4.22f, 0.91f, 9.01f, 0.91f)
                reflectiveCurveToRelative(8.84f, -0.88f, 9.01f, -0.91f)
                curveToRelative(0.33f, -0.07f, 0.6f, -0.3f, 0.72f, -0.61f)
                curveToRelative(0.05f, -0.13f, 1.21f, -3.17f, 1.21f, -7.21f)
                curveToRelative(0f, -4.08f, -1.16f, -7.09f, -1.21f, -7.21f)
                close()
                moveTo(12f, 19.1f)
                curveToRelative(-3.25f, 0f, -4.84f, -1.58f, -4.84f, -4.84f)
                reflectiveCurveToRelative(1.58f, -4.84f, 4.84f, -4.84f)
                reflectiveCurveToRelative(4.84f, 1.58f, 4.84f, 4.84f)
                reflectiveCurveToRelative(-1.58f, 4.84f, -4.84f, 4.84f)
                close()
            }
        }.also { _Camera = it}
