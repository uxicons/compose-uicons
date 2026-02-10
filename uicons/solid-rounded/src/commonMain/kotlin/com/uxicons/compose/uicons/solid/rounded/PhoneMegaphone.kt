package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneMegaphone: ImageVector? = null

val Icons.Sr.PhoneMegaphone: ImageVector
    get() = _PhoneMegaphone ?: UXIcon(name = "PhoneMegaphone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9f)
                curveToRelative(0f, -0.65f, -0.42f, -1.2f, -1f, -1.41f)
                verticalLineToRelative(-2.59f)
                curveToRelative(0f, -0.5f, -0.37f, -0.92f, -0.86f, -0.99f)
                curveToRelative(-0.49f, -0.07f, -0.96f, 0.23f, -1.1f, 0.71f)
                curveToRelative(-0.24f, 0.82f, -0.91f, 1.28f, -1.91f, 1.28f)
                horizontalLineToRelative(-2.13f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 0.69f, 0.25f, 1.33f, 0.65f, 1.84f)
                lineToRelative(1.89f, 4.38f)
                curveToRelative(0.21f, 0.48f, 0.68f, 0.79f, 1.2f, 0.79f)
                curveToRelative(0.93f, 0f, 1.56f, -0.95f, 1.2f, -1.81f)
                lineToRelative(-0.92f, -2.19f)
                horizontalLineToRelative(1.12f)
                curveToRelative(0.99f, 0f, 1.67f, 0.45f, 1.91f, 1.28f)
                curveToRelative(0.14f, 0.48f, 0.61f, 0.79f, 1.1f, 0.71f)
                curveToRelative(0.49f, -0.07f, 0.86f, -0.49f, 0.86f, -0.99f)
                verticalLineToRelative(-2.59f)
                curveToRelative(0.58f, -0.21f, 1.0f, -0.76f, 1.0f, -1.41f)
                close()
                moveTo(14.69f, 16f)
                horizontalLineToRelative(-11.69f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.41f, 0f, 4.43f, 1.72f, 4.9f, 4f)
                horizontalLineToRelative(-1.9f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 1.02f, 0.31f, 1.99f, 0.9f, 2.84f)
                close()
                moveTo(3f, 18f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-1f)
                close()
                moveTo(12f, 22f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _PhoneMegaphone = it}
