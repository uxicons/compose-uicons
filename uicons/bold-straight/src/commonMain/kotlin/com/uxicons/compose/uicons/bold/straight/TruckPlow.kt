package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckPlow: ImageVector? = null

val Icons.Bs.TruckPlow: ImageVector
    get() = _TruckPlow ?: UXIcon(name = "TruckPlow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18.38f)
                verticalLineTo(10.62f)
                lineToRelative(1.81f, -1.81f)
                lineTo(21.69f, 6.69f)
                lineTo(19f, 9.38f)
                verticalLineTo(13f)
                horizontalLineTo(16.96f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.94f, -2.65f)
                lineTo(10.25f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.38f, 2f)
                horizontalLineTo(3f)
                verticalLineToRelative(8.04f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 13.5f)
                verticalLineTo(19f)
                horizontalLineTo(2.05f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.9f, 0f)
                horizontalLineToRelative(3.1f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.9f, 0f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.62f)
                lineToRelative(2.75f, 2.75f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(7.38f, 5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.41f, 0.21f)
                lineTo(11.13f, 10f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                close()
                moveTo(3f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(10f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                close()
            }
        }.also { _TruckPlow = it}
