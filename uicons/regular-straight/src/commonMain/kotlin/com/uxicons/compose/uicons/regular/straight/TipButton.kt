package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TipButton: ImageVector? = null

val Icons.Rs.TipButton: ImageVector
    get() = _TipButton ?: UXIcon(name = "TipButton") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 5f)
                lineTo(3f, 5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(10f)
                lineTo(24f, 18f)
                lineTo(24f, 8f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 16f)
                lineTo(2f, 16f)
                lineTo(2f, 8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(8f)
                close()
                moveTo(8.5f, 8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-7f)
                close()
                moveTo(7.5f, 8f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(5.4f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-5.4f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(-1.6f)
                lineTo(7.5f, 8f)
                close()
                moveTo(13.75f, 8f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(0.65f)
                curveToRelative(1.24f, 0f, 2.25f, -1.01f, 2.25f, -2.25f)
                reflectiveCurveToRelative(-1.01f, -2.25f, -2.25f, -2.25f)
                close()
                moveTo(13.75f, 10.9f)
                horizontalLineToRelative(-0.65f)
                verticalLineToRelative(-1.3f)
                horizontalLineToRelative(0.65f)
                curveToRelative(0.36f, 0f, 0.65f, 0.29f, 0.65f, 0.65f)
                reflectiveCurveToRelative(-0.29f, 0.65f, -0.65f, 0.65f)
                close()
                moveTo(21f, 12.92f)
                curveToRelative(0f, 1.39f, -1.21f, 2.13f, -2.34f, 2.13f)
                curveToRelative(-1.17f, 0f, -2.23f, -0.92f, -2.35f, -1.02f)
                lineToRelative(1.06f, -1.2f)
                curveToRelative(0.27f, 0.24f, 0.86f, 0.62f, 1.29f, 0.62f)
                curveToRelative(0.07f, 0f, 0.74f, -0.02f, 0.74f, -0.53f)
                curveToRelative(0f, -0.25f, -0.31f, -0.44f, -1.04f, -0.79f)
                curveToRelative(-0.81f, -0.39f, -1.93f, -0.93f, -1.93f, -2.21f)
                curveToRelative(0f, -1.17f, 0.94f, -2.06f, 2.19f, -2.06f)
                curveToRelative(0.94f, 0f, 1.88f, 0.76f, 2.06f, 0.91f)
                lineToRelative(-1.03f, 1.22f)
                curveToRelative(-0.3f, -0.25f, -0.79f, -0.53f, -1.02f, -0.53f)
                curveToRelative(-0.06f, 0f, -0.58f, 0.01f, -0.58f, 0.46f)
                curveToRelative(0f, 0.26f, 0.41f, 0.47f, 1.02f, 0.77f)
                curveToRelative(0.82f, 0.39f, 1.95f, 0.93f, 1.95f, 2.23f)
                close()
            }
        }.also { _TipButton = it}
