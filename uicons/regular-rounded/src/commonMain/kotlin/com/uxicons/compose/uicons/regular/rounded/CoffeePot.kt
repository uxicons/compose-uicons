package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeePot: ImageVector? = null

val Icons.Rr.CoffeePot: ImageVector
    get() = _CoffeePot ?: UXIcon(name = "CoffeePot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 3.16f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.46f, 0f)
                lineTo(3f, 0f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.93f, 1.37f)
                lineTo(3.88f, 5.89f)
                arcTo(30.52f, 30.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.03f, 18.47f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 24f)
                lineTo(16f, 24f)
                arcToRelative(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.98f, -5.53f)
                arcTo(30.11f, 30.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 5.7f)
                lineTo(17f, 2f)
                arcToRelative(3.09f, 3.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.25f, 1.89f)
                arcTo(25.23f, 25.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcTo(27.25f, 27.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.11f, 3.16f)
                close()
                moveTo(18.22f, 21.01f)
                arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 22f)
                lineTo(5f, 22f)
                curveToRelative(-4.4f, -0.27f, -2.72f, -5.4f, -2.18f, -8f)
                lineTo(15f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(3.39f, 12f)
                arcTo(24.19f, 24.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.55f, 7f)
                horizontalLineToRelative(9.9f)
                arcToRelative(29.11f, 29.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.53f, 11.68f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.22f, 21.01f)
                close()
                moveTo(15f, 5f)
                lineTo(5.68f, 5f)
                lineToRelative(-1.2f, -3f)
                lineTo(15f, 2f)
                close()
            }
        }.also { _CoffeePot = it}
