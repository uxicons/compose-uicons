package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckCouch: ImageVector? = null

val Icons.Bs.TruckCouch: ImageVector
    get() = _TruckCouch ?: UXIcon(name = "TruckCouch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 3f)
                horizontalLineTo(24f)
                verticalLineTo(0f)
                horizontalLineTo(20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 3.5f)
                verticalLineTo(16.36f)
                lineTo(4.1f, 19.94f)
                lineToRelative(-0.72f, -2.88f)
                lineTo(15f, 13.98f)
                verticalLineTo(7.26f)
                lineToRelative(-0.15f, -0.61f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.28f, -2.54f)
                lineTo(4.63f, 5.72f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.54f, 4.24f)
                lineToRelative(0.54f, 2.16f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.1f, 16.37f)
                lineToRelative(1.1f, 4.38f)
                lineTo(0.1f, 21.05f)
                lineToRelative(0.8f, 2.89f)
                lineToRelative(16.27f, -4.52f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20.5f, 17f)
                arcToRelative(3.43f, 3.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.04f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 3f)
                close()
                moveTo(5.39f, 8.62f)
                lineToRelative(5.94f, -1.61f)
                arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.38f, 0.06f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.23f, 0.3f)
                lineToRelative(1.01f, 4.05f)
                lineTo(6.01f, 13.24f)
                lineTo(5f, 9.24f)
                arcTo(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.39f, 8.62f)
                close()
            }
        }.also { _TruckCouch = it}
