package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Equipment: ImageVector? = null

val Icons.Ss.Equipment: ImageVector
    get() = _Equipment ?: UXIcon(name = "Equipment") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2.9f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.82f, -5.88f)
                lineToRelative(-1.74f, -0.35f)
                lineToRelative(-2.08f, 3.54f)
                lineToRelative(-1.72f, -1.01f)
                lineToRelative(1.73f, -2.94f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.67f, -0.24f)
                lineToRelative(-3.02f, 1.84f)
                lineToRelative(-1.04f, -1.71f)
                lineToRelative(3.05f, -1.85f)
                lineToRelative(-0.05f, -0.48f)
                horizontalLineToRelative(-3.64f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.44f)
                lineToRelative(-0.14f, -1.42f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.68f, -2.49f)
                lineToRelative(-7.62f, 2.16f)
                verticalLineToRelative(15.76f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                close()
                moveTo(14f, 22f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(7f)
                close()
            }
        }.also { _Equipment = it}
