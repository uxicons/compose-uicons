package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BuildingCar: ImageVector? = null

val Icons.Bs.BuildingCar: ImageVector
    get() = _BuildingCar ?: UXIcon(name = "BuildingCar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(13f, 8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-11f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(5f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(24f, 19.08f)
                verticalLineToRelative(2.92f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.92f)
                curveToRelative(0f, -0.97f, 0.15f, -1.93f, 0.44f, -2.85f)
                lineToRelative(1.19f, -3.77f)
                curveToRelative(0.46f, -1.46f, 1.8f, -2.45f, 3.34f, -2.45f)
                horizontalLineToRelative(4.07f)
                curveToRelative(1.54f, 0f, 2.88f, 0.98f, 3.34f, 2.45f)
                lineToRelative(1.19f, 3.77f)
                curveToRelative(0.29f, 0.93f, 0.44f, 1.89f, 0.44f, 2.86f)
                close()
                moveTo(20.34f, 16f)
                lineTo(19.51f, 13.35f)
                curveToRelative(-0.07f, -0.21f, -0.26f, -0.35f, -0.48f, -0.35f)
                horizontalLineToRelative(-4.07f)
                curveToRelative(-0.22f, 0f, -0.41f, 0.14f, -0.48f, 0.35f)
                lineToRelative(-0.84f, 2.65f)
                horizontalLineToRelative(6.69f)
                close()
                moveTo(5f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _BuildingCar = it}
