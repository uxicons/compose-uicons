package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cookie: ImageVector? = null

val Icons.Bs.Cookie: ImageVector
    get() = _Cookie ?: UXIcon(name = "Cookie") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.61f, 9.59f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23.98f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -24f)
                curveToRelative(0.39f, 0f, 0.77f, 0.02f, 1.15f, 0.06f)
                lineToRelative(1.23f, 0.12f)
                lineTo(14.5f, 1.39f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.09f, 8.09f)
                lineToRelative(1.24f, 0.12f)
                lineToRelative(0.12f, 1.24f)
                curveToRelative(0.04f, 0.38f, 0.06f, 0.76f, 0.06f, 1.15f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 23.98f)
                close()
                moveTo(11.71f, 2.98f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 21f, 12.27f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.71f, 2.98f)
                close()
            }
        }.also { _Cookie = it}
