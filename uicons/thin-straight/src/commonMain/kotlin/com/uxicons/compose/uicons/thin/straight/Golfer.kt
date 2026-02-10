package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Golfer: ImageVector? = null

val Icons.Ts.Golfer: ImageVector
    get() = _Golfer ?: UXIcon(name = "Golfer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 6f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8.5f, 2f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(16.31f, 0.47f)
                curveToRelative(-0.27f, -0.44f, -0.84f, -0.59f, -1.29f, -0.33f)
                lineToRelative(-2.19f, 1.26f)
                lineToRelative(0.5f, 0.87f)
                lineToRelative(2.12f, -1.29f)
                lineToRelative(4.48f, 8.03f)
                horizontalLineToRelative(-5.35f)
                lineToRelative(-6.47f, -1.94f)
                curveToRelative(-0.67f, -0.13f, -1.31f, 0.05f, -1.71f, 0.48f)
                curveToRelative(-0.36f, 0.39f, -0.48f, 0.92f, -0.34f, 1.47f)
                lineToRelative(1.81f, 6.6f)
                lineToRelative(-4.66f, 8.39f)
                horizontalLineToRelative(1.2f)
                lineToRelative(4.43f, -8f)
                horizontalLineToRelative(3.08f)
                curveToRelative(0.05f, 0.29f, 0.08f, 0.57f, 0.08f, 0.86f)
                verticalLineToRelative(7.14f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7.14f)
                curveToRelative(0f, -0.62f, -0.09f, -1.24f, -0.28f, -1.84f)
                lineToRelative(-1.88f, -6.1f)
                lineToRelative(3.51f, 1.06f)
                lineToRelative(6.64f, 0.02f)
                verticalLineToRelative(-1.13f)
                close()
                moveTo(11.67f, 15f)
                horizontalLineToRelative(-2.93f)
                lineToRelative(-1.72f, -6.25f)
                curveToRelative(-0.06f, -0.21f, -0.02f, -0.4f, 0.1f, -0.53f)
                curveToRelative(0.16f, -0.18f, 0.46f, -0.24f, 0.74f, -0.19f)
                lineToRelative(1.83f, 0.55f)
                lineToRelative(1.98f, 6.42f)
                close()
            }
        }.also { _Golfer = it}
