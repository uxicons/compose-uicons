package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeePot: ImageVector? = null

val Icons.Ss.CoffeePot: ImageVector
    get() = _CoffeePot ?: UXIcon(name = "CoffeePot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                horizontalLineTo(22f)
                arcTo(25.11f, 25.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.4f, 2f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(3.52f)
                lineToRelative(-2f, -5f)
                horizontalLineToRelative(19.04f)
                lineToRelative(0.29f, 0.48f)
                arcTo(26.23f, 26.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 13f)
                close()
                moveTo(3.77f, 7f)
                arcTo(20.36f, 20.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 12f)
                horizontalLineTo(15.4f)
                curveToRelative(0.2f, 0.61f, 0.39f, 1.27f, 0.58f, 2f)
                horizontalLineTo(0.95f)
                arcTo(36.68f, 36.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 20.86f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 24f)
                horizontalLineTo(18f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3.14f)
                curveTo(20.62f, 12.95f, 18.25f, 8.55f, 17.23f, 7f)
                close()
            }
        }.also { _CoffeePot = it}
