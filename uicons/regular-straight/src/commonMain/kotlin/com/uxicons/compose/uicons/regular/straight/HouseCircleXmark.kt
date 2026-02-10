package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseCircleXmark: ImageVector? = null

val Icons.Rs.HouseCircleXmark: ImageVector
    get() = _HouseCircleXmark ?: UXIcon(name = "HouseCircleXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.07f)
                verticalLineToRelative(1.27f)
                curveToRelative(-0.64f, -0.79f, -1.41f, -1.47f, -2.28f, -2.0f)
                curveToRelative(-0.04f, -0.05f, -0.09f, -0.1f, -0.14f, -0.14f)
                lineTo(12.67f, 2.23f)
                curveToRelative(-0.4f, -0.31f, -0.95f, -0.31f, -1.35f, 0f)
                lineTo(2.42f, 9.21f)
                curveToRelative(-0.27f, 0.21f, -0.42f, 0.53f, -0.42f, 0.86f)
                verticalLineToRelative(11.93f)
                horizontalLineToRelative(7.52f)
                curveToRelative(0.51f, 0.76f, 1.12f, 1.43f, 1.83f, 2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-13.93f)
                curveToRelative(0f, -0.96f, 0.43f, -1.85f, 1.19f, -2.44f)
                lineTo(10.09f, 0.66f)
                curveToRelative(1.12f, -0.88f, 2.69f, -0.88f, 3.82f, 0f)
                lineToRelative(8.9f, 6.98f)
                curveToRelative(0.75f, 0.59f, 1.19f, 1.48f, 1.19f, 2.44f)
                close()
                moveTo(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(22f, 17f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveTo(18.54f, 14.04f)
                lineToRelative(-1.54f, 1.54f)
                lineToRelative(-1.54f, -1.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.54f, 1.54f)
                lineToRelative(-1.54f, 1.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.54f, -1.54f)
                lineToRelative(1.54f, 1.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.54f, -1.54f)
                lineToRelative(1.54f, -1.54f)
                lineToRelative(-1.41f, -1.41f)
                close()
            }
        }.also { _HouseCircleXmark = it}
