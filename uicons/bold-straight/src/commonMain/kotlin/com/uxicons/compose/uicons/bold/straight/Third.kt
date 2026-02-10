package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Third: ImageVector? = null

val Icons.Bs.Third: ImageVector
    get() = _Third ?: UXIcon(name = "Third") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5.19f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5.19f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                curveToRelative(0f, 1.35f, -0.49f, 2.59f, -1.3f, 3.55f)
                curveToRelative(1.58f, 1.08f, 2.61f, 2.9f, 2.61f, 4.95f)
                close()
                moveTo(9.99f, 16f)
                lineToRelative(0.01f, 2.0f)
                lineToRelative(-3f, 0.01f)
                lineToRelative(-0.01f, -2.0f)
                horizontalLineToRelative(-1.97f)
                lineToRelative(0.01f, 2.0f)
                lineToRelative(-3f, 0.01f)
                lineToRelative(-0.01f, -2.0f)
                lineTo(0f, 16f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.02f)
                lineToRelative(-0.01f, -2f)
                lineTo(0f, 11f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-0.01f, -2.0f)
                lineToRelative(3f, -0.01f)
                lineToRelative(0.01f, 2.0f)
                horizontalLineToRelative(1.97f)
                lineToRelative(-0.01f, -2.0f)
                lineToRelative(3f, -0.01f)
                lineToRelative(0.01f, 2.0f)
                horizontalLineToRelative(2.03f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.02f)
                lineToRelative(0.01f, 2f)
                horizontalLineToRelative(2.01f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(6.99f, 13f)
                lineToRelative(-0.01f, -2f)
                horizontalLineToRelative(-1.97f)
                lineToRelative(0.01f, 2f)
                horizontalLineToRelative(1.97f)
                close()
            }
        }.also { _Third = it}
