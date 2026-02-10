package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneAlt: ImageVector? = null

val Icons.Ss.PlaneAlt: ImageVector
    get() = _PlaneAlt ?: UXIcon(name = "PlaneAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.81f, 24f)
                horizontalLineTo(8f)
                lineToRelative(3.04f, -9f)
                horizontalLineTo(6f)
                lineTo(4.92f, 16.65f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.41f, 18f)
                horizontalLineTo(0.04f)
                lineToRelative(2.2f, -6f)
                lineTo(0.03f, 6f)
                horizontalLineTo(2.4f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.9f, 7.34f)
                lineTo(6f, 9f)
                horizontalLineToRelative(5.04f)
                lineTo(8f, 0f)
                horizontalLineToRelative(2.81f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.63f, 1.56f)
                lineTo(17.59f, 9f)
                horizontalLineToRelative(3.31f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.07f, 2.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 15f)
                horizontalLineTo(17.59f)
                lineToRelative(-4.15f, 7.44f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.81f, 24f)
                close()
            }
        }.also { _PlaneAlt = it}
