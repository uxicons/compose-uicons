package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseCircleCheck: ImageVector? = null

val Icons.Bs.HouseCircleCheck: ImageVector
    get() = _HouseCircleCheck ?: UXIcon(name = "HouseCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.75f, 20.44f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-2.18f, -2.27f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.22f, 2.3f)
                lineToRelative(3.61f, -3.7f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-3.61f, 3.7f)
                close()
                moveTo(24f, 10.18f)
                verticalLineToRelative(2.56f)
                curveToRelative(-0.81f, -0.93f, -1.84f, -1.66f, -3f, -2.13f)
                verticalLineToRelative(-0.42f)
                curveToRelative(0f, -0.15f, -0.07f, -0.3f, -0.19f, -0.39f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                lineTo(12.31f, 3.13f)
                curveToRelative(-0.18f, -0.14f, -0.43f, -0.14f, -0.62f, 0f)
                lineTo(3.19f, 9.78f)
                curveToRelative(-0.12f, 0.1f, -0.19f, 0.24f, -0.19f, 0.39f)
                verticalLineToRelative(10.82f)
                horizontalLineToRelative(5.0f)
                reflectiveCurveToRelative(0.0f, 0f, 0.0f, 0f)
                horizontalLineToRelative(2.58f)
                curveToRelative(0.47f, 1.16f, 1.2f, 2.18f, 2.12f, 3f)
                horizontalLineToRelative(-3.71f)
                reflectiveCurveToRelative(-9f, 0f, -9f, 0f)
                verticalLineToRelative(-13.82f)
                curveToRelative(0f, -1.08f, 0.49f, -2.09f, 1.34f, -2.76f)
                lineTo(9.84f, 0.77f)
                curveToRelative(1.27f, -0.99f, 3.04f, -0.99f, 4.31f, 0f)
                lineToRelative(8.5f, 6.65f)
                horizontalLineToRelative(0f)
                curveToRelative(0.85f, 0.67f, 1.34f, 1.67f, 1.34f, 2.76f)
                close()
            }
        }.also { _HouseCircleCheck = it}
