package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSquareRight: ImageVector? = null

val Icons.Bs.AngleSquareRight: ImageVector
    get() = _AngleSquareRight ?: UXIcon(name = "AngleSquareRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 0f)
                horizontalLineToRelative(17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 3.5f)
                close()
                moveTo(3f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.27f, 10.23f)
                lineToRelative(-4.25f, -4.25f)
                lineTo(8.9f, 8.1f)
                lineToRelative(3.9f, 3.9f)
                lineTo(8.9f, 15.9f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.25f, -4.25f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.54f)
                close()
            }
        }.also { _AngleSquareRight = it}
