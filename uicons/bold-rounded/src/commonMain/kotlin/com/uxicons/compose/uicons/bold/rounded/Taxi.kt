package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Taxi: ImageVector? = null

val Icons.Br.Taxi: ImageVector
    get() = _Taxi ?: UXIcon(name = "Taxi") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 10f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -1.5f)
            horizontalLineTo(21.03f)
            lineToRelative(-0.78f, -2.63f)
            arcTo(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.6f, 2.05f)
            arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.12f, 0f)
            horizontalLineToRelative(-0.23f)
            arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.4f, 2.04f)
            arcTo(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.69f, 5.89f)
            lineTo(2.92f, 8.5f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(0.53f)
            lineToRelative(-0.48f, 1.63f)
            arcTo(4.46f, 4.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 20.72f)
            verticalLineTo(22f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
            verticalLineTo(21f)
            horizontalLineTo(17f)
            verticalLineToRelative(1f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
            verticalLineTo(20.72f)
            arcToRelative(4.46f, 4.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.39f, -7.65f)
            verticalLineToRelative(0f)
            lineTo(21.92f, 11.5f)
            horizontalLineToRelative(0.58f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 10f)
            close()
            moveTo(6.56f, 6.76f)
            arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.95f, 5f)
            horizontalLineTo(15f)
            arcToRelative(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.38f, 1.74f)
            lineTo(18.94f, 12f)
            horizontalLineTo(5.01f)
            close()
            moveTo(19.5f, 18f)
            horizontalLineTo(4.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineTo(5f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(15f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(15f)
            horizontalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
        }
    }.also { _Taxi = it }
