package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Student: ImageVector? = null

val Icons.Bs.Student: ImageVector
    get() = _Student ?: UXIcon(name = "Student") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 22.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(7f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                close()
                moveTo(22f, 4.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6.02f)
                lineToRelative(-1f, 0.5f)
                verticalLineToRelative(2.51f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-2.51f)
                lineToRelative(-3.96f, -1.98f)
                lineTo(10.23f, 0.41f)
                curveToRelative(1.07f, -0.53f, 2.46f, -0.54f, 3.53f, -0.0f)
                lineToRelative(8.24f, 4.1f)
                close()
                moveTo(8.75f, 4.5f)
                lineToRelative(2.83f, 1.41f)
                curveToRelative(0.23f, 0.12f, 0.61f, 0.12f, 0.84f, 0f)
                lineToRelative(2.83f, -1.41f)
                lineToRelative(-2.83f, -1.41f)
                curveToRelative(-0.23f, -0.12f, -0.61f, -0.12f, -0.85f, 0f)
                lineToRelative(-2.82f, 1.41f)
                close()
                moveTo(15f, 7.98f)
                lineToRelative(-1.24f, 0.62f)
                curveToRelative(-0.54f, 0.27f, -1.15f, 0.4f, -1.76f, 0.4f)
                reflectiveCurveToRelative(-1.23f, -0.13f, -1.76f, -0.4f)
                lineToRelative(-1.24f, -0.62f)
                verticalLineToRelative(1.01f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1.01f)
                close()
            }
        }.also { _Student = it}
