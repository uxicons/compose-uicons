package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmilePlus: ImageVector? = null

val Icons.Ss.SmilePlus: ImageVector
    get() = _SmilePlus ?: UXIcon(name = "SmilePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                lineTo(19f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 15f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(0f, 19.96f, 0f, 15f)
                reflectiveCurveTo(4.04f, 6f, 9f, 6f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
                moveTo(5f, 13.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(12.67f, 18.55f)
                lineToRelative(-1.33f, -1.49f)
                curveToRelative(-0.01f, 0.01f, -1.1f, 0.95f, -2.34f, 0.95f)
                reflectiveCurveToRelative(-2.33f, -0.94f, -2.33f, -0.95f)
                lineToRelative(-1.33f, 1.49f)
                curveToRelative(0.07f, 0.06f, 1.65f, 1.46f, 3.67f, 1.46f)
                reflectiveCurveToRelative(3.6f, -1.4f, 3.67f, -1.46f)
                close()
                moveTo(13f, 13.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _SmilePlus = it}
