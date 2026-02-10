package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonMilitaryPointing: ImageVector? = null

val Icons.Sr.PersonMilitaryPointing: ImageVector
    get() = _PersonMilitaryPointing ?: UXIcon(name = "PersonMilitaryPointing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                close()
                moveTo(8.12f, 3f)
                horizontalLineToRelative(8.0f)
                lineToRelative(0.32f, -0.83f)
                curveToRelative(0.27f, -0.79f, -0.29f, -1.61f, -1.12f, -1.66f)
                lineTo(9.31f, 0.0f)
                curveToRelative(-1.13f, -0.06f, -1.99f, 1.01f, -1.68f, 2.1f)
                lineToRelative(0.48f, 0.9f)
                close()
                moveTo(23.85f, 20.47f)
                lineToRelative(-3.12f, -5.0f)
                curveToRelative(-0.98f, -1.57f, -2.37f, -2.77f, -3.97f, -3.53f)
                lineToRelative(-7.05f, 8.06f)
                horizontalLineToRelative(7.3f)
                verticalLineToRelative(-5.62f)
                curveToRelative(0.8f, 0.57f, 1.49f, 1.29f, 2.03f, 2.15f)
                lineToRelative(3.12f, 5.0f)
                curveToRelative(0.29f, 0.47f, 0.92f, 0.61f, 1.38f, 0.32f)
                curveToRelative(0.47f, -0.29f, 0.61f, -0.91f, 0.32f, -1.38f)
                close()
                moveTo(7.0f, 20f)
                horizontalLineToRelative(0.05f)
                lineToRelative(7.67f, -8.76f)
                curveToRelative(-0.66f, -0.14f, -1.35f, -0.24f, -2.05f, -0.24f)
                lineTo(1f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(7f, 13f)
                verticalLineToRelative(7f)
                close()
                moveTo(8.83f, 24f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(6.83f, 22f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
            }
        }.also { _PersonMilitaryPointing = it}
