package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsAltV: ImageVector? = null

val Icons.Ts.ArrowsAltV: ImageVector
    get() = _ArrowsAltV ?: UXIcon(name = "ArrowsAltV") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 7f)
                horizontalLineToRelative(6.79f)
                lineTo(13.45f, 0.61f)
                curveToRelative(-0.7f, -0.78f, -2.04f, -0.78f, -2.74f, -0.0f)
                lineTo(4.87f, 7f)
                horizontalLineToRelative(6.63f)
                verticalLineToRelative(10f)
                lineTo(4.87f, 17f)
                lineToRelative(5.85f, 6.39f)
                curveToRelative(0.35f, 0.39f, 0.85f, 0.61f, 1.37f, 0.61f)
                reflectiveCurveToRelative(1.02f, -0.22f, 1.36f, -0.61f)
                lineToRelative(5.85f, -6.39f)
                horizontalLineToRelative(-6.79f)
                lineTo(12.5f, 7f)
                close()
                moveTo(11.45f, 1.28f)
                lineToRelative(0.0f, -0.0f)
                curveToRelative(0.32f, -0.36f, 0.92f, -0.36f, 1.25f, 0.0f)
                lineToRelative(4.32f, 4.72f)
                lineTo(7.13f, 6f)
                lineTo(11.45f, 1.28f)
                close()
                moveTo(12.7f, 22.72f)
                curveToRelative(-0.32f, 0.36f, -0.93f, 0.36f, -1.25f, 0f)
                lineToRelative(-4.32f, -4.72f)
                horizontalLineToRelative(9.89f)
                lineToRelative(-4.32f, 4.72f)
                close()
            }
        }.also { _ArrowsAltV = it}
