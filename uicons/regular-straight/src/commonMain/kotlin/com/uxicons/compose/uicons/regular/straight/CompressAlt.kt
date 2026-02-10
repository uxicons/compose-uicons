package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompressAlt: ImageVector? = null

val Icons.Rs.CompressAlt: ImageVector
    get() = _CompressAlt ?: UXIcon(name = "CompressAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.41f, 0f)
                lineTo(0f, 1.41f)
                lineTo(4.29f, 5.71f)
                lineTo(2f, 8f)
                horizontalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 7f)
                verticalLineTo(2f)
                lineTo(5.71f, 4.29f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 16f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(5f)
                lineToRelative(2.29f, -2.29f)
                lineTo(22.59f, 24f)
                lineTo(24f, 22.59f)
                lineToRelative(-4.29f, -4.29f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 8f)
                horizontalLineToRelative(5f)
                lineTo(19.71f, 5.71f)
                lineTo(24f, 1.41f)
                lineTo(22.59f, 0f)
                lineTo(18.29f, 4.29f)
                lineTo(16f, 2f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 16f)
                horizontalLineTo(2f)
                lineToRelative(2.29f, 2.29f)
                lineTo(0f, 22.59f)
                lineTo(1.41f, 24f)
                lineToRelative(4.29f, -4.29f)
                lineTo(8f, 22f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 16f)
                close()
            }
        }.also { _CompressAlt = it}
