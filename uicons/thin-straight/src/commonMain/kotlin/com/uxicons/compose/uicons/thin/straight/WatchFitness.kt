package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WatchFitness: ImageVector? = null

val Icons.Ts.WatchFitness: ImageVector
    get() = _WatchFitness ?: UXIcon(name = "WatchFitness") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 3.05f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                lineTo(7f, 3f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3.05f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2f, 2.45f)
                verticalLineToRelative(3.05f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3.05f)
                curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
                lineTo(20f, 5.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                close()
                moveTo(19f, 18.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(6.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(5f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(13f)
                close()
                moveTo(14f, 8.5f)
                curveToRelative(-0.84f, 0f, -1.55f, 0.37f, -2f, 0.96f)
                curveToRelative(-0.45f, -0.59f, -1.16f, -0.96f, -2f, -0.96f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.19f, -2.5f, 2.66f)
                curveToRelative(0f, 2.45f, 3.78f, 5.15f, 4.21f, 5.45f)
                lineToRelative(0.28f, 0.2f)
                lineToRelative(0.28f, -0.2f)
                curveToRelative(0.43f, -0.3f, 4.21f, -3.0f, 4.21f, -5.45f)
                curveToRelative(0f, -1.47f, -1.12f, -2.66f, -2.5f, -2.66f)
                close()
                moveTo(12f, 15.58f)
                curveToRelative(-1.19f, -0.89f, -3.5f, -2.92f, -3.5f, -4.42f)
                curveToRelative(0f, -0.92f, 0.67f, -1.66f, 1.5f, -1.66f)
                curveToRelative(0.87f, 0f, 1.5f, 0.63f, 1.5f, 1.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -0.87f, 0.63f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.74f, 1.5f, 1.66f)
                curveToRelative(0f, 1.51f, -2.31f, 3.54f, -3.5f, 4.42f)
                close()
            }
        }.also { _WatchFitness = it}
