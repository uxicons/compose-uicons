package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comment: ImageVector? = null

val Icons.Bs.Comment: ImageVector
    get() = _Comment ?: UXIcon(name = "Comment") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                horizontalLineTo(12.02f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 11.25f)
                lineToRelative(0f, 0.09f)
                close()
                moveTo(12.02f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 18f)
                horizontalLineTo(21f)
                verticalLineTo(11.39f)
                arcTo(9.02f, 9.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.02f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 8f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 14f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-10f)
                close()
            }
        }.also { _Comment = it}
