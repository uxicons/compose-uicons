package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _File: ImageVector? = null

val Icons.Ss.File: ImageVector
    get() = _File ?: UXIcon(name = "File") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 0.59f)
                lineToRelative(0f, 4.41f)
                lineToRelative(4.41f, 0f)
                lineToRelative(-4.41f, -4.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 7f)
                verticalLineTo(0f)
                horizontalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                close()
            }
        }.also { _File = it}
