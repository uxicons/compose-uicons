package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Introduction: ImageVector? = null

val Icons.Tr.Introduction: ImageVector
    get() = _Introduction ?: UXIcon(name = "Introduction") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 13f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(8f, 6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(15f, 21.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                lineTo(1.5f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(7f)
                curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                close()
                moveTo(5f, 18.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(21.5f, 0f)
                lineToRelative(-5f, 0.0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7.21f)
                curveToRelative(0.0f, 0.47f, 0.26f, 0.9f, 0.67f, 1.13f)
                curveToRelative(0.19f, 0.1f, 0.41f, 0.16f, 0.62f, 0.16f)
                curveToRelative(0.24f, 0f, 0.48f, -0.07f, 0.69f, -0.2f)
                curveToRelative(0.03f, -0.02f, 0.06f, -0.05f, 0.09f, -0.08f)
                lineToRelative(1.64f, -1.72f)
                lineToRelative(3.79f, -0.0f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 6.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineToRelative(-4.0f, 0.0f)
                curveToRelative(-0.14f, 0f, -0.27f, 0.06f, -0.36f, 0.15f)
                lineToRelative(-1.73f, 1.81f)
                curveToRelative(-0.11f, 0.05f, -0.21f, 0.01f, -0.25f, -0.01f)
                curveToRelative(-0.04f, -0.03f, -0.15f, -0.1f, -0.15f, -0.25f)
                lineTo(15.0f, 2.5f)
                curveToRelative(-0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineToRelative(5f, -0.0f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                close()
            }
        }.also { _Introduction = it}
