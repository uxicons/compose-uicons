package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kpi: ImageVector? = null

val Icons.Sr.Kpi: ImageVector
    get() = _Kpi ?: UXIcon(name = "Kpi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.5f)
                moveToRelative(0f, -2f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.3f)
                curveToRelative(1.9f, 0f, 3.59f, -1.42f, 3.69f, -3.31f)
                curveToRelative(0.11f, -2.02f, -1.5f, -3.69f, -3.5f, -3.69f)
                horizontalLineToRelative(0f)
                close()
                moveTo(21f, 17f)
                lineTo(21f, 8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(9.02f, 16.56f)
                lineToRelative(-2.11f, -4.83f)
                lineToRelative(1.78f, -3.17f)
                curveToRelative(0.39f, -0.7f, -0.11f, -1.56f, -0.91f, -1.56f)
                curveToRelative(-0.37f, 0f, -0.71f, 0.2f, -0.9f, 0.52f)
                lineToRelative(-2.05f, 3.48f)
                horizontalLineToRelative(-0.83f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1.15f)
                lineToRelative(1.98f, 4.39f)
                curveToRelative(0.17f, 0.37f, 0.53f, 0.61f, 0.94f, 0.61f)
                curveToRelative(0.74f, 0f, 1.24f, -0.76f, 0.94f, -1.44f)
                close()
            }
        }.also { _Kpi = it}
