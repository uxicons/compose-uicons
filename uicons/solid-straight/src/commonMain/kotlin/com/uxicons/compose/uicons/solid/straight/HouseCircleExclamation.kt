package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseCircleExclamation: ImageVector? = null

val Icons.Ss.HouseCircleExclamation: ImageVector
    get() = _HouseCircleExclamation ?: UXIcon(name = "HouseCircleExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(19f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
                moveTo(12.73f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-13.93f)
                curveToRelative(0f, -0.96f, 0.43f, -1.85f, 1.19f, -2.44f)
                lineTo(10.09f, 0.66f)
                curveToRelative(1.12f, -0.88f, 2.69f, -0.88f, 3.81f, 0f)
                lineToRelative(8.91f, 6.98f)
                curveToRelative(0.75f, 0.59f, 1.19f, 1.48f, 1.19f, 2.44f)
                verticalLineToRelative(2.65f)
                curveToRelative(-1.47f, -1.67f, -3.61f, -2.73f, -6f, -2.73f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                curveToRelative(0f, 2.39f, 1.06f, 4.53f, 2.73f, 6f)
                close()
            }
        }.also { _HouseCircleExclamation = it}
