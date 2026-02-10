package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Medicine: ImageVector? = null

val Icons.Ss.Medicine: ImageVector
    get() = _Medicine ?: UXIcon(name = "Medicine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 5f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(12f)
                close()
                moveTo(18f, 9f)
                horizontalLineToRelative(-2.01f)
                lineToRelative(0.01f, -2f)
                horizontalLineToRelative(-7.95f)
                lineToRelative(-0.05f, 2f)
                horizontalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
                moveTo(16f, 17f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _Medicine = it}
