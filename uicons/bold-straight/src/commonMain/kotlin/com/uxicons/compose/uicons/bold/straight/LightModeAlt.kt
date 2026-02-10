package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightModeAlt: ImageVector? = null

val Icons.Bs.LightModeAlt: ImageVector
    get() = _LightModeAlt ?: UXIcon(name = "LightModeAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                horizontalLineToRelative(-8f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                curveToRelative(0f, -3.66f, 2.47f, -6.74f, 5.83f, -7.69f)
                curveToRelative(0.6f, 1.11f, 1.49f, 2.04f, 2.58f, 2.69f)
                horizontalLineToRelative(-0.41f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-0.41f)
                curveToRelative(1.08f, -0.65f, 1.98f, -1.57f, 2.57f, -2.69f)
                curveToRelative(3.36f, 0.95f, 5.83f, 4.03f, 5.83f, 7.69f)
                close()
                moveTo(16f, 19f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                close()
                moveTo(8.11f, 8.29f)
                lineTo(9.55f, 7.5f)
                curveToRelative(0.4f, 0.39f, 0.9f, 0.68f, 1.45f, 0.84f)
                verticalLineToRelative(1.66f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.66f)
                curveToRelative(0.55f, -0.17f, 1.05f, -0.45f, 1.45f, -0.84f)
                lineToRelative(1.44f, 0.8f)
                lineToRelative(0.97f, -1.75f)
                lineToRelative(-1.44f, -0.8f)
                curveToRelative(0.11f, -0.48f, 0.11f, -1.01f, 0f, -1.49f)
                lineToRelative(1.44f, -0.8f)
                lineToRelative(-0.97f, -1.75f)
                lineToRelative(-1.44f, 0.8f)
                curveToRelative(-0.4f, -0.39f, -0.9f, -0.68f, -1.45f, -0.84f)
                verticalLineToRelative(-1.66f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.66f)
                curveToRelative(-0.55f, 0.17f, -1.05f, 0.45f, -1.45f, 0.84f)
                lineToRelative(-1.44f, -0.8f)
                lineToRelative(-0.97f, 1.75f)
                lineToRelative(1.44f, 0.8f)
                curveToRelative(-0.11f, 0.48f, -0.11f, 1.01f, 0f, 1.49f)
                lineToRelative(-1.44f, 0.8f)
                close()
            }
        }.also { _LightModeAlt = it}
