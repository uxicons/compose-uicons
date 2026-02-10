package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WonSign: ImageVector? = null

val Icons.Ts.WonSign: ImageVector
    get() = _WonSign ?: UXIcon(name = "WonSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 14f)
                horizontalLineToRelative(-3.12f)
                lineTo(23.42f, 0f)
                horizontalLineToRelative(-1.02f)
                reflectiveCurveToRelative(-2.54f, 14f, -2.54f, 14f)
                horizontalLineToRelative(-5.53f)
                lineToRelative(-2.33f, -8.71f)
                lineToRelative(-2.33f, 8.71f)
                lineTo(4.07f, 14f)
                lineTo(1.39f, 0f)
                lineTo(0.38f, 0f)
                lineTo(3.05f, 14f)
                lineTo(0f, 14f)
                verticalLineToRelative(1f)
                lineTo(3.24f, 15f)
                lineToRelative(1.4f, 7.33f)
                curveToRelative(0.22f, 1.01f, 0.96f, 1.67f, 1.89f, 1.67f)
                curveToRelative(1.26f, 0f, 1.74f, -0.94f, 1.91f, -1.51f)
                lineToRelative(2f, -7.49f)
                horizontalLineToRelative(3.13f)
                lineToRelative(2.03f, 7.59f)
                curveToRelative(0.21f, 0.86f, 0.95f, 1.41f, 1.88f, 1.41f)
                reflectiveCurveToRelative(1.67f, -0.66f, 1.89f, -1.68f)
                lineToRelative(1.33f, -7.32f)
                horizontalLineToRelative(3.3f)
                verticalLineToRelative(-1f)
                close()
                moveTo(7.48f, 22.21f)
                curveToRelative(-0.23f, 0.71f, -0.65f, 0.79f, -0.95f, 0.79f)
                curveToRelative(-0.44f, 0f, -0.78f, -0.32f, -0.91f, -0.87f)
                lineToRelative(-1.36f, -7.13f)
                horizontalLineToRelative(5.15f)
                lineToRelative(-1.93f, 7.21f)
                close()
                moveTo(10.71f, 14f)
                lineToRelative(1.29f, -4.84f)
                lineToRelative(1.3f, 4.84f)
                horizontalLineToRelative(-2.59f)
                close()
                moveTo(18.39f, 22.11f)
                curveToRelative(-0.13f, 0.56f, -0.47f, 0.89f, -0.91f, 0.89f)
                curveToRelative(-0.67f, 0f, -0.86f, -0.47f, -0.91f, -0.67f)
                lineToRelative(-1.96f, -7.33f)
                horizontalLineToRelative(5.08f)
                lineToRelative(-1.29f, 7.11f)
                close()
            }
        }.also { _WonSign = it}
