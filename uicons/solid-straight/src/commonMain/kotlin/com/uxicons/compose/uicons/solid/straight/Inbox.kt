package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Inbox: ImageVector? = null

val Icons.Ss.Inbox: ImageVector
    get() = _Inbox ?: UXIcon(name = "Inbox") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 8f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                horizontalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(12f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 8f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-20f)
                close()
            }
        }.also { _Inbox = it}
