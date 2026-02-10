package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Glasses: ImageVector? = null

val Icons.Tr.Glasses: ImageVector
    get() = _Glasses ?: UXIcon(name = "Glasses") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                curveToRelative(-1.98f, 0f, -3.68f, 1.48f, -3.96f, 3.43f)
                curveToRelative(-0.04f, 0.27f, 0.15f, 0.53f, 0.42f, 0.57f)
                curveToRelative(0.27f, 0.04f, 0.53f, -0.15f, 0.57f, -0.42f)
                curveToRelative(0.21f, -1.47f, 1.49f, -2.57f, 2.97f, -2.57f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(12.03f)
                curveToRelative(-0.91f, -1.23f, -2.36f, -2.03f, -4f, -2.03f)
                curveToRelative(-2.41f, 0f, -4.43f, 1.72f, -4.9f, 4f)
                horizontalLineToRelative(-4.2f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                curveToRelative(-1.64f, 0f, -3.09f, 0.81f, -4f, 2.03f)
                lineTo(1f, 4f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                curveToRelative(1.48f, 0f, 2.76f, 1.1f, 2.97f, 2.57f)
                curveToRelative(0.04f, 0.27f, 0.29f, 0.46f, 0.57f, 0.42f)
                curveToRelative(0.27f, -0.04f, 0.46f, -0.29f, 0.42f, -0.57f)
                curveToRelative(-0.28f, -1.95f, -1.98f, -3.43f, -3.96f, -3.43f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                horizontalLineToRelative(4f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                lineTo(24f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(5f, 23f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(19f, 23f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
            }
        }.also { _Glasses = it}
