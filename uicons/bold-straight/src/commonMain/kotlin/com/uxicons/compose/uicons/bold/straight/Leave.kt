package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leave: ImageVector? = null

val Icons.Bs.Leave: ImageVector
    get() = _Leave ?: UXIcon(name = "Leave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(15f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                lineTo(0f, 24f)
                lineTo(0f, 4.7f)
                curveTo(0f, 3.04f, 1.18f, 1.6f, 2.81f, 1.27f)
                lineTo(8.81f, 0.07f)
                curveToRelative(1.03f, -0.21f, 2.09f, 0.06f, 2.91f, 0.73f)
                curveToRelative(0.41f, 0.33f, 0.72f, 0.75f, 0.94f, 1.21f)
                horizontalLineToRelative(1.84f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(10f, 3.5f)
                curveToRelative(0f, -0.21f, -0.12f, -0.33f, -0.18f, -0.39f)
                curveToRelative(-0.07f, -0.06f, -0.21f, -0.14f, -0.41f, -0.1f)
                lineToRelative(-6f, 1.2f)
                curveToRelative(-0.23f, 0.05f, -0.4f, 0.25f, -0.4f, 0.49f)
                verticalLineToRelative(16.3f)
                horizontalLineToRelative(7f)
                lineTo(10f, 3.5f)
                close()
                moveTo(23.66f, 13.79f)
                lineToRelative(-3.71f, -3.79f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.95f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4.95f)
                verticalLineToRelative(3f)
                lineToRelative(3.71f, -3.79f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _Leave = it}
