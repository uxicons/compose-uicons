package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LockAlt: ImageVector? = null

val Icons.Sr.LockAlt: ImageVector
    get() = _LockAlt ?: UXIcon(name = "LockAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(24f, 12f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                close()
                moveTo(15f, 10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4f, 2.82f)
                verticalLineToRelative(3.18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-3.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2.82f)
                close()
            }
        }.also { _LockAlt = it}
