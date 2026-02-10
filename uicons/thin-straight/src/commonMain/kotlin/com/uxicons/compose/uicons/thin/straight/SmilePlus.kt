package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmilePlus: ImageVector? = null

val Icons.Ts.SmilePlus: ImageVector
    get() = _SmilePlus ?: UXIcon(name = "SmilePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 6f)
                curveTo(4.04f, 6f, 0f, 10.04f, 0f, 15f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(13.96f, 6f, 9f, 6f)
                close()
                moveTo(9f, 23f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(4.59f, 7f, 9f, 7f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
                moveTo(5f, 13f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(13f, 13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                lineTo(19f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                close()
                moveTo(12.17f, 16.73f)
                lineToRelative(0.67f, 0.75f)
                curveToRelative(-0.07f, 0.06f, -1.73f, 1.53f, -3.83f, 1.53f)
                reflectiveCurveToRelative(-3.76f, -1.47f, -3.83f, -1.53f)
                lineToRelative(0.67f, -0.75f)
                curveToRelative(0.01f, 0.01f, 1.46f, 1.27f, 3.17f, 1.27f)
                curveToRelative(1.72f, 0f, 3.15f, -1.26f, 3.17f, -1.27f)
                close()
            }
        }.also { _SmilePlus = it}
