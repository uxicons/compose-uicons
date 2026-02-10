package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Home: ImageVector? = null

val Icons.Rr.Home: ImageVector
    get() = _Home ?: UXIcon(name = "Home") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.12f, 9.07f)
                lineTo(15.54f, 1.48f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.07f, 0f)
                lineTo(0.88f, 9.07f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.19f)
                verticalLineToRelative(9.82f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(21f, 24.01f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(24f, 11.19f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.12f, 9.07f)
                close()
                moveTo(15f, 22.01f)
                lineTo(9f, 22.01f)
                lineTo(9f, 18.07f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                close()
                moveTo(22f, 21.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(17f, 22.01f)
                lineTo(17f, 18.07f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10f, 0f)
                verticalLineToRelative(3.93f)
                lineTo(3f, 22.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineTo(2f, 11.19f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.29f, -0.71f)
                lineTo(9.88f, 2.9f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.24f, 0f)
                lineToRelative(7.58f, 7.59f)
                arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 11.19f)
                close()
            }
        }.also { _Home = it}
