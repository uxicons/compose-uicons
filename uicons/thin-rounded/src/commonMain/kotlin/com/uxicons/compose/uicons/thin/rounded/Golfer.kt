package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Golfer: ImageVector? = null

val Icons.Tr.Golfer: ImageVector
    get() = _Golfer ?: UXIcon(name = "Golfer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 6f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8.5f, 2f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(20.94f, 9.27f)
                lineTo(16.52f, 0.8f)
                curveToRelative(-0.2f, -0.36f, -0.53f, -0.61f, -0.92f, -0.71f)
                curveToRelative(-0.39f, -0.11f, -0.8f, -0.05f, -1.13f, 0.15f)
                lineToRelative(-1.2f, 0.63f)
                curveToRelative(-0.24f, 0.13f, -0.34f, 0.43f, -0.21f, 0.68f)
                curveToRelative(0.13f, 0.24f, 0.43f, 0.34f, 0.68f, 0.21f)
                lineToRelative(1.23f, -0.64f)
                curveToRelative(0.12f, -0.07f, 0.25f, -0.09f, 0.39f, -0.05f)
                curveToRelative(0.13f, 0.04f, 0.24f, 0.12f, 0.3f, 0.23f)
                lineToRelative(4.03f, 7.72f)
                horizontalLineToRelative(-4.59f)
                curveToRelative(-0.34f, 0f, -0.68f, -0.05f, -1.01f, -0.15f)
                lineToRelative(-5.98f, -1.79f)
                curveToRelative(-0.67f, -0.13f, -1.31f, 0.05f, -1.71f, 0.48f)
                curveToRelative(-0.36f, 0.39f, -0.48f, 0.92f, -0.33f, 1.48f)
                lineToRelative(1.89f, 6.66f)
                lineToRelative(-4.2f, 7.58f)
                curveToRelative(-0.13f, 0.24f, -0.05f, 0.55f, 0.2f, 0.68f)
                curveToRelative(0.24f, 0.13f, 0.55f, 0.05f, 0.68f, -0.2f)
                lineToRelative(4.29f, -7.74f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.06f, 0.35f, 0.09f, 0.7f, 0.09f, 1.05f)
                verticalLineToRelative(6.45f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6.45f)
                curveToRelative(0f, -0.75f, -0.11f, -1.49f, -0.33f, -2.21f)
                lineToRelative(-1.82f, -5.92f)
                lineToRelative(2.95f, 0.89f)
                curveToRelative(0.42f, 0.13f, 0.85f, 0.19f, 1.3f, 0.19f)
                horizontalLineToRelative(5.41f)
                curveToRelative(0.17f, 0f, 0.34f, -0.09f, 0.43f, -0.24f)
                curveToRelative(0.09f, -0.15f, 0.1f, -0.34f, 0.02f, -0.49f)
                close()
                moveTo(11.67f, 15f)
                horizontalLineToRelative(-2.87f)
                lineToRelative(-1.77f, -6.25f)
                curveToRelative(-0.06f, -0.21f, -0.02f, -0.4f, 0.1f, -0.53f)
                curveToRelative(0.16f, -0.18f, 0.46f, -0.24f, 0.74f, -0.19f)
                lineToRelative(1.83f, 0.55f)
                close()
            }
        }.also { _Golfer = it}
