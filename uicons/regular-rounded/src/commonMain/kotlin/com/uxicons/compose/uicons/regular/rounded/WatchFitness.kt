package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WatchFitness: ImageVector? = null

val Icons.Rr.WatchFitness: ImageVector
    get() = _WatchFitness ?: UXIcon(name = "WatchFitness") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 4.0f)
                lineTo(18f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.1f)
                curveToRelative(-0.32f, -0.07f, -0.66f, -0.1f, -1f, -0.1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.34f, 0f, -0.68f, 0.04f, -1f, 0.1f)
                lineTo(8f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.0f)
                curveToRelative(-1.21f, 0.91f, -2f, 2.37f, -2f, 4.0f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.63f, 0.79f, 3.08f, 2f, 4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.1f)
                curveToRelative(0.32f, 0.07f, 0.66f, 0.1f, 1f, 0.1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.34f, 0f, 0.68f, -0.04f, 1f, -0.1f)
                verticalLineToRelative(2.1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.0f)
                curveToRelative(1.21f, -0.91f, 2f, -2.37f, 2f, -4.0f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.63f, -0.79f, -3.08f, -2f, -4.0f)
                close()
                moveTo(18f, 16f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(8f)
                close()
                moveTo(16f, 11.16f)
                curveToRelative(0f, 1.73f, -2.34f, 3.76f, -3.44f, 4.62f)
                curveToRelative(-0.33f, 0.26f, -0.79f, 0.26f, -1.12f, 0f)
                curveToRelative(-1.1f, -0.86f, -3.44f, -2.89f, -3.44f, -4.62f)
                curveToRelative(0f, -1.19f, 0.9f, -2.16f, 2f, -2.16f)
                reflectiveCurveToRelative(2f, 0.81f, 2f, 2f)
                curveToRelative(0f, -1.19f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.97f, 2f, 2.16f)
                close()
            }
        }.also { _WatchFitness = it}
