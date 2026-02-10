package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square3: ImageVector? = null

val Icons.Ts.Square3: ImageVector
    get() = _Square3 ?: UXIcon(name = "Square3") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 23f)
                close()
                moveTo(17f, 14.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 0.93f, -0.43f, 1.75f, -1.1f, 2.3f)
                curveToRelative(1.23f, 0.54f, 2.1f, 1.77f, 2.1f, 3.2f)
                close()
            }
        }.also { _Square3 = it}
