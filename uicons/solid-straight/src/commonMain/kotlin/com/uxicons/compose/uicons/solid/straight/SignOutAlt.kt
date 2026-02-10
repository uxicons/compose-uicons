package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignOutAlt: ImageVector? = null

val Icons.Ss.SignOutAlt: ImageVector
    get() = _SignOutAlt ?: UXIcon(name = "SignOutAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.76f, 10.23f)
                lineToRelative(-4.95f, -4.95f)
                lineTo(16.4f, 6.7f)
                lineTo(20.7f, 11f)
                horizontalLineTo(6.62f)
                verticalLineToRelative(2f)
                horizontalLineTo(20.7f)
                lineToRelative(-4.3f, 4.3f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.95f, -4.95f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.54f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.48f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                horizontalLineTo(9.48f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineTo(8.33f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(9.48f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(15.67f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _SignOutAlt = it}
