package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseSignal: ImageVector? = null

val Icons.Ts.HouseSignal: ImageVector
    get() = _HouseSignal ?: UXIcon(name = "HouseSignal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 23.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(0f, 17.0f)
                verticalLineToRelative(1f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                horizontalLineToRelative(1f)
                curveTo(7f, 20.14f, 3.86f, 17.0f, 0f, 17.0f)
                close()
                moveTo(0f, 12.0f)
                verticalLineToRelative(1f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                horizontalLineToRelative(1f)
                curveTo(12f, 17.38f, 6.62f, 12.0f, 0f, 12.0f)
                close()
                moveTo(17.5f, 8.0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                close()
                moveTo(16.5f, 9.0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(23.04f, 5.63f)
                lineTo(16.54f, 0.53f)
                curveToRelative(-0.91f, -0.71f, -2.18f, -0.71f, -3.08f, 0f)
                lineToRelative(-6.5f, 5.09f)
                curveToRelative(-0.61f, 0.48f, -0.96f, 1.19f, -0.96f, 1.97f)
                verticalLineToRelative(3.78f)
                curveToRelative(0.34f, 0.16f, 0.68f, 0.34f, 1f, 0.52f)
                verticalLineToRelative(-4.3f)
                curveToRelative(0f, -0.47f, 0.21f, -0.9f, 0.57f, -1.18f)
                lineTo(14.07f, 1.32f)
                curveToRelative(0.55f, -0.43f, 1.3f, -0.43f, 1.85f, 0f)
                lineToRelative(6.5f, 5.09f)
                curveToRelative(0.36f, 0.29f, 0.57f, 0.72f, 0.57f, 1.18f)
                verticalLineToRelative(9.41f)
                horizontalLineToRelative(-10.89f)
                curveToRelative(0.19f, 0.33f, 0.36f, 0.66f, 0.52f, 1f)
                horizontalLineToRelative(11.37f)
                lineTo(24f, 7.59f)
                curveToRelative(0f, -0.77f, -0.35f, -1.49f, -0.96f, -1.97f)
                close()
            }
        }.also { _HouseSignal = it}
