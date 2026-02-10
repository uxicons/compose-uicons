package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonDivide: ImageVector? = null

val Icons.Tr.HexagonDivide: ImageVector
    get() = _HexagonDivide ?: UXIcon(name = "HexagonDivide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.46f, 9.88f)
                lineToRelative(-3.53f, -6.5f)
                curveToRelative(-0.8f, -1.47f, -2.35f, -2.38f, -4.05f, -2.38f)
                horizontalLineToRelative(-7.75f)
                curveToRelative(-1.69f, 0f, -3.24f, 0.91f, -4.04f, 2.38f)
                lineTo(0.54f, 9.88f)
                curveToRelative(-0.73f, 1.33f, -0.73f, 2.92f, 0f, 4.25f)
                lineToRelative(3.55f, 6.5f)
                curveToRelative(0.8f, 1.47f, 2.35f, 2.38f, 4.04f, 2.38f)
                horizontalLineToRelative(7.75f)
                curveToRelative(1.7f, 0f, 3.25f, -0.91f, 4.05f, -2.38f)
                lineToRelative(3.53f, -6.5f)
                curveToRelative(0.72f, -1.33f, 0.72f, -2.91f, 0f, -4.23f)
                close()
                moveTo(22.58f, 13.64f)
                lineToRelative(-3.53f, 6.5f)
                curveToRelative(-0.62f, 1.15f, -1.84f, 1.86f, -3.17f, 1.86f)
                horizontalLineToRelative(-7.75f)
                curveToRelative(-1.33f, 0f, -2.54f, -0.71f, -3.17f, -1.85f)
                lineToRelative(-3.55f, -6.5f)
                curveToRelative(-0.56f, -1.03f, -0.56f, -2.26f, 0f, -3.29f)
                lineToRelative(3.55f, -6.5f)
                curveToRelative(0.62f, -1.14f, 1.84f, -1.85f, 3.16f, -1.85f)
                horizontalLineToRelative(7.75f)
                curveToRelative(1.33f, 0f, 2.54f, 0.71f, 3.17f, 1.86f)
                lineToRelative(3.53f, 6.5f)
                curveToRelative(0.56f, 1.03f, 0.56f, 2.25f, 0f, 3.28f)
                close()
                moveTo(18f, 12f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(6.5f, 12.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(12f, 5.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12f, 18.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _HexagonDivide = it}
