package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plane: ImageVector? = null

val Icons.Bs.Plane: ImageVector
    get() = _Plane ?: UXIcon(name = "Plane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 9f)
                horizontalLineTo(18.13f)
                lineTo(14.31f, 1.82f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.24f, 0f)
                horizontalLineToRelative(-4.8f)
                lineTo(9.18f, 9f)
                horizontalLineTo(7.02f)
                lineTo(4.89f, 7.29f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.5f, 0.66f)
                arcTo(2.85f, 2.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.35f, 10.79f)
                lineTo(3.58f, 17f)
                horizontalLineTo(9.19f)
                lineToRelative(-3f, 7f)
                horizontalLineToRelative(5.05f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.02f, -1.73f)
                lineTo(18.1f, 17f)
                horizontalLineTo(24f)
                verticalLineTo(12.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 9f)
                close()
                moveTo(10.49f, 3f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.43f, 0.25f)
                lineTo(14.73f, 9f)
                horizontalLineTo(12.32f)
                close()
                moveTo(21f, 14f)
                horizontalLineTo(16.57f)
                lineToRelative(-4.79f, 6.58f)
                lineToRelative(-0.1f, 0.16f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.44f, 0.26f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(3f, -7f)
                horizontalLineTo(5.39f)
                lineTo(3.13f, 9.72f)
                lineTo(5.96f, 12f)
                horizontalLineTo(20.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
            }
        }.also { _Plane = it}
