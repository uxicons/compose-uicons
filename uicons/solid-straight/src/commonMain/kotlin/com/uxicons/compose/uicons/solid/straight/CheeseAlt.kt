package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheeseAlt: ImageVector? = null

val Icons.Ss.CheeseAlt: ImageVector
    get() = _CheeseAlt ?: UXIcon(name = "CheeseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.14f, 8.04f)
                curveToRelative(1f, -1.98f, 2.81f, -4.77f, 5.9f, -7.08f)
                curveToRelative(1.66f, -1.24f, 3.95f, -1.28f, 5.71f, -0.11f)
                lineToRelative(9.58f, 7.15f)
                lineTo(2.67f, 8f)
                curveToRelative(-0.18f, 0f, -0.36f, 0.02f, -0.53f, 0.04f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(14f)
                reflectiveCurveToRelative(-19.17f, 0f, -19.17f, 0f)
                curveToRelative(-1.63f, 0f, -3.07f, -0.96f, -3.69f, -2.46f)
                curveTo(0.62f, 20.28f, 0f, 18.3f, 0f, 16f)
                curveToRelative(0f, -1.93f, 0.44f, -3.63f, 0.88f, -4.87f)
                curveToRelative(0.33f, -0.69f, 1.01f, -1.13f, 1.79f, -1.13f)
                lineTo(24f, 10f)
                close()
            }
        }.also { _CheeseAlt = it}
