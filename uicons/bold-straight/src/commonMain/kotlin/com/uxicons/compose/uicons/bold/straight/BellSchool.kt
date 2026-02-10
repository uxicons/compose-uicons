package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellSchool: ImageVector? = null

val Icons.Bs.BellSchool: ImageVector
    get() = _BellSchool ?: UXIcon(name = "BellSchool") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 8f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, -1.5f)
                close()
                moveTo(20.5f, 7f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.19f, 6.98f)
                arcToRelative(11.57f, 11.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.31f, 6.93f)
                verticalLineToRelative(-2.04f)
                arcToRelative(9.49f, 9.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.65f, -3.14f)
                arcToRelative(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.97f, -2.34f)
                arcToRelative(6.49f, 6.49f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.62f, -6.78f)
                arcToRelative(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.34f, -1.94f)
                arcToRelative(9.48f, 9.48f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9.64f, 14.2f)
                verticalLineToRelative(5.13f)
                horizontalLineToRelative(1.5f)
                curveToRelative(8f, 0f, 14.5f, -6.06f, 14.5f, -13.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                close()
            }
        }.also { _BellSchool = it}
