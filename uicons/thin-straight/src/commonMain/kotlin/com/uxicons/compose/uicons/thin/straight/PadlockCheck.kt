package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PadlockCheck: ImageVector? = null

val Icons.Ts.PadlockCheck: ImageVector
    get() = _PadlockCheck ?: UXIcon(name = "PadlockCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(17.5f, 23f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(20.44f, 15.55f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(-3.46f, 3.4f)
                curveToRelative(-0.22f, 0.22f, -0.51f, 0.34f, -0.82f, 0.34f)
                reflectiveCurveToRelative(-0.6f, -0.12f, -0.82f, -0.34f)
                lineToRelative(-1.85f, -1.79f)
                lineToRelative(0.7f, -0.72f)
                lineToRelative(1.86f, 1.8f)
                curveToRelative(0.06f, 0.06f, 0.19f, 0.06f, 0.24f, 0.01f)
                lineToRelative(3.46f, -3.4f)
                close()
                moveTo(2.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-12.5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                reflectiveCurveTo(3f, 2.92f, 3f, 6.5f)
                verticalLineToRelative(1.5f)
                lineTo(0f, 8f)
                verticalLineToRelative(13.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(8.85f)
                curveToRelative(-0.38f, -0.3f, -0.72f, -0.64f, -1.04f, -1f)
                lineTo(2.5f, 23f)
                close()
                moveTo(4f, 6.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                verticalLineToRelative(1.5f)
                lineTo(4f, 8f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(9f, 18f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _PadlockCheck = it}
