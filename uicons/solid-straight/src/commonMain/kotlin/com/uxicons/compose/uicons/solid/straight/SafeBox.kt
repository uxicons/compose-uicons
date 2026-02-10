package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SafeBox: ImageVector? = null

val Icons.Ss.SafeBox: ImageVector
    get() = _SafeBox ?: UXIcon(name = "SafeBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 13f)
                curveToRelative(0f, 1.66f, -2.69f, 3f, -6f, 3f)
                reflectiveCurveTo(0f, 14.66f, 0f, 13f)
                reflectiveCurveToRelative(2.69f, -3f, 6f, -3f)
                reflectiveCurveToRelative(6f, 1.34f, 6f, 3f)
                close()
                moveTo(12f, 18.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.0f, -2.58f, 3.5f, -6f, 3.5f)
                reflectiveCurveToRelative(-6f, -1.5f, -6f, -3.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, 1.97f, 2.5f, 3.5f, 6f, 3.5f)
                reflectiveCurveToRelative(6f, -1.53f, 6f, -3.5f)
                close()
                moveTo(12f, 14.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.0f, -2.58f, 3.5f, -6f, 3.5f)
                reflectiveCurveToRelative(-6f, -1.5f, -6f, -3.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, 1.97f, 2.5f, 3.5f, 6f, 3.5f)
                reflectiveCurveToRelative(6f, -1.53f, 6f, -3.5f)
                close()
                moveTo(11f, 6f)
                curveToRelative(-1.51f, 0f, -2.83f, 0.84f, -3.51f, 2.08f)
                curveToRelative(3.68f, 0.38f, 6.27f, 2.18f, 6.49f, 4.58f)
                curveToRelative(0.63f, -0.71f, 1.02f, -1.64f, 1.02f, -2.66f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.36f, 0f, 0.03f, 1.32f, 0.0f, 2.95f)
                curveToRelative(0f, 0.02f, -0.0f, 0.03f, -0.0f, 0.05f)
                verticalLineToRelative(6.59f)
                curveToRelative(1.3f, -0.9f, 3.16f, -1.47f, 5.34f, -1.57f)
                curveToRelative(0.82f, -2.34f, 3.05f, -4.01f, 5.66f, -4.01f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 2.22f, -1.21f, 4.16f, -3f, 5.2f)
                verticalLineToRelative(4.8f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _SafeBox = it}
