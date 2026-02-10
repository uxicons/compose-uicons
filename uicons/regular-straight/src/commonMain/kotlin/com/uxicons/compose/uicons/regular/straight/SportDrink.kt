package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SportDrink: ImageVector? = null

val Icons.Rs.SportDrink: ImageVector
    get() = _SportDrink ?: UXIcon(name = "SportDrink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 8f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.77f, 0.3f, 1.47f, 0.78f, 2f)
                curveToRelative(-0.48f, 0.53f, -0.78f, 1.23f, -0.78f, 2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.77f, -0.3f, -1.47f, -0.78f, -2f)
                curveToRelative(0.48f, -0.53f, 0.78f, -1.23f, 0.78f, -2f)
                close()
                moveTo(18f, 22f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _SportDrink = it}
