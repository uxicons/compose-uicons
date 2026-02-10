package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasStation: ImageVector? = null

val Icons.Sr.GasStation: ImageVector
    get() = _GasStation ?: UXIcon(name = "GasStation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.0f, 13.99f)
                reflectiveCurveToRelative(-0.0f, 0.01f, -0.0f, 0.01f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.99f)
                close()
                moveTo(19.78f, 18.78f)
                lineTo(15.79f, 22.47f)
                curveToRelative(-1.0f, 0.98f, -2.35f, 1.53f, -3.79f, 1.53f)
                reflectiveCurveToRelative(-2.78f, -0.55f, -3.81f, -1.55f)
                lineToRelative(-3.94f, -3.64f)
                curveToRelative(-4.32f, -4.32f, -4.32f, -11.29f, -0.03f, -15.58f)
                curveToRelative(2.08f, -2.08f, 4.84f, -3.22f, 7.78f, -3.22f)
                reflectiveCurveToRelative(5.7f, 1.15f, 7.78f, 3.22f)
                curveToRelative(4.29f, 4.29f, 4.29f, 11.27f, 0f, 15.56f)
                close()
                moveTo(17.7f, 7.67f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-0.9f, 0.9f)
                curveToRelative(-0.24f, 0.24f, -0.39f, 0.58f, -0.39f, 0.93f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(0.74f, 0f, 1.38f, -0.41f, 1.72f, -1f)
                horizontalLineToRelative(1.28f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-3.22f)
                lineToRelative(0.7f, -0.7f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _GasStation = it}
