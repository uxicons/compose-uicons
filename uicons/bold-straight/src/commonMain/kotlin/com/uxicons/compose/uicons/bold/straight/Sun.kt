package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sun: ImageVector? = null

val Icons.Bs.Sun: ImageVector
    get() = _Sun ?: UXIcon(name = "Sun") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13.5f)
                verticalLineToRelative(-3f)
                horizontalLineTo(19.85f)
                arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.24f, -2.99f)
                lineToRelative(2.93f, -2.93f)
                lineTo(19.43f, 2.45f)
                lineTo(16.49f, 5.39f)
                arcTo(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 4.15f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineTo(4.15f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.99f, 1.24f)
                lineTo(4.58f, 2.45f)
                lineTo(2.45f, 4.58f)
                lineTo(5.39f, 7.51f)
                arcTo(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.15f, 10.5f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(4.15f)
                arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.24f, 2.99f)
                lineTo(2.45f, 19.43f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.93f, -2.93f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.99f, 1.24f)
                verticalLineTo(24f)
                horizontalLineToRelative(3f)
                verticalLineTo(19.85f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.99f, -1.24f)
                lineToRelative(2.93f, 2.93f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.93f, -2.93f)
                arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.24f, -2.99f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-6.61f, -0.21f, -6.61f, -9.79f, 0f, -10f)
                curveTo(18.61f, 7.21f, 18.61f, 16.79f, 12f, 17f)
                close()
            }
        }.also { _Sun = it}
