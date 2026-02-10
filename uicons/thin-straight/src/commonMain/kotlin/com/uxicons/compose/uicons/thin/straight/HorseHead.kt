package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HorseHead: ImageVector? = null

val Icons.Ts.HorseHead: ImageVector
    get() = _HorseHead ?: UXIcon(name = "HorseHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 12f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(23.98f, 17.18f)
                curveToRelative(-0.1f, -1.13f, -0.68f, -2.19f, -1.59f, -2.91f)
                curveToRelative(-2.75f, -2.16f, -3.86f, -4.38f, -4.92f, -6.53f)
                curveToRelative(-0.71f, -1.43f, -1.38f, -2.78f, -2.46f, -3.97f)
                lineTo(15f, -0.04f)
                lineToRelative(-0.57f, 0.08f)
                curveToRelative(-1.63f, 0.24f, -2.97f, 1.48f, -3.33f, 3.07f)
                horizontalLineToRelative(0f)
                curveTo(4.15f, 3.93f, 0f, 8.93f, 0f, 16.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -7.01f, 3.82f, -11.64f, 10.21f, -12.39f)
                lineToRelative(0.7f, -0.08f)
                lineToRelative(0.16f, -0.69f)
                curveToRelative(0.23f, -1.0f, 0.97f, -1.82f, 1.93f, -2.16f)
                verticalLineToRelative(2.98f)
                lineToRelative(0.26f, 0.29f)
                curveToRelative(0.99f, 1.09f, 1.63f, 2.38f, 2.31f, 3.75f)
                curveToRelative(1.12f, 2.25f, 2.27f, 4.57f, 5.2f, 6.87f)
                curveToRelative(0.69f, 0.55f, 1.14f, 1.35f, 1.22f, 2.21f)
                curveToRelative(0.08f, 0.85f, -0.2f, 1.71f, -0.77f, 2.35f)
                lineToRelative(-1.22f, 1.39f)
                lineToRelative(-10.1f, -6.29f)
                lineToRelative(2.07f, 4.73f)
                curveToRelative(0.56f, 1.28f, 1.16f, 2.47f, 1.78f, 3.54f)
                lineToRelative(0.55f, 1.01f)
                horizontalLineToRelative(1.14f)
                lineToRelative(-0.82f, -1.5f)
                curveToRelative(-0.61f, -1.04f, -1.19f, -2.2f, -1.73f, -3.44f)
                lineToRelative(-0.78f, -1.77f)
                lineToRelative(8.07f, 5.03f)
                lineToRelative(1.78f, -2.02f)
                curveToRelative(0.75f, -0.84f, 1.12f, -1.98f, 1.02f, -3.1f)
                close()
            }
        }.also { _HorseHead = it}
