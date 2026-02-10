package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stats: ImageVector? = null

val Icons.Bs.Stats: ImageVector
    get() = _Stats ?: UXIcon(name = "Stats") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 21f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(24f)
                verticalLineTo(21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _Stats = it}
