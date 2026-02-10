package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuickBox: ImageVector? = null

val Icons.Ts.QuickBox: ImageVector
    get() = _QuickBox ?: UXIcon(name = "QuickBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 14f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                close()
                moveTo(6f, 17f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                close()
                moveTo(0f, 22f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(23.97f, 4.98f)
                lineTo(21.54f, 22f)
                horizontalLineToRelative(-15.54f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(14.68f)
                lineToRelative(1.86f, -13f)
                horizontalLineToRelative(-7.31f)
                lineToRelative(-0.29f, 2f)
                horizontalLineToRelative(-5.01f)
                lineToRelative(0.29f, -2f)
                horizontalLineToRelative(-6.76f)
                lineToRelative(-0.43f, 3f)
                horizontalLineToRelative(-1.01f)
                lineToRelative(0.92f, -6.42f)
                curveToRelative(0.21f, -1.47f, 1.49f, -2.58f, 2.97f, -2.58f)
                horizontalLineToRelative(15.49f)
                curveToRelative(1.54f, -0.04f, 2.84f, 1.46f, 2.58f, 2.98f)
                close()
                moveTo(10.35f, 7f)
                lineTo(10.92f, 3f)
                horizontalLineToRelative(-5.03f)
                curveToRelative(-0.99f, 0f, -1.84f, 0.74f, -1.98f, 1.72f)
                lineToRelative(-0.33f, 2.28f)
                horizontalLineToRelative(6.76f)
                close()
                moveTo(14.92f, 3f)
                horizontalLineToRelative(-2.99f)
                lineToRelative(-0.86f, 6f)
                horizontalLineToRelative(2.99f)
                close()
                moveTo(22.68f, 7f)
                lineTo(22.98f, 4.84f)
                curveToRelative(0.16f, -0.94f, -0.64f, -1.86f, -1.59f, -1.84f)
                horizontalLineToRelative(-5.46f)
                lineToRelative(-0.57f, 4f)
                horizontalLineToRelative(7.31f)
                close()
                moveTo(13.74f, 17f)
                lineTo(13.6f, 18f)
                horizontalLineToRelative(4.4f)
                lineToRelative(0.14f, -1f)
                close()
            }
        }.also { _QuickBox = it}
