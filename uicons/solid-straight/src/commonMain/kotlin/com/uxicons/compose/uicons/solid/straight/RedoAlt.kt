package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RedoAlt: ImageVector? = null

val Icons.Ss.RedoAlt: ImageVector
    get() = _RedoAlt ?: UXIcon(name = "RedoAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.32f, 14.72f)
                lineToRelative(4.95f, -4.95f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.54f)
                lineToRelative(-4.95f, -4.95f)
                lineTo(16.9f, 2.7f)
                lineToRelative(4.3f, 4.3f)
                horizontalLineTo(3.1f)
                arcTo(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.95f)
                verticalLineToRelative(11.1f)
                arcTo(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.1f, 24f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(3.1f)
                arcTo(1.03f, 1.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 21.05f)
                verticalLineTo(9.95f)
                arcTo(1.03f, 1.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.1f, 9f)
                horizontalLineTo(21.21f)
                lineToRelative(-4.3f, 4.3f)
                close()
            }
        }.also { _RedoAlt = it}
