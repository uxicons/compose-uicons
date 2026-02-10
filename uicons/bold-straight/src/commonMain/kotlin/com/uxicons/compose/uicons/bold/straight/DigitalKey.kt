package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DigitalKey: ImageVector? = null

val Icons.Bs.DigitalKey: ImageVector
    get() = _DigitalKey ?: UXIcon(name = "DigitalKey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 6.5f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                reflectiveCurveToRelative(-6.5f, 2.92f, -6.5f, 6.5f)
                curveToRelative(0f, 2.5f, 1.42f, 4.67f, 3.5f, 5.76f)
                lineToRelative(1.64f, 1.57f)
                lineToRelative(-2.04f, 2.04f)
                lineToRelative(2.04f, 2.04f)
                lineToRelative(-2.04f, 2.04f)
                lineToRelative(-0.09f, 0.47f)
                curveToRelative(0f, 0.51f, 0.2f, 1.0f, 0.56f, 1.36f)
                lineToRelative(1.68f, 1.68f)
                curveToRelative(0.69f, 0.69f, 1.82f, 0.69f, 2.51f, 0f)
                lineToRelative(1.56f, -1.56f)
                curveToRelative(0.44f, -0.44f, 0.68f, -1.03f, 0.68f, -1.65f)
                verticalLineToRelative(-8.3f)
                curveToRelative(1.8f, -1.16f, 3f, -3.17f, 3f, -5.47f)
                close()
                moveTo(7.5f, 3f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(23f, 21.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.81f, 0.4f, -1.53f, 1f, -1.99f)
                verticalLineToRelative(-3.51f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(6.51f)
                curveToRelative(0.6f, 0.46f, 1f, 1.17f, 1f, 1.99f)
                close()
                moveTo(6f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(14.7f, 11f)
                curveToRelative(0.56f, -0.9f, 0.96f, -1.91f, 1.16f, -3f)
                horizontalLineToRelative(3.14f)
                verticalLineToRelative(-3.51f)
                curveToRelative(-0.6f, -0.46f, -1f, -1.17f, -1f, -1.99f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 0.81f, -0.4f, 1.53f, -1f, 1.99f)
                verticalLineToRelative(6.51f)
                close()
            }
        }.also { _DigitalKey = it}
