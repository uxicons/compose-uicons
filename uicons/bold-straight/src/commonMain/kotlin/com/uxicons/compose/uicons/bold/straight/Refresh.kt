package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Refresh: ImageVector? = null

val Icons.Bs.Refresh: ImageVector
    get() = _Refresh ?: UXIcon(name = "Refresh") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.99f)
                arcToRelative(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.36f, 2.65f)
                lineTo(15.99f, 8.01f)
                horizontalLineToRelative(5.83f)
                arcToRelative(1.15f, 1.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.15f, -1.15f)
                verticalLineTo(1.04f)
                lineTo(20.47f, 3.53f)
                arcTo(11.98f, 11.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                horizontalLineTo(2.99f)
                arcTo(9.02f, 9.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.99f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.01f, 12f)
                arcTo(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.64f, 18.36f)
                lineToRelative(2.37f, -2.37f)
                horizontalLineTo(1.99f)
                arcToRelative(0.96f, 0.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.95f, 0.95f)
                verticalLineToRelative(6.02f)
                lineToRelative(2.49f, -2.49f)
                arcTo(11.98f, 11.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                close()
            }
        }.also { _Refresh = it}
