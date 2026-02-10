package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WatchFitness: ImageVector? = null

val Icons.Bs.WatchFitness: ImageVector
    get() = _WatchFitness ?: UXIcon(name = "WatchFitness") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 2.34f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.34f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.39f, 0.82f, 2.6f, 2f, 3.16f)
                verticalLineToRelative(2.34f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.34f)
                curveToRelative(1.18f, -0.56f, 2f, -1.77f, 2f, -3.16f)
                lineTo(21f, 5.5f)
                curveToRelative(0f, -1.39f, -0.82f, -2.6f, -2f, -3.16f)
                close()
                moveTo(18f, 18.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                lineTo(6.5f, 19f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                lineTo(6f, 5.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(13f)
                close()
                moveTo(16f, 11.16f)
                curveToRelative(0f, 2.26f, -4f, 5.04f, -4f, 5.04f)
                curveToRelative(0f, 0f, -4f, -2.78f, -4f, -5.04f)
                curveToRelative(0f, -1.19f, 0.9f, -2.16f, 2f, -2.16f)
                reflectiveCurveToRelative(2f, 0.81f, 2f, 2f)
                curveToRelative(0f, -1.19f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.97f, 2f, 2.16f)
                close()
            }
        }.also { _WatchFitness = it}
