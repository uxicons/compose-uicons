package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldDog: ImageVector? = null

val Icons.Ss.ShieldDog: ImageVector
    get() = _ShieldDog ?: UXIcon(name = "ShieldDog") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.0f, 11.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.36f)
                lineToRelative(-0.7f, 2.56f)
                curveToRelative(-1.23f, -1.16f, -1.9f, -2.3f, -1.94f, -3.31f)
                lineToRelative(1.62f, -3.25f)
                horizontalLineToRelative(1.12f)
                curveToRelative(0.77f, 0f, 1.47f, 0.33f, 1.82f, 0.87f)
                curveToRelative(0.66f, 0.99f, 1.81f, 1.63f, 2.94f, 1.63f)
                close()
                moveTo(22f, 5.44f)
                verticalLineToRelative(6.53f)
                curveToRelative(0f, 7.43f, -7.05f, 10.85f, -9.21f, 11.72f)
                lineToRelative(-0.83f, 0.34f)
                lineToRelative(-0.81f, -0.4f)
                curveToRelative(-2.15f, -1.07f, -9.15f, -5.09f, -9.15f, -11.65f)
                verticalLineToRelative(-6.53f)
                curveToRelative(0f, -1.29f, 0.83f, -2.44f, 2.06f, -2.84f)
                lineTo(12f, -0.04f)
                lineToRelative(7.95f, 2.63f)
                curveToRelative(1.23f, 0.41f, 2.06f, 1.55f, 2.06f, 2.84f)
                close()
                moveTo(18f, 11.5f)
                lineToRelative(-0.01f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.39f, 0f, -0.95f, -0.25f, -1.27f, -0.74f)
                curveToRelative(-0.73f, -1.1f, -2.04f, -1.76f, -3.49f, -1.76f)
                horizontalLineToRelative(-0.24f)
                verticalLineToRelative(-2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(0.76f)
                reflectiveCurveToRelative(-2.01f, 4.01f, -2.01f, 4.01f)
                verticalLineToRelative(0.39f)
                curveToRelative(0f, 2.5f, 2.12f, 4.62f, 3.89f, 5.96f)
                lineToRelative(1.18f, 0.89f)
                lineToRelative(1.1f, -4.01f)
                horizontalLineToRelative(1.84f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _ShieldDog = it}
