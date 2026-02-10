package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MaskSnorkel: ImageVector? = null

val Icons.Ss.MaskSnorkel: ImageVector
    get() = _MaskSnorkel ?: UXIcon(name = "MaskSnorkel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
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
                moveTo(14f, 0f)
                lineTo(6f, 0f)
                curveTo(2.69f, 0f, 0f, 2.69f, 0f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(1.17f)
                curveToRelative(0.62f, -1.57f, 1.62f, -3.5f, 2.83f, -3.5f)
                reflectiveCurveToRelative(2.21f, 1.93f, 2.83f, 3.5f)
                horizontalLineToRelative(1.17f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(17.31f, 0f, 14f, 0f)
                close()
            }
        }.also { _MaskSnorkel = it}
