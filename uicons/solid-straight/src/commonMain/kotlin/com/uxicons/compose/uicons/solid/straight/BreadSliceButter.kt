package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadSliceButter: ImageVector? = null

val Icons.Ss.BreadSliceButter: ImageVector
    get() = _BreadSliceButter ?: UXIcon(name = "BreadSliceButter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 1f)
                lineTo(5f, 1f)
                curveTo(2.24f, 1f, 0f, 3.24f, 0f, 6f)
                curveToRelative(0f, 1.56f, 0.75f, 3.04f, 2f, 3.98f)
                verticalLineToRelative(13.02f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-13.02f)
                curveToRelative(1.25f, -0.94f, 2f, -2.42f, 2f, -3.98f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(16.5f, 14.16f)
                lineToRelative(-3.35f, 3.35f)
                curveToRelative(-0.31f, 0.31f, -0.72f, 0.48f, -1.16f, 0.48f)
                reflectiveCurveToRelative(-0.85f, -0.17f, -1.16f, -0.48f)
                lineToRelative(-3.35f, -3.35f)
                curveToRelative(-0.31f, -0.31f, -0.48f, -0.72f, -0.48f, -1.16f)
                reflectiveCurveToRelative(0.17f, -0.85f, 0.48f, -1.16f)
                lineToRelative(3.35f, -3.35f)
                curveToRelative(0.62f, -0.62f, 1.69f, -0.62f, 2.31f, 0f)
                lineToRelative(3.35f, 3.35f)
                curveToRelative(0.31f, 0.31f, 0.48f, 0.72f, 0.48f, 1.16f)
                reflectiveCurveToRelative(-0.17f, 0.85f, -0.48f, 1.16f)
                close()
                moveTo(12f, 10.17f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(-2.83f, 2.83f)
                lineToRelative(-2.83f, -2.83f)
                lineToRelative(2.83f, -2.83f)
                close()
            }
        }.also { _BreadSliceButter = it}
