package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Headset: ImageVector? = null

val Icons.Rs.Headset: ImageVector
    get() = _Headset ?: UXIcon(name = "Headset") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 12.42f)
                lineTo(21f, 11f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 11f)
                verticalLineToRelative(1.42f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 22f)
                lineTo(7f, 22f)
                lineTo(7f, 12f)
                lineTo(5f, 12f)
                lineTo(5f, 11f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 0f)
                verticalLineToRelative(1f)
                lineTo(17f, 12f)
                verticalLineToRelative(8f)
                lineTo(13f, 20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -9.58f)
                close()
                moveTo(5f, 20f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6f)
                close()
                moveTo(19f, 20f)
                lineTo(19f, 14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6f)
                close()
            }
        }.also { _Headset = it}
