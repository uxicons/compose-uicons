package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hose: ImageVector? = null

val Icons.Ts.Hose: ImageVector
    get() = _Hose ?: UXIcon(name = "Hose") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 20f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(1f)
                lineTo(0f, 21f)
                verticalLineToRelative(-1f)
                close()
                moveTo(0f, 24f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                close()
                moveTo(0f, 18f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1f)
                lineTo(0f, 17f)
                verticalLineToRelative(1f)
                close()
                moveTo(0f, 15f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1f)
                lineTo(0f, 14f)
                verticalLineToRelative(1f)
                close()
                moveTo(15f, 3.6f)
                verticalLineToRelative(-0.6f)
                lineTo(5f, 3f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(1f)
                lineTo(5f, 12f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(2.24f, 2f, 5f, 2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-0.62f)
                curveToRelative(0f, -0.41f, 0.18f, -0.8f, 0.5f, -1.07f)
                curveToRelative(0.32f, -0.27f, 0.73f, -0.38f, 1.14f, -0.31f)
                lineToRelative(7.37f, 1.07f)
                verticalLineToRelative(2.87f)
                reflectiveCurveToRelative(-7.53f, 1.07f, -7.6f, 1.07f)
                curveToRelative(-0.32f, 0f, -0.65f, -0.12f, -0.9f, -0.33f)
                curveToRelative(-0.32f, -0.27f, -0.5f, -0.66f, -0.5f, -1.07f)
                close()
                moveTo(16f, 3.6f)
                curveToRelative(0f, 0.16f, 0.09f, 0.26f, 0.14f, 0.31f)
                curveToRelative(0.05f, 0.04f, 0.17f, 0.12f, 0.32f, 0.09f)
                lineToRelative(6.53f, -0.93f)
                verticalLineToRelative(-1.13f)
                reflectiveCurveToRelative(-6.58f, -0.96f, -6.6f, -0.96f)
                curveToRelative(-0.13f, 0f, -0.21f, 0.06f, -0.26f, 0.09f)
                curveToRelative(-0.05f, 0.04f, -0.14f, 0.14f, -0.14f, 0.31f)
                verticalLineToRelative(2.22f)
                close()
            }
        }.also { _Hose = it}
