package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeMaker: ImageVector? = null

val Icons.Bs.CoffeeMaker: ImageVector
    get() = _CoffeeMaker ?: UXIcon(name = "CoffeeMaker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineTo(24f)
                horizontalLineTo(22f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4.25f)
                curveToRelative(1.8f, 0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-2.75f)
                horizontalLineTo(12f)
                verticalLineToRelative(2.75f)
                curveToRelative(0f, 1.8f, 1.46f, 3.25f, 3.25f, 3.25f)
                horizontalLineToRelative(-5.25f)
                verticalLineTo(8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(10f)
                close()
                moveTo(7f, 5f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(7f)
                close()
            }
        }.also { _CoffeeMaker = it}
