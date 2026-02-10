package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MaskSnorkel: ImageVector? = null

val Icons.Bs.MaskSnorkel: ImageVector
    get() = _MaskSnorkel ?: UXIcon(name = "MaskSnorkel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 10.07f)
                curveToRelative(0.34f, 0.23f, 0.9f, 0.8f, 1.3f, 1.33f)
                lineToRelative(0.45f, 0.6f)
                horizontalLineToRelative(1.75f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(16.31f, 0f, 13f, 0f)
                horizontalLineToRelative(-7f)
                curveTo(2.69f, 0f, 0f, 2.69f, 0f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                lineToRelative(1.75f, -0.0f)
                lineToRelative(0.45f, -0.6f)
                curveToRelative(0.4f, -0.53f, 0.96f, -1.1f, 1.3f, -1.33f)
                close()
                moveTo(6.28f, 9f)
                horizontalLineToRelative(-0.28f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-0.28f)
                curveToRelative(-0.79f, -0.92f, -1.98f, -2f, -3.22f, -2f)
                reflectiveCurveToRelative(-2.43f, 1.08f, -3.22f, 2f)
                close()
                moveTo(24f, 0f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                lineTo(21f, 0f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _MaskSnorkel = it}
