package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtRunning: ImageVector? = null

val Icons.Ts.ShirtRunning: ImageVector
    get() = _ShirtRunning ?: UXIcon(name = "ShirtRunning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.67f, 8.94f)
                curveToRelative(-1.62f, -0.57f, -2.67f, -2.18f, -2.67f, -4.09f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4.86f)
                curveToRelative(0f, 1.91f, -1.05f, 3.52f, -2.67f, 4.09f)
                lineToRelative(-0.33f, 0.12f)
                verticalLineToRelative(14.94f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-14.94f)
                lineToRelative(-0.33f, -0.12f)
                close()
                moveTo(6.87f, 6.11f)
                curveToRelative(1.05f, 1.73f, 2.96f, 2.89f, 5.13f, 2.89f)
                reflectiveCurveToRelative(4.08f, -1.16f, 5.13f, -2.89f)
                curveToRelative(0.2f, 0.96f, 0.64f, 1.81f, 1.26f, 2.48f)
                lineToRelative(-14.39f, 11.85f)
                verticalLineToRelative(-10.69f)
                curveToRelative(1.48f, -0.65f, 2.52f, -2.0f, 2.87f, -3.65f)
                close()
                moveTo(4f, 21.73f)
                lineToRelative(15.14f, -12.47f)
                curveToRelative(0.27f, 0.19f, 0.55f, 0.35f, 0.86f, 0.49f)
                verticalLineToRelative(1.51f)
                lineToRelative(-14.25f, 11.73f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(-1.26f)
                close()
                moveTo(7.32f, 23f)
                lineToRelative(12.68f, -10.44f)
                verticalLineToRelative(10.44f)
                lineTo(7.32f, 23f)
                close()
            }
        }.also { _ShirtRunning = it}
