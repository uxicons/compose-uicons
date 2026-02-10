package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsersAlt: ImageVector? = null

val Icons.Ss.UsersAlt: ImageVector
    get() = _UsersAlt ?: UXIcon(name = "UsersAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, -4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17f)
                close()
                moveTo(18f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(9f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(3f)
                lineTo(18f, 24f)
                close()
                moveTo(18f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, -4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 8f)
                close()
                moveTo(6f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, -4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8f)
                close()
                moveTo(6f, 13f)
                arcTo(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.54f, 9f)
                lineTo(3f, 9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(3f)
                lineTo(6.35f, 15f)
                arcTo(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 13f)
                close()
                moveTo(17.65f, 15f)
                lineTo(24f, 15f)
                lineTo(24f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(16.46f, 9f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.19f, 6f)
                close()
            }
        }.also { _UsersAlt = it}
