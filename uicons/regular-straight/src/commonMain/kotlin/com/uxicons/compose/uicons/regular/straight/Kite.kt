package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kite: ImageVector? = null

val Icons.Rs.Kite: ImageVector
    get() = _Kite ?: UXIcon(name = "Kite") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.76f, 16f)
                arcToRelative(5.21f, 5.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.71f, 1.53f)
                lineToRelative(-3f, 3f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.52f, 22f)
                lineTo(3.12f, 22f)
                arcToRelative(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.79f, -1.91f)
                lineTo(5.52f, 16.9f)
                lineToRelative(13.25f, -3.54f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 10.46f)
                lineTo(21f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(10.54f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.9f, 2.23f)
                lineTo(4.1f, 15.48f)
                lineTo(0.92f, 18.67f)
                arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.12f, 24f)
                lineTo(8.52f, 24f)
                arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, -2.05f)
                lineToRelative(3f, -3f)
                arcTo(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 21.24f)
                lineTo(22f, 24f)
                horizontalLineToRelative(2f)
                lineTo(24f, 21.24f)
                arcTo(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.76f, 16f)
                close()
                moveTo(19f, 3.42f)
                verticalLineToRelative(6.17f)
                lineTo(15.91f, 6.5f)
                close()
                moveTo(14.5f, 5.09f)
                lineTo(11.41f, 2f)
                horizontalLineToRelative(6.17f)
                close()
                moveTo(18.07f, 11.48f)
                lineTo(8.34f, 14.07f)
                lineTo(14.5f, 7.92f)
                close()
                moveTo(9.52f, 2.93f)
                lineTo(13.09f, 6.5f)
                lineTo(6.92f, 12.66f)
                close()
            }
        }.also { _Kite = it}
