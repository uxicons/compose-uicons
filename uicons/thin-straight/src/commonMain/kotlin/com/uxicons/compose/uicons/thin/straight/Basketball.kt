package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Basketball: ImageVector? = null

val Icons.Ts.Basketball: ImageVector
    get() = _Basketball ?: UXIcon(name = "Basketball") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(15.37f, 7.92f)
                curveToRelative(-1.74f, -1.9f, -2.75f, -4.33f, -2.86f, -6.91f)
                curveToRelative(2.65f, 0.12f, 5.07f, 1.19f, 6.91f, 2.87f)
                lineToRelative(-4.04f, 4.04f)
                close()
                moveTo(14.66f, 8.63f)
                lineToRelative(-2.66f, 2.66f)
                lineTo(4.59f, 3.88f)
                curveToRelative(1.84f, -1.68f, 4.26f, -2.75f, 6.92f, -2.87f)
                curveToRelative(0.12f, 2.85f, 1.23f, 5.53f, 3.16f, 7.62f)
                close()
                moveTo(11.29f, 12f)
                lineToRelative(-2.66f, 2.66f)
                curveToRelative(-2.09f, -1.93f, -4.77f, -3.04f, -7.62f, -3.16f)
                curveToRelative(0.12f, -2.66f, 1.18f, -5.08f, 2.87f, -6.92f)
                lineToRelative(7.41f, 7.41f)
                close()
                moveTo(7.92f, 15.37f)
                lineToRelative(-4.04f, 4.04f)
                curveToRelative(-1.68f, -1.84f, -2.75f, -4.25f, -2.87f, -6.91f)
                curveToRelative(2.58f, 0.12f, 5.01f, 1.13f, 6.91f, 2.86f)
                close()
                moveTo(8.63f, 16.08f)
                curveToRelative(1.74f, 1.9f, 2.75f, 4.33f, 2.86f, 6.91f)
                curveToRelative(-2.65f, -0.12f, -5.07f, -1.19f, -6.91f, -2.87f)
                lineToRelative(4.04f, -4.04f)
                close()
                moveTo(9.34f, 15.37f)
                lineToRelative(2.66f, -2.66f)
                lineToRelative(7.41f, 7.41f)
                curveToRelative(-1.84f, 1.68f, -4.26f, 2.75f, -6.92f, 2.87f)
                curveToRelative(-0.12f, -2.85f, -1.23f, -5.53f, -3.16f, -7.62f)
                close()
                moveTo(12.71f, 12f)
                lineToRelative(2.66f, -2.66f)
                curveToRelative(2.09f, 1.93f, 4.77f, 3.04f, 7.62f, 3.16f)
                curveToRelative(-0.12f, 2.66f, -1.18f, 5.08f, -2.87f, 6.92f)
                lineToRelative(-7.41f, -7.41f)
                close()
                moveTo(16.08f, 8.63f)
                lineToRelative(4.04f, -4.04f)
                curveToRelative(1.68f, 1.84f, 2.75f, 4.25f, 2.87f, 6.91f)
                curveToRelative(-2.58f, -0.12f, -5.01f, -1.13f, -6.91f, -2.86f)
                close()
            }
        }.also { _Basketball = it}
