package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenField: ImageVector? = null

val Icons.Sr.PenField: ImageVector
    get() = _PenField ?: UXIcon(name = "PenField") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.27f, 7.48f)
                lineTo(20.08f, 0.67f)
                curveToRelative(0.9f, -0.9f, 2.35f, -0.9f, 3.25f, 0f)
                reflectiveCurveToRelative(0.9f, 2.35f, 0f, 3.25f)
                lineToRelative(-6.81f, 6.81f)
                curveToRelative(-0.81f, 0.81f, -1.92f, 1.27f, -3.06f, 1.27f)
                horizontalLineToRelative(-1.46f)
                verticalLineToRelative(-1.46f)
                curveToRelative(0f, -1.15f, 0.46f, -2.25f, 1.27f, -3.06f)
                close()
                moveTo(20.75f, 9.33f)
                lineToRelative(-2.81f, 2.81f)
                curveToRelative(-1.19f, 1.19f, -2.8f, 1.85f, -4.48f, 1.85f)
                horizontalLineToRelative(-2.46f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.46f)
                curveToRelative(0f, -0.53f, 0.07f, -1.04f, 0.2f, -1.54f)
                horizontalLineToRelative(-5.2f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.14f, -1.36f, -3.96f, -3.25f, -4.67f)
                close()
                moveTo(5.5f, 17.96f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(10.5f, 17.96f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _PenField = it}
