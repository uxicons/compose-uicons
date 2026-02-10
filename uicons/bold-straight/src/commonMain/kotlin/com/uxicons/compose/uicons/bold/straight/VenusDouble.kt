package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VenusDouble: ImageVector? = null

val Icons.Bs.VenusDouble: ImageVector
    get() = _VenusDouble ?: UXIcon(name = "VenusDouble") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 7.5f)
                arcTo(7.49f, 7.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.01f, 1.51f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 14.85f)
                lineTo(6f, 19f)
                lineTo(4f, 19f)
                verticalLineToRelative(3f)
                lineTo(6f, 22f)
                verticalLineToRelative(2f)
                lineTo(9f, 24f)
                lineTo(9f, 22f)
                horizontalLineToRelative(2f)
                lineTo(11f, 19f)
                lineTo(9f, 19f)
                lineTo(9f, 14.84f)
                arcToRelative(7.52f, 7.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.0f, -1.35f)
                arcTo(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 14.85f)
                lineTo(15f, 19f)
                lineTo(13f, 19f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                lineTo(18f, 22f)
                horizontalLineToRelative(2f)
                lineTo(20f, 19f)
                lineTo(18f, 19f)
                lineTo(18f, 14.85f)
                arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 7.5f)
                close()
                moveTo(3f, 7.5f)
                arcToRelative(4.48f, 4.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, -3.72f)
                arcToRelative(7.44f, 7.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.45f)
                arcTo(4.48f, 4.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 7.5f)
                close()
                moveTo(12f, 7.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16.5f, 12f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7.5f)
                close()
            }
        }.also { _VenusDouble = it}
