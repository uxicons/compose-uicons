package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SportDrink: ImageVector? = null

val Icons.Ts.SportDrink: ImageVector
    get() = _SportDrink ?: UXIcon(name = "SportDrink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 10.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.82f, 0.4f, 1.54f, 1.01f, 2f)
                curveToRelative(-0.61f, 0.46f, -1.01f, 1.18f, -1.01f, 2f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0f, -0.82f, -0.4f, -1.54f, -1.01f, -2f)
                curveToRelative(0.61f, -0.46f, 1.01f, -1.18f, 1.01f, -2f)
                close()
                moveTo(11.5f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(8f, 4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(19f, 10.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _SportDrink = it}
