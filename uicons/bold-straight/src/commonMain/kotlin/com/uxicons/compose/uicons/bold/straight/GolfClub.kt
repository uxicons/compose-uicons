package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfClub: ImageVector? = null

val Icons.Bs.GolfClub: ImageVector
    get() = _GolfClub ?: UXIcon(name = "GolfClub") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.02f, 24f)
                horizontalLineTo(4.99f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                verticalLineToRelative(-5.3f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.96f, 8.8f)
                lineTo(19.2f, 11.44f)
                lineTo(21.02f, 0.01f)
                lineToRelative(2.96f, 0.47f)
                lineTo(21.57f, 15.65f)
                arcToRelative(9.53f, 9.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.68f, 2.55f)
                arcTo(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.02f, 24f)
                close()
                moveTo(4.98f, 11.71f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.0f, 2f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(7.03f)
                arcToRelative(6.7f, 6.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.13f, -4f)
                arcTo(6.81f, 6.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.6f, 15.21f)
                lineToRelative(0.13f, -0.8f)
                lineTo(5.38f, 11.75f)
                arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.98f, 11.71f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.14f, 16.63f)
                lineToRelative(0.62f, -2.94f)
                lineToRelative(8.57f, 1.8f)
                lineToRelative(-0.62f, 2.94f)
                close()
            }
        }.also { _GolfClub = it}
