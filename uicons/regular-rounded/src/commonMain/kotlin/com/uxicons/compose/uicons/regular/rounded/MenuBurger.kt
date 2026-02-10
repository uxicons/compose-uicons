package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MenuBurger: ImageVector? = null

val Icons.Rr.MenuBurger: ImageVector
    get() = _MenuBurger ?: UXIcon(name = "MenuBurger") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 11f)
                lineTo(23f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                lineTo(24f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 13f)
                lineTo(1f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12f)
                lineTo(0f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 4f)
                lineTo(23f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 5f)
                lineTo(24f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 6f)
                lineTo(1f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5f)
                lineTo(0f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 18f)
                lineTo(23f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 19f)
                lineTo(24f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 20f)
                lineTo(1f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 19f)
                lineTo(0f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 18f)
                close()
            }
        }.also { _MenuBurger = it}
