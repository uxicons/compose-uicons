package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Garage: ImageVector? = null

val Icons.Bs.Garage: ImageVector
    get() = _Garage ?: UXIcon(name = "Garage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.69f, 7.45f)
                lineTo(14.1f, 0.72f)
                arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.2f, 0f)
                lineTo(1.31f, 7.45f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10.13f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 10.13f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.69f, 7.45f)
                close()
                moveTo(16f, 21f)
                lineTo(8f, 21f)
                lineTo(8f, 13f)
                horizontalLineToRelative(8f)
                close()
                moveTo(21f, 21f)
                lineTo(19f, 21f)
                lineTo(19f, 13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(8f, 10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(8f)
                lineTo(3f, 21f)
                lineTo(3f, 10.13f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.16f, -0.32f)
                lineToRelative(8.59f, -6.72f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.51f, 0f)
                lineToRelative(8.59f, 6.72f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.16f, 0.32f)
                close()
            }
        }.also { _Garage = it}
