package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DesktopArrowDown: ImageVector? = null

val Icons.Rs.DesktopArrowDown: ImageVector
    get() = _DesktopArrowDown ?: UXIcon(name = "DesktopArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                lineTo(24f, 4f)
                curveToRelative(0f, -0.81f, -0.34f, -1.6f, -0.92f, -2.17f)
                curveToRelative(-0.56f, -0.54f, -1.29f, -0.82f, -2.0f, -0.8f)
                lineToRelative(-6.08f, -0.04f)
                lineToRelative(-0.01f, 2f)
                lineToRelative(6.12f, 0.04f)
                curveToRelative(0.21f, -0.01f, 0.41f, 0.08f, 0.58f, 0.24f)
                curveToRelative(0.19f, 0.19f, 0.31f, 0.45f, 0.31f, 0.72f)
                verticalLineToRelative(9f)
                lineTo(2f, 13f)
                lineTo(2f, 4f)
                curveToRelative(0f, -0.26f, 0.1f, -0.51f, 0.29f, -0.69f)
                curveToRelative(0.19f, -0.19f, 0.45f, -0.29f, 0.79f, -0.28f)
                horizontalLineToRelative(5.92f)
                lineTo(9f, 1.04f)
                lineTo(3.11f, 1.04f)
                curveToRelative(-0.83f, -0.02f, -1.63f, 0.27f, -2.21f, 0.84f)
                curveToRelative(-0.58f, 0.56f, -0.9f, 1.31f, -0.9f, 2.12f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                close()
                moveTo(2f, 15f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(2f)
                lineTo(2f, 17f)
                verticalLineToRelative(-2f)
                close()
                moveTo(11f, 8f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.29f, 3.29f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.2f, -1.41f, -0.58f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.29f, 2.29f)
                close()
            }
        }.also { _DesktopArrowDown = it}
