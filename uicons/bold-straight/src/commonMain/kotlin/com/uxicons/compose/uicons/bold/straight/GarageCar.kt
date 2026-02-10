package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GarageCar: ImageVector? = null

val Icons.Bs.GarageCar: ImageVector
    get() = _GarageCar ?: UXIcon(name = "GarageCar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 22f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(10f, 24f)
                close()
                moveTo(10.23f, 16f)
                lineTo(9.5f, 19f)
                horizontalLineToRelative(5f)
                lineToRelative(-0.73f, -3f)
                close()
                moveTo(24f, 10.13f)
                lineTo(24f, 24f)
                lineTo(17f, 24f)
                lineTo(17f, 20.35f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.23f, -1.51f)
                lineTo(15.68f, 15.4f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.77f, 14f)
                lineTo(10.23f, 14f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.32f, 15.4f)
                lineToRelative(-1.09f, 3.44f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 20.35f)
                lineTo(7f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 10.13f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.31f, 7.45f)
                lineTo(9.9f, 0.72f)
                arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.2f, 0f)
                lineToRelative(8.59f, 6.72f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 10.13f)
                close()
                moveTo(21f, 10.13f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.16f, -0.32f)
                lineToRelative(-8.59f, -6.72f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.51f, 0f)
                lineTo(3.16f, 9.81f)
                arcTo(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 10.13f)
                lineTo(3f, 21f)
                lineTo(5f, 21f)
                lineTo(5f, 12.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 10f)
                horizontalLineToRelative(9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12.5f)
                lineTo(19f, 21f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _GarageCar = it}
