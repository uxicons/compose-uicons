package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dollar: ImageVector? = null

val Icons.Sr.Dollar: ImageVector
    get() = _Dollar ?: UXIcon(name = "Dollar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.07f, 20f)
                arcTo(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 16.93f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(17f)
                curveToRelative(0f, 0.02f, 0f, 0.04f, 0f, 0.06f)
                arcTo(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.07f, 22f)
                horizontalLineTo(11f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(22f)
                horizontalLineToRelative(0.93f)
                arcToRelative(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, -9.88f)
                lineTo(13f, 11.28f)
                verticalLineTo(4f)
                horizontalLineToRelative(0.93f)
                arcTo(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 7.07f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.02f, 0f, -0.04f, 0f, -0.06f)
                arcTo(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.93f, 2f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(2f)
                horizontalLineToRelative(-0.93f)
                arcToRelative(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, 9.88f)
                lineTo(11f, 12.72f)
                verticalLineTo(20f)
                close()
                moveTo(13f, 13.39f)
                lineToRelative(1.9f, 0.63f)
                arcTo(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.93f, 20f)
                horizontalLineTo(13f)
                close()
                moveTo(9.1f, 9.98f)
                arcTo(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.07f, 4f)
                horizontalLineTo(11f)
                verticalLineToRelative(6.61f)
                close()
            }
        }.also { _Dollar = it}
