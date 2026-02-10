package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaravanAlt: ImageVector? = null

val Icons.Rs.CaravanAlt: ImageVector
    get() = _CaravanAlt ?: UXIcon(name = "CaravanAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19f)
                lineTo(22f, 19f)
                lineTo(22f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(3f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                lineTo(0f, 21f)
                lineTo(4.14f, 21f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.72f, 0f)
                lineTo(24f, 21f)
                close()
                moveTo(2f, 8f)
                lineTo(7f, 8f)
                verticalLineToRelative(3f)
                lineTo(2f, 11f)
                close()
                moveTo(8f, 22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 22f)
                close()
                moveTo(8f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.86f, 3f)
                lineTo(2f, 19f)
                lineTo(2f, 13f)
                lineTo(9f, 13f)
                lineTo(9f, 6f)
                lineTo(2f, 6f)
                lineTo(2f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                lineTo(19f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                lineTo(20f, 19f)
                lineTo(11.86f, 19f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 16f)
                close()
                moveTo(18f, 6f)
                lineTo(11f, 6f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                close()
                moveTo(16f, 11f)
                lineTo(13f, 11f)
                lineTo(13f, 8f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _CaravanAlt = it}
