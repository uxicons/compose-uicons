package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsAltH: ImageVector? = null

val Icons.Ts.ArrowsAltH: ImageVector
    get() = _ArrowsAltH ?: UXIcon(name = "ArrowsAltH") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.39f, 10.56f)
                lineToRelative(-6.39f, -5.85f)
                verticalLineToRelative(6.79f)
                lineTo(7f, 11.5f)
                lineTo(7f, 4.71f)
                lineTo(0.61f, 10.55f)
                curveToRelative(-0.39f, 0.35f, -0.61f, 0.85f, -0.61f, 1.37f)
                reflectiveCurveToRelative(0.22f, 1.02f, 0.61f, 1.37f)
                lineToRelative(6.39f, 5.85f)
                verticalLineToRelative(-6.63f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(6.63f)
                lineToRelative(6.39f, -5.85f)
                curveToRelative(0.39f, -0.35f, 0.61f, -0.85f, 0.61f, -1.37f)
                reflectiveCurveToRelative(-0.22f, -1.02f, -0.61f, -1.36f)
                close()
                moveTo(6f, 16.86f)
                lineTo(1.28f, 12.55f)
                lineToRelative(-0.0f, -0.0f)
                curveToRelative(-0.18f, -0.16f, -0.28f, -0.38f, -0.28f, -0.62f)
                reflectiveCurveToRelative(0.1f, -0.46f, 0.28f, -0.63f)
                lineTo(6f, 6.98f)
                verticalLineToRelative(9.89f)
                close()
                moveTo(22.72f, 12.54f)
                lineToRelative(-4.72f, 4.32f)
                lineTo(18f, 6.98f)
                lineToRelative(4.72f, 4.32f)
                curveToRelative(0.18f, 0.16f, 0.28f, 0.38f, 0.28f, 0.62f)
                reflectiveCurveToRelative(-0.1f, 0.46f, -0.28f, 0.62f)
                close()
            }
        }.also { _ArrowsAltH = it}
