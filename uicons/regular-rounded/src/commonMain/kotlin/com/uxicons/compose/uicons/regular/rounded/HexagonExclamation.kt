package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonExclamation: ImageVector? = null

val Icons.Rr.HexagonExclamation: ImageVector
    get() = _HexagonExclamation ?: UXIcon(name = "HexagonExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.34f, 9.48f)
                lineToRelative(-3.5f, -6f)
                curveToRelative(-0.89f, -1.53f, -2.55f, -2.48f, -4.32f, -2.48f)
                horizontalLineToRelative(-7.07f)
                curveToRelative(-1.77f, 0f, -3.43f, 0.95f, -4.32f, 2.48f)
                lineTo(0.63f, 9.48f)
                curveToRelative(-0.91f, 1.55f, -0.91f, 3.48f, 0f, 5.04f)
                lineToRelative(3.5f, 6f)
                curveToRelative(0.89f, 1.53f, 2.55f, 2.48f, 4.32f, 2.48f)
                horizontalLineToRelative(7.07f)
                curveToRelative(1.77f, 0f, 3.43f, -0.95f, 4.32f, -2.48f)
                lineToRelative(3.5f, -6f)
                curveToRelative(0.91f, -1.55f, 0.91f, -3.48f, 0f, -5.04f)
                close()
                moveTo(21.61f, 13.51f)
                lineToRelative(-3.5f, 6f)
                curveToRelative(-0.54f, 0.92f, -1.53f, 1.49f, -2.59f, 1.49f)
                horizontalLineToRelative(-7.07f)
                curveToRelative(-1.06f, 0f, -2.06f, -0.57f, -2.59f, -1.49f)
                lineToRelative(-3.5f, -6f)
                curveToRelative(-0.54f, -0.93f, -0.54f, -2.09f, 0f, -3.02f)
                lineToRelative(3.5f, -6f)
                curveToRelative(0.54f, -0.92f, 1.53f, -1.49f, 2.59f, -1.49f)
                horizontalLineToRelative(7.07f)
                curveToRelative(1.06f, 0f, 2.06f, 0.57f, 2.59f, 1.49f)
                lineToRelative(3.5f, 6f)
                curveToRelative(0.54f, 0.93f, 0.54f, 2.09f, 0f, 3.02f)
                close()
                moveTo(11.0f, 12.5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(13.5f, 16.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _HexagonExclamation = it}
