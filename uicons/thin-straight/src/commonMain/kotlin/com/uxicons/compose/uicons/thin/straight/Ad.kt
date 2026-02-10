package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ad: ImageVector? = null

val Icons.Ts.Ad: ImageVector
    get() = _Ad ?: UXIcon(name = "Ad") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2f)
                lineTo(2.5f, 2f)
                curveTo(1.12f, 2f, 0f, 3.12f, 0f, 4.5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 21f)
                lineTo(1f, 21f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 21f)
                close()
                moveTo(19f, 12.05f)
                curveToRelative(-0.64f, -0.65f, -1.52f, -1.05f, -2.5f, -1.05f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.98f, 0f, 1.86f, -0.4f, 2.5f, -1.05f)
                verticalLineToRelative(1.05f)
                horizontalLineToRelative(1f)
                lineTo(20f, 6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6.05f)
                close()
                moveTo(16.5f, 17f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(3.5f, 18f)
                horizontalLineToRelative(1.06f)
                lineToRelative(1.08f, -3f)
                horizontalLineToRelative(4.75f)
                lineToRelative(1.1f, 3f)
                horizontalLineToRelative(1.06f)
                lineTo(8f, 5.5f)
                lineTo(3.5f, 18f)
                close()
                moveTo(6.0f, 14f)
                lineToRelative(2.0f, -5.53f)
                lineToRelative(2.03f, 5.53f)
                lineTo(6.0f, 14f)
                close()
            }
        }.also { _Ad = it}
