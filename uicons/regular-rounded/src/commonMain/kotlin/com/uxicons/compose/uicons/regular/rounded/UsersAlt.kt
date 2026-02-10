package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsersAlt: ImageVector? = null

val Icons.Rr.UsersAlt: ImageVector
    get() = _UsersAlt ?: UXIcon(name = "UsersAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, -4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                close()
                moveTo(12f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                close()
                moveTo(18f, 23f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(18f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, -4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 8f)
                close()
                moveTo(18f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 2f)
                close()
                moveTo(24f, 15f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(6f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, -4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8f)
                close()
                moveTo(6f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 2f)
                close()
                moveTo(2f, 15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 9f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
            }
        }.also { _UsersAlt = it}
