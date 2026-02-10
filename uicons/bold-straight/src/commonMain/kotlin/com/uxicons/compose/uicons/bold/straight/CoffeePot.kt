package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeePot: ImageVector? = null

val Icons.Bs.CoffeePot: ImageVector
    get() = _CoffeePot ?: UXIcon(name = "CoffeePot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.05f, 3f)
                arcTo(25.73f, 25.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 13f)
                horizontalLineToRelative(3f)
                arcTo(26.93f, 26.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.31f, 0.77f)
                lineTo(20.88f, 0f)
                horizontalLineTo(0.57f)
                lineTo(3.78f, 6.41f)
                arcTo(30.56f, 30.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 20.44f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.4f, 24f)
                horizontalLineTo(17.6f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 20.44f)
                curveToRelative(-0.38f, -8.08f, -3.1f, -12.98f, -4f, -14.39f)
                verticalLineTo(3f)
                close()
                moveTo(17.89f, 20.88f)
                arcTo(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.6f, 21f)
                horizontalLineTo(3.4f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.4f, -0.41f)
                arcTo(32.7f, 32.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.97f, 14f)
                horizontalLineTo(14.95f)
                arcToRelative(25.07f, 25.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.03f, -3f)
                horizontalLineToRelative(-9f)
                arcToRelative(21f, 21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.4f, -3f)
                horizontalLineToRelative(8.35f)
                arcTo(28.01f, 28.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 20.59f)
                arcTo(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.89f, 20.88f)
                close()
                moveTo(14f, 5f)
                horizontalLineTo(6.43f)
                lineToRelative(-1f, -2f)
                horizontalLineTo(14f)
                close()
            }
        }.also { _CoffeePot = it}
