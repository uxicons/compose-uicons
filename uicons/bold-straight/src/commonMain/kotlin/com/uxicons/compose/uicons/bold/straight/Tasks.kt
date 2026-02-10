package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tasks: ImageVector? = null

val Icons.Bs.Tasks: ImageVector
    get() = _Tasks ?: UXIcon(name = "Tasks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                horizontalLineToRelative(-17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(8.67f, 12.43f)
                lineTo(7.46f, 11.31f)
                lineTo(8.85f, 9.87f)
                lineTo(10.1f, 11.02f)
                lineTo(12.4f, 8.62f)
                lineTo(13.8f, 10.05f)
                lineTo(11.5f, 12.44f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                close()
                moveTo(3.5f, 3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(3f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(20.5f, 20.44f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-1.21f, -1.11f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.24f, 1.15f)
                lineToRelative(2.31f, -2.4f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-2.3f, 2.39f)
                close()
                moveTo(15f, 15f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _Tasks = it}
