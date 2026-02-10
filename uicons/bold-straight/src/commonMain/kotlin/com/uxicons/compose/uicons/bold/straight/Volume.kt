package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Volume: ImageVector? = null

val Icons.Bs.Volume: ImageVector
    get() = _Volume ?: UXIcon(name = "Volume") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                lineTo(5.21f, 18.5f)
                lineTo(13f, 23.64f)
                lineTo(13f, 0.36f)
                lineTo(5.21f, 5.5f)
                close()
                moveTo(10f, 5.94f)
                lineTo(10f, 18.06f)
                lineTo(6.11f, 15.5f)
                lineTo(3f, 15.5f)
                verticalLineToRelative(-7f)
                lineTo(6.11f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 8.82f)
                verticalLineToRelative(7.36f)
                arcToRelative(3.68f, 3.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -7.36f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.86f, 3.37f)
                verticalLineToRelative(3f)
                arcToRelative(6.14f, 6.14f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 12.27f)
                verticalLineToRelative(3f)
                arcToRelative(9.14f, 9.14f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -18.27f)
                close()
            }
        }.also { _Volume = it}
