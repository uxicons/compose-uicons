package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JugBottle: ImageVector? = null

val Icons.Sr.JugBottle: ImageVector
    get() = _JugBottle ?: UXIcon(name = "JugBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.66f, 5.97f)
                lineToRelative(-5.66f, -0.94f)
                verticalLineToRelative(-3.02f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                verticalLineToRelative(3.18f)
                lineToRelative(-0.76f, 0.28f)
                curveToRelative(-1.94f, 0.73f, -3.25f, 2.61f, -3.25f, 4.68f)
                verticalLineToRelative(8.86f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-9.09f)
                curveToRelative(0f, -1.96f, -1.41f, -3.62f, -3.34f, -3.94f)
                close()
                moveTo(20f, 15.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-6.02f)
                curveToRelative(0f, -0.82f, 0.68f, -1.48f, 1.5f, -1.48f)
                curveToRelative(0.82f, 0f, 1.5f, 0.66f, 1.5f, 1.48f)
                verticalLineToRelative(6.02f)
                close()
            }
        }.also { _JugBottle = it}
