package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrowserUi: ImageVector? = null

val Icons.Ts.BrowserUi: ImageVector
    get() = _BrowserUi ?: UXIcon(name = "BrowserUi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 12f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-8f)
                close()
                moveTo(12f, 17f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(19.5f)
                lineTo(0f, 23f)
                lineTo(0f, 3.5f)
                curveTo(0f, 2.12f, 1.12f, 1f, 2.5f, 1f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(1f, 3.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(22f)
                lineTo(23f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 2f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(23f, 22f)
                verticalLineToRelative(-13f)
                lineTo(1f, 9f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(22f)
                close()
                moveTo(4f, 6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(7f, 6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(10f, 6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _BrowserUi = it}
