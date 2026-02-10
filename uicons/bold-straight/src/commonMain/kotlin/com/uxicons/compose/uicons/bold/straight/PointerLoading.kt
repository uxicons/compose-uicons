package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PointerLoading: ImageVector? = null

val Icons.Bs.PointerLoading: ImageVector
    get() = _PointerLoading ?: UXIcon(name = "PointerLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.55f, 3.7f)
                curveToRelative(-0.35f, -0.46f, -0.89f, -0.78f, -1.47f, -0.86f)
                curveToRelative(-0.57f, -0.08f, -1.12f, 0.06f, -1.63f, 0.46f)
                lineTo(9.4f, 12.85f)
                lineToRelative(6.1f, 0.65f)
                lineToRelative(-3.03f, 5.97f)
                lineToRelative(3.83f, 1.92f)
                lineToRelative(3.12f, -6.08f)
                lineToRelative(4.57f, 4.18f)
                lineTo(24.0f, 5.02f)
                curveToRelative(0f, -0.48f, -0.16f, -0.95f, -0.45f, -1.32f)
                close()
                moveTo(21f, 12.68f)
                lineToRelative(-2.0f, -1.83f)
                lineToRelative(-2.4f, -0.26f)
                lineToRelative(4.4f, -3.8f)
                verticalLineToRelative(5.89f)
                close()
                moveTo(3f, 19.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(7f, 19.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(11f, 19.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _PointerLoading = it}
