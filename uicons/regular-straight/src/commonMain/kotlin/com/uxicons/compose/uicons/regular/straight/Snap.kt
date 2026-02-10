package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snap: ImageVector? = null

val Icons.Rs.Snap: ImageVector
    get() = _Snap ?: UXIcon(name = "Snap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.21f, 6.21f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3f, -3f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3f, 3f)
                close()
                moveTo(6.21f, 4.79f)
                lineTo(3.21f, 1.79f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3f, 3f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(10f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                lineTo(10f, 0f)
                close()
                moveTo(20.33f, 18.45f)
                lineToRelative(-3.45f, -5.17f)
                lineToRelative(4.17f, -4.17f)
                curveToRelative(1.05f, -1.05f, 1.22f, -2.72f, 0.39f, -3.87f)
                curveToRelative(-0.51f, -0.71f, -1.3f, -1.16f, -2.16f, -1.23f)
                curveToRelative(-0.85f, -0.07f, -1.71f, 0.24f, -2.32f, 0.85f)
                lineToRelative(-7.93f, 7.93f)
                lineToRelative(-0.13f, -1.12f)
                curveToRelative(-0.03f, -0.79f, -0.36f, -1.52f, -0.93f, -2.05f)
                curveToRelative(-0.57f, -0.54f, -1.35f, -0.81f, -2.11f, -0.79f)
                curveToRelative(-1.62f, 0.06f, -2.9f, 1.42f, -2.85f, 3.01f)
                verticalLineToRelative(9.25f)
                reflectiveCurveTo(0.09f, 24f, 0.09f, 24f)
                horizontalLineToRelative(2.83f)
                lineToRelative(2.09f, -2.09f)
                verticalLineToRelative(-10.11f)
                curveToRelative(-0.02f, -0.52f, 0.4f, -0.96f, 0.92f, -0.98f)
                curveToRelative(0.27f, -0.01f, 0.49f, 0.08f, 0.68f, 0.25f)
                curveToRelative(0.18f, 0.17f, 0.29f, 0.41f, 0.31f, 0.74f)
                lineToRelative(0.6f, 5.32f)
                lineToRelative(10.86f, -10.86f)
                curveToRelative(0.2f, -0.2f, 0.48f, -0.3f, 0.75f, -0.27f)
                curveToRelative(0.28f, 0.02f, 0.53f, 0.17f, 0.7f, 0.4f)
                curveToRelative(0.26f, 0.36f, 0.18f, 0.93f, -0.18f, 1.29f)
                lineToRelative(-5.33f, 5.33f)
                lineToRelative(4.36f, 6.53f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0.0f)
                lineToRelative(0.55f, 0.82f)
                lineToRelative(-3.63f, 3.63f)
                horizontalLineToRelative(2.83f)
                lineToRelative(3.37f, -3.37f)
                lineToRelative(-1.46f, -2.18f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                close()
            }
        }.also { _Snap = it}
