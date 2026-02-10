package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Diploma: ImageVector? = null

val Icons.Ss.Diploma: ImageVector
    get() = _Diploma ?: UXIcon(name = "Diploma") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 20.44f)
                verticalLineToRelative(3.56f)
                lineToRelative(-2f, -2f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(-3.56f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                close()
                moveTo(14f, 21.46f)
                verticalLineToRelative(0.54f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(8.81f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7f, 9.65f)
                close()
                moveTo(7f, 6f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(7f, 10f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(7f, 14f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _Diploma = it}
