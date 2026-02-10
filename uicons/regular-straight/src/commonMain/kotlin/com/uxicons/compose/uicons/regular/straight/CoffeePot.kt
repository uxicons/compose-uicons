package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeePot: ImageVector? = null

val Icons.Rs.CoffeePot: ImageVector
    get() = _CoffeePot ?: UXIcon(name = "CoffeePot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.4f, 2f)
                arcTo(25.11f, 25.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 13f)
                horizontalLineToRelative(2f)
                arcTo(26.23f, 26.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.86f, 0.48f)
                lineTo(20.57f, 0f)
                lineTo(1.52f, 0f)
                lineTo(3.89f, 5.9f)
                curveTo(3f, 7.42f, 0.4f, 12.54f, 0f, 20.86f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 24f)
                lineTo(18f, 24f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3.14f)
                curveToRelative(-0.41f, -8.72f, -3.26f, -13.93f, -4f, -15.15f)
                lineTo(17f, 2f)
                close()
                moveTo(18.72f, 21.69f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                lineTo(3f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1.05f)
                arcTo(37.87f, 37.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.96f, 14f)
                lineTo(15.97f, 14f)
                curveToRelative(-0.18f, -0.72f, -0.38f, -1.39f, -0.58f, -2f)
                lineTo(3.5f, 12f)
                arcTo(25.19f, 25.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.57f, 7f)
                horizontalLineToRelative(9.87f)
                arcTo(31.96f, 31.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 20.95f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.73f, 21.69f)
                close()
                moveTo(15f, 5f)
                lineTo(5.68f, 5f)
                lineToRelative(-1.2f, -3f)
                lineTo(15f, 2f)
                close()
            }
        }.also { _CoffeePot = it}
