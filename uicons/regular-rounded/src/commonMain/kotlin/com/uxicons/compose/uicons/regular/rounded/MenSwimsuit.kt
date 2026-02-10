package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MenSwimsuit: ImageVector? = null

val Icons.Rr.MenSwimsuit: ImageVector
    get() = _MenSwimsuit ?: UXIcon(name = "MenSwimsuit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 3f)
                horizontalLineToRelative(-16f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(2.04f)
                curveToRelative(0f, 1.52f, 0.57f, 2.97f, 1.6f, 4.08f)
                lineToRelative(5.99f, 6.46f)
                curveToRelative(0.56f, 0.6f, 1.27f, 1.02f, 2.06f, 1.19f)
                curveToRelative(0.71f, 0.15f, 1.5f, 0.23f, 2.35f, 0.23f)
                reflectiveCurveToRelative(1.64f, -0.08f, 2.35f, -0.23f)
                curveToRelative(0.79f, -0.17f, 1.5f, -0.58f, 2.06f, -1.19f)
                lineToRelative(5.99f, -6.46f)
                curveToRelative(1.03f, -1.11f, 1.6f, -2.56f, 1.6f, -4.08f)
                verticalLineToRelative(-2.04f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(22f, 7f)
                verticalLineToRelative(2.04f)
                reflectiveCurveToRelative(-0.0f, 0.01f, -0.0f, 0.01f)
                curveToRelative(-1.49f, 0.12f, -2.83f, 0.52f, -4.0f, 1.15f)
                verticalLineToRelative(-5.2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(2f, 7f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.21f)
                curveToRelative(-1.17f, -0.64f, -2.51f, -1.03f, -4.0f, -1.15f)
                curveToRelative(0f, -0.0f, -0.0f, -0.01f, -0.0f, -0.01f)
                verticalLineToRelative(-2.04f)
                close()
                moveTo(3.07f, 11.76f)
                curveToRelative(-0.18f, -0.19f, -0.33f, -0.4f, -0.47f, -0.62f)
                curveToRelative(3.46f, 0.58f, 5.74f, 3.09f, 6.25f, 6.86f)
                lineToRelative(-5.78f, -6.24f)
                close()
                moveTo(10.94f, 18.94f)
                curveToRelative(-0.15f, -3.02f, -1.19f, -5.51f, -2.94f, -7.25f)
                verticalLineToRelative(-6.7f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6.69f)
                curveToRelative(-1.75f, 1.73f, -2.79f, 4.23f, -2.94f, 7.25f)
                curveToRelative(-0.69f, 0.07f, -1.44f, 0.07f, -2.13f, 0f)
                close()
                moveTo(15.15f, 18.0f)
                curveToRelative(0.51f, -3.78f, 2.79f, -6.28f, 6.25f, -6.86f)
                curveToRelative(-0.14f, 0.22f, -0.29f, 0.43f, -0.47f, 0.62f)
                close()
            }
        }.also { _MenSwimsuit = it}
