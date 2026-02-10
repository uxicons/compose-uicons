package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dollar: ImageVector? = null

val Icons.Ss.Dollar: ImageVector
    get() = _Dollar ?: UXIcon(name = "Dollar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 8f)
                lineTo(19f, 7.07f)
                arcTo(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.93f, 2f)
                lineTo(13f, 2f)
                lineTo(13f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 2f)
                horizontalLineToRelative(-0.93f)
                arcToRelative(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, 9.88f)
                lineTo(11f, 12.72f)
                lineTo(11f, 20f)
                horizontalLineToRelative(-0.93f)
                arcTo(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 16.93f)
                lineTo(7f, 16f)
                lineTo(5f, 16f)
                verticalLineToRelative(0.93f)
                arcTo(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.07f, 22f)
                lineTo(11f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(13f, 22f)
                horizontalLineToRelative(0.93f)
                arcToRelative(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, -9.88f)
                lineTo(13f, 11.28f)
                lineTo(13f, 4f)
                horizontalLineToRelative(0.93f)
                arcTo(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 7.07f)
                lineTo(17f, 8f)
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
