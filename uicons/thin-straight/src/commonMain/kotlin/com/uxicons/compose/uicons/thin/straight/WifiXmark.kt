package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiXmark: ImageVector? = null

val Icons.Ts.WifiXmark: ImageVector
    get() = _WifiXmark ?: UXIcon(name = "WifiXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 5.87f)
                curveToRelative(-2.08f, 0.73f, -4.0f, 1.92f, -5.61f, 3.52f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(1.8f, -1.8f, 3.96f, -3.11f, 6.31f, -3.88f)
                verticalLineToRelative(1.06f)
                close()
                moveTo(17f, 4.81f)
                verticalLineToRelative(1.06f)
                curveToRelative(2.08f, 0.73f, 4.0f, 1.92f, 5.61f, 3.52f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(-1.8f, -1.8f, -3.96f, -3.11f, -6.31f, -3.88f)
                close()
                moveTo(8.65f, 8.55f)
                lineToRelative(3.35f, -3.35f)
                lineToRelative(3.35f, 3.35f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.35f, -3.35f)
                lineToRelative(3.35f, -3.35f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.35f, 3.35f)
                lineTo(8.65f, 0.45f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.35f, 3.35f)
                lineToRelative(-3.35f, 3.35f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(14f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(13f, 20f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(5.64f, 13.64f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(1.51f, -1.51f, 3.52f, -2.34f, 5.66f, -2.34f)
                reflectiveCurveToRelative(4.15f, 0.83f, 5.66f, 2.34f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(-1.7f, -1.7f, -3.96f, -2.64f, -6.36f, -2.64f)
                reflectiveCurveToRelative(-4.66f, 0.94f, -6.36f, 2.64f)
                close()
            }
        }.also { _WifiXmark = it}
