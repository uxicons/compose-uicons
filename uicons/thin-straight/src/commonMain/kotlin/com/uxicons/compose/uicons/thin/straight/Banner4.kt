package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banner4: ImageVector? = null

val Icons.Ts.Banner4: ImageVector
    get() = _Banner4 ?: UXIcon(name = "Banner4") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.05f, 14f)
                lineToRelative(-3.17f, -4f)
                lineToRelative(3.17f, -4f)
                horizontalLineToRelative(-9.05f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                lineTo(-0.05f, 6f)
                lineToRelative(3.17f, 4f)
                lineTo(-0.05f, 14f)
                horizontalLineToRelative(5.05f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(5.05f)
                close()
                moveTo(19.61f, 10f)
                lineToRelative(2.38f, 3f)
                horizontalLineToRelative(-2.99f)
                verticalLineToRelative(-3.71f)
                lineToRelative(-2.29f, -2.29f)
                horizontalLineToRelative(5.28f)
                lineToRelative(-2.37f, 3f)
                close()
                moveTo(2.01f, 13f)
                lineToRelative(2.38f, -3f)
                lineToRelative(-2.38f, -3f)
                horizontalLineToRelative(5.28f)
                lineToRelative(-2.29f, 2.29f)
                verticalLineToRelative(3.71f)
                horizontalLineToRelative(-2.99f)
                close()
                moveTo(6f, 17f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(7f)
                lineTo(6f, 17f)
                close()
            }
        }.also { _Banner4 = it}
