package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Second: ImageVector? = null

val Icons.Bs.Second: ImageVector
    get() = _Second ?: UXIcon(name = "Second") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 17f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.01f)
                lineToRelative(-0.01f, -2f)
                horizontalLineToRelative(2.02f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.03f)
                lineToRelative(-0.01f, -2.0f)
                lineToRelative(-3f, 0.01f)
                lineToRelative(0.01f, 2.0f)
                horizontalLineToRelative(-1.97f)
                lineToRelative(-0.01f, -2.0f)
                lineToRelative(-3f, 0.01f)
                lineToRelative(0.01f, 2.0f)
                lineTo(0f, 9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.01f)
                lineToRelative(0.01f, 2f)
                lineTo(0f, 14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.03f)
                lineToRelative(0.01f, 2.0f)
                lineToRelative(3f, -0.01f)
                lineToRelative(-0.01f, -2.0f)
                horizontalLineToRelative(1.97f)
                lineToRelative(0.01f, 2.0f)
                lineToRelative(3f, -0.01f)
                lineToRelative(-0.01f, -2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(5.02f, 14f)
                lineToRelative(-0.01f, -2f)
                horizontalLineToRelative(1.97f)
                lineToRelative(0.01f, 2f)
                horizontalLineToRelative(-1.97f)
                close()
                moveTo(15.64f, 19f)
                horizontalLineToRelative(8.36f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.71f, 2.32f, -4.61f, 4.57f, -6.44f)
                curveToRelative(2.18f, -1.78f, 4.43f, -3.61f, 4.43f, -5.98f)
                curveToRelative(0f, -1.75f, -1.26f, -3.08f, -2.92f, -3.08f)
                curveToRelative(-1.32f, 0f, -2.43f, 0.83f, -2.87f, 2f)
                horizontalLineToRelative(-3.1f)
                curveToRelative(0.51f, -2.84f, 2.99f, -5f, 5.98f, -5f)
                curveToRelative(3.32f, 0f, 5.92f, 2.67f, 5.92f, 6.08f)
                curveToRelative(0f, 3.8f, -2.94f, 6.19f, -5.54f, 8.31f)
                curveToRelative(-1.11f, 0.9f, -2.18f, 1.77f, -2.83f, 2.61f)
                close()
            }
        }.also { _Second = it}
