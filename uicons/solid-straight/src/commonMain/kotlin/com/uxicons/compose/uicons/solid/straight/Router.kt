package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Router: ImageVector? = null

val Icons.Ss.Router: ImageVector
    get() = _Router ?: UXIcon(name = "Router") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 5f)
                curveToRelative(1.82f, 0f, 3.53f, 0.71f, 4.81f, 1.99f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-0.91f, -0.91f, -2.11f, -1.41f, -3.4f, -1.41f)
                reflectiveCurveToRelative(-2.49f, 0.5f, -3.4f, 1.41f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(1.28f, -1.28f, 2.99f, -1.99f, 4.81f, -1.99f)
                close()
                moveTo(15.5f, 2f)
                curveToRelative(2.65f, 0f, 5.14f, 1.03f, 7.02f, 2.91f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(-2.25f, -2.25f, -5.25f, -3.49f, -8.43f, -3.49f)
                reflectiveCurveToRelative(-6.18f, 1.24f, -8.43f, 3.49f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(1.88f, -1.88f, 4.37f, -2.91f, 7.02f, -2.91f)
                close()
                moveTo(24f, 18f)
                verticalLineToRelative(6f)
                lineTo(0f, 24f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(6f, 19.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(11f, 19.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _Router = it}
