package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ElectricCar: ImageVector? = null

val Icons.Rs.ElectricCar: ImageVector
    get() = _ElectricCar ?: UXIcon(name = "ElectricCar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 20f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-11f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.27f)
                curveToRelative(0f, -1.26f, -0.21f, -2.51f, -0.64f, -3.7f)
                lineToRelative(-1.44f, -4.04f)
                curveToRelative(-0.42f, -1.19f, -1.56f, -1.99f, -2.83f, -1.99f)
                horizontalLineToRelative(-7.18f)
                curveToRelative(-1.26f, 0f, -2.4f, 0.8f, -2.83f, 1.99f)
                lineToRelative(-1.44f, 4.04f)
                curveToRelative(-0.42f, 1.19f, -0.64f, 2.44f, -0.64f, 3.7f)
                verticalLineToRelative(4.27f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(3.97f, 10.66f)
                curveToRelative(0.14f, -0.4f, 0.52f, -0.66f, 0.94f, -0.66f)
                horizontalLineToRelative(7.18f)
                curveToRelative(0.42f, 0f, 0.8f, 0.27f, 0.94f, 0.66f)
                lineToRelative(1.19f, 3.34f)
                horizontalLineToRelative(-11.45f)
                close()
                moveTo(15f, 20f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-2.27f)
                curveToRelative(0f, -0.58f, 0.06f, -1.16f, 0.17f, -1.73f)
                horizontalLineToRelative(1.83f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.83f)
                curveToRelative(0.11f, 0.57f, 0.17f, 1.15f, 0.17f, 1.73f)
                close()
            }
        }.also { _ElectricCar = it}
