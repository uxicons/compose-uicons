package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseCircleExclamation: ImageVector? = null

val Icons.Sr.HouseCircleExclamation: ImageVector
    get() = _HouseCircleExclamation ?: UXIcon(name = "HouseCircleExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.73f, 24f)
                horizontalLineToRelative(-7.73f)
                curveTo(2.24f, 24f, 0f, 21.76f, 0f, 19f)
                verticalLineToRelative(-9.28f)
                curveTo(0f, 8.06f, 0.82f, 6.51f, 2.2f, 5.58f)
                lineTo(9.2f, 0.85f)
                curveToRelative(1.7f, -1.15f, 3.9f, -1.15f, 5.59f, 0f)
                lineToRelative(7.2f, 4.88f)
                curveToRelative(1.25f, 0.94f, 2f, 2.41f, 2f, 3.99f)
                verticalLineToRelative(3.0f)
                curveToRelative(-1.47f, -1.67f, -3.61f, -2.73f, -6f, -2.73f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                curveToRelative(0f, 2.39f, 1.06f, 4.54f, 2.73f, 6.0f)
                close()
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(17f, 15f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 22f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _HouseCircleExclamation = it}
