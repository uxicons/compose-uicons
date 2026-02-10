package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Introduction: ImageVector? = null

val Icons.Sr.Introduction: ImageVector
    get() = _Introduction ?: UXIcon(name = "Introduction") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 9f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
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
                moveTo(15f, 21.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(5f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                lineTo(0f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(6.5f)
                curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                close()
            }
        }.also { _Introduction = it}
