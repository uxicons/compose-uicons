package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessThanEqual: ImageVector? = null

val Icons.Rr.LessThanEqual: ImageVector
    get() = _LessThanEqual ?: UXIcon(name = "LessThanEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(4f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(20.39f, 17.08f)
                lineToRelative(-14.58f, -6.26f)
                curveToRelative(-0.6f, -0.26f, -0.81f, -0.85f, -0.81f, -1.32f)
                reflectiveCurveToRelative(0.21f, -1.06f, 0.81f, -1.32f)
                lineTo(20.39f, 1.92f)
                curveToRelative(0.51f, -0.22f, 0.74f, -0.81f, 0.52f, -1.31f)
                curveToRelative(-0.22f, -0.51f, -0.81f, -0.74f, -1.31f, -0.52f)
                lineTo(5.02f, 6.34f)
                curveToRelative(-1.25f, 0.54f, -2.02f, 1.75f, -2.02f, 3.16f)
                reflectiveCurveToRelative(0.78f, 2.62f, 2.02f, 3.16f)
                lineToRelative(14.58f, 6.26f)
                curveToRelative(0.13f, 0.06f, 0.26f, 0.08f, 0.39f, 0.08f)
                curveToRelative(0.39f, 0f, 0.76f, -0.23f, 0.92f, -0.6f)
                curveToRelative(0.22f, -0.51f, -0.02f, -1.1f, -0.52f, -1.31f)
                close()
            }
        }.also { _LessThanEqual = it}
