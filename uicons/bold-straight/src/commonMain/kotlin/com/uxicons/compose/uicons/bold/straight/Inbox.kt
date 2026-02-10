package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Inbox: ImageVector? = null

val Icons.Bs.Inbox: ImageVector
    get() = _Inbox ?: UXIcon(name = "Inbox") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 11f)
                verticalLineToRelative(2.64f)
                arcTo(1.37f, 1.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.14f, 15f)
                horizontalLineTo(9.86f)
                arcTo(1.37f, 1.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 13.64f)
                verticalLineTo(11f)
                horizontalLineTo(0f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(11f)
                close()
                moveTo(21f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                horizontalLineTo(5.51f)
                arcToRelative(4.37f, 4.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.35f, 4f)
                horizontalLineToRelative(4.27f)
                arcToRelative(4.37f, 4.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.35f, -4f)
                horizontalLineTo(21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 6f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 1f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-20f)
                close()
            }
        }.also { _Inbox = it}
