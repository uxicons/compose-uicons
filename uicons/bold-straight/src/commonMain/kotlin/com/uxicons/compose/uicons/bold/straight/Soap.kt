package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Soap: ImageVector? = null

val Icons.Bs.Soap: ImageVector
    get() = _Soap ?: UXIcon(name = "Soap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 16f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(22f, 17f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-7f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -8.65f)
                verticalLineToRelative(-3.35f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, -3.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.35f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 8.65f)
                close()
                moveTo(19f, 17f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14f, 0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(14f)
                close()
            }
        }.also { _Soap = it}
