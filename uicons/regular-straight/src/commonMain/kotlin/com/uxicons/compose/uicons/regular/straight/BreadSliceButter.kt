package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadSliceButter: ImageVector? = null

val Icons.Rs.BreadSliceButter: ImageVector
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
                moveTo(20.5f, 8.58f)
                lineToRelative(-0.5f, 0.29f)
                verticalLineToRelative(12.13f)
                lineTo(4f, 21f)
                verticalLineToRelative(-12.13f)
                lineToRelative(-0.5f, -0.29f)
                curveToRelative(-0.94f, -0.55f, -1.5f, -1.51f, -1.5f, -2.58f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 1.07f, -0.56f, 2.03f, -1.5f, 2.58f)
                close()
                moveTo(13.16f, 8.5f)
                curveToRelative(-0.62f, -0.62f, -1.7f, -0.62f, -2.31f, 0f)
                lineToRelative(-3.35f, 3.35f)
                curveToRelative(-0.31f, 0.31f, -0.48f, 0.72f, -0.48f, 1.16f)
                reflectiveCurveToRelative(0.17f, 0.85f, 0.48f, 1.16f)
                lineToRelative(3.35f, 3.35f)
                curveToRelative(0.31f, 0.31f, 0.72f, 0.48f, 1.16f, 0.48f)
                reflectiveCurveToRelative(0.85f, -0.17f, 1.16f, -0.48f)
                lineToRelative(3.35f, -3.35f)
                curveToRelative(0.31f, -0.31f, 0.48f, -0.72f, 0.48f, -1.16f)
                reflectiveCurveToRelative(-0.17f, -0.85f, -0.48f, -1.16f)
                lineToRelative(-3.35f, -3.35f)
                close()
                moveTo(12.0f, 15.83f)
                lineToRelative(-2.83f, -2.83f)
                lineToRelative(2.83f, -2.83f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(-2.83f, 2.83f)
                close()
            }
        }.also { _BreadSliceButter = it}
