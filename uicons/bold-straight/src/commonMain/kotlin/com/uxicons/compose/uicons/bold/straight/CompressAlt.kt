package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompressAlt: ImageVector? = null

val Icons.Bs.CompressAlt: ImageVector
    get() = _CompressAlt ?: UXIcon(name = "CompressAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.12f, 0f)
                lineTo(0f, 2.12f)
                lineToRelative(3.94f, 3.94f)
                lineTo(2f, 8f)
                horizontalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 7f)
                verticalLineTo(2f)
                lineTo(6.06f, 3.94f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 16f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(5f)
                lineToRelative(1.94f, -1.94f)
                lineTo(21.88f, 24f)
                lineTo(24f, 21.88f)
                lineToRelative(-3.94f, -3.94f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 8f)
                horizontalLineToRelative(5f)
                lineTo(20.06f, 6.06f)
                lineTo(24f, 2.12f)
                lineTo(21.88f, 0f)
                lineToRelative(-3.94f, 3.94f)
                lineTo(16f, 2f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 16f)
                horizontalLineTo(2f)
                lineToRelative(1.94f, 1.94f)
                lineTo(0f, 21.88f)
                lineTo(2.12f, 24f)
                lineToRelative(3.94f, -3.94f)
                lineTo(8f, 22f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 16f)
                close()
            }
        }.also { _CompressAlt = it}
