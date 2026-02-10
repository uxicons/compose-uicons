package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PointerLoading: ImageVector? = null

val Icons.Ss.PointerLoading: ImageVector
    get() = _PointerLoading ?: UXIcon(name = "PointerLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3.74f)
                curveToRelative(0f, -0.38f, -0.12f, -0.75f, -0.35f, -1.05f)
                curveToRelative(-0.57f, -0.74f, -1.65f, -0.92f, -2.41f, -0.34f)
                lineTo(9.96f, 12.09f)
                lineToRelative(5.84f, 0.62f)
                lineToRelative(-3.62f, 7.03f)
                lineToRelative(3.67f, 1.83f)
                lineToRelative(3.71f, -7.14f)
                lineToRelative(4.45f, 4.07f)
                lineTo(24f, 3.74f)
                close()
                moveTo(1.5f, 19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(5.5f, 19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(9.5f, 19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _PointerLoading = it}
