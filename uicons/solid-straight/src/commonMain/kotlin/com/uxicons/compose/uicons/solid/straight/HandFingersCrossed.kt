package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandFingersCrossed: ImageVector? = null

val Icons.Ss.HandFingersCrossed: ImageVector
    get() = _HandFingersCrossed ?: UXIcon(name = "HandFingersCrossed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 9.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-4f)
                close()
                moveTo(20.5f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(7.08f, 5.73f)
                lineToRelative(1.77f, -3.2f)
                lineToRelative(-0.89f, -1.61f)
                curveTo(7.61f, 0.23f, 6.82f, -0.17f, 6.09f, 0.07f)
                curveToRelative(-0.94f, 0.3f, -1.35f, 1.34f, -0.92f, 2.18f)
                lineToRelative(1.91f, 3.49f)
                close()
                moveTo(20.5f, 17f)
                curveToRelative(-0.74f, 0f, -1.43f, -0.23f, -2f, -0.63f)
                curveToRelative(-0.61f, 0.42f, -1.36f, 0.66f, -2.16f, 0.63f)
                curveToRelative(-1.9f, -0.09f, -3.34f, -1.77f, -3.34f, -3.67f)
                verticalLineToRelative(-3.6f)
                reflectiveCurveToRelative(-1.67f, 3.16f, -1.67f, 3.16f)
                curveToRelative(-0.55f, 1.04f, -1.24f, 2.01f, -2.04f, 2.87f)
                lineToRelative(-1.64f, 1.76f)
                lineToRelative(-1.45f, -1.38f)
                lineToRelative(2.21f, -2.21f)
                curveToRelative(0.09f, -0.09f, 0.2f, -0.24f, 0.33f, -0.44f)
                curveToRelative(0.47f, -0.84f, 0.28f, -1.95f, -0.56f, -2.58f)
                curveToRelative(-0.81f, -0.6f, -1.97f, -0.44f, -2.68f, 0.28f)
                lineToRelative(-2.72f, 2.71f)
                curveToRelative(-1.03f, 1.03f, -1.03f, 2.7f, -0.0f, 3.73f)
                lineToRelative(6.39f, 6.39f)
                horizontalLineToRelative(12.82f)
                verticalLineToRelative(-7.34f)
                curveToRelative(-0.46f, 0.22f, -0.96f, 0.34f, -1.5f, 0.34f)
                close()
                moveTo(9.38f, 9.29f)
                curveToRelative(0.41f, 0.31f, 0.75f, 0.68f, 1.0f, 1.09f)
                curveToRelative(0.0f, -0.0f, 0.01f, -0.01f, 0.01f, -0.01f)
                lineTo(14.83f, 2.25f)
                curveToRelative(0.42f, -0.84f, 0.01f, -1.88f, -0.92f, -2.18f)
                curveToRelative(-0.73f, -0.23f, -1.53f, 0.17f, -1.88f, 0.85f)
                lineToRelative(-4.25f, 7.67f)
                curveToRelative(0.58f, 0.11f, 1.13f, 0.34f, 1.61f, 0.69f)
                close()
            }
        }.also { _HandFingersCrossed = it}
