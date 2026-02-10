package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PointerLoading: ImageVector? = null

val Icons.Rs.PointerLoading: ImageVector
    get() = _PointerLoading ?: UXIcon(name = "PointerLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.62f, 2.74f)
                curveToRelative(-0.6f, -0.79f, -1.76f, -0.98f, -2.57f, -0.36f)
                lineTo(9.04f, 12.75f)
                lineToRelative(5.32f, 0.56f)
                lineToRelative(-2.53f, 4.99f)
                lineToRelative(5.45f, 2.73f)
                lineToRelative(2.65f, -5.17f)
                lineToRelative(4.06f, 3.71f)
                lineTo(24f, 3.85f)
                curveToRelative(0f, -0.4f, -0.13f, -0.8f, -0.38f, -1.11f)
                close()
                moveTo(22f, 15.04f)
                lineToRelative(-2.64f, -2.42f)
                lineToRelative(-2.95f, 5.73f)
                lineToRelative(-1.88f, -0.94f)
                lineToRelative(2.93f, -5.78f)
                lineToRelative(-3.62f, -0.39f)
                lineToRelative(8.16f, -7.05f)
                lineTo(22f, 15.04f)
                close()
                moveTo(3f, 20.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(7f, 20.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(11f, 20.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _PointerLoading = it}
