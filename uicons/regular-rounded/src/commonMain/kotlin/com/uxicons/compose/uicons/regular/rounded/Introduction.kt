package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Introduction: ImageVector? = null

val Icons.Rr.Introduction: ImageVector
    get() = _Introduction ?: UXIcon(name = "Introduction") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 13f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(8f, 7f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(15f, 21.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                lineTo(2f, 17f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                lineTo(0f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(6.5f)
                curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                close()
                moveTo(23.12f, 0.88f)
                curveToRelative(-0.57f, -0.57f, -1.32f, -0.88f, -2.12f, -0.88f)
                horizontalLineToRelative(-0.0f)
                lineToRelative(-4f, 0.0f)
                curveToRelative(-1.65f, 0f, -3.0f, 1.35f, -3.0f, 3f)
                verticalLineToRelative(6.21f)
                reflectiveCurveToRelative(0.0f, 0f, 0.0f, 0f)
                curveToRelative(0f, 0.65f, 0.36f, 1.25f, 0.93f, 1.57f)
                curveToRelative(0.27f, 0.15f, 0.56f, 0.22f, 0.86f, 0.22f)
                curveToRelative(0.34f, 0f, 0.67f, -0.09f, 0.96f, -0.28f)
                curveToRelative(0.07f, -0.04f, 0.13f, -0.1f, 0.18f, -0.15f)
                lineToRelative(1.49f, -1.56f)
                lineToRelative(2.58f, -0.0f)
                curveToRelative(1.65f, 0f, 3.0f, -1.35f, 3.0f, -3f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0f, -0.8f, -0.31f, -1.55f, -0.88f, -2.12f)
                close()
                moveTo(22f, 6.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1.0f, -1.0f, 1f)
                lineToRelative(-3.0f, 0.0f)
                curveToRelative(-0.27f, 0f, -0.53f, 0.11f, -0.72f, 0.31f)
                lineToRelative(-1.27f, 1.34f)
                lineTo(16.0f, 3.0f)
                curveToRelative(-0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1f)
                lineToRelative(4f, -0.0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.27f, 0f, 0.52f, 0.1f, 0.71f, 0.29f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(5.28f, 20.33f)
                curveToRelative(-0.19f, 0.53f, -0.28f, 1.09f, -0.28f, 1.67f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.8f, 0.13f, -1.59f, 0.4f, -2.33f)
                curveToRelative(0.18f, -0.52f, 0.76f, -0.79f, 1.28f, -0.61f)
                curveToRelative(0.52f, 0.18f, 0.79f, 0.76f, 0.61f, 1.28f)
                close()
            }
        }.also { _Introduction = it}
