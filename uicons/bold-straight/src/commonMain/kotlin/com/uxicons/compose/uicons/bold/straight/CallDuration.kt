package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallDuration: ImageVector? = null

val Icons.Bs.CallDuration: ImageVector
    get() = _CallDuration ?: UXIcon(name = "CallDuration") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.29f, 14.92f)
                curveToRelative(-2.33f, -1.1f, -4.04f, -2.82f, -5.21f, -5.23f)
                lineToRelative(2.61f, -2.61f)
                lineTo(5.06f, 0.44f)
                lineTo(1.77f, 3.73f)
                curveToRelative(-1.14f, 1.14f, -1.77f, 2.67f, -1.77f, 4.32f)
                curveToRelative(0f, 7.15f, 8.79f, 15.94f, 15.94f, 15.94f)
                curveToRelative(1.65f, 0f, 3.19f, -0.63f, 4.32f, -1.76f)
                lineToRelative(3.29f, -3.3f)
                lineToRelative(-6.64f, -6.64f)
                lineToRelative(-2.62f, 2.62f)
                close()
                moveTo(18.14f, 20.11f)
                curveToRelative(-0.57f, 0.57f, -1.35f, 0.89f, -2.2f, 0.89f)
                curveToRelative(-4.99f, 0f, -12.94f, -7.07f, -12.94f, -12.94f)
                curveToRelative(0f, -0.85f, 0.31f, -1.63f, 0.89f, -2.2f)
                lineToRelative(1.18f, -1.17f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(-1.92f, 1.92f)
                lineToRelative(0.37f, 0.92f)
                curveToRelative(1.59f, 3.96f, 4.35f, 6.71f, 8.2f, 8.18f)
                lineToRelative(0.91f, 0.35f)
                lineToRelative(1.91f, -1.91f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(-1.18f, 1.18f)
                close()
                moveTo(18.5f, 11f)
                curveToRelative(3.04f, 0f, 5.5f, -2.46f, 5.5f, -5.5f)
                reflectiveCurveTo(21.54f, 0f, 18.5f, 0f)
                reflectiveCurveToRelative(-5.5f, 2.46f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.46f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(17.5f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.09f)
                lineToRelative(2.21f, 2.21f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.79f, -2.79f)
                verticalLineToRelative(-3.91f)
                close()
            }
        }.also { _CallDuration = it}
