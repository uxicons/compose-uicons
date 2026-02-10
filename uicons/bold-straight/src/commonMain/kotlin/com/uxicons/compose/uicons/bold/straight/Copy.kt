package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Copy: ImageVector? = null

val Icons.Bs.Copy: ImageVector
    get() = _Copy ?: UXIcon(name = "Copy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 19f)
                horizontalLineToRelative(-19f)
                verticalLineToRelative(-15.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, -3.5f)
                horizontalLineToRelative(12f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3.5f)
                close()
                moveTo(3f, 16f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-12.5f)
                arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
                horizontalLineToRelative(-12f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                close()
                moveTo(21f, 5.05f)
                verticalLineToRelative(15.95f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(-15.5f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3.45f)
                close()
            }
        }.also { _Copy = it}
