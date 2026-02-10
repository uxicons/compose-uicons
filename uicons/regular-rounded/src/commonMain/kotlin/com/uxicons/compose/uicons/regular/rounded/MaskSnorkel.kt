package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MaskSnorkel: ImageVector? = null

val Icons.Rr.MaskSnorkel: ImageVector
    get() = _MaskSnorkel ?: UXIcon(name = "MaskSnorkel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 9.03f)
                curveToRelative(0.17f, 0.1f, 0.6f, 0.45f, 1.34f, 1.54f)
                curveToRelative(0.6f, 0.89f, 1.6f, 1.43f, 2.66f, 1.43f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(17.31f, 0f, 14f, 0f)
                lineTo(6f, 0f)
                curveTo(2.69f, 0f, 0f, 2.69f, 0f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(1.07f, 0f, 2.06f, -0.53f, 2.66f, -1.43f)
                curveToRelative(0.73f, -1.09f, 1.17f, -1.44f, 1.34f, -1.54f)
                close()
                moveTo(7.0f, 9.46f)
                curveToRelative(-0.23f, 0.34f, -0.6f, 0.54f, -1.0f, 0.54f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveTo(3.79f, 2f, 6f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                curveToRelative(-0.4f, 0f, -0.77f, -0.2f, -1.0f, -0.54f)
                curveToRelative(-1.12f, -1.68f, -2.08f, -2.46f, -3.0f, -2.46f)
                reflectiveCurveToRelative(-1.88f, 0.78f, -3.0f, 2.46f)
                close()
                moveTo(24f, 1f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 4.14f, -3.36f, 7.5f, -7.5f, 7.5f)
                reflectiveCurveToRelative(-7.5f, -3.36f, -7.5f, -7.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(22f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _MaskSnorkel = it}
