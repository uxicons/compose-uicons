package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyboardBrightness: ImageVector? = null

val Icons.Tc.KeyboardBrightness: ImageVector
    get() = _KeyboardBrightness ?: UXIcon(name = "KeyboardBrightness") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 17.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(3.85f, 8.15f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(3f, 3f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(12f, 11f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(22.5f, 17f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(20.85f, 8.15f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-3f, 3f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0f)
                lineToRelative(3f, -3f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(16.75f, 17.07f)
                curveToRelative(-0.07f, -0.04f, -1.84f, -1.07f, -4.75f, -1.07f)
                reflectiveCurveToRelative(-4.68f, 1.02f, -4.75f, 1.07f)
                curveToRelative(-0.24f, 0.14f, -0.32f, 0.45f, -0.18f, 0.68f)
                curveToRelative(0.14f, 0.24f, 0.45f, 0.32f, 0.68f, 0.18f)
                curveToRelative(0.02f, -0.01f, 1.62f, -0.93f, 4.25f, -0.93f)
                reflectiveCurveToRelative(4.23f, 0.92f, 4.25f, 0.93f)
                curveToRelative(0.23f, 0.14f, 0.54f, 0.06f, 0.68f, -0.18f)
                curveToRelative(0.14f, -0.24f, 0.06f, -0.54f, -0.18f, -0.68f)
                close()
            }
        }.also { _KeyboardBrightness = it}
