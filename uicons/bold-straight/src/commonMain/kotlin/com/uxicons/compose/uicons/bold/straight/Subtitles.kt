package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subtitles: ImageVector? = null

val Icons.Bs.Subtitles: ImageVector
    get() = _Subtitles ?: UXIcon(name = "Subtitles") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                lineTo(3f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 2f)
                close()
                moveTo(21f, 19f)
                lineTo(3f, 19f)
                lineTo(3f, 5f)
                lineTo(21f, 5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 9f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 14f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _Subtitles = it}
