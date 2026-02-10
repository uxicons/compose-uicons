package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownToLine: ImageVector? = null

val Icons.Sr.DownToLine: ImageVector
    get() = _DownToLine ?: UXIcon(name = "DownToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 24f)
                lineTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(23f, 22f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(14.77f, 18.86f)
                reflectiveCurveToRelative(6.35f, -6.75f, 6.35f, -6.75f)
                curveToRelative(0.87f, -0.87f, 1.12f, -2.11f, 0.65f, -3.24f)
                curveToRelative(-0.47f, -1.13f, -1.52f, -1.84f, -2.75f, -1.85f)
                horizontalLineToRelative(-2.02f)
                reflectiveCurveToRelative(0f, -4.03f, 0f, -4.03f)
                curveToRelative(0.01f, -1.67f, -1.36f, -3f, -3.02f, -3f)
                horizontalLineToRelative(-3.98f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(4f)
                reflectiveCurveToRelative(-1.87f, 0f, -1.87f, 0f)
                curveToRelative(-1.17f, 0f, -2.3f, 0.61f, -2.81f, 1.66f)
                curveToRelative(-0.57f, 1.18f, -0.34f, 2.51f, 0.54f, 3.4f)
                lineToRelative(6.29f, 6.8f)
                curveToRelative(0.77f, 0.77f, 1.79f, 1.16f, 2.81f, 1.16f)
                reflectiveCurveToRelative(2.03f, -0.39f, 2.81f, -1.16f)
                close()
            }
        }.also { _DownToLine = it}
