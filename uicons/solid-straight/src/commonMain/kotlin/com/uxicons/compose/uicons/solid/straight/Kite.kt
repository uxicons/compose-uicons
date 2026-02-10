package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kite: ImageVector? = null

val Icons.Ss.Kite: ImageVector
    get() = _Kite ?: UXIcon(name = "Kite") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21.24f)
                verticalLineTo(24f)
                horizontalLineTo(22f)
                verticalLineTo(21.24f)
                arcToRelative(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.54f, -2.29f)
                lineToRelative(-3f, 3f)
                arcTo(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.52f, 24f)
                horizontalLineTo(3.12f)
                arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.92f, 18.67f)
                lineTo(4.1f, 15.48f)
                lineTo(7.64f, 2.23f)
                arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 1.41f)
                lineTo(13.09f, 6.5f)
                lineTo(4.11f, 15.48f)
                lineTo(5.52f, 16.9f)
                lineTo(14.5f, 7.92f)
                lineTo(19.59f, 13f)
                arcToRelative(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.81f, 0.36f)
                lineTo(5.52f, 16.9f)
                lineToRelative(-3.19f, 3.19f)
                arcTo(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.12f, 22f)
                horizontalLineTo(8.52f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.54f, -1.47f)
                lineToRelative(3f, -3f)
                arcTo(5.24f, 5.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 21.24f)
                close()
                moveTo(19.29f, 0.3f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 0f)
                horizontalLineTo(10.54f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.96f, 0.16f)
                lineTo(14.5f, 5.09f)
                close()
                moveTo(20.84f, 11.43f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.16f, -0.96f)
                verticalLineTo(3f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.3f, -1.28f)
                lineTo(15.91f, 6.5f)
                close()
            }
        }.also { _Kite = it}
