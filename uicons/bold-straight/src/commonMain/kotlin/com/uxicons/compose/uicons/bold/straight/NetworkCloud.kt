package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NetworkCloud: ImageVector? = null

val Icons.Bs.NetworkCloud: ImageVector
    get() = _NetworkCloud ?: UXIcon(name = "NetworkCloud") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                horizontalLineToRelative(-8.85f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.65f, -1.65f)
                verticalLineToRelative(-3.35f)
                horizontalLineToRelative(2.25f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.88f, -10.43f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.63f, 1.68f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.49f, 8.74f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.35f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.65f, 1.65f)
                horizontalLineToRelative(-8.85f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8.85f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.3f, 0f)
                horizontalLineToRelative(8.85f)
                close()
                moveTo(6f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.44f, -1.5f)
                lineToRelative(2.18f, 0.11f)
                arcToRelative(20.49f, 20.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.62f, -2.61f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.96f, -0.29f)
                lineToRelative(0.17f, 1.43f)
                arcToRelative(12.29f, 12.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.66f, -0.14f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.04f, 4.5f)
                horizontalLineToRelative(-8.25f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, -1.5f)
                close()
            }
        }.also { _NetworkCloud = it}
