package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignOutAlt: ImageVector? = null

val Icons.Bs.SignOutAlt: ImageVector
    get() = _SignOutAlt ?: UXIcon(name = "SignOutAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.12f, 9.88f)
                lineToRelative(-4.95f, -4.95f)
                lineTo(16.05f, 7.05f)
                lineTo(19.5f, 10.5f)
                horizontalLineTo(6.62f)
                verticalLineToRelative(3f)
                horizontalLineTo(19.5f)
                lineToRelative(-3.45f, 3.45f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.95f, -4.95f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.12f, 9.88f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.99f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
                horizontalLineTo(3.51f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
                verticalLineTo(3.53f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineTo(9.49f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineTo(8.35f)
                horizontalLineToRelative(3f)
                verticalLineTo(3.53f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                horizontalLineTo(3.51f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineTo(20.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 3.5f)
                horizontalLineTo(9.49f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, -3.5f)
                verticalLineTo(15.68f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _SignOutAlt = it}
