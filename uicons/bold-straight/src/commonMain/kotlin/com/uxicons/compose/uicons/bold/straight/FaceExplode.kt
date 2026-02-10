package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceExplode: ImageVector? = null

val Icons.Bs.FaceExplode: ImageVector
    get() = _FaceExplode ?: UXIcon(name = "FaceExplode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 16f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(16f, 12f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(4.65f)
                curveToRelative(0f, 6.69f, -5.28f, 12.35f, -11.78f, 12.35f)
                curveToRelative(-2.65f, 0f, -6.37f, -1.21f, -8.63f, -3.44f)
                curveTo(1.28f, 18.29f, 0f, 15.25f, 0f, 12f)
                lineTo(0f, 7f)
                lineTo(3f, 7f)
                curveToRelative(0f, 0.93f, 0.38f, 1f, 0.5f, 1f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2f, -1.64f, -1.78f, -1.64f, -1.78f)
                curveToRelative(-0.07f, 0.04f, -0.71f, 0.78f, -1.86f, 0.78f)
                curveToRelative(-1.56f, 0f, -2.79f, -1.44f, -2.44f, -3.06f)
                curveToRelative(0.18f, -0.81f, 0.79f, -1.49f, 1.57f, -1.78f)
                curveToRelative(0.72f, -0.27f, 1.38f, -0.18f, 1.94f, 0.09f)
                curveToRelative(0.55f, -0.75f, 1.43f, -1.25f, 2.43f, -1.25f)
                curveToRelative(0.77f, 0f, 1.47f, 0.3f, 2f, 0.78f)
                curveToRelative(0.53f, -0.48f, 1.23f, -0.78f, 2f, -0.78f)
                curveToRelative(1.0f, 0f, 1.88f, 0.5f, 2.43f, 1.25f)
                curveToRelative(0.33f, -0.16f, 0.69f, -0.25f, 1.07f, -0.25f)
                curveToRelative(1.6f, 0f, 2.85f, 1.5f, 2.41f, 3.17f)
                curveToRelative(-0.21f, 0.8f, -0.83f, 1.46f, -1.62f, 1.7f)
                curveToRelative(-1.03f, 0.33f, -1.98f, -0.01f, -2.6f, -0.66f)
                curveToRelative(-0.01f, -0.0f, -1.69f, -0.21f, -1.69f, 1.79f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.1f, -0.01f, 0.5f, -0.04f, 0.5f, -1f)
                horizontalLineToRelative(3f)
                close()
                moveTo(21f, 10.96f)
                curveToRelative(-0.17f, 0.03f, -0.34f, 0.04f, -0.5f, 0.04f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-0.74f, 0f, -1.43f, -0.23f, -2f, -0.63f)
                curveToRelative(-0.57f, 0.4f, -1.26f, 0.63f, -2f, 0.63f)
                lineTo(3.5f, 11f)
                curveToRelative(-0.16f, 0f, -0.33f, -0.01f, -0.5f, -0.04f)
                verticalLineToRelative(1.04f)
                curveToRelative(0f, 2.44f, 0.96f, 4.72f, 2.69f, 6.42f)
                curveToRelative(1.74f, 1.71f, 4.02f, 2.62f, 6.47f, 2.58f)
                curveToRelative(4.87f, -0.09f, 8.83f, -4.28f, 8.83f, -9.35f)
                verticalLineToRelative(-0.69f)
                close()
            }
        }.also { _FaceExplode = it}
