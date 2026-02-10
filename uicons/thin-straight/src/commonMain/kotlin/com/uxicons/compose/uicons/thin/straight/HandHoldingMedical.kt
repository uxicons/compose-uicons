package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHoldingMedical: ImageVector? = null

val Icons.Ts.HandHoldingMedical: ImageVector
    get() = _HandHoldingMedical ?: UXIcon(name = "HandHoldingMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                lineTo(8f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                close()
                moveTo(23.36f, 13.18f)
                lineToRelative(-9.64f, 10.82f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(10.86f)
                curveToRelative(1.21f, 0f, 2.23f, 0.81f, 2.54f, 1.92f)
                lineToRelative(3.73f, -4.1f)
                curveToRelative(0.45f, -0.5f, 1.07f, -0.79f, 1.74f, -0.82f)
                curveToRelative(0.67f, -0.02f, 1.31f, 0.2f, 1.81f, 0.65f)
                curveToRelative(1.01f, 0.92f, 1.09f, 2.5f, 0.18f, 3.53f)
                close()
                moveTo(22.51f, 10.39f)
                curveToRelative(-0.3f, -0.27f, -0.69f, -0.41f, -1.09f, -0.39f)
                curveToRelative(-0.4f, 0.02f, -0.78f, 0.19f, -1.05f, 0.49f)
                lineToRelative(-4.5f, 4.94f)
                curveToRelative(-0.3f, 0.94f, -1.12f, 1.68f, -2.15f, 1.82f)
                lineToRelative(-5.67f, 0.74f)
                lineToRelative(-0.13f, -0.99f)
                lineToRelative(5.66f, -0.74f)
                curveToRelative(0.8f, -0.11f, 1.4f, -0.81f, 1.4f, -1.62f)
                curveToRelative(0f, -0.91f, -0.74f, -1.64f, -1.64f, -1.64f)
                lineTo(2.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(10.78f)
                lineToRelative(9.34f, -10.48f)
                curveToRelative(0.55f, -0.61f, 0.5f, -1.57f, -0.11f, -2.12f)
                close()
            }
        }.also { _HandHoldingMedical = it}
