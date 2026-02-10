package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _File: ImageVector? = null

val Icons.Bs.File: ImageVector
    get() = _File ?: UXIcon(name = "File") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.4f, 0f)
                horizontalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(22f)
                verticalLineTo(5.66f)
                close()
                moveTo(5f, 21f)
                verticalLineTo(3f)
                horizontalLineToRelative(9f)
                verticalLineTo(8f)
                horizontalLineToRelative(5f)
                verticalLineTo(21f)
                close()
            }
        }.also { _File = it}
