package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseFlood: ImageVector? = null

val Icons.Ss.HouseFlood: ImageVector
    get() = _HouseFlood ?: UXIcon(name = "HouseFlood") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.01f, 22.63f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22.62f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.01f, 0.01f)
                lineTo(1.5f, 21.32f)
                arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                horizontalLineToRelative(2f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 1.32f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 18f)
                verticalLineTo(16.81f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6f, -0.15f)
                verticalLineTo(18f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 18f)
                verticalLineTo(16.85f)
                curveToRelative(0.14f, -6.82f, 9.76f, -6.85f, 10f, -0.19f)
                verticalLineTo(18f)
                horizontalLineToRelative(7f)
                verticalLineTo(10.09f)
                lineTo(13.34f, 0.49f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.68f, 0f)
                lineTo(0f, 10.09f)
                verticalLineTo(18f)
                close()
            }
        }.also { _HouseFlood = it}
