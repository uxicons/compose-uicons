package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtRunning: ImageVector? = null

val Icons.Sc.ShirtRunning: ImageVector
    get() = _ShirtRunning ?: UXIcon(name = "ShirtRunning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.68f, 21.03f)
                curveToRelative(-0.21f, -1.06f, -0.68f, -4.02f, -0.68f, -8.94f)
                curveToRelative(0f, -0.92f, 0.02f, -1.35f, 0.05f, -2.12f)
                curveToRelative(0.02f, -0.49f, 0.39f, -0.9f, 0.87f, -0.96f)
                curveToRelative(0.52f, -0.07f, 2.08f, -0.27f, 2.08f, -3.51f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.39f)
                curveToRelative(0.06f, 0.63f, 0.41f, 1.11f, 2f, 1.11f)
                reflectiveCurveToRelative(1.94f, -0.48f, 2f, -1.11f)
                verticalLineToRelative(-2.39f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 3.11f, 1.44f, 3.42f, 2.01f, 3.5f)
                curveToRelative(-3.94f, 5.03f, -8.64f, 8.97f, -14.33f, 12.03f)
                close()
                moveTo(19.99f, 10.99f)
                curveToRelative(-3.8f, 4.64f, -8.39f, 8.47f, -13.68f, 11.42f)
                curveToRelative(1.05f, 0.24f, 3.02f, 0.59f, 5.69f, 0.59f)
                curveToRelative(3.98f, 0f, 6.45f, -0.78f, 6.56f, -0.81f)
                curveToRelative(0.33f, -0.11f, 0.58f, -0.38f, 0.67f, -0.71f)
                curveToRelative(0.03f, -0.13f, 0.78f, -3.22f, 0.78f, -9.39f)
                curveToRelative(0f, -0.47f, -0.01f, -0.79f, -0.01f, -1.09f)
                close()
            }
        }.also { _ShirtRunning = it}
