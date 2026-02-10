package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subtitles: ImageVector? = null

val Icons.Br.Subtitles: ImageVector
    get() = _Subtitles ?: UXIcon(name = "Subtitles") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 22f)
            horizontalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16.5f)
            verticalLineToRelative(-9f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 2f)
            horizontalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 7.5f)
            verticalLineToRelative(9f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 22f)
            close()
            moveTo(5.5f, 5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 7.5f)
            verticalLineToRelative(9f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 19f)
            horizontalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 16.5f)
            verticalLineToRelative(-9f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 12f)
            horizontalLineToRelative(-6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 17f)
            horizontalLineToRelative(-6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 10.5f)
            moveToRelative(-1.5f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 15.51f)
            moveToRelative(-1.5f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
        }
    }.also { _Subtitles = it }
