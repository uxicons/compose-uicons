package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stars: ImageVector? = null

val Icons.Ts.Stars: ImageVector
    get() = _Stars ?: UXIcon(name = "Stars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.98f, 23.97f)
                lineToRelative(-0.74f, -0.56f)
                lineToRelative(2.85f, -7.59f)
                lineTo(0f, 11.97f)
                verticalLineToRelative(-0.97f)
                lineTo(7.74f, 11f)
                lineTo(9.97f, 3f)
                horizontalLineToRelative(1.07f)
                lineToRelative(2.23f, 8f)
                horizontalLineToRelative(7.74f)
                verticalLineToRelative(0.97f)
                lineToRelative(-6.08f, 3.85f)
                lineToRelative(2.85f, 7.6f)
                lineToRelative(-0.79f, 0.54f)
                lineToRelative(-6.49f, -4.93f)
                lineToRelative(-6.52f, 4.93f)
                close()
                moveTo(10.5f, 17.79f)
                lineToRelative(5.72f, 4.34f)
                lineToRelative(-2.52f, -6.72f)
                lineToRelative(5.38f, -3.41f)
                horizontalLineToRelative(-6.58f)
                lineToRelative(-2.0f, -7.19f)
                lineToRelative(-2.0f, 7.19f)
                lineTo(1.92f, 12f)
                lineToRelative(5.38f, 3.41f)
                lineToRelative(-2.51f, 6.69f)
                lineToRelative(5.71f, -4.31f)
                close()
                moveTo(22.03f, 8.71f)
                lineToRelative(-2.53f, -1.64f)
                lineToRelative(-2.53f, 1.64f)
                lineToRelative(-0.64f, -0.48f)
                lineToRelative(0.81f, -2.7f)
                lineToRelative(-2.14f, -1.72f)
                verticalLineToRelative(-0.74f)
                lineToRelative(0.5f, -0.06f)
                horizontalLineToRelative(2.54f)
                lineToRelative(1.05f, -3f)
                horizontalLineToRelative(0.71f)
                lineToRelative(0.21f, 0.33f)
                lineToRelative(0.94f, 2.67f)
                horizontalLineToRelative(3.04f)
                verticalLineToRelative(0.8f)
                lineToRelative(-2.14f, 1.72f)
                lineToRelative(0.81f, 2.7f)
                lineToRelative(-0.64f, 0.48f)
                close()
                moveTo(19.5f, 5.88f)
                lineToRelative(1.77f, 1.15f)
                lineToRelative(-0.56f, -1.86f)
                lineToRelative(1.45f, -1.17f)
                horizontalLineToRelative(-1.92f)
                lineToRelative(-0.74f, -2.13f)
                lineToRelative(-0.75f, 2.13f)
                horizontalLineToRelative(-1.92f)
                lineToRelative(1.45f, 1.17f)
                lineToRelative(-0.56f, 1.85f)
                lineToRelative(1.77f, -1.15f)
                close()
            }
        }.also { _Stars = it}
