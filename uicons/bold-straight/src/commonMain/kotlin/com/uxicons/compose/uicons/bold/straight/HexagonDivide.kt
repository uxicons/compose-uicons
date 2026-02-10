package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonDivide: ImageVector? = null

val Icons.Bs.HexagonDivide: ImageVector
    get() = _HexagonDivide ?: UXIcon(name = "HexagonDivide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.59f, 10.36f)
                lineToRelative(-4.06f, -7.57f)
                curveToRelative(-0.59f, -1.11f, -1.75f, -1.79f, -3.0f, -1.79f)
                lineTo(7.5f, 1.0f)
                curveToRelative(-1.26f, 0f, -2.41f, 0.69f, -3.0f, 1.79f)
                lineTo(0.41f, 10.36f)
                curveToRelative(-0.56f, 1.03f, -0.56f, 2.26f, 0f, 3.29f)
                lineToRelative(4.08f, 7.56f)
                curveToRelative(0.6f, 1.1f, 1.75f, 1.79f, 3.0f, 1.79f)
                horizontalLineToRelative(9.03f)
                curveToRelative(1.26f, 0f, 2.41f, -0.69f, 3.0f, -1.79f)
                lineToRelative(4.06f, -7.56f)
                curveToRelative(0.55f, -1.03f, 0.55f, -2.25f, 0f, -3.28f)
                close()
                moveTo(20.94f, 12.22f)
                lineToRelative(-4.06f, 7.56f)
                curveToRelative(-0.07f, 0.13f, -0.21f, 0.21f, -0.36f, 0.21f)
                lineTo(7.5f, 20.0f)
                curveToRelative(-0.15f, 0f, -0.29f, -0.08f, -0.36f, -0.21f)
                lineToRelative(-4.08f, -7.56f)
                curveToRelative(-0.07f, -0.14f, -0.07f, -0.3f, 0f, -0.44f)
                lineToRelative(4.08f, -7.57f)
                curveToRelative(0.07f, -0.13f, 0.21f, -0.21f, 0.36f, -0.21f)
                horizontalLineToRelative(9.03f)
                curveToRelative(0.15f, 0f, 0.29f, 0.08f, 0.36f, 0.21f)
                lineToRelative(4.06f, 7.57f)
                curveToRelative(0.07f, 0.14f, 0.07f, 0.3f, 0f, 0.44f)
                close()
                moveTo(7f, 10.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                lineTo(7f, 13.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(10.5f, 7.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(13.5f, 16.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _HexagonDivide = it}
