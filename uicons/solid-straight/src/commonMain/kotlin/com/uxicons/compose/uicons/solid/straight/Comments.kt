package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comments: ImageVector? = null

val Icons.Ss.Comments: ImageVector
    get() = _Comments ?: UXIcon(name = "Comments") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 18f)
                horizontalLineTo(0f)
                verticalLineTo(9f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, 9f)
                close()
                moveTo(20f, 9.08f)
                horizontalLineToRelative(0f)
                arcTo(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.08f, 20f)
                horizontalLineToRelative(0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 24f)
                horizontalLineToRelative(8f)
                verticalLineTo(16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 9.08f)
                close()
            }
        }.also { _Comments = it}
