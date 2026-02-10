package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Toothbrush: ImageVector? = null

val Icons.Ts.Toothbrush: ImageVector
    get() = _Toothbrush ?: UXIcon(name = "Toothbrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.5f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(6.5f, 3f)
                curveTo(2.92f, 3f, 0f, 5.92f, 0f, 9.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(-1f)
                lineTo(2.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-9.5f)
                curveToRelative(2.35f, -0.98f, 4f, -3.3f, 4f, -6f)
                close()
                moveTo(6.5f, 4f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.19f, 0f, 2.27f, -0.53f, 3f, -1.36f)
                verticalLineToRelative(0.86f)
                curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                lineTo(1.02f, 9f)
                curveToRelative(0.25f, -2.8f, 2.61f, -5f, 5.48f, -5f)
                close()
                moveTo(11f, 10f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(3f)
                close()
                moveTo(12f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9f)
                close()
                moveTo(4f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9f)
                close()
                moveTo(19f, 19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.52f, 0f, 1.02f, -0.06f, 1.5f, -0.17f)
                verticalLineToRelative(9.18f)
                close()
            }
        }.also { _Toothbrush = it}
