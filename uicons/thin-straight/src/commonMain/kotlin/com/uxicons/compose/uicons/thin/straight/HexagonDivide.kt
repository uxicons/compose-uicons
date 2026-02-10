package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonDivide: ImageVector? = null

val Icons.Ts.HexagonDivide: ImageVector
    get() = _HexagonDivide ?: UXIcon(name = "HexagonDivide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.69f, 10.74f)
                lineToRelative(-4.45f, -8.36f)
                curveToRelative(-0.45f, -0.85f, -1.33f, -1.38f, -2.29f, -1.38f)
                lineTo(7.07f, 1f)
                curveToRelative(-0.96f, 0f, -1.83f, 0.53f, -2.28f, 1.37f)
                lineTo(0.32f, 10.74f)
                curveToRelative(-0.42f, 0.79f, -0.42f, 1.74f, 0f, 2.54f)
                lineToRelative(4.47f, 8.36f)
                curveToRelative(0.45f, 0.85f, 1.33f, 1.37f, 2.28f, 1.37f)
                horizontalLineToRelative(9.89f)
                curveToRelative(0.96f, 0f, 1.83f, -0.53f, 2.29f, -1.38f)
                lineToRelative(4.45f, -8.36f)
                curveToRelative(0.42f, -0.79f, 0.42f, -1.74f, 0f, -2.52f)
                close()
                moveTo(22.8f, 12.79f)
                lineToRelative(-4.45f, 8.36f)
                curveToRelative(-0.28f, 0.52f, -0.81f, 0.85f, -1.4f, 0.85f)
                lineTo(7.07f, 22.0f)
                curveToRelative(-0.59f, 0f, -1.12f, -0.32f, -1.4f, -0.84f)
                lineTo(1.2f, 12.8f)
                curveToRelative(-0.27f, -0.5f, -0.27f, -1.09f, 0f, -1.59f)
                lineTo(5.67f, 2.84f)
                curveToRelative(0.28f, -0.52f, 0.81f, -0.84f, 1.4f, -0.84f)
                horizontalLineToRelative(9.89f)
                curveToRelative(0.59f, 0f, 1.12f, 0.32f, 1.4f, 0.85f)
                lineToRelative(4.45f, 8.36f)
                curveToRelative(0.26f, 0.5f, 0.26f, 1.09f, 0f, 1.59f)
                close()
                moveTo(6f, 11.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                lineTo(6f, 12.5f)
                verticalLineToRelative(-1f)
                close()
                moveTo(12f, 8.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(12f, 15.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _HexagonDivide = it}
