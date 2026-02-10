package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ElectricCar: ImageVector? = null

val Icons.Ss.ElectricCar: ImageVector
    get() = _ElectricCar ?: UXIcon(name = "ElectricCar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.35f, 14f)
                horizontalLineToRelative(-15.7f)
                lineToRelative(1.43f, -4.01f)
                curveToRelative(0.42f, -1.19f, 1.56f, -1.99f, 2.83f, -1.99f)
                horizontalLineToRelative(7.18f)
                curveToRelative(1.26f, 0f, 2.4f, 0.8f, 2.83f, 1.99f)
                lineToRelative(1.43f, 4.01f)
                close()
                moveTo(24f, 0f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.27f)
                curveToRelative(0f, -0.58f, 0.05f, -1.16f, 0.14f, -1.73f)
                horizontalLineToRelative(16.72f)
                curveToRelative(0.09f, 0.57f, 0.14f, 1.15f, 0.14f, 1.73f)
                verticalLineToRelative(0.27f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-11f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(5f, 19f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(14f, 19f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _ElectricCar = it}
