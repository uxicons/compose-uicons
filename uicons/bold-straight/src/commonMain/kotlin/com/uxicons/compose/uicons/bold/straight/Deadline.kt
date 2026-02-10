package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Deadline: ImageVector? = null

val Icons.Bs.Deadline: ImageVector
    get() = _Deadline ?: UXIcon(name = "Deadline") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 7f)
                verticalLineToRelative(4.69f)
                curveToRelative(0.31f, 0.35f, 0.5f, 0.81f, 0.5f, 1.31f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.5f, 0.19f, -0.96f, 0.5f, -1.31f)
                verticalLineToRelative(-4.69f)
                close()
                moveTo(24f, 24f)
                horizontalLineToRelative(-14f)
                lineToRelative(7f, -12f)
                close()
                moveTo(18f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(18f, 20f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                close()
                moveTo(4f, 13f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                curveToRelative(4.46f, -0.01f, 8.11f, 3.7f, 7.99f, 8.16f)
                lineToRelative(2.24f, 3.85f)
                curveToRelative(0.49f, -1.24f, 0.77f, -2.59f, 0.77f, -4.0f)
                curveToRelative(0f, -2.7f, -0.98f, -5.17f, -2.6f, -7.09f)
                lineToRelative(0.66f, -0.73f)
                lineToRelative(0.76f, 0.76f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(0.87f, 0.87f)
                lineToRelative(-0.76f, 0.85f)
                curveToRelative(-1.37f, -0.93f, -2.96f, -1.55f, -4.67f, -1.79f)
                verticalLineToRelative(-2.11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.12f)
                curveToRelative(-1.71f, 0.23f, -3.3f, 0.85f, -4.67f, 1.79f)
                lineToRelative(-0.76f, -0.85f)
                lineToRelative(0.87f, -0.87f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(0.76f, -0.76f)
                lineToRelative(0.66f, 0.73f)
                curveToRelative(-1.62f, 1.92f, -2.6f, 4.39f, -2.6f, 7.09f)
                curveToRelative(0f, 4.69f, 2.96f, 8.7f, 7.11f, 10.28f)
                lineToRelative(1.53f, -2.63f)
                curveToRelative(-3.26f, -1.01f, -5.64f, -4.05f, -5.64f, -7.64f)
                close()
            }
        }.also { _Deadline = it}
