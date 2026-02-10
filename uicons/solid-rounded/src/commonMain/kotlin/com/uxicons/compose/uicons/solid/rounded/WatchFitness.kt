package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WatchFitness: ImageVector? = null

val Icons.Sr.WatchFitness: ImageVector
    get() = _WatchFitness ?: UXIcon(name = "WatchFitness") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 4f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(12.56f, 15.78f)
                curveToRelative(-0.33f, 0.26f, -0.79f, 0.26f, -1.12f, 0f)
                curveToRelative(-1.1f, -0.86f, -3.44f, -2.89f, -3.44f, -4.62f)
                curveToRelative(0f, -1.19f, 0.9f, -2.16f, 2f, -2.16f)
                reflectiveCurveToRelative(2f, 0.81f, 2f, 2f)
                curveToRelative(0f, -1.19f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.97f, 2f, 2.16f)
                curveToRelative(0f, 1.73f, -2.34f, 3.76f, -3.44f, 4.62f)
                close()
                moveTo(6f, 2.69f)
                verticalLineToRelative(-1.69f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.69f)
                curveToRelative(-0.91f, -0.43f, -1.93f, -0.69f, -3f, -0.69f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.07f, 0f, -2.09f, 0.25f, -3f, 0.69f)
                close()
                moveTo(9f, 22f)
                horizontalLineToRelative(6f)
                curveToRelative(1.07f, 0f, 2.09f, -0.25f, 3f, -0.69f)
                verticalLineToRelative(1.69f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(7f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.69f)
                curveToRelative(0.91f, 0.43f, 1.93f, 0.69f, 3f, 0.69f)
                close()
            }
        }.also { _WatchFitness = it}
