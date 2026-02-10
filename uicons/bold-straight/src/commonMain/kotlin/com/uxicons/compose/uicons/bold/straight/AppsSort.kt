package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppsSort: ImageVector? = null

val Icons.Bs.AppsSort: ImageVector
    get() = _AppsSort ?: UXIcon(name = "AppsSort") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 19.06f)
                verticalLineTo(4.92f)
                horizontalLineToRelative(3.99f)
                lineTo(19.46f, 0.4f)
                arcToRelative(1.38f, 1.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.94f, 0f)
                lineTo(12.99f, 4.92f)
                horizontalLineTo(17f)
                verticalLineTo(19.06f)
                horizontalLineTo(12.96f)
                lineToRelative(4.55f, 4.54f)
                arcToRelative(1.38f, 1.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.95f, 0f)
                lineTo(24f, 19.06f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 3f)
                verticalLineToRelative(8f)
                horizontalLineTo(11f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                close()
                moveTo(3f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(8f)
                lineTo(11f, 13f)
                lineTo(0f, 13f)
                close()
                moveTo(3f, 16f)
                lineTo(8f, 16f)
                verticalLineToRelative(5f)
                lineTo(3f, 21f)
                close()
            }
        }.also { _AppsSort = it}
