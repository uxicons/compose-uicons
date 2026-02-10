package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Apps: ImageVector? = null

val Icons.Rs.Apps: ImageVector
    get() = _Apps ?: UXIcon(name = "Apps") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 11f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                horizontalLineToRelative(8f)
                close()
                moveTo(2f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(0f)
                horizontalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(15f, 9f)
                horizontalLineToRelative(7f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 24f)
                horizontalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                close()
                moveTo(2f, 15f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                lineTo(13f, 24f)
                lineTo(13f, 13f)
                lineTo(24f, 13f)
                verticalLineToRelative(8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 24f)
                close()
                moveTo(15f, 22f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(22f, 15f)
                lineTo(15f, 15f)
                close()
            }
        }.also { _Apps = it}
