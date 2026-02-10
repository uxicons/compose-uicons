package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MaskSnorkel: ImageVector? = null

val Icons.Sr.MaskSnorkel: ImageVector
    get() = _MaskSnorkel ?: UXIcon(name = "MaskSnorkel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 24f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 4.14f, -3.36f, 7.5f, -7.5f, 7.5f)
                close()
                moveTo(14f, 0f)
                horizontalLineTo(6f)
                curveTo(2.69f, 0f, 0f, 2.69f, 0f, 6f)
                curveToRelative(0f, 3.16f, 2.5f, 6f, 5.5f, 6f)
                curveToRelative(1f, 0f, 1.65f, -0.47f, 2f, -1f)
                curveToRelative(0.59f, -0.88f, 1.5f, -3f, 2.5f, -3f)
                reflectiveCurveToRelative(1.91f, 2.12f, 2.5f, 3f)
                curveToRelative(0.35f, 0.53f, 1f, 1f, 1.94f, 0.98f)
                curveToRelative(3.06f, 0f, 5.56f, -2.82f, 5.56f, -5.98f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                close()
            }
        }.also { _MaskSnorkel = it}
