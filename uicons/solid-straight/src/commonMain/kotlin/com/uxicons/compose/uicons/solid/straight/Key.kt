package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Key: ImageVector? = null

val Icons.Ss.Key: ImageVector
    get() = _Key ?: UXIcon(name = "Key") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 0f)
                horizontalLineToRelative(-1.44f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 0.88f)
                lineToRelative(-8.53f, 8.52f)
                arcToRelative(7.52f, 7.52f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.68f, 4.68f)
                lineToRelative(2.4f, -2.4f)
                verticalLineToRelative(-3.68f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.55f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.45f, -1.56f)
                verticalLineToRelative(-1.44f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                close()
                moveTo(5.5f, 20f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 1.5f)
                close()
            }
        }.also { _Key = it}
