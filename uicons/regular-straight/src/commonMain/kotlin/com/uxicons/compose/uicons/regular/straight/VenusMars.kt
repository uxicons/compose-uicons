package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VenusMars: ImageVector? = null

val Icons.Rs.VenusMars: ImageVector
    get() = _VenusMars ?: UXIcon(name = "VenusMars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 0f)
                lineTo(18f, 0f)
                lineTo(18f, 2f)
                horizontalLineToRelative(2.59f)
                lineToRelative(-2.4f, 2.4f)
                arcToRelative(6.94f, 6.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.69f, -0.45f)
                arcTo(6.99f, 6.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 16.92f)
                lineTo(6f, 19f)
                lineTo(3f, 19f)
                verticalLineToRelative(2f)
                lineTo(6f, 21f)
                verticalLineToRelative(3f)
                lineTo(8f, 24f)
                lineTo(8f, 21f)
                horizontalLineToRelative(3f)
                lineTo(11f, 19f)
                lineTo(8f, 19f)
                lineTo(8f, 16.93f)
                arcToRelative(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.49f, -0.88f)
                arcTo(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.6f, 5.82f)
                lineToRelative(2.4f, -2.4f)
                lineTo(22f, 6f)
                horizontalLineToRelative(2f)
                lineTo(24f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 0f)
                close()
                moveTo(2f, 10f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.79f, 5.34f)
                arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.31f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 10f)
                close()
                moveTo(14f, 15f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, -5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 15f)
                close()
            }
        }.also { _VenusMars = it}
