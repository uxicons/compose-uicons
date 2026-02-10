package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonExclamation: ImageVector? = null

val Icons.Sr.OctagonExclamation: ImageVector
    get() = _OctagonExclamation ?: UXIcon(name = "OctagonExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.24f, 5.27f)
                lineToRelative(-3.52f, -3.52f)
                curveToRelative(-1.13f, -1.13f, -2.64f, -1.76f, -4.24f, -1.76f)
                horizontalLineToRelative(-4.97f)
                curveToRelative(-1.6f, 0f, -3.11f, 0.62f, -4.24f, 1.76f)
                lineToRelative(-3.52f, 3.51f)
                curveToRelative(-1.13f, 1.13f, -1.76f, 2.64f, -1.76f, 4.24f)
                verticalLineToRelative(4.97f)
                curveToRelative(0f, 1.6f, 0.62f, 3.11f, 1.76f, 4.24f)
                lineToRelative(3.52f, 3.52f)
                curveToRelative(1.13f, 1.13f, 2.64f, 1.76f, 4.24f, 1.76f)
                horizontalLineToRelative(4.97f)
                curveToRelative(1.6f, 0f, 3.11f, -0.62f, 4.24f, -1.76f)
                lineToRelative(3.52f, -3.51f)
                curveToRelative(1.13f, -1.13f, 1.76f, -2.64f, 1.76f, -4.24f)
                verticalLineToRelative(-4.97f)
                curveToRelative(0f, -1.6f, -0.62f, -3.11f, -1.76f, -4.24f)
                close()
                moveTo(11f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(11f, 6f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _OctagonExclamation = it}
