package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trust: ImageVector? = null

val Icons.Ss.Trust: ImageVector
    get() = _Trust ?: UXIcon(name = "Trust") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.0f, 6.0f)
                curveToRelative(0.06f, -1.94f, 1.39f, -3.61f, 3.25f, -4.09f)
                lineToRelative(4.25f, -0.91f)
                lineTo(14.5f, 0f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(5f)
                lineToRelative(-4.5f, 5f)
                horizontalLineToRelative(-8.49f)
                reflectiveCurveToRelative(0.03f, -4.07f, 0.03f, -4.07f)
                lineToRelative(-2f, -0.01f)
                lineToRelative(-0.04f, 5.58f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                reflectiveCurveToRelative(0.0f, 0f, 0.0f, 0f)
                verticalLineToRelative(-0.01f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(22.23f, 16.8f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.62f, 3.62f)
                lineToRelative(-2.01f, -2.01f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.01f, 2.01f)
                curveToRelative(0.38f, 0.38f, 0.88f, 0.59f, 1.41f, 0.59f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.53f, 0f, 1.04f, -0.21f, 1.41f, -0.59f)
                lineToRelative(3.62f, -3.62f)
                close()
                moveTo(10f, 18f)
                curveToRelative(0f, -2.39f, 1.06f, -4.53f, 2.72f, -6f)
                horizontalLineToRelative(-1.77f)
                curveToRelative(-0.24f, 1.69f, -1.69f, 3f, -3.45f, 3f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineToRelative(0.0f, -4.9f)
                curveToRelative(-1.0f, 0.58f, -1.77f, 1.55f, -2.07f, 2.73f)
                lineToRelative(-0.98f, 3.81f)
                lineTo(0.03f, 14.06f)
                lineToRelative(-0.03f, 9.94f)
                horizontalLineToRelative(4.92f)
                lineToRelative(3.5f, -3.96f)
                lineToRelative(1.85f, -0.01f)
                curveToRelative(-0.17f, -0.65f, -0.27f, -1.33f, -0.27f, -2.03f)
                close()
            }
        }.also { _Trust = it}
