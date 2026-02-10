package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeePot: ImageVector? = null

val Icons.Br.CoffeePot: ImageVector
    get() = _CoffeePot ?: UXIcon(name = "CoffeePot") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.29f, 3.49f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.17f, 0f)
            horizontalLineTo(3.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.11f, 2.06f)
            lineToRelative(1.7f, 4.25f)
            arcTo(27.18f, 27.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.03f, 18.12f)
            arcTo(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.32f, 24f)
            horizontalLineTo(15.68f)
            arcToRelative(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.29f, -5.88f)
            arcTo(26.68f, 26.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 6.02f)
            verticalLineTo(3f)
            horizontalLineToRelative(0.17f)
            arcTo(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 4.6f)
            arcTo(21.42f, 21.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            arcTo(24.46f, 24.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.29f, 3.49f)
            close()
            moveTo(17.4f, 20.23f)
            arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.68f, 21f)
            horizontalLineTo(5.32f)
            arcToRelative(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.31f, -2.57f)
            arcTo(29.64f, 29.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.58f, 15f)
            horizontalLineTo(13.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineTo(4.43f)
            arcTo(20.4f, 20.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.29f, 8f)
            horizontalLineToRelative(8.42f)
            arcToRelative(24.62f, 24.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.28f, 10.43f)
            arcTo(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.4f, 20.23f)
            close()
            moveTo(14f, 5f)
            horizontalLineTo(6.51f)
            lineToRelative(-0.8f, -2f)
            horizontalLineTo(14f)
            close()
        }
    }.also { _CoffeePot = it }
