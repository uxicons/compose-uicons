package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kite: ImageVector? = null

val Icons.Bs.Kite: ImageVector
    get() = _Kite ?: UXIcon(name = "Kite") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.9f, 17f)
                arcToRelative(6.09f, 6.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.39f, 1.02f)
                lineTo(11.18f, 20.24f)
                arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 0.76f)
                horizontalLineTo(3.63f)
                arcToRelative(0.62f, 0.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.44f, -1.06f)
                lineTo(4.28f, 18.84f)
                lineTo(18.3f, 15.1f)
                arcTo(3.63f, 3.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 11.6f)
                verticalLineTo(3.63f)
                arcTo(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.37f, 0f)
                horizontalLineTo(9.4f)
                arcTo(3.63f, 3.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.9f, 2.7f)
                lineTo(2.15f, 16.73f)
                lineTo(1.06f, 17.82f)
                arcTo(3.62f, 3.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.63f, 24f)
                horizontalLineTo(8.68f)
                arcToRelative(7.47f, 7.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.16f, -1.26f)
                lineToRelative(3.33f, -2.22f)
                arcTo(3.11f, 3.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 23.11f)
                verticalLineTo(24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.9f)
                arcTo(6.11f, 6.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.9f, 17f)
                close()
                moveTo(8.79f, 3.47f)
                arcToRelative(0.63f, 0.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.12f, -0.23f)
                lineToRelative(4.63f, 4.36f)
                lineTo(17.87f, 3.27f)
                arcToRelative(0.62f, 0.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.13f, 0.37f)
                verticalLineTo(11.6f)
                arcToRelative(0.63f, 0.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.03f, 0.17f)
                lineTo(13.54f, 7.59f)
                lineToRelative(-7.9f, 7.78f)
                lineToRelative(-0.03f, 0.01f)
                close()
            }
        }.also { _Kite = it}
