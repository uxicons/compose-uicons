package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseReturn: ImageVector? = null

val Icons.Ss.HouseReturn: ImageVector
    get() = _HouseReturn ?: UXIcon(name = "HouseReturn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveTo(15.12f, 0f, 16.5f, 0f)
                close()
                moveTo(24f, 9.97f)
                verticalLineToRelative(5.03f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.97f)
                lineToRelative(-2f, -1.38f)
                verticalLineToRelative(3.76f)
                curveToRelative(0f, 0.98f, -0.48f, 1.9f, -1.28f, 2.46f)
                lineToRelative(-4.74f, 3.17f)
                lineToRelative(0.02f, 4.96f)
                lineToRelative(-2f, 0.01f)
                lineToRelative(-0.03f, -6.04f)
                lineToRelative(3.03f, -2.02f)
                verticalLineToRelative(-3.87f)
                lineToRelative(-3.81f, 2.53f)
                lineToRelative(-1.09f, -1.68f)
                lineToRelative(3.17f, -2.06f)
                lineToRelative(1.24f, -2.87f)
                curveToRelative(0.37f, -1.18f, 1.6f, -2f, 2.5f, -2f)
                curveToRelative(1.5f, 0f, 2.45f, 0.86f, 2.45f, 0.86f)
                lineToRelative(4.55f, 3.11f)
                close()
                moveTo(17.66f, 18.83f)
                lineToRelative(2.07f, 5.17f)
                horizontalLineToRelative(2.16f)
                lineToRelative(-2.56f, -6.36f)
                curveToRelative(-0.05f, 0.04f, -1.68f, 1.18f, -1.68f, 1.18f)
                close()
                moveTo(13.48f, 5.81f)
                curveToRelative(-0.36f, 0.44f, -0.67f, 0.94f, -0.85f, 1.48f)
                lineToRelative(-0.96f, 2.23f)
                lineToRelative(-3.66f, 2.39f)
                verticalLineToRelative(1.47f)
                lineToRelative(2.35f, 3.62f)
                lineTo(0f, 17f)
                lineTo(0f, 7.46f)
                curveToRelative(0f, -0.97f, 0.44f, -1.88f, 1.21f, -2.48f)
                lineTo(7.04f, 0.42f)
                curveToRelative(0.8f, -0.63f, 1.95f, -0.55f, 2.91f, 0.21f)
                lineToRelative(2.08f, 1.54f)
                curveToRelative(-0.01f, 0.11f, -0.03f, 0.22f, -0.03f, 0.33f)
                curveToRelative(0f, 1.31f, 0.58f, 2.49f, 1.48f, 3.31f)
                close()
                moveTo(6.0f, 10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _HouseReturn = it}
