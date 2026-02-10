package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TipButton: ImageVector? = null

val Icons.Ts.TipButton: ImageVector
    get() = _TipButton ?: UXIcon(name = "TipButton") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 5f)
                lineTo(2.5f, 5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(10.5f)
                lineTo(24f, 18f)
                lineTo(24f, 7.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 17f)
                lineTo(1f, 17f)
                lineTo(1f, 7.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(20.88f, 13.14f)
                curveToRelative(0f, 1.31f, -1.12f, 2.0f, -2.23f, 2.0f)
                curveToRelative(-1.17f, 0f, -2.26f, -0.94f, -2.38f, -1.05f)
                lineToRelative(0.66f, -0.75f)
                curveToRelative(0.25f, 0.22f, 1.05f, 0.8f, 1.72f, 0.8f)
                curveToRelative(0.46f, 0f, 1.23f, -0.21f, 1.23f, -1.0f)
                curveToRelative(0f, -0.54f, -0.55f, -0.83f, -1.45f, -1.25f)
                curveToRelative(-0.9f, -0.41f, -2.01f, -0.93f, -2.01f, -2.13f)
                curveToRelative(0f, -1.25f, 1.07f, -1.92f, 2.08f, -1.92f)
                curveToRelative(0.93f, 0f, 2.01f, 0.82f, 2.13f, 0.92f)
                lineToRelative(-0.61f, 0.79f)
                curveToRelative(-0.35f, -0.27f, -1.07f, -0.7f, -1.51f, -0.7f)
                curveToRelative(-0.37f, 0f, -1.07f, 0.19f, -1.07f, 0.92f)
                curveToRelative(0f, 0.52f, 0.54f, 0.81f, 1.43f, 1.22f)
                curveToRelative(0.9f, 0.42f, 2.03f, 0.94f, 2.03f, 2.16f)
                close()
                moveTo(13.25f, 8f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(1.25f)
                curveToRelative(1.24f, 0f, 2.25f, -1.01f, 2.25f, -2.25f)
                reflectiveCurveToRelative(-1.01f, -2.25f, -2.25f, -2.25f)
                close()
                moveTo(13.25f, 11.5f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
                close()
                moveTo(9f, 8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                close()
                moveTo(3f, 8f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                lineTo(3f, 9f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _TipButton = it}
