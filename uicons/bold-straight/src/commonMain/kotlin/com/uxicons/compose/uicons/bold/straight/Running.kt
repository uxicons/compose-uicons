package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Running: ImageVector? = null

val Icons.Bs.Running: ImageVector
    get() = _Running ?: UXIcon(name = "Running") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.5f)
                close()
                moveTo(18.68f, 10f)
                lineTo(16.23f, 7.2f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.59f, 6f)
                horizontalLineTo(5.17f)
                lineToRelative(-2.94f, 4.71f)
                lineTo(4.77f, 12.3f)
                lineTo(6.83f, 9f)
                horizontalLineTo(9.5f)
                lineTo(8.24f, 12.08f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.43f, 4.32f)
                lineTo(14f, 18.87f)
                verticalLineTo(24f)
                horizontalLineToRelative(3f)
                verticalLineTo(17.13f)
                lineTo(12.56f, 14.6f)
                lineToRelative(1.99f, -4.76f)
                lineTo(17.32f, 13f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                close()
                moveTo(7.39f, 17.03f)
                lineToRelative(-0.4f, 0.97f)
                horizontalLineTo(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(9f)
                lineToRelative(0.89f, -2.16f)
                lineToRelative(-1.22f, -0.69f)
                arcTo(5.88f, 5.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.39f, 17.03f)
                close()
            }
        }.also { _Running = it}
