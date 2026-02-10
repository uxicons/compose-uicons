package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plane: ImageVector? = null

val Icons.Ss.Plane: ImageVector
    get() = _Plane ?: UXIcon(name = "Plane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.96f, 8f)
                lineTo(7.64f, 0f)
                horizontalLineTo(10.4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.63f, 1.56f)
                lineTo(16.27f, 8f)
                close()
                moveTo(21f, 10f)
                horizontalLineTo(4.99f)
                lineTo(2.4f, 7.41f)
                arcTo(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.19f, 9.1f)
                lineTo(3.41f, 15f)
                horizontalLineToRelative(7.15f)
                lineTo(7.02f, 24f)
                horizontalLineToRelative(3.06f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, -1.51f)
                lineTo(17.27f, 15f)
                horizontalLineTo(24f)
                verticalLineTo(13f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 10f)
                close()
            }
        }.also { _Plane = it}
