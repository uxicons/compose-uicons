package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subtitles: ImageVector? = null

val Icons.Rs.Subtitles: ImageVector
    get() = _Subtitles ?: UXIcon(name = "Subtitles") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(2f, 20f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 11f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 16f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _Subtitles = it}
