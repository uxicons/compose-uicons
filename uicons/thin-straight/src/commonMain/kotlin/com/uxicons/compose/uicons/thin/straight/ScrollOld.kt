package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScrollOld: ImageVector? = null

val Icons.Ts.ScrollOld: ImageVector
    get() = _ScrollOld ?: UXIcon(name = "ScrollOld") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 18f)
                lineTo(20f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(5f, 5f)
                lineTo(1f, 5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 21f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.77f, -0.29f, -1.47f, -0.77f, -2f)
                horizontalLineToRelative(11.27f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(3f)
                close()
                moveTo(23f, 21f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-10.77f)
                curveToRelative(0.48f, -0.53f, 0.77f, -1.23f, 0.77f, -2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _ScrollOld = it}
