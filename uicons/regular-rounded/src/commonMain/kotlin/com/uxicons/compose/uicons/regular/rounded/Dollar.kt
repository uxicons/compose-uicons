package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dollar: ImageVector? = null

val Icons.Rr.Dollar: ImageVector
    get() = _Dollar ?: UXIcon(name = "Dollar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.93f, 4f)
                arcTo(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 7.07f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(19f, 7f)
                curveToRelative(0f, -0.02f, 0f, -0.04f, 0f, -0.06f)
                arcTo(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.93f, 2f)
                lineTo(13f, 2f)
                lineTo(13f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineTo(11f, 2f)
                horizontalLineToRelative(-0.93f)
                arcToRelative(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, 9.88f)
                lineTo(11f, 12.72f)
                lineTo(11f, 20f)
                horizontalLineToRelative(-0.93f)
                arcTo(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 16.93f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineTo(5f, 17f)
                curveToRelative(0f, 0.02f, 0f, 0.04f, 0f, 0.06f)
                arcTo(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.07f, 22f)
                lineTo(11f, 22f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(13f, 22f)
                horizontalLineToRelative(0.93f)
                arcToRelative(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, -9.88f)
                lineTo(13f, 11.28f)
                lineTo(13f, 4f)
                close()
                moveTo(14.9f, 14.02f)
                arcTo(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.93f, 20f)
                lineTo(13f, 20f)
                lineTo(13f, 13.39f)
                close()
                moveTo(11f, 10.61f)
                lineTo(9.1f, 9.98f)
                arcTo(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.07f, 4f)
                lineTo(11f, 4f)
                close()
            }
        }.also { _Dollar = it}
