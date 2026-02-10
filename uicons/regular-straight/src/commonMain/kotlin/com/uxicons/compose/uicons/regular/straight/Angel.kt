package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angel: ImageVector? = null

val Icons.Rs.Angel: ImageVector
    get() = _Angel ?: UXIcon(name = "Angel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(8.06f, 4.87f)
                curveToRelative(0.12f, -0.7f, 0.41f, -1.34f, 0.84f, -1.87f)
                curveToRelative(0f, 0f, 0.6f, -1f, 3.1f, -1f)
                reflectiveCurveToRelative(3.1f, 1f, 3.1f, 1f)
                curveToRelative(0.43f, 0.53f, 0.73f, 1.17f, 0.84f, 1.87f)
                curveToRelative(0.66f, -0.51f, 1.06f, -1.15f, 1.06f, -1.87f)
                curveToRelative(0f, -1.71f, -2.15f, -3f, -5f, -3f)
                reflectiveCurveToRelative(-5f, 1.29f, -5f, 3f)
                curveToRelative(0f, 0.72f, 0.4f, 1.36f, 1.06f, 1.87f)
                close()
                moveTo(24f, 16f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.62f)
                lineToRelative(1.01f, 2.38f)
                lineTo(2.99f, 24f)
                lineToRelative(1.01f, -2.38f)
                verticalLineToRelative(-2.62f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                lineTo(0f, 17f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.01f, 0.34f, -10f, 3.5f, -10f)
                curveToRelative(3.43f, 0f, 6.14f, 2.87f, 6.87f, 3.72f)
                curveToRelative(1.06f, 0.37f, 2.21f, 0.37f, 3.27f, 0f)
                curveToRelative(0.73f, -0.85f, 3.43f, -3.72f, 6.87f, -3.72f)
                curveToRelative(3.16f, 0f, 3.5f, 6.99f, 3.5f, 10f)
                close()
                moveTo(5.95f, 17f)
                lineToRelative(2.65f, -6.25f)
                curveToRelative(-0.81f, -0.87f, -2.81f, -2.75f, -5.1f, -2.75f)
                curveToRelative(-0.62f, 0.17f, -1.37f, 3.24f, -1.48f, 7f)
                horizontalLineToRelative(1.98f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.95f)
                close()
                moveTo(17.99f, 22f)
                lineToRelative(-4.32f, -10.2f)
                curveToRelative(-1.09f, 0.27f, -2.25f, 0.27f, -3.35f, 0f)
                lineToRelative(-4.32f, 10.2f)
                horizontalLineToRelative(11.98f)
                close()
                moveTo(21.98f, 15f)
                curveToRelative(-0.12f, -3.76f, -0.86f, -6.83f, -1.48f, -7f)
                curveToRelative(-2.29f, 0f, -4.29f, 1.88f, -5.1f, 2.75f)
                lineToRelative(2.65f, 6.25f)
                horizontalLineToRelative(1.95f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.98f)
                close()
            }
        }.also { _Angel = it}
