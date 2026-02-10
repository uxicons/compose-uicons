package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTime: ImageVector? = null

val Icons.Ss.UserTime: ImageVector
    get() = _UserTime ?: UXIcon(name = "UserTime") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.47f, 11f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.5f, -5.5f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 5.5f)
                close()
                moveTo(17f, 10f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7f, 7f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7f, -7f)
                close()
                moveTo(19f, 20.41f)
                lineTo(16f, 17.41f)
                verticalLineToRelative(-4.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.59f)
                lineToRelative(2.41f, 2.41f)
                close()
                moveTo(8f, 17f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.95f, -4f)
                horizontalLineToRelative(-3.95f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(11.35f)
                arcToRelative(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.35f, -7f)
                close()
            }
        }.also { _UserTime = it}
