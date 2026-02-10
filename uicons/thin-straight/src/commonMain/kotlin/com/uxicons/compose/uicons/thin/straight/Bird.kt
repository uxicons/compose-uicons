package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bird: ImageVector? = null

val Icons.Ts.Bird: ImageVector
    get() = _Bird ?: UXIcon(name = "Bird") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 8f)
                lineToRelative(-2f, 0.86f)
                verticalLineToRelative(2.14f)
                curveToRelative(0f, 4.66f, -2.91f, 8.64f, -7f, 10.25f)
                verticalLineToRelative(2.75f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.42f)
                curveToRelative(-0.95f, 0.27f, -1.96f, 0.42f, -3f, 0.42f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.05f)
                curveTo(4.4f, 21.45f, 0f, 16.73f, 0f, 11f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                verticalLineToRelative(0.14f)
                lineToRelative(2f, 0.86f)
                verticalLineToRelative(1f)
                close()
                moveTo(1f, 11f)
                curveToRelative(0f, 2.25f, 0.75f, 4.33f, 2.0f, 6f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-2.34f)
                curveToRelative(-1.0f, 1.42f, -2.64f, 2.34f, -4.5f, 2.34f)
                reflectiveCurveToRelative(-3.5f, -0.93f, -4.5f, -2.34f)
                verticalLineToRelative(1.34f)
                close()
                moveTo(21f, 6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                horizontalLineToRelative(-1.13f)
                curveToRelative(1.82f, 1.85f, 4.34f, 3f, 7.13f, 3f)
                curveToRelative(5.51f, 0f, 10f, -4.49f, 10f, -10f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _Bird = it}
