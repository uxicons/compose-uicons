package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Glasses: ImageVector? = null

val Icons.Ss.Glasses: ImageVector
    get() = _Glasses ?: UXIcon(name = "Glasses") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0.06f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13.03f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -1.02f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.9f, 4f)
                horizontalLineToRelative(-4.2f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.9f, -4f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 1.02f)
                verticalLineToRelative(-13.03f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                horizontalLineToRelative(2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(19f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.9f, 1f)
                horizontalLineToRelative(4.2f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.9f, -1f)
                verticalLineToRelative(-19f)
                close()
            }
        }.also { _Glasses = it}
