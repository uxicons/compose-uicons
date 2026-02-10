package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cat: ImageVector? = null

val Icons.Rr.Cat: ImageVector
    get() = _Cat ?: UXIcon(name = "Cat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6.5f)
                lineTo(24f, 1f)
                curveToRelative(0f, -0.38f, -0.21f, -0.72f, -0.55f, -0.9f)
                curveToRelative(-0.34f, -0.17f, -0.75f, -0.13f, -1.05f, 0.1f)
                lineToRelative(-1.69f, 1.26f)
                curveToRelative(-0.68f, -0.3f, -1.43f, -0.47f, -2.21f, -0.47f)
                reflectiveCurveToRelative(-1.53f, 0.17f, -2.21f, 0.47f)
                lineToRelative(-1.69f, -1.26f)
                curveToRelative(-0.3f, -0.23f, -0.71f, -0.27f, -1.05f, -0.1f)
                curveToRelative(-0.34f, 0.17f, -0.55f, 0.52f, -0.55f, 0.9f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.05f, 0.29f, 2.03f, 0.8f, 2.86f)
                curveToRelative(-8.5f, 2.83f, -8.81f, 11.14f, -8.81f, 12.42f)
                curveToRelative(-1.53f, -0.43f, -3.0f, -1.49f, -3.0f, -3.28f)
                curveToRelative(0f, -1.56f, 0.72f, -2.72f, 1.48f, -3.95f)
                curveToRelative(0.75f, -1.21f, 1.52f, -2.45f, 1.52f, -4.05f)
                curveToRelative(0f, -2.56f, -1.37f, -4.16f, -3.87f, -4.49f)
                curveToRelative(-0.54f, -0.07f, -1.05f, 0.31f, -1.12f, 0.86f)
                curveToRelative(-0.07f, 0.55f, 0.31f, 1.05f, 0.86f, 1.12f)
                curveToRelative(1.49f, 0.2f, 2.13f, 0.95f, 2.13f, 2.51f)
                curveToRelative(0f, 1.03f, -0.57f, 1.94f, -1.22f, 3.0f)
                curveToRelative(-0.83f, 1.34f, -1.78f, 2.87f, -1.78f, 5.0f)
                curveToRelative(0f, 3.13f, 2.76f, 5.12f, 5.69f, 5.45f)
                curveToRelative(0.1f, 0.03f, 0.73f, 0.05f, 0.87f, 0.05f)
                horizontalLineToRelative(16.44f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-11.26f)
                curveToRelative(1.22f, -1.01f, 2f, -2.54f, 2f, -4.24f)
                close()
                moveTo(20f, 22f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                lineTo(7.0f, 22f)
                curveToRelative(-0.02f, -0.36f, -0.31f, -8.74f, 8.33f, -11.01f)
                curveToRelative(0.9f, 0.64f, 1.99f, 1.01f, 3.17f, 1.01f)
                curveToRelative(0.52f, 0f, 1.02f, -0.07f, 1.5f, -0.21f)
                verticalLineToRelative(10.21f)
                close()
                moveTo(18.5f, 10f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _Cat = it}
