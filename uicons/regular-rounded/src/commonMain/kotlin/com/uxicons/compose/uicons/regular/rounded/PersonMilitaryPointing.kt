package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonMilitaryPointing: ImageVector? = null

val Icons.Rr.PersonMilitaryPointing: ImageVector
    get() = _PersonMilitaryPointing ?: UXIcon(name = "PersonMilitaryPointing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.85f, 20.47f)
                lineToRelative(-3.12f, -5.0f)
                curveToRelative(-1.75f, -2.8f, -4.76f, -4.47f, -8.06f, -4.47f)
                lineTo(1f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(7f, 13f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(4f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-5.26f)
                curveToRelative(0.38f, 0.39f, 0.73f, 0.82f, 1.03f, 1.29f)
                lineToRelative(3.12f, 5.0f)
                curveToRelative(0.29f, 0.47f, 0.92f, 0.61f, 1.38f, 0.32f)
                curveToRelative(0.47f, -0.29f, 0.61f, -0.91f, 0.32f, -1.38f)
                close()
                moveTo(12.67f, 13f)
                curveToRelative(0.64f, 0f, 1.26f, 0.08f, 1.86f, 0.23f)
                lineToRelative(-5.53f, 6.93f)
                verticalLineToRelative(-7.16f)
                horizontalLineToRelative(3.67f)
                close()
                moveTo(14.5f, 22f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.13f, 0f, -0.25f, -0.02f, -0.37f, -0.05f)
                lineToRelative(5.87f, -7.35f)
                verticalLineToRelative(5.9f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(7.5f, 2.99f)
                verticalLineToRelative(2.51f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                lineToRelative(0.01f, -2.5f)
                lineToRelative(0.43f, -0.83f)
                curveToRelative(0.27f, -0.79f, -0.29f, -1.61f, -1.12f, -1.66f)
                lineTo(8.74f, 0.0f)
                curveToRelative(-1.13f, -0.06f, -1.99f, 1.01f, -1.68f, 2.1f)
                lineToRelative(0.43f, 0.89f)
                close()
                moveTo(14.5f, 5.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _PersonMilitaryPointing = it}
