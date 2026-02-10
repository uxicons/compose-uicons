package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GameConsoleCrankHandheld: ImageVector? = null

val Icons.Bs.GameConsoleCrankHandheld: ImageVector
    get() = _GameConsoleCrankHandheld ?: UXIcon(name = "GameConsoleCrankHandheld") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 4f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-12f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                close()
                moveTo(16f, 19f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-13.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(12f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(8f, 14f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                close()
                moveTo(14f, 14.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(5f, 7f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-9f)
                close()
            }
        }.also { _GameConsoleCrankHandheld = it}
