package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Router: ImageVector? = null

val Icons.Rs.Router: ImageVector
    get() = _Router ?: UXIcon(name = "Router") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 15f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                lineTo(3f, 15f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveTo(15.5f, 5f)
                curveToRelative(1.82f, 0f, 3.53f, 0.71f, 4.81f, 1.99f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-0.91f, -0.91f, -2.11f, -1.41f, -3.4f, -1.41f)
                reflectiveCurveToRelative(-2.49f, 0.5f, -3.4f, 1.41f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(1.28f, -1.28f, 2.99f, -1.99f, 4.81f, -1.99f)
                close()
                moveTo(8.48f, 4.91f)
                lineToRelative(-1.41f, -1.41f)
                curveTo(9.32f, 1.24f, 12.31f, 0f, 15.5f, 0f)
                reflectiveCurveToRelative(6.18f, 1.24f, 8.43f, 3.49f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-1.88f, -1.88f, -4.37f, -2.91f, -7.02f, -2.91f)
                reflectiveCurveToRelative(-5.14f, 1.03f, -7.02f, 2.91f)
                close()
                moveTo(6f, 19.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(10f, 19.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Router = it}
