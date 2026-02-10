package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Throat: ImageVector? = null

val Icons.Sr.Throat: ImageVector
    get() = _Throat ?: UXIcon(name = "Throat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12.0f)
                curveToRelative(0f, 0.97f, -0.7f, 2f, -2f, 2f)
                horizontalLineToRelative(-7f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -1.63f, 1.27f, -2.97f, 2.84f, -3.0f)
                curveToRelative(1.27f, -0.03f, 2.47f, 0.21f, 3.62f, 0.69f)
                lineToRelative(2.98f, 1.24f)
                curveToRelative(0.12f, 0.05f, 0.25f, 0.08f, 0.38f, 0.08f)
                horizontalLineToRelative(5.17f)
                close()
                moveTo(13f, 18.0f)
                verticalLineToRelative(5.07f)
                curveToRelative(0f, 0.69f, 0.72f, 1.13f, 1.34f, 0.83f)
                curveToRelative(0.98f, -0.49f, 1.66f, -1.23f, 1.66f, -2.4f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.49f)
                curveToRelative(2.5f, -0.21f, 4.63f, -1.87f, 4.96f, -4.38f)
                lineToRelative(0.06f, -0.62f)
                horizontalLineToRelative(-6.51f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveTo(16.23f, 8.84f)
                lineTo(19.03f, 10.0f)
                horizontalLineToRelative(4.29f)
                curveToRelative(-1.0f, -2.03f, -2.81f, -4.71f, -3.51f, -5.58f)
                curveToRelative(-2.44f, -3.25f, -6.31f, -4.87f, -10.35f, -4.31f)
                curveToRelative(-5.0f, 0.69f, -8.95f, 4.84f, -9.41f, 9.88f)
                curveToRelative(-0.25f, 2.77f, 0.54f, 5.5f, 2.21f, 7.69f)
                curveToRelative(0.48f, 0.62f, 0.74f, 1.46f, 0.74f, 2.35f)
                verticalLineToRelative(0.97f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -2.71f, 2.16f, -4.95f, 4.81f, -5.0f)
                curveToRelative(1.53f, -0.02f, 3.02f, 0.26f, 4.42f, 0.84f)
                close()
            }
        }.also { _Throat = it}
