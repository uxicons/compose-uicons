package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellSchool: ImageVector? = null

val Icons.Rs.BellSchool: ImageVector
    get() = _BellSchool ?: UXIcon(name = "BellSchool") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                close()
                moveTo(24f, 10f)
                arcToRelative(14.02f, 14.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14f, 14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.05f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.91f, -14.47f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.63f, 1.23f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 6.61f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.63f, 1.22f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.91f, 5.4f)
                verticalLineToRelative(2.03f)
                arcToRelative(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.62f, -9.03f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.38f, -2.93f)
                close()
                moveTo(22f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                close()
            }
        }.also { _BellSchool = it}
