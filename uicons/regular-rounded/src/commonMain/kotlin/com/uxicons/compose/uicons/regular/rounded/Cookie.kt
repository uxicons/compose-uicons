package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cookie: ImageVector? = null

val Icons.Rr.Cookie: ImageVector
    get() = _Cookie ?: UXIcon(name = "Cookie") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 9.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 1.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 6.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 14.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 14.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.94f, 10.85f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.9f, -0.9f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.05f, 0.96f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.9f, -0.9f)
                curveTo(12.77f, 0.02f, 12.39f, 0f, 12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                curveTo(24f, 11.61f, 23.98f, 11.23f, 23.94f, 10.85f)
                close()
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                lineToRelative(0.17f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 11.83f)
                curveToRelative(0f, 0.06f, 0f, 0.11f, 0f, 0.17f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
            }
        }.also { _Cookie = it}
