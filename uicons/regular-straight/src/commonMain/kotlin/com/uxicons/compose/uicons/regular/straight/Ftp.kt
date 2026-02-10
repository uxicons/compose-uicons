package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ftp: ImageVector? = null

val Icons.Rs.Ftp: ImageVector
    get() = _Ftp ?: UXIcon(name = "Ftp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20f)
                horizontalLineToRelative(-9.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.82f, -1.82f)
                verticalLineToRelative(-3.18f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-5.69f)
                lineToRelative(-2.91f, -2f)
                horizontalLineToRelative(-3.4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.82f, 1.82f)
                horizontalLineToRelative(-9.18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9.18f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.63f, 0f)
                horizontalLineToRelative(9.18f)
                close()
                moveTo(6f, 2f)
                horizontalLineToRelative(2.78f)
                lineToRelative(2.91f, 2f)
                horizontalLineToRelative(6.31f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                close()
                moveTo(5f, 8f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-14f)
                close()
                moveTo(12f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
            }
        }.also { _Ftp = it}
