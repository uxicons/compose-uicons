package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Following: ImageVector? = null

val Icons.Bs.Following: ImageVector
    get() = _Following ?: UXIcon(name = "Following") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 14f)
                horizontalLineTo(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineTo(19f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 14f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 6f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 12f)
                close()
                moveTo(8f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.75f, 7.42f)
                arcTo(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 9.89f)
                arcToRelative(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, -2.48f)
                arcTo(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 9.89f)
                curveToRelative(0f, 2.59f, 4.5f, 5.78f, 4.5f, 5.78f)
                reflectiveCurveTo(24f, 12.48f, 24f, 9.89f)
                arcTo(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.75f, 7.42f)
                close()
            }
        }.also { _Following = it}
