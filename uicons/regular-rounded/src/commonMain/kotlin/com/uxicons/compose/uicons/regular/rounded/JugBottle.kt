package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JugBottle: ImageVector? = null

val Icons.Rr.JugBottle: ImageVector
    get() = _JugBottle ?: UXIcon(name = "JugBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.66f, 5.97f)
                lineToRelative(-5.66f, -0.94f)
                verticalLineToRelative(-3.02f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                verticalLineToRelative(3.18f)
                lineToRelative(-0.76f, 0.28f)
                curveToRelative(-1.94f, 0.73f, -3.25f, 2.61f, -3.25f, 4.68f)
                verticalLineToRelative(8.86f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-9.09f)
                curveToRelative(0f, -1.96f, -1.41f, -3.62f, -3.34f, -3.94f)
                close()
                moveTo(20f, 9.91f)
                verticalLineToRelative(5.59f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.01f, 0f, 0.02f, -0.01f, 0.04f, -0.01f)
                curveToRelative(0.86f, 0.24f, 1.46f, 1.01f, 1.46f, 1.92f)
                close()
                moveTo(17f, 22.0f)
                lineTo(7f, 22.0f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-8.86f)
                curveToRelative(0f, -1.24f, 0.78f, -2.37f, 1.95f, -2.81f)
                lineToRelative(1.4f, -0.53f)
                curveToRelative(0.39f, -0.15f, 0.65f, -0.52f, 0.65f, -0.94f)
                verticalLineToRelative(-3.87f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.87f)
                curveToRelative(0f, 0.49f, 0.35f, 0.91f, 0.83f, 0.99f)
                lineToRelative(3.81f, 0.63f)
                curveToRelative(-0.4f, 0.57f, -0.64f, 1.26f, -0.64f, 2.01f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.54f, 0f, 1.04f, -0.13f, 1.5f, -0.35f)
                verticalLineToRelative(0.35f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _JugBottle = it}
