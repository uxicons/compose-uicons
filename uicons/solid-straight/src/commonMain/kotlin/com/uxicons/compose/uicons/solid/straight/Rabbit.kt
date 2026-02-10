package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rabbit: ImageVector? = null

val Icons.Ss.Rabbit: ImageVector
    get() = _Rabbit ?: UXIcon(name = "Rabbit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.23f, 5.07f)
                curveToRelative(-1.89f, 0.88f, -4.26f, 1.94f, -8.23f, 1.94f)
                verticalLineToRelative(-2f)
                curveToRelative(3.65f, 0f, 5.73f, -0.97f, 7.56f, -1.83f)
                curveToRelative(0.12f, -0.05f, 0.23f, -0.11f, 0.35f, -0.16f)
                curveToRelative(-2.08f, -0.5f, -4.95f, -1.01f, -7.91f, -1.01f)
                lineTo(6f, 0f)
                curveToRelative(5.91f, 0f, 11.26f, 1.85f, 11.8f, 2.05f)
                curveToRelative(0.21f, -0.03f, 0.42f, -0.05f, 0.64f, -0.05f)
                curveToRelative(3.33f, 0f, 5.56f, 3.38f, 5.56f, 5.62f)
                curveToRelative(0f, 2.48f, -3.1f, 3.38f, -5.56f, 3.38f)
                reflectiveCurveToRelative(-4.44f, -2.02f, -4.44f, -4.5f)
                curveToRelative(0f, -0.5f, 0.08f, -0.98f, 0.23f, -1.44f)
                close()
                moveTo(21f, 12.74f)
                curveToRelative(-0.78f, 0.17f, -1.64f, 0.26f, -2.56f, 0.26f)
                curveToRelative(-2.72f, 0f, -5.06f, -1.71f, -6f, -4.13f)
                curveToRelative(-7.41f, 2.37f, -9.0f, 8.84f, -9.35f, 11.46f)
                curveToRelative(-0.32f, -0.21f, -0.69f, -0.33f, -1.1f, -0.33f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9.26f)
                close()
            }
        }.also { _Rabbit = it}
