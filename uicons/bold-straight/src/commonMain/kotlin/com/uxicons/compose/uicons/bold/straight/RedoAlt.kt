package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RedoAlt: ImageVector? = null

val Icons.Bs.RedoAlt: ImageVector
    get() = _RedoAlt ?: UXIcon(name = "RedoAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.17f, 15.36f)
                lineToRelative(4.95f, -4.95f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.24f)
                lineToRelative(-4.95f, -4.95f)
                lineTo(16.05f, 3.34f)
                lineTo(19.71f, 7f)
                horizontalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10.5f)
                verticalLineToRelative(10f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 24f)
                horizontalLineTo(22f)
                verticalLineTo(21f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
                verticalLineToRelative(-10f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineTo(19.28f)
                lineToRelative(-3.24f, 3.23f)
                close()
            }
        }.also { _RedoAlt = it}
