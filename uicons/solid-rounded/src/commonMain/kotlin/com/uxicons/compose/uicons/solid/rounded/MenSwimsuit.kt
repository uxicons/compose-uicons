package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MenSwimsuit: ImageVector? = null

val Icons.Sr.MenSwimsuit: ImageVector
    get() = _MenSwimsuit ?: UXIcon(name = "MenSwimsuit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 19.67f)
                verticalLineToRelative(0.29f)
                curveToRelative(-0.14f, -0.12f, -0.28f, -0.24f, -0.41f, -0.38f)
                lineToRelative(-5.99f, -6.46f)
                curveToRelative(-0.57f, -0.61f, -0.98f, -1.33f, -1.25f, -2.11f)
                horizontalLineToRelative(0.1f)
                curveToRelative(4.66f, 0.22f, 7.55f, 3.54f, 7.55f, 8.66f)
                close()
                moveTo(6f, 10.84f)
                verticalLineToRelative(-7.84f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(2.01f)
                horizontalLineToRelative(0.5f)
                curveToRelative(2.15f, 0.1f, 4.01f, 0.74f, 5.5f, 1.82f)
                close()
                moveTo(20f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7.84f)
                curveToRelative(1.49f, -1.08f, 3.35f, -1.72f, 5.5f, -1.82f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-2.01f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(16f, 3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(9.84f)
                curveToRelative(1.29f, 1.78f, 2f, 4.11f, 2f, 6.83f)
                verticalLineToRelative(1.15f)
                curveToRelative(0.62f, 0.11f, 1.28f, 0.18f, 2f, 0.18f)
                reflectiveCurveToRelative(1.38f, -0.07f, 2f, -0.18f)
                verticalLineToRelative(-1.15f)
                curveToRelative(0f, -2.72f, 0.71f, -5.05f, 2f, -6.83f)
                close()
                moveTo(16f, 19.67f)
                verticalLineToRelative(0.29f)
                curveToRelative(0.14f, -0.12f, 0.28f, -0.24f, 0.41f, -0.38f)
                lineToRelative(5.99f, -6.46f)
                curveToRelative(0.57f, -0.61f, 0.98f, -1.33f, 1.25f, -2.11f)
                horizontalLineToRelative(-0.1f)
                curveToRelative(-4.66f, 0.22f, -7.55f, 3.54f, -7.55f, 8.66f)
                close()
            }
        }.also { _MenSwimsuit = it}
