package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bird: ImageVector? = null

val Icons.Tr.Bird: ImageVector
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
                curveToRelative(0f, 4.65f, -2.91f, 8.63f, -7f, 10.24f)
                verticalLineToRelative(2.26f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.93f)
                curveToRelative(-0.95f, 0.27f, -1.96f, 0.43f, -3f, 0.43f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.55f)
                curveTo(4.4f, 21.44f, 0f, 16.73f, 0f, 11f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
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
                curveToRelative(0f, 2.25f, 0.76f, 4.33f, 2.02f, 6f)
                horizontalLineToRelative(1.98f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-2.35f)
                curveToRelative(-1.0f, 1.42f, -2.64f, 2.35f, -4.5f, 2.35f)
                reflectiveCurveToRelative(-3.5f, -0.93f, -4.5f, -2.35f)
                verticalLineToRelative(1.35f)
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
