package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LockAlt: ImageVector? = null

val Icons.Rr.LockAlt: ImageVector
    get() = _LockAlt ?: UXIcon(name = "LockAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
                close()
                moveTo(12f, 22f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10f, -10f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10f, 10f)
                close()
                moveTo(12f, 7f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 5.82f)
                verticalLineToRelative(3.18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-3.18f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -5.82f)
                close()
                moveTo(12f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
            }
        }.also { _LockAlt = it}
