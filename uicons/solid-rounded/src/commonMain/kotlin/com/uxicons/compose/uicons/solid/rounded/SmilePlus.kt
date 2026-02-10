package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmilePlus: ImageVector? = null

val Icons.Sr.SmilePlus: ImageVector
    get() = _SmilePlus ?: UXIcon(name = "SmilePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 6f)
                curveTo(4.04f, 6f, 0f, 10.04f, 0f, 15f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(13.96f, 6f, 9f, 6f)
                close()
                moveTo(5f, 13.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(12.18f, 18.73f)
                curveToRelative(-0.14f, 0.13f, -1.42f, 1.27f, -3.18f, 1.27f)
                reflectiveCurveToRelative(-3.04f, -1.14f, -3.18f, -1.26f)
                curveToRelative(-0.41f, -0.38f, -0.43f, -1.01f, -0.06f, -1.41f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.43f, 1.41f, -0.06f)
                curveToRelative(0.0f, 0.0f, 0.83f, 0.73f, 1.82f, 0.73f)
                reflectiveCurveToRelative(1.82f, -0.73f, 1.83f, -0.74f)
                curveToRelative(0.41f, -0.37f, 1.04f, -0.34f, 1.41f, 0.07f)
                reflectiveCurveToRelative(0.35f, 1.03f, -0.06f, 1.41f)
                close()
                moveTo(11.5f, 15f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(24f, 4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                lineTo(19f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _SmilePlus = it}
