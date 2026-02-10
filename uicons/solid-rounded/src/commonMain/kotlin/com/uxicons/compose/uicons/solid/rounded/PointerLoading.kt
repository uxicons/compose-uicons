package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PointerLoading: ImageVector? = null

val Icons.Sr.PointerLoading: ImageVector
    get() = _PointerLoading ?: UXIcon(name = "PointerLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4.34f)
                verticalLineToRelative(12.18f)
                curveToRelative(0f, 1.27f, -1.53f, 1.95f, -2.5f, 1.12f)
                lineToRelative(-2.28f, -2.04f)
                lineToRelative(-2.61f, 5.29f)
                curveToRelative(-0.57f, 1.11f, -2.0f, 1.48f, -3.06f, 0.71f)
                curveToRelative(-0.82f, -0.6f, -1.02f, -1.76f, -0.56f, -2.67f)
                lineToRelative(2.43f, -4.96f)
                lineToRelative(-3.12f, -0.44f)
                curveToRelative(-1.24f, -0.17f, -1.74f, -1.65f, -0.86f, -2.52f)
                lineTo(20.07f, 2.57f)
                curveToRelative(1.54f, -1.31f, 3.93f, -0.23f, 3.93f, 1.77f)
                close()
                moveTo(0f, 20.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(4f, 20.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(8f, 20.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _PointerLoading = it}
