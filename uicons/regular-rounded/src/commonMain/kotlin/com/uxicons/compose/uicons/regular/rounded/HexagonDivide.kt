package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonDivide: ImageVector? = null

val Icons.Rr.HexagonDivide: ImageVector
    get() = _HexagonDivide ?: UXIcon(name = "HexagonDivide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 16.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(12f, 9f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(23.4f, 14.36f)
                lineToRelative(-3.28f, 6f)
                curveToRelative(-0.89f, 1.62f, -2.61f, 2.64f, -4.49f, 2.64f)
                horizontalLineToRelative(-7.23f)
                curveToRelative(-1.88f, 0f, -3.6f, -1.01f, -4.49f, -2.63f)
                lineTo(0.61f, 14.38f)
                curveToRelative(-0.82f, -1.49f, -0.82f, -3.26f, -0.0f, -4.75f)
                lineTo(3.91f, 3.63f)
                curveToRelative(0.89f, -1.62f, 2.61f, -2.63f, 4.49f, -2.63f)
                horizontalLineToRelative(7.23f)
                curveToRelative(1.88f, 0f, 3.6f, 1.01f, 4.49f, 2.64f)
                lineToRelative(3.28f, 6f)
                curveToRelative(0.81f, 1.48f, 0.81f, 3.25f, 0f, 4.73f)
                close()
                moveTo(21.64f, 10.6f)
                lineToRelative(-3.28f, -6f)
                curveToRelative(-0.54f, -0.98f, -1.59f, -1.6f, -2.74f, -1.6f)
                horizontalLineToRelative(-7.23f)
                curveToRelative(-1.15f, 0f, -2.19f, 0.61f, -2.73f, 1.59f)
                lineToRelative(-3.3f, 6.0f)
                curveToRelative(-0.48f, 0.88f, -0.48f, 1.94f, 0f, 2.82f)
                lineToRelative(3.3f, 6.0f)
                curveToRelative(0.54f, 0.98f, 1.59f, 1.59f, 2.73f, 1.59f)
                horizontalLineToRelative(7.23f)
                curveToRelative(1.15f, 0f, 2.2f, -0.61f, 2.73f, -1.59f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                lineToRelative(3.28f, -6f)
                curveToRelative(0.48f, -0.88f, 0.48f, -1.93f, 0f, -2.81f)
                close()
                moveTo(17.0f, 11f)
                lineTo(7f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _HexagonDivide = it}
