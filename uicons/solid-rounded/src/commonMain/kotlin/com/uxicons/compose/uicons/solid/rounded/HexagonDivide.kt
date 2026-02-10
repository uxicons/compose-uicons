package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonDivide: ImageVector? = null

val Icons.Sr.HexagonDivide: ImageVector
    get() = _HexagonDivide ?: UXIcon(name = "HexagonDivide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.4f, 9.64f)
                lineToRelative(-3.28f, -6f)
                curveToRelative(-0.89f, -1.63f, -2.61f, -2.64f, -4.49f, -2.64f)
                horizontalLineToRelative(-7.23f)
                curveToRelative(-1.88f, 0f, -3.6f, 1.01f, -4.49f, 2.63f)
                lineTo(0.61f, 9.63f)
                curveToRelative(-0.81f, 1.49f, -0.81f, 3.26f, 0.0f, 4.75f)
                lineToRelative(3.29f, 6.0f)
                curveToRelative(0.89f, 1.62f, 2.61f, 2.63f, 4.49f, 2.63f)
                horizontalLineToRelative(7.23f)
                curveToRelative(1.88f, 0f, 3.6f, -1.01f, 4.49f, -2.64f)
                lineToRelative(3.28f, -6f)
                curveToRelative(0.81f, -1.48f, 0.81f, -3.25f, 0f, -4.73f)
                close()
                moveTo(12f, 6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17f, 13f)
                lineTo(7f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _HexagonDivide = it}
