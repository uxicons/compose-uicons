package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tablet: ImageVector? = null

val Icons.Ss.Tablet: ImageVector
    get() = _Tablet ?: UXIcon(name = "Tablet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 19f)
                verticalLineToRelative(2f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(19f)
                close()
            }
        }.also { _Tablet = it}
