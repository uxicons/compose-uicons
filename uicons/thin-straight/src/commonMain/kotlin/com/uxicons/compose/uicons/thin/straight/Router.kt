package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Router: ImageVector? = null

val Icons.Ts.Router: ImageVector
    get() = _Router ?: UXIcon(name = "Router") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 16f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                lineTo(2.5f, 16f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(15.5f, 5f)
                curveToRelative(1.69f, 0f, 3.27f, 0.66f, 4.46f, 1.85f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-1.0f, -1.0f, -2.33f, -1.55f, -3.75f, -1.55f)
                reflectiveCurveToRelative(-2.75f, 0.55f, -3.75f, 1.55f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(1.19f, -1.19f, 2.77f, -1.85f, 4.46f, -1.85f)
                close()
                moveTo(8.13f, 4.05f)
                lineToRelative(-0.71f, -0.71f)
                curveTo(9.58f, 1.19f, 12.45f, 0f, 15.5f, 0f)
                reflectiveCurveToRelative(5.92f, 1.19f, 8.08f, 3.35f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-1.97f, -1.97f, -4.59f, -3.05f, -7.37f, -3.05f)
                reflectiveCurveToRelative(-5.4f, 1.08f, -7.37f, 3.05f)
                close()
                moveTo(5f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(9f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Router = it}
