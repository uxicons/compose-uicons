package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bookmark: ImageVector? = null

val Icons.Ss.Bookmark: ImageVector
    get() = _Bookmark ?: UXIcon(name = "Bookmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                horizontalLineTo(4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 3f)
                verticalLineTo(24f)
                lineTo(12f, 13.05f)
                lineTo(23f, 24f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 0f)
                close()
            }
        }.also { _Bookmark = it}
