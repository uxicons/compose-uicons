package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Interlining: ImageVector? = null

val Icons.Bs.Interlining: ImageVector
    get() = _Interlining ?: UXIcon(name = "Interlining") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 4f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 11f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 18f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                lineTo(5.3f, 3.3f)
                arcToRelative(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.59f, 0f)
                lineTo(0f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                horizontalLineTo(0f)
                lineToRelative(3.67f, 3.67f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.58f, 0f)
                lineTo(8.92f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                close()
            }
        }.also { _Interlining = it}
