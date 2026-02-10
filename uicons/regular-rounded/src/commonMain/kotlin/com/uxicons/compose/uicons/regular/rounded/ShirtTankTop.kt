package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtTankTop: ImageVector? = null

val Icons.Rr.ShirtTankTop: ImageVector
    get() = _ShirtTankTop ?: UXIcon(name = "ShirtTankTop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.65f, 8.47f)
                curveToRelative(-1.03f, -0.65f, -1.65f, -1.76f, -1.65f, -2.97f)
                lineTo(18f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                lineTo(8f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.22f, -0.62f, 2.33f, -1.65f, 2.97f)
                curveToRelative(-0.83f, 0.52f, -1.35f, 1.48f, -1.35f, 2.5f)
                verticalLineToRelative(8.03f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8.03f)
                curveToRelative(0f, -1.02f, -0.52f, -1.98f, -1.35f, -2.5f)
                close()
                moveTo(19f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-8.03f)
                curveToRelative(0f, -0.34f, 0.16f, -0.65f, 0.41f, -0.81f)
                curveToRelative(0.9f, -0.56f, 1.59f, -1.36f, 2.04f, -2.27f)
                curveToRelative(1.1f, 1.29f, 2.73f, 2.11f, 4.56f, 2.11f)
                reflectiveCurveToRelative(3.45f, -0.82f, 4.56f, -2.11f)
                curveToRelative(0.44f, 0.92f, 1.13f, 1.71f, 2.03f, 2.27f)
                curveToRelative(0.25f, 0.16f, 0.41f, 0.47f, 0.41f, 0.81f)
                verticalLineToRelative(8.03f)
                close()
            }
        }.also { _ShirtTankTop = it}
