package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Algorithm: ImageVector? = null

val Icons.Bs.Algorithm: ImageVector
    get() = _Algorithm ?: UXIcon(name = "Algorithm") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 8.5f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                close()
                moveTo(19f, 15f)
                verticalLineToRelative(3f)
                lineTo(5.24f, 18f)
                curveToRelative(-0.07f, -0.08f, -0.15f, -0.16f, -0.23f, -0.23f)
                lineTo(5f, 5.24f)
                curveToRelative(0.08f, -0.07f, 0.16f, -0.15f, 0.23f, -0.23f)
                horizontalLineToRelative(13.53f)
                curveToRelative(0.55f, 0.61f, 1.35f, 1f, 2.23f, 1f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                curveToRelative(-1.31f, 0f, -2.42f, 0.83f, -2.83f, 2f)
                lineTo(5.83f, 2f)
                curveToRelative(-0.41f, -1.17f, -1.52f, -2f, -2.83f, -2f)
                curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
                curveToRelative(0f, 1.31f, 0.83f, 2.42f, 2f, 2.83f)
                verticalLineToRelative(11.34f)
                curveToRelative(-1.17f, 0.41f, -2f, 1.52f, -2f, 2.83f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                curveToRelative(1.31f, 0f, 2.42f, -0.83f, 2.83f, -2f)
                horizontalLineToRelative(13.17f)
                verticalLineToRelative(3f)
                lineToRelative(4.21f, -3.79f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-4.21f, -3.79f)
                close()
            }
        }.also { _Algorithm = it}
