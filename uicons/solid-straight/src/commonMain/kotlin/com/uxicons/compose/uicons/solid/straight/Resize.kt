package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Resize: ImageVector? = null

val Icons.Ss.Resize: ImageVector
    get() = _Resize ?: UXIcon(name = "Resize") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 18f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(10f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4f)
                arcToRelative(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.28f, 0.3f)
                lineToRelative(5.3f, -5.3f)
                horizontalLineToRelative(-3.58f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.59f)
                lineToRelative(-5.3f, 5.3f)
                arcToRelative(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.3f, 1.29f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
            }
        }.also { _Resize = it}
