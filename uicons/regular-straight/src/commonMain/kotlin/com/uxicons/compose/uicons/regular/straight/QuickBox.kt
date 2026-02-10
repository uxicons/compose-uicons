package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuickBox: ImageVector? = null

val Icons.Rs.QuickBox: ImageVector
    get() = _QuickBox ?: UXIcon(name = "QuickBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 14f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                close()
                moveTo(6f, 16f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                close()
                moveTo(0f, 22f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(23.97f, 5.42f)
                lineTo(21.6f, 22f)
                horizontalLineToRelative(-15.6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(13.87f)
                lineToRelative(1.57f, -11f)
                horizontalLineToRelative(-5.79f)
                lineToRelative(-0.29f, 2f)
                horizontalLineToRelative(-6.02f)
                lineToRelative(0.29f, -2f)
                horizontalLineToRelative(-5.19f)
                lineToRelative(-0.15f, 1f)
                horizontalLineToRelative(-2.02f)
                lineToRelative(0.73f, -5.0f)
                curveToRelative(0.24f, -1.71f, 1.73f, -3.0f, 3.46f, -3.0f)
                horizontalLineToRelative(14.54f)
                curveToRelative(1.77f, -0.04f, 3.26f, 1.68f, 2.97f, 3.42f)
                close()
                moveTo(9.92f, 7f)
                lineTo(10.35f, 4f)
                horizontalLineToRelative(-4.14f)
                curveToRelative(-0.59f, 0f, -1.1f, 0.44f, -1.19f, 1.03f)
                lineToRelative(-0.29f, 1.97f)
                horizontalLineToRelative(5.19f)
                close()
                moveTo(14.35f, 4f)
                horizontalLineToRelative(-1.98f)
                lineToRelative(-0.71f, 5f)
                horizontalLineToRelative(1.98f)
                close()
                moveTo(21.72f, 7f)
                lineTo(21.99f, 5.14f)
                curveToRelative(0.1f, -0.58f, -0.4f, -1.16f, -0.99f, -1.14f)
                horizontalLineToRelative(-4.63f)
                lineToRelative(-0.43f, 3f)
                close()
                moveTo(13.89f, 16f)
                lineTo(13.6f, 18f)
                horizontalLineToRelative(4.4f)
                lineToRelative(0.29f, -2f)
                close()
            }
        }.also { _QuickBox = it}
