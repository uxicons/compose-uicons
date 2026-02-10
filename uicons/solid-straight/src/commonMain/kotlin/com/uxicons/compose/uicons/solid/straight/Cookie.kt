package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cookie: ImageVector? = null

val Icons.Ss.Cookie: ImageVector
    get() = _Cookie ?: UXIcon(name = "Cookie") {
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
                moveTo(24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 0f)
                curveToRelative(0.39f, 0f, 0.77f, 0.02f, 1.15f, 0.06f)
                lineToRelative(0.82f, 0.08f)
                lineToRelative(0.08f, 0.82f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.99f, 8.99f)
                lineToRelative(0.82f, 0.08f)
                lineToRelative(0.08f, 0.82f)
                curveTo(23.98f, 11.23f, 24f, 11.61f, 24f, 12f)
                close()
                moveTo(8.5f, 7f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 8.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 7f)
                close()
                moveTo(8.5f, 14f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 14f)
                close()
                moveTo(15.5f, 13f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 17f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 13f)
                close()
            }
        }.also { _Cookie = it}
