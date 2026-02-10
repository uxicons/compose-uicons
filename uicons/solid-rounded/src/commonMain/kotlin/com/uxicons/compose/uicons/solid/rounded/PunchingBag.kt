package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PunchingBag: ImageVector? = null

val Icons.Sr.PunchingBag: ImageVector
    get() = _PunchingBag ?: UXIcon(name = "PunchingBag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.09f, 8.15f)
                curveToRelative(-0.12f, -0.17f, -4.79f, -5.65f, -5.09f, -6.01f)
                verticalLineToRelative(-1.13f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.13f)
                reflectiveCurveToRelative(-5.03f, 5.93f, -5.04f, 5.95f)
                curveToRelative(-0.6f, 0.82f, -0.96f, 1.83f, -0.96f, 2.92f)
                horizontalLineToRelative(9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(4f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0f, -1.06f, -0.34f, -2.04f, -0.91f, -2.85f)
                close()
                moveTo(10.34f, 6f)
                lineTo(12f, 4.04f)
                lineTo(13.66f, 6f)
                close()
            }
        }.also { _PunchingBag = it}
