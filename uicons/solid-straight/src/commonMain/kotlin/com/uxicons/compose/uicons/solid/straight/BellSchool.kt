package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellSchool: ImageVector? = null

val Icons.Ss.BellSchool: ImageVector
    get() = _BellSchool ?: UXIcon(name = "BellSchool") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.62f, 5.93f)
                arcToRelative(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.62f, 9.03f)
                verticalLineToRelative(-2.03f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.91f, -5.4f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -9.05f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9.9f, 14.47f)
                verticalLineToRelative(4.05f)
                horizontalLineToRelative(1f)
                arcToRelative(14.02f, 14.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, -14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
                moveTo(10f, 8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                close()
            }
        }.also { _BellSchool = it}
