package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheeseAlt: ImageVector? = null

val Icons.Ts.CheeseAlt: ImageVector
    get() = _CheeseAlt ?: UXIcon(name = "CheeseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 16f)
                curveToRelative(0f, 2.37f, 0.64f, 4.42f, 1.18f, 5.72f)
                curveToRelative(0.57f, 1.38f, 1.92f, 2.28f, 3.43f, 2.28f)
                lineTo(24f, 24f)
                reflectiveCurveToRelative(0f, -15.76f, 0f, -15.76f)
                lineTo(13.52f, 0.81f)
                curveToRelative(-1.67f, -1.12f, -3.84f, -1.08f, -5.4f, 0.09f)
                curveTo(2.67f, 4.98f, 1.05f, 10.53f, 0.98f, 10.77f)
                horizontalLineToRelative(0f)
                curveTo(0.5f, 12.07f, 0f, 13.91f, 0f, 16f)
                close()
                moveTo(21.93f, 8f)
                lineTo(4.61f, 8f)
                curveToRelative(-0.52f, 0f, -1.03f, 0.11f, -1.48f, 0.31f)
                curveToRelative(1.01f, -1.91f, 2.77f, -4.49f, 5.6f, -6.6f)
                curveToRelative(1.22f, -0.92f, 2.93f, -0.94f, 4.24f, -0.07f)
                lineToRelative(8.97f, 6.36f)
                close()
                moveTo(1f, 16f)
                curveToRelative(0f, -2.21f, 0.6f, -4.12f, 1.1f, -5.34f)
                curveToRelative(0.42f, -1.01f, 1.4f, -1.66f, 2.5f, -1.66f)
                lineTo(23f, 9f)
                verticalLineToRelative(14f)
                lineTo(4.61f, 23f)
                curveToRelative(-1.1f, 0f, -2.09f, -0.65f, -2.5f, -1.66f)
                curveToRelative(-0.5f, -1.22f, -1.1f, -3.13f, -1.1f, -5.34f)
                close()
            }
        }.also { _CheeseAlt = it}
