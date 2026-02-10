package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VenusMars: ImageVector? = null

val Icons.Sc.VenusMars: ImageVector
    get() = _VenusMars ?: UXIcon(name = "VenusMars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.84f, 2.27f)
                curveToRelative(-0.15f, -0.45f, -0.5f, -0.8f, -0.95f, -0.95f)
                curveToRelative(-0.23f, -0.08f, -2.29f, -0.72f, -4.37f, 0.07f)
                curveToRelative(-0.77f, 0.3f, -1.16f, 1.16f, -0.86f, 1.94f)
                curveToRelative(0.19f, 0.5f, 0.63f, 0.84f, 1.12f, 0.94f)
                lineToRelative(-0.98f, 0.99f)
                curveToRelative(-2.38f, -1.64f, -4.88f, -1.33f, -7.14f, 0.94f)
                curveToRelative(-2.62f, 2.69f, -2.61f, 5.58f, 0.06f, 8.39f)
                curveToRelative(1.34f, 1.31f, 2.77f, 1.97f, 4.2f, 1.97f)
                curveToRelative(1.41f, 0f, 2.81f, -0.65f, 4.11f, -1.94f)
                curveToRelative(2.23f, -2.29f, 2.53f, -4.81f, 0.89f, -7.22f)
                lineToRelative(0.97f, -0.98f)
                curveToRelative(0.1f, 0.5f, 0.44f, 0.93f, 0.94f, 1.12f)
                curveToRelative(0.17f, 0.07f, 0.35f, 0.1f, 0.53f, 0.1f)
                curveToRelative(0.61f, 0f, 1.18f, -0.37f, 1.4f, -0.97f)
                curveToRelative(0.79f, -2.09f, 0.15f, -4.15f, 0.08f, -4.38f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.75f, 18.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.74f)
                curveToRelative(-0.67f, -0.39f, -1.31f, -0.89f, -1.93f, -1.49f)
                curveToRelative(-3.48f, -3.65f, -3.5f, -7.72f, -0.1f, -11.21f)
                curveToRelative(0.0f, -0.0f, 0.01f, -0.01f, 0.01f, -0.01f)
                curveToRelative(-3.42f, 0.24f, -5.38f, 2.35f, -5.4f, 5.88f)
                curveToRelative(0.02f, 3.21f, 1.56f, 5.2f, 4.41f, 5.74f)
                lineToRelative(-0.0f, 1.84f)
                horizontalLineToRelative(-0.51f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(0.25f)
                curveToRelative(-0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.26f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _VenusMars = it}
