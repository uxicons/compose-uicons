package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GameConsoleCrankHandheld: ImageVector? = null

val Icons.Rs.GameConsoleCrankHandheld: ImageVector
    get() = _GameConsoleCrankHandheld ?: UXIcon(name = "GameConsoleCrankHandheld") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-13f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(17f, 20f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(13f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(7.5f, 14.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(15f, 15.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(4f, 11f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-11f)
                close()
                moveTo(6f, 8f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-7f)
                close()
            }
        }.also { _GameConsoleCrankHandheld = it}
