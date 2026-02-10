package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eyeliner: ImageVector? = null

val Icons.Ss.Eyeliner: ImageVector
    get() = _Eyeliner ?: UXIcon(name = "Eyeliner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.1f, 5.91f)
                lineToRelative(1.61f, 1.19f)
                curveToRelative(-0.06f, 0.09f, -0.92f, 1.22f, -2.46f, 2.25f)
                lineToRelative(1.01f, 1.63f)
                lineToRelative(-1.7f, 1.05f)
                lineToRelative(-1.08f, -1.74f)
                curveToRelative(-0.76f, 0.32f, -1.62f, 0.56f, -2.57f, 0.66f)
                verticalLineToRelative(2.06f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.06f)
                curveToRelative(-0.95f, -0.1f, -1.81f, -0.34f, -2.57f, -0.66f)
                lineToRelative(-1.08f, 1.74f)
                lineToRelative(-1.7f, -1.05f)
                lineToRelative(1.01f, -1.63f)
                curveToRelative(-1.54f, -1.03f, -2.4f, -2.16f, -2.46f, -2.25f)
                lineToRelative(1.61f, -1.19f)
                curveToRelative(0.02f, 0.03f, 2.35f, 3.1f, 6.2f, 3.1f)
                curveToRelative(3.88f, 0f, 6.17f, -3.06f, 6.19f, -3.09f)
                close()
                moveTo(16.4f, 0f)
                curveToRelative(-2.88f, 0f, -3.81f, 1.33f, -4.62f, 2.5f)
                curveToRelative(-0.19f, 0.28f, -0.39f, 0.57f, -0.68f, 0.9f)
                curveToRelative(-0.05f, 0.07f, -1.23f, 1.6f, -3.2f, 1.6f)
                reflectiveCurveToRelative(-3.15f, -1.53f, -3.2f, -1.6f)
                lineToRelative(-1.61f, 1.19f)
                curveToRelative(0.07f, 0.1f, 1.8f, 2.41f, 4.81f, 2.41f)
                reflectiveCurveToRelative(4.73f, -2.31f, 4.76f, -2.35f)
                curveToRelative(0.29f, -0.33f, 0.53f, -0.67f, 0.76f, -1.0f)
                curveToRelative(0.74f, -1.06f, 1.15f, -1.65f, 2.98f, -1.65f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(20.9f, 4.21f)
                lineTo(18.76f, 7.4f)
                curveToRelative(-0.56f, 0.83f, -0.85f, 1.79f, -0.85f, 2.79f)
                verticalLineToRelative(10.81f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-10.81f)
                curveToRelative(0f, -1f, -0.29f, -1.97f, -0.85f, -2.79f)
                close()
            }
        }.also { _Eyeliner = it}
