package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlugCircleCheck: ImageVector? = null

val Icons.Ts.PlugCircleCheck: ImageVector
    get() = _PlugCircleCheck ?: UXIcon(name = "PlugCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 17f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                lineTo(1f, 7f)
                lineTo(0f, 7f)
                verticalLineToRelative(-1f)
                lineTo(4f, 6f)
                lineTo(4f, 0f)
                horizontalLineToRelative(1f)
                lineTo(5f, 6f)
                horizontalLineToRelative(7f)
                lineTo(12f, 0f)
                horizontalLineToRelative(1f)
                lineTo(13f, 6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.14f)
                curveToRelative(-0.34f, 0.06f, -0.68f, 0.14f, -1f, 0.23f)
                verticalLineToRelative(-2.38f)
                lineTo(2f, 7f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                close()
                moveTo(23f, 17.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                close()
                moveTo(16.98f, 18.95f)
                curveToRelative(-0.06f, 0.06f, -0.18f, 0.06f, -0.24f, -0.01f)
                lineToRelative(-1.86f, -1.8f)
                lineToRelative(-0.7f, 0.72f)
                lineToRelative(1.85f, 1.79f)
                curveToRelative(0.22f, 0.22f, 0.51f, 0.34f, 0.82f, 0.34f)
                reflectiveCurveToRelative(0.6f, -0.12f, 0.82f, -0.34f)
                lineToRelative(3.46f, -3.4f)
                lineToRelative(-0.7f, -0.71f)
                lineToRelative(-3.46f, 3.4f)
                close()
            }
        }.also { _PlugCircleCheck = it}
