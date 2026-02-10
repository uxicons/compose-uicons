package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SportDrink: ImageVector? = null

val Icons.Bs.SportDrink: ImageVector
    get() = _SportDrink ?: UXIcon(name = "SportDrink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 8.5f)
                curveToRelative(0f, -1.76f, -1.31f, -3.2f, -3f, -3.45f)
                verticalLineToRelative(-2.05f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(2.05f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.69f, -3f, 3.45f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.74f, 0.24f, 1.43f, 0.64f, 2f)
                curveToRelative(-0.4f, 0.57f, -0.64f, 1.26f, -0.64f, 2f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -0.74f, -0.24f, -1.43f, -0.64f, -2f)
                curveToRelative(0.4f, -0.57f, 0.64f, -1.26f, 0.64f, -2f)
                close()
                moveTo(17f, 21f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                close()
            }
        }.also { _SportDrink = it}
