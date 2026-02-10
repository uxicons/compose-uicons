package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner5: ImageVector? = null

val Icons.Ss.Banner5: ImageVector
    get() = _Banner5 ?: UXIcon(name = "Banner5") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 6f)
                reflectiveCurveToRelative(2.31f, -1f, 6f, -1f)
                reflectiveCurveToRelative(6f, 1f, 6f, 1f)
                verticalLineToRelative(8f)
                reflectiveCurveToRelative(-2.77f, -1f, -6f, -1f)
                reflectiveCurveToRelative(-6f, 1f, -6f, 1f)
                lineTo(6f, 6f)
                close()
                moveTo(6.68f, 15.8f)
                lineToRelative(-2.67f, 0.95f)
                lineToRelative(-0.0f, -6.39f)
                curveToRelative(-2.41f, 0.58f, -4.0f, 1.63f, -4.0f, 1.63f)
                verticalLineToRelative(0.07f)
                curveToRelative(1.5f, 0.93f, 3f, 2.93f, 3f, 2.93f)
                curveToRelative(0f, 0f, -1.81f, 2.04f, -3f, 4.93f)
                verticalLineToRelative(0.07f)
                curveToRelative(2.5f, -1f, 5.18f, -1.82f, 7f, -2f)
                verticalLineToRelative(-2.3f)
                curveToRelative(-0.2f, 0.06f, -0.32f, 0.1f, -0.32f, 0.1f)
                close()
                moveTo(24f, 12.07f)
                verticalLineToRelative(-0.07f)
                reflectiveCurveToRelative(-1.59f, -1.05f, -4f, -1.63f)
                verticalLineToRelative(6.4f)
                lineToRelative(-2.68f, -0.97f)
                reflectiveCurveToRelative(-0.12f, -0.04f, -0.32f, -0.1f)
                verticalLineToRelative(2.3f)
                curveToRelative(1.82f, 0.18f, 4.5f, 1f, 7f, 2f)
                verticalLineToRelative(-0.07f)
                curveToRelative(-1.19f, -2.89f, -3f, -4.93f, -3f, -4.93f)
                curveToRelative(0f, 0f, 1.5f, -2f, 3f, -2.93f)
                close()
            }
        }.also { _Banner5 = it}
