package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GreaterThanEqual: ImageVector? = null

val Icons.Sr.GreaterThanEqual: ImageVector
    get() = _GreaterThanEqual ?: UXIcon(name = "GreaterThanEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 24f)
                lineTo(4f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(4.39f, 18.92f)
                lineToRelative(14.58f, -6.26f)
                curveToRelative(1.25f, -0.54f, 2.02f, -1.75f, 2.02f, -3.16f)
                reflectiveCurveToRelative(-0.78f, -2.62f, -2.02f, -3.16f)
                lineTo(4.39f, 0.08f)
                curveToRelative(-0.51f, -0.22f, -1.09f, 0.02f, -1.31f, 0.52f)
                curveToRelative(-0.22f, 0.51f, 0.02f, 1.09f, 0.52f, 1.31f)
                lineToRelative(14.58f, 6.26f)
                curveToRelative(0.6f, 0.26f, 0.81f, 0.85f, 0.81f, 1.32f)
                reflectiveCurveToRelative(-0.21f, 1.06f, -0.81f, 1.32f)
                lineToRelative(-14.58f, 6.26f)
                curveToRelative(-0.51f, 0.22f, -0.74f, 0.81f, -0.52f, 1.31f)
                curveToRelative(0.16f, 0.38f, 0.53f, 0.6f, 0.92f, 0.6f)
                curveToRelative(0.13f, 0f, 0.27f, -0.03f, 0.4f, -0.08f)
                close()
            }
        }.also { _GreaterThanEqual = it}
