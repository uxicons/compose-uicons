package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MaskSnorkel: ImageVector? = null

val Icons.Rs.MaskSnorkel: ImageVector
    get() = _MaskSnorkel ?: UXIcon(name = "MaskSnorkel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 9.03f)
                curveToRelative(0.42f, 0.23f, 1.29f, 1.35f, 1.9f, 2.46f)
                lineToRelative(0.29f, 0.51f)
                horizontalLineToRelative(1.81f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(17.31f, 0f, 14f, 0f)
                lineTo(6f, 0f)
                curveTo(2.69f, 0f, 0f, 2.69f, 0f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(1.81f)
                lineToRelative(0.29f, -0.51f)
                curveToRelative(0.62f, -1.11f, 1.49f, -2.23f, 1.9f, -2.46f)
                close()
                moveTo(6.65f, 10f)
                horizontalLineToRelative(-0.65f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveTo(3.79f, 2f, 6f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-0.65f)
                curveToRelative(-0.78f, -1.3f, -2.06f, -3f, -3.35f, -3f)
                reflectiveCurveToRelative(-2.57f, 1.7f, -3.35f, 3f)
                close()
                moveTo(24f, 0f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 4.14f, -3.36f, 7.5f, -7.5f, 7.5f)
                reflectiveCurveToRelative(-7.5f, -3.36f, -7.5f, -7.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(22f, 0f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _MaskSnorkel = it}
