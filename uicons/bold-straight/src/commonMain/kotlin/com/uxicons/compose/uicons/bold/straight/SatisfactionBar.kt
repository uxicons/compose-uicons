package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SatisfactionBar: ImageVector? = null

val Icons.Bs.SatisfactionBar: ImageVector
    get() = _SatisfactionBar ?: UXIcon(name = "SatisfactionBar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(20.5f, 5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(19.71f, 9.29f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(-0.83f, 0.83f, -1.94f, 1.29f, -3.12f, 1.29f)
                reflectiveCurveToRelative(-2.29f, -0.46f, -3.12f, -1.29f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(0.91f, 0.91f, 2.5f, 0.91f, 3.41f, 0f)
                close()
                moveTo(15.5f, 5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 14f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(9.31f, 2f, 6f, 2f)
                reflectiveCurveTo(0f, 4.69f, 0f, 8f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(8.5f, 5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4.29f, 11.71f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(0.83f, -0.83f, 1.94f, -1.29f, 3.12f, -1.29f)
                reflectiveCurveToRelative(2.29f, 0.46f, 3.12f, 1.29f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-0.91f, -0.91f, -2.5f, -0.91f, -3.41f, 0f)
                close()
                moveTo(3.5f, 5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 18f)
                lineToRelative(-13f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(13f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -7f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _SatisfactionBar = it}
