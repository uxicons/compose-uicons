package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tasks: ImageVector? = null

val Icons.Ss.Tasks: ImageVector
    get() = _Tasks ?: UXIcon(name = "Tasks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.21f, 19.43f)
                lineToRelative(-1.21f, -1.11f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.24f, 1.15f)
                lineToRelative(2.31f, -2.4f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-2.3f, 2.39f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                close()
                moveTo(0f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                close()
                moveTo(0f, 24f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-17f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(10.53f, 11.44f)
                lineTo(10.54f, 11.44f)
                lineTo(12.84f, 9.05f)
                lineTo(11.44f, 7.62f)
                lineTo(9.13f, 10.02f)
                lineTo(7.89f, 8.87f)
                lineTo(6.5f, 10.31f)
                lineTo(7.71f, 11.42f)
                curveToRelative(0.77f, 0.77f, 2.08f, 0.76f, 2.82f, 0.02f)
                close()
                moveTo(14f, 14f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(-17f)
                horizontalLineToRelative(-10f)
                close()
            }
        }.also { _Tasks = it}
