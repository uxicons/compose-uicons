package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rv: ImageVector? = null

val Icons.Rs.Rv: ImageVector
    get() = _Rv ?: UXIcon(name = "Rv") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                lineTo(4f, 1f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                lineTo(0f, 15.41f)
                lineToRelative(3f, 3f)
                lineTo(3f, 19.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                lineTo(10f, 19f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                lineTo(22f, 19f)
                horizontalLineToRelative(2f)
                lineTo(24f, 14.06f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.66f, -2.48f)
                lineTo(20.72f, 7f)
                lineTo(24f, 7f)
                close()
                moveTo(2f, 7f)
                lineTo(8f, 7f)
                lineTo(8f, 9f)
                lineTo(2f, 9f)
                close()
                moveTo(8f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                lineTo(5f, 19f)
                lineTo(8f, 19f)
                close()
                moveTo(20f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                lineTo(17f, 19f)
                horizontalLineToRelative(3f)
                close()
                moveTo(22f, 17f)
                lineTo(15f, 17f)
                lineTo(15f, 13f)
                horizontalLineToRelative(6.8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.2f, 1.06f)
                close()
                moveTo(15f, 11f)
                lineTo(15f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(2.42f)
                lineToRelative(2.29f, 4f)
                close()
                moveTo(16f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(9f)
                lineTo(4.41f, 17f)
                lineTo(2f, 14.59f)
                lineTo(2f, 11f)
                horizontalLineToRelative(8f)
                lineTo(10f, 5f)
                lineTo(2f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 3f)
                lineTo(20f, 3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                close()
            }
        }.also { _Rv = it}
