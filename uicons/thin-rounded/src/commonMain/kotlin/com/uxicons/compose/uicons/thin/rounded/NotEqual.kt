package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotEqual: ImageVector? = null

val Icons.Tr.NotEqual: ImageVector
    get() = _NotEqual ?: UXIcon(name = "NotEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-13.34f)
                lineToRelative(-3.21f, 6.72f)
                curveToRelative(-0.09f, 0.18f, -0.27f, 0.28f, -0.45f, 0.28f)
                curveToRelative(-0.07f, 0f, -0.15f, -0.02f, -0.22f, -0.05f)
                curveToRelative(-0.25f, -0.12f, -0.35f, -0.42f, -0.23f, -0.67f)
                lineToRelative(3.0f, -6.28f)
                horizontalLineTo(0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(9.03f)
                lineToRelative(3.83f, -8f)
                horizontalLineTo(0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13.34f)
                lineTo(17.05f, 0.28f)
                curveToRelative(0.12f, -0.25f, 0.42f, -0.35f, 0.67f, -0.23f)
                curveToRelative(0.25f, 0.12f, 0.35f, 0.42f, 0.23f, 0.67f)
                lineToRelative(-3.0f, 6.28f)
                horizontalLineToRelative(8.55f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-9.03f)
                lineToRelative(-3.83f, 8f)
                horizontalLineToRelative(12.86f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _NotEqual = it}
