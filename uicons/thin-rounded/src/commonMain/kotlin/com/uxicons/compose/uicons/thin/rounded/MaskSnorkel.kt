package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MaskSnorkel: ImageVector? = null

val Icons.Tr.MaskSnorkel: ImageVector
    get() = _MaskSnorkel ?: UXIcon(name = "MaskSnorkel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.57f, 10.48f)
                curveToRelative(0.44f, 0.92f, 1.4f, 1.52f, 2.43f, 1.52f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(18.31f, 0f, 15f, 0f)
                lineTo(6f, 0f)
                curveTo(2.69f, 0f, 0f, 2.69f, 0f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6.03f, 6f)
                curveToRelative(1.05f, 0f, 2.01f, -0.61f, 2.44f, -1.54f)
                curveToRelative(0.34f, -0.73f, 1.06f, -1.96f, 2.03f, -1.96f)
                curveToRelative(0.98f, 0f, 1.72f, 1.24f, 2.07f, 1.98f)
                close()
                moveTo(7.57f, 10.03f)
                curveToRelative(-0.27f, 0.59f, -0.88f, 0.97f, -1.57f, 0.97f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(3.24f, 1f, 6f, 1f)
                horizontalLineToRelative(9f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                curveToRelative(-0.65f, 0f, -1.25f, -0.37f, -1.53f, -0.95f)
                curveToRelative(-0.8f, -1.67f, -1.82f, -2.55f, -2.97f, -2.55f)
                reflectiveCurveToRelative(-2.16f, 0.88f, -2.93f, 2.53f)
                close()
                moveTo(24f, 0.5f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                lineTo(23f, 0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _MaskSnorkel = it}
