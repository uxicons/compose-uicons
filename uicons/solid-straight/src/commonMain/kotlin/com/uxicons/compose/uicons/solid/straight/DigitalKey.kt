package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DigitalKey: ImageVector? = null

val Icons.Ss.DigitalKey: ImageVector
    get() = _DigitalKey ?: UXIcon(name = "DigitalKey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 8f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2.28f)
                curveToRelative(-0.59f, -0.35f, -1f, -0.98f, -1f, -1.72f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.74f, -0.41f, 1.38f, -1f, 1.72f)
                close()
                moveTo(22f, 20.28f)
                verticalLineToRelative(-4.28f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2.28f)
                curveToRelative(-0.59f, 0.35f, -1f, 0.98f, -1f, 1.72f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.74f, -0.41f, -1.38f, -1f, -1.72f)
                close()
                moveTo(21f, 10f)
                curveToRelative(-0.74f, 0f, -1.38f, 0.41f, -1.72f, 1f)
                horizontalLineToRelative(-4.58f)
                curveToRelative(-0.47f, 0.74f, -1.04f, 1.41f, -1.7f, 1.97f)
                verticalLineToRelative(0.03f)
                horizontalLineToRelative(6.28f)
                curveToRelative(0.35f, 0.59f, 0.98f, 1f, 1.72f, 1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(14f, 6.5f)
                curveToRelative(0f, 2.24f, -1.14f, 4.28f, -3f, 5.47f)
                verticalLineToRelative(8.16f)
                curveToRelative(0f, 0.73f, -0.29f, 1.44f, -0.81f, 1.96f)
                lineToRelative(-1.36f, 1.36f)
                curveToRelative(-0.37f, 0.37f, -0.85f, 0.55f, -1.33f, 0.55f)
                reflectiveCurveToRelative(-0.96f, -0.18f, -1.33f, -0.55f)
                lineToRelative(-1.36f, -1.36f)
                curveToRelative(-0.52f, -0.52f, -0.81f, -1.23f, -0.81f, -1.96f)
                verticalLineToRelative(-2.05f)
                lineToRelative(1.46f, -1.46f)
                lineToRelative(-1.88f, -1.88f)
                lineToRelative(1.88f, -1.88f)
                lineToRelative(-0.33f, -0.33f)
                curveToRelative(-2.48f, -0.97f, -4.14f, -3.37f, -4.14f, -6.05f)
                curveToRelative(0.0f, -3.58f, 2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                close()
                moveTo(9f, 4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _DigitalKey = it}
