package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Student: ImageVector? = null

val Icons.Rs.Student: ImageVector
    get() = _Student ?: UXIcon(name = "Student") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 21.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(7f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(22f, 4.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6.53f)
                lineToRelative(-2f, 1f)
                verticalLineToRelative(2.53f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-2.53f)
                lineToRelative(-3.94f, -1.97f)
                lineTo(10.28f, 0.39f)
                curveToRelative(1.05f, -0.52f, 2.4f, -0.52f, 3.45f, 0f)
                lineToRelative(8.28f, 4.11f)
                close()
                moveTo(6.53f, 4.5f)
                lineToRelative(4.64f, 2.32f)
                curveToRelative(0.48f, 0.24f, 1.18f, 0.24f, 1.66f, 0f)
                lineToRelative(4.64f, -2.32f)
                lineToRelative(-4.64f, -2.32f)
                curveToRelative(-0.48f, -0.24f, -1.18f, -0.24f, -1.66f, 0f)
                lineToRelative(-4.64f, 2.32f)
                close()
                moveTo(16f, 7.47f)
                lineToRelative(-2.28f, 1.14f)
                curveToRelative(-0.52f, 0.26f, -1.12f, 0.39f, -1.72f, 0.39f)
                reflectiveCurveToRelative(-1.2f, -0.13f, -1.72f, -0.39f)
                lineToRelative(-2.28f, -1.14f)
                verticalLineToRelative(1.53f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-1.53f)
                close()
            }
        }.also { _Student = it}
