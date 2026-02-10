package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BooksMedical: ImageVector? = null

val Icons.Bs.BooksMedical: ImageVector
    get() = _BooksMedical ?: UXIcon(name = "BooksMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 8f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-8f)
                close()
                moveTo(10f, 24f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                close()
                moveTo(3f, 24f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                lineTo(3f, 19f)
                verticalLineToRelative(5f)
                close()
                moveTo(3f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveTo(20.97f, 7.51f)
                lineToRelative(-4.91f, 0.94f)
                lineToRelative(1.63f, 8.19f)
                lineToRelative(4.91f, -0.94f)
                lineToRelative(-1.63f, -8.19f)
                close()
                moveTo(20.4f, 4.56f)
                lineToRelative(-0.57f, -2.95f)
                curveToRelative(-0.21f, -1.08f, -1.26f, -1.79f, -2.34f, -1.59f)
                lineToRelative(-0.98f, 0.19f)
                curveToRelative(-0.76f, 0.15f, -1.34f, 0.71f, -1.54f, 1.41f)
                curveToRelative(-0.17f, -0.93f, -0.99f, -1.63f, -1.97f, -1.63f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2.03f)
                lineToRelative(0.49f, 2.54f)
                lineToRelative(4.91f, -0.94f)
                close()
                moveTo(23.16f, 18.64f)
                lineToRelative(-4.91f, 0.94f)
                lineToRelative(0.82f, 4.41f)
                lineToRelative(4.91f, -0.94f)
                lineToRelative(-0.82f, -4.41f)
                close()
                moveTo(5.5f, 8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.5f)
                lineTo(0f, 10.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.5f)
                close()
            }
        }.also { _BooksMedical = it}
