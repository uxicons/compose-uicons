package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SatisfactionBar: ImageVector? = null

val Icons.Ss.SatisfactionBar: ImageVector
    get() = _SatisfactionBar ?: UXIcon(name = "SatisfactionBar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                close()
                moveTo(14f, 18f)
                lineTo(0f, 18f)
                verticalLineToRelative(2f)
                lineTo(14f, 20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(12f, 8f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(19f, 6.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(16.29f, 9.29f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(0.83f, 0.83f, 1.94f, 1.29f, 3.12f, 1.29f)
                reflectiveCurveToRelative(2.29f, -0.46f, 3.12f, -1.29f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-0.91f, 0.91f, -2.5f, 0.91f, -3.41f, 0f)
                close()
                moveTo(14f, 6.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(0f, 8f)
                curveTo(0f, 4.69f, 2.69f, 2f, 6f, 2f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveTo(0f, 11.31f, 0f, 8f)
                close()
                moveTo(7f, 6.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(6f, 9f)
                curveToRelative(-1.18f, 0f, -2.29f, 0.46f, -3.12f, 1.29f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.91f, -0.91f, 2.5f, -0.91f, 3.41f, 0f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(-0.83f, -0.83f, -1.94f, -1.29f, -3.12f, -1.29f)
                close()
                moveTo(2f, 6.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _SatisfactionBar = it}
