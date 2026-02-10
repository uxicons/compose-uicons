package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Schedule: ImageVector? = null

val Icons.Bs.Schedule: ImageVector
    get() = _Schedule ?: UXIcon(name = "Schedule") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 2f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-18.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(9.38f, 9.78f)
                lineTo(10.8f, 8.37f)
                lineTo(12.01f, 9.58f)
                lineTo(13.2f, 8.39f)
                lineTo(14.61f, 9.8f)
                lineTo(13.42f, 10.99f)
                lineTo(14.65f, 12.22f)
                lineTo(13.23f, 13.63f)
                lineTo(12.01f, 12.41f)
                lineTo(10.78f, 13.63f)
                lineTo(9.37f, 12.22f)
                lineTo(10.59f, 10.99f)
                close()
                moveTo(3.6f, 19.02f)
                lineTo(5.63f, 16.9f)
                lineTo(7.03f, 18.33f)
                lineTo(5.01f, 20.44f)
                lineTo(5.0f, 20.45f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-1.21f, -1.11f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.24f, 1.15f)
                close()
                moveTo(16.97f, 19.31f)
                lineTo(18.36f, 17.87f)
                lineTo(19.6f, 19.02f)
                lineTo(21.63f, 16.9f)
                lineTo(23.03f, 18.33f)
                lineTo(21.01f, 20.44f)
                lineTo(21.0f, 20.45f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-1.21f, -1.11f)
                close()
                moveTo(16f, 15.0f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _Schedule = it}
