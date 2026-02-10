package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeePot: ImageVector? = null

val Icons.Sr.CoffeePot: ImageVector
    get() = _CoffeePot ?: UXIcon(name = "CoffeePot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcToRelative(25.23f, 25.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.75f, -9.11f)
                arcTo(3.09f, 3.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 2f)
                lineTo(17f, 5f)
                lineTo(3.52f, 5f)
                lineTo(2.07f, 1.37f)
                arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                lineTo(17.46f, 0f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.65f, 3.16f)
                arcTo(27.25f, 27.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 13f)
                close()
                moveTo(20.97f, 18.47f)
                curveTo(20.3f, 11.99f, 18.23f, 8.38f, 17.26f, 7f)
                lineTo(3.74f, 7f)
                arcToRelative(18.95f, 18.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.38f, 5f)
                lineTo(15f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                lineTo(0.79f, 14f)
                arcToRelative(33.33f, 33.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.76f, 4.47f)
                arcTo(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 24f)
                lineTo(16f, 24f)
                arcTo(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.97f, 18.47f)
                close()
            }
        }.also { _CoffeePot = it}
