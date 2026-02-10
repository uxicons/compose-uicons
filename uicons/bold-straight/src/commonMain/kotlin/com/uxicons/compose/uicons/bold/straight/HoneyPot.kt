package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoneyPot: ImageVector? = null

val Icons.Bs.HoneyPot: ImageVector
    get() = _HoneyPot ?: UXIcon(name = "HoneyPot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.15f, 3f)
                horizontalLineToRelative(0.85f)
                lineTo(23f, 0f)
                lineTo(1f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(0.85f)
                curveTo(0.69f, 5.11f, 0f, 7.63f, 0f, 10f)
                curveToRelative(0f, 4.36f, 2.82f, 9.93f, 5.23f, 13.36f)
                lineToRelative(0.45f, 0.64f)
                horizontalLineToRelative(12.65f)
                lineToRelative(0.45f, -0.64f)
                curveToRelative(2.41f, -3.44f, 5.23f, -9.0f, 5.23f, -13.36f)
                curveToRelative(0f, -2.37f, -0.69f, -4.89f, -1.85f, -7f)
                close()
                moveTo(16.75f, 21f)
                lineTo(7.25f, 21f)
                curveToRelative(-2.12f, -3.21f, -4.25f, -7.81f, -4.25f, -11f)
                curveToRelative(0f, -2.44f, 0.96f, -5.17f, 2.43f, -7f)
                horizontalLineToRelative(0.57f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                lineTo(10f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.57f)
                curveToRelative(1.47f, 1.83f, 2.43f, 4.56f, 2.43f, 7f)
                curveToRelative(0f, 3.19f, -2.13f, 7.79f, -4.25f, 11f)
                close()
            }
        }.also { _HoneyPot = it}
