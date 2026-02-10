package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NetworkCloud: ImageVector? = null

val Icons.Ss.NetworkCloud: ImageVector
    get() = _NetworkCloud ?: UXIcon(name = "NetworkCloud") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20f)
                horizontalLineToRelative(-9.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.82f, -1.82f)
                verticalLineToRelative(-4.18f)
                horizontalLineToRelative(3f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.79f, -9.94f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.79f, 1.44f)
                arcToRelative(5.15f, 5.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.04f, 0.62f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.96f, 7.88f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.82f, 1.82f)
                horizontalLineToRelative(-9.18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9.18f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.63f, 0f)
                horizontalLineToRelative(9.18f)
                close()
            }
        }.also { _NetworkCloud = it}
