package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseLock: ImageVector? = null

val Icons.Rr.HouseLock: ImageVector
    get() = _HouseLock ?: UXIcon(name = "HouseLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 9.72f)
                verticalLineToRelative(9.28f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-9.28f)
                curveToRelative(0f, -1.67f, 0.82f, -3.21f, 2.2f, -4.14f)
                lineTo(9.2f, 0.85f)
                curveToRelative(1.7f, -1.15f, 3.9f, -1.15f, 5.59f, 0f)
                lineToRelative(7.2f, 4.88f)
                curveToRelative(0.64f, 0.48f, 1.17f, 1.11f, 1.51f, 1.83f)
                curveToRelative(0.24f, 0.5f, 0.03f, 1.1f, -0.47f, 1.33f)
                curveToRelative(-0.5f, 0.24f, -1.09f, 0.03f, -1.33f, -0.47f)
                curveToRelative(-0.23f, -0.48f, -0.58f, -0.9f, -1.03f, -1.19f)
                lineToRelative(-7.0f, -4.72f)
                curveToRelative(-1.02f, -0.69f, -2.34f, -0.69f, -3.35f, 0f)
                lineTo(3.32f, 7.24f)
                curveToRelative(-0.83f, 0.56f, -1.32f, 1.49f, -1.32f, 2.49f)
                close()
                moveTo(24f, 18f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.47f, 0.81f, -2.75f, 2f, -3.44f)
                verticalLineToRelative(-1.56f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(1.56f)
                curveToRelative(1.19f, 0.69f, 2f, 1.97f, 2f, 3.44f)
                close()
                moveTo(16f, 14f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                close()
                moveTo(22f, 18f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 17.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _HouseLock = it}
