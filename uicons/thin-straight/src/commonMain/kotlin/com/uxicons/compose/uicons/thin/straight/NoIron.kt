package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoIron: ImageVector? = null

val Icons.Ts.NoIron: ImageVector
    get() = _NoIron ?: UXIcon(name = "NoIron") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.71f, 22f)
                horizontalLineToRelative(1.29f)
                lineTo(24f, 7.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                lineTo(8f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(2.5f)
                lineTo(10.71f, 10f)
                lineTo(0.7f, -0.0f)
                lineTo(-0.0f, 0.7f)
                lineTo(23.3f, 24.0f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-1.3f, -1.3f)
                close()
                moveTo(23f, 11f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-1.29f)
                lineTo(11.71f, 11f)
                horizontalLineToRelative(11.29f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(7f, 16f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(17.46f, 21f)
                lineToRelative(1f, 1f)
                lineTo(0f, 22f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -4.45f, 2.92f, -8.22f, 6.95f, -9.52f)
                lineToRelative(0.81f, 0.81f)
                curveToRelative(-3.88f, 1f, -6.76f, 4.52f, -6.76f, 8.71f)
                verticalLineToRelative(1f)
                lineTo(17.46f, 21f)
                close()
            }
        }.also { _NoIron = it}
