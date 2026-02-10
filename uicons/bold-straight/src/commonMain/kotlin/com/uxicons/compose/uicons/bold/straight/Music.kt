package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Music: ImageVector? = null

val Icons.Bs.Music: ImageVector
    get() = _Music ?: UXIcon(name = "Music") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(11f, 1f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 4f)
                verticalLineToRelative(8.61f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11f, 17.5f)
                verticalLineToRelative(-0.09f)
                horizontalLineToRelative(0f)
                lineTo(11f, 4f)
                lineTo(21f, 4f)
                verticalLineToRelative(8.61f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 17.5f)
                verticalLineToRelative(-0.06f)
                horizontalLineToRelative(0f)
                close()
                moveTo(5.5f, 20f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 20f)
                close()
                moveTo(18.5f, 20f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 21f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 20f)
                close()
            }
        }.also { _Music = it}
