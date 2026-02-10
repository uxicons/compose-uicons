package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PeopleLine: ImageVector? = null

val Icons.Sr.PeopleLine: ImageVector
    get() = _PeopleLine ?: UXIcon(name = "PeopleLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 8f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveTo(15.79f, 0f, 18f, 0f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(6f, 8f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveTo(3.79f, 0f, 6f, 0f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(23f, 22f)
                horizontalLineToRelative(-5f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                lineTo(1f, 22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(23f, 24f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(1f, 17f)
                lineTo(5.76f, 17f)
                curveToRelative(0.56f, -0.69f, 1.23f, -1.29f, 1.99f, -1.77f)
                curveToRelative(-1.08f, -1.09f, -1.75f, -2.58f, -1.75f, -4.23f)
                curveToRelative(0f, -0.34f, 0.04f, -0.67f, 0.09f, -0.99f)
                curveToRelative(-0.03f, 0f, -0.06f, -0.01f, -0.09f, -0.01f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(24f, 16f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                curveToRelative(-0.03f, 0f, -0.06f, 0.0f, -0.09f, 0.01f)
                curveToRelative(0.06f, 0.33f, 0.09f, 0.66f, 0.09f, 0.99f)
                curveToRelative(0f, 1.65f, -0.67f, 3.15f, -1.75f, 4.23f)
                curveToRelative(0.76f, 0.48f, 1.43f, 1.07f, 1.99f, 1.77f)
                horizontalLineToRelative(4.76f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _PeopleLine = it}
