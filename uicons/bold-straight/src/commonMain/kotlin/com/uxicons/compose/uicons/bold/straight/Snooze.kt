package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snooze: ImageVector? = null

val Icons.Bs.Snooze: ImageVector
    get() = _Snooze ?: UXIcon(name = "Snooze") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.0f, 21f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3f)
                lineTo(2.14f, 24f)
                curveToRelative(-0.87f, 0f, -1.64f, -0.52f, -1.98f, -1.32f)
                curveToRelative(-0.32f, -0.78f, -0.16f, -1.66f, 0.41f, -2.27f)
                lineToRelative(5.43f, -6.41f)
                lineTo(0f, 14.0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7.86f)
                curveToRelative(0.87f, 0f, 1.64f, 0.52f, 1.98f, 1.32f)
                curveToRelative(0.32f, 0.78f, 0.16f, 1.66f, -0.41f, 2.27f)
                lineToRelative(-5.43f, 6.41f)
                close()
                moveTo(23.52f, 16.13f)
                curveToRelative(0.48f, -0.54f, 0.61f, -1.3f, 0.33f, -1.97f)
                curveToRelative(-0.29f, -0.71f, -0.97f, -1.16f, -1.74f, -1.16f)
                horizontalLineToRelative(-5.12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.78f)
                lineToRelative(-2.31f, 2.87f)
                curveToRelative(-0.48f, 0.54f, -0.61f, 1.3f, -0.33f, 1.97f)
                curveToRelative(0.29f, 0.71f, 0.97f, 1.16f, 1.74f, 1.16f)
                horizontalLineToRelative(5.12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.78f)
                lineToRelative(2.31f, -2.87f)
                close()
                moveTo(18.95f, 7f)
                horizontalLineToRelative(-3.7f)
                lineToRelative(3.23f, -3.73f)
                curveToRelative(0.52f, -0.56f, 0.67f, -1.36f, 0.37f, -2.07f)
                curveToRelative(-0.3f, -0.73f, -1.01f, -1.2f, -1.8f, -1.2f)
                horizontalLineToRelative(-6.05f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.75f)
                lineToRelative(-3.23f, 3.73f)
                curveToRelative(-0.52f, 0.56f, -0.67f, 1.36f, -0.37f, 2.07f)
                curveToRelative(0.3f, 0.73f, 1.01f, 1.2f, 1.8f, 1.2f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Snooze = it}
