package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LinkHorizontal: ImageVector? = null

val Icons.Ts.LinkHorizontal: ImageVector
    get() = _LinkHorizontal ?: UXIcon(name = "LinkHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 15.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                horizontalLineToRelative(2.45f)
                curveToRelative(-0.05f, 0.35f, -0.15f, 0.69f, -0.3f, 1f)
                horizontalLineToRelative(-2.15f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(5f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                curveToRelative(0f, -2.23f, -1.33f, -4.15f, -3.25f, -5.01f)
                curveToRelative(0.08f, -0.33f, 0.14f, -0.67f, 0.18f, -1.01f)
                curveToRelative(2.38f, 0.97f, 4.06f, 3.3f, 4.06f, 6.02f)
                close()
                moveTo(1f, 8.5f)
                curveTo(1f, 5.47f, 3.47f, 3f, 6.5f, 3f)
                horizontalLineToRelative(5f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-2.15f)
                curveToRelative(-0.15f, 0.31f, -0.25f, 0.65f, -0.3f, 1f)
                horizontalLineToRelative(2.45f)
                curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                horizontalLineTo(6.5f)
                curveTo(2.92f, 2f, 0f, 4.92f, 0f, 8.5f)
                curveToRelative(0f, 2.72f, 1.68f, 5.05f, 4.06f, 6.02f)
                curveToRelative(0.04f, -0.34f, 0.1f, -0.68f, 0.18f, -1.01f)
                curveToRelative(-1.91f, -0.86f, -3.25f, -2.78f, -3.25f, -5.01f)
                close()
            }
        }.also { _LinkHorizontal = it}
