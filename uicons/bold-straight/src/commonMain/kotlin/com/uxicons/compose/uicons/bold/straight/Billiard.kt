package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Billiard: ImageVector? = null

val Icons.Bs.Billiard: ImageVector
    get() = _Billiard ?: UXIcon(name = "Billiard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, 12f)
                close()
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 9f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -9f)
                close()
                moveTo(12f, 6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -6f)
                close()
                moveTo(15.08f, 11.02f)
                lineTo(12.35f, 16.65f)
                lineTo(9.65f, 15.35f)
                lineTo(11.27f, 12f)
                horizontalLineToRelative(-2.27f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6.08f)
                close()
            }
        }.also { _Billiard = it}
