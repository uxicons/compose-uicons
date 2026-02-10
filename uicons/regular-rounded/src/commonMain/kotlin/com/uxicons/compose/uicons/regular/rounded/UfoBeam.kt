package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UfoBeam: ImageVector? = null

val Icons.Rr.UfoBeam: ImageVector
    get() = _UfoBeam ?: UXIcon(name = "UfoBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.95f, 5.23f)
                curveToRelative(-0.38f, -2.94f, -2.9f, -5.23f, -5.95f, -5.23f)
                reflectiveCurveToRelative(-5.57f, 2.28f, -5.95f, 5.23f)
                curveTo(2.19f, 6.01f, 0f, 7.49f, 0f, 9.33f)
                curveToRelative(0f, 3.06f, 6.04f, 4.67f, 12f, 4.67f)
                reflectiveCurveToRelative(12f, -1.6f, 12f, -4.67f)
                curveToRelative(0f, -1.84f, -2.19f, -3.32f, -6.05f, -4.11f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(0.05f)
                reflectiveCurveToRelative(0f, 0.01f, 0f, 0.01f)
                verticalLineToRelative(0.15f)
                curveToRelative(-0.47f, 0.28f, -1.65f, 0.8f, -4f, 0.8f)
                curveToRelative(-2.37f, 0f, -3.54f, -0.52f, -4f, -0.79f)
                verticalLineToRelative(-0.15f)
                reflectiveCurveToRelative(0f, -0.01f, 0f, -0.01f)
                verticalLineToRelative(-0.05f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-6.2f, 0f, -10f, -1.73f, -10f, -2.67f)
                curveToRelative(0f, -0.4f, 1.07f, -1.41f, 4.17f, -2.09f)
                curveToRelative(0.02f, 0.03f, 0.04f, 0.06f, 0.07f, 0.09f)
                curveToRelative(0.24f, 0.28f, 1.62f, 1.66f, 5.76f, 1.66f)
                reflectiveCurveToRelative(5.53f, -1.38f, 5.76f, -1.66f)
                curveToRelative(0.03f, -0.03f, 0.05f, -0.06f, 0.07f, -0.09f)
                curveToRelative(3.09f, 0.68f, 4.17f, 1.69f, 4.17f, 2.09f)
                curveToRelative(0f, 0.94f, -3.8f, 2.67f, -10f, 2.67f)
                close()
                moveTo(6.92f, 16.39f)
                lineToRelative(-3f, 7f)
                curveToRelative(-0.16f, 0.38f, -0.53f, 0.61f, -0.92f, 0.61f)
                curveToRelative(-0.13f, 0f, -0.27f, -0.03f, -0.39f, -0.08f)
                curveToRelative(-0.51f, -0.22f, -0.74f, -0.81f, -0.53f, -1.31f)
                lineToRelative(3f, -7f)
                curveToRelative(0.22f, -0.51f, 0.8f, -0.75f, 1.31f, -0.53f)
                curveToRelative(0.51f, 0.22f, 0.74f, 0.81f, 0.53f, 1.31f)
                close()
                moveTo(21.92f, 22.61f)
                curveToRelative(0.22f, 0.51f, -0.02f, 1.09f, -0.53f, 1.31f)
                curveToRelative(-0.13f, 0.06f, -0.26f, 0.08f, -0.39f, 0.08f)
                curveToRelative(-0.39f, 0f, -0.76f, -0.23f, -0.92f, -0.61f)
                lineToRelative(-3f, -7f)
                curveToRelative(-0.22f, -0.51f, 0.02f, -1.09f, 0.53f, -1.31f)
                curveToRelative(0.51f, -0.22f, 1.1f, 0.02f, 1.31f, 0.53f)
                lineToRelative(3f, 7f)
                close()
            }
        }.also { _UfoBeam = it}
