package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smartphone: ImageVector? = null

val Icons.Rs.Smartphone: ImageVector
    get() = _Smartphone ?: UXIcon(name = "Smartphone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 0f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(0f)
                close()
                moveTo(18f, 2f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                close()
                moveTo(17f, 22f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineToRelative(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 22f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 19f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Smartphone = it}
