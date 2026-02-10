package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Unlock: ImageVector? = null

val Icons.Rs.Unlock: ImageVector
    get() = _Unlock ?: UXIcon(name = "Unlock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 8f)
                verticalLineTo(7f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.38f, -2.42f)
                lineToRelative(1.75f, -0.97f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(8f)
                close()
                moveTo(20f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Unlock = it}
