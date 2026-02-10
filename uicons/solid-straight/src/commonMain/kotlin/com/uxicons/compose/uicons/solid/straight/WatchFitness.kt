package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WatchFitness: ImageVector? = null

val Icons.Ss.WatchFitness: ImageVector
    get() = _WatchFitness ?: UXIcon(name = "WatchFitness") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 4f)
                lineTo(7f, 4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(20f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(12f, 16.2f)
                reflectiveCurveToRelative(-4f, -2.78f, -4f, -5.04f)
                curveToRelative(0f, -1.19f, 0.9f, -2.16f, 2f, -2.16f)
                reflectiveCurveToRelative(2f, 0.81f, 2f, 2f)
                curveToRelative(0f, -1.19f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.97f, 2f, 2.16f)
                curveToRelative(0f, 2.26f, -4f, 5.04f, -4f, 5.04f)
                close()
                moveTo(6f, 2.1f)
                lineTo(6f, 0f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2.1f)
                curveToRelative(-0.32f, -0.07f, -0.66f, -0.1f, -1f, -0.1f)
                lineTo(7f, 2f)
                curveToRelative(-0.34f, 0f, -0.68f, 0.04f, -1f, 0.1f)
                close()
                moveTo(7f, 22f)
                horizontalLineToRelative(10f)
                curveToRelative(0.34f, 0f, 0.68f, -0.04f, 1f, -0.1f)
                verticalLineToRelative(2.1f)
                lineTo(6f, 24f)
                verticalLineToRelative(-2.1f)
                curveToRelative(0.32f, 0.07f, 0.66f, 0.1f, 1f, 0.1f)
                close()
            }
        }.also { _WatchFitness = it}
