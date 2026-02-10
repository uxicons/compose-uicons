package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FanTable: ImageVector? = null

val Icons.Ss.FanTable: ImageVector
    get() = _FanTable ?: UXIcon(name = "FanTable") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 22f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                lineTo(6f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3.07f)
                curveToRelative(-1.45f, -0.16f, -2.81f, -0.63f, -4.0f, -1.36f)
                curveToRelative(1.55f, -1.49f, 3.73f, -4.33f, 5.0f, -6.13f)
                curveToRelative(1.27f, 1.8f, 3.45f, 4.64f, 5.0f, 6.13f)
                curveToRelative(-1.19f, 0.74f, -2.54f, 1.21f, -4.0f, 1.36f)
                verticalLineToRelative(3.07f)
                close()
                moveTo(7.95f, 0.92f)
                curveToRelative(-3.21f, 1.52f, -5.45f, 4.79f, -5.45f, 8.58f)
                curveToRelative(0f, 0.48f, 0.05f, 0.94f, 0.11f, 1.4f)
                curveToRelative(1.88f, -0.76f, 5.55f, -1.73f, 7.88f, -2.11f)
                curveToRelative(-0.92f, -2.14f, -2.23f, -5.82f, -2.55f, -7.87f)
                close()
                moveTo(14.12f, 0.25f)
                curveToRelative(-0.68f, -0.16f, -1.39f, -0.25f, -2.12f, -0.25f)
                reflectiveCurveToRelative(-1.44f, 0.09f, -2.12f, 0.25f)
                curveToRelative(0.07f, 1.24f, 1.19f, 4.64f, 2.12f, 6.96f)
                curveToRelative(0.93f, -2.33f, 2.05f, -5.72f, 2.12f, -6.96f)
                close()
                moveTo(3.12f, 12.85f)
                curveToRelative(0.5f, 1.32f, 1.28f, 2.51f, 2.28f, 3.47f)
                curveToRelative(1.2f, -1.07f, 3.17f, -3.55f, 4.5f, -5.39f)
                curveToRelative(-2.28f, 0.46f, -5.49f, 1.34f, -6.79f, 1.92f)
                close()
                moveTo(16.05f, 0.92f)
                curveToRelative(-0.32f, 2.05f, -1.63f, 5.73f, -2.55f, 7.87f)
                curveToRelative(2.33f, 0.37f, 6.0f, 1.34f, 7.88f, 2.11f)
                curveToRelative(0.07f, -0.46f, 0.11f, -0.92f, 0.11f, -1.4f)
                curveToRelative(0f, -3.79f, -2.23f, -7.05f, -5.45f, -8.58f)
                close()
                moveTo(18.59f, 16.32f)
                curveToRelative(1f, -0.97f, 1.78f, -2.15f, 2.28f, -3.47f)
                curveToRelative(-1.3f, -0.58f, -4.51f, -1.47f, -6.79f, -1.92f)
                curveToRelative(1.34f, 1.84f, 3.3f, 4.33f, 4.5f, 5.39f)
                close()
            }
        }.also { _FanTable = it}
