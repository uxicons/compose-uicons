package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _File: ImageVector? = null

val Icons.Rs.File: ImageVector
    get() = _File ?: UXIcon(name = "File") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.41f, 0f)
                horizontalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(22f)
                verticalLineTo(7.59f)
                close()
                moveTo(15f, 3.41f)
                lineTo(18.59f, 7f)
                horizontalLineTo(15f)
                close()
                moveTo(4f, 22f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 2f)
                horizontalLineToRelative(8f)
                verticalLineTo(9f)
                horizontalLineToRelative(7f)
                verticalLineTo(22f)
                close()
            }
        }.also { _File = it}
