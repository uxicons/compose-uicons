package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldPlus: ImageVector? = null

val Icons.Tr.ShieldPlus: ImageVector
    get() = _ShieldPlus ?: UXIcon(name = "ShieldPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.92f, 2.27f)
                lineTo(12.16f, 0.03f)
                curveToRelative(-0.1f, -0.03f, -0.21f, -0.03f, -0.31f, 0f)
                lineTo(5.08f, 2.27f)
                curveToRelative(-1.84f, 0.61f, -3.08f, 2.33f, -3.08f, 4.27f)
                lineToRelative(-0.0f, 5.35f)
                curveToRelative(0f, 6.61f, 7.16f, 10.7f, 9.35f, 11.8f)
                lineToRelative(0.42f, 0.21f)
                curveToRelative(0.07f, 0.04f, 0.15f, 0.05f, 0.22f, 0.05f)
                curveToRelative(0.06f, 0f, 0.13f, -0.01f, 0.19f, -0.04f)
                lineToRelative(0.44f, -0.18f)
                curveToRelative(2.2f, -0.89f, 9.37f, -4.35f, 9.37f, -11.85f)
                lineToRelative(0.0f, -5.35f)
                curveToRelative(0f, -1.94f, -1.24f, -3.66f, -3.08f, -4.27f)
                close()
                moveTo(21.0f, 11.88f)
                curveToRelative(0f, 6.87f, -6.69f, 10.1f, -8.74f, 10.92f)
                lineToRelative(-0.23f, 0.09f)
                lineToRelative(-0.22f, -0.11f)
                curveToRelative(-2.06f, -1.03f, -8.8f, -4.87f, -8.8f, -10.9f)
                lineToRelative(0.0f, -5.35f)
                curveToRelative(0f, -1.51f, 0.96f, -2.85f, 2.4f, -3.32f)
                lineTo(12f, 1.03f)
                lineToRelative(6.6f, 2.19f)
                curveToRelative(1.44f, 0.48f, 2.4f, 1.81f, 2.4f, 3.32f)
                lineToRelative(-0.0f, 5.35f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 11f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _ShieldPlus = it}
