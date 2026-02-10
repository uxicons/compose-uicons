package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseCircleXmark: ImageVector? = null

val Icons.Sr.HouseCircleXmark: ImageVector
    get() = _HouseCircleXmark ?: UXIcon(name = "HouseCircleXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.73f, 24f)
                horizontalLineToRelative(-7.73f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-9.28f)
                curveToRelative(0f, -1.67f, 0.82f, -3.21f, 2.2f, -4.14f)
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
                moveTo(20.71f, 19.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.29f, -1.29f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.29f, -1.29f)
                lineToRelative(-1.29f, -1.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.29f, 1.29f)
                lineToRelative(1.29f, -1.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-1.29f, 1.29f)
                lineToRelative(1.29f, 1.29f)
                close()
            }
        }.also { _HouseCircleXmark = it}
