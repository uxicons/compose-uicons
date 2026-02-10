package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Follow: ImageVector? = null

val Icons.Ss.Follow: ImageVector
    get() = _Follow ?: UXIcon(name = "Follow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(19f, 12f)
                curveToRelative(-1.16f, 0f, -2.25f, -0.29f, -3.21f, -0.79f)
                curveToRelative(-0.52f, 1.61f, -2.01f, 2.79f, -3.79f, 2.79f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(-0.0f, -2.22f, 1.85f, -4.06f, 4.08f, -3.99f)
                curveToRelative(-0.05f, -0.33f, -0.08f, -0.67f, -0.08f, -1.01f)
                curveToRelative(0f, -1.87f, 0.74f, -3.57f, 1.94f, -4.83f)
                curveToRelative(-0.63f, -0.1f, -1.28f, -0.17f, -1.94f, -0.17f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                curveToRelative(0f, 4.43f, 2.42f, 8.3f, 6f, 10.38f)
                verticalLineToRelative(-3.38f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3.38f)
                curveToRelative(3.58f, -2.08f, 6f, -5.95f, 6f, -10.38f)
                curveToRelative(0f, -0.66f, -0.07f, -1.31f, -0.17f, -1.94f)
                curveToRelative(-1.26f, 1.2f, -2.95f, 1.94f, -4.83f, 1.94f)
                close()
                moveTo(15f, 18f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.3f)
                curveToRelative(1.25f, 0.45f, 2.6f, 0.7f, 4f, 0.7f)
                reflectiveCurveToRelative(2.75f, -0.26f, 4f, -0.7f)
                verticalLineToRelative(-4.3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Follow = it}
