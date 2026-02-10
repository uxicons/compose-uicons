package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmilePlus: ImageVector? = null

val Icons.Bs.SmilePlus: ImageVector
    get() = _SmilePlus ?: UXIcon(name = "SmilePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 6f)
                curveTo(4.04f, 6f, 0f, 10.04f, 0f, 15f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(13.96f, 6f, 9f, 6f)
                close()
                moveTo(9f, 21f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(10.83f, 16.26f)
                lineToRelative(1.35f, 1.47f)
                curveToRelative(-0.14f, 0.13f, -1.42f, 1.27f, -3.18f, 1.27f)
                reflectiveCurveToRelative(-3.04f, -1.14f, -3.18f, -1.26f)
                lineToRelative(1.36f, -1.47f)
                reflectiveCurveToRelative(0.83f, 0.73f, 1.82f, 0.73f)
                reflectiveCurveToRelative(1.82f, -0.73f, 1.83f, -0.74f)
                close()
                moveTo(6.5f, 15f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13f, 13.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                lineTo(18f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _SmilePlus = it}
