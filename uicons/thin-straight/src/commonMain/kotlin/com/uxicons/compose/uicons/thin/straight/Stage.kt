package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stage: ImageVector? = null

val Icons.Ts.Stage: ImageVector
    get() = _Stage ?: UXIcon(name = "Stage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.21f, 23f)
                lineToRelative(-5.71f, -5.71f)
                lineTo(12.5f, 6.21f)
                lineToRelative(1.62f, -1.62f)
                curveToRelative(0.4f, 0.26f, 0.87f, 0.42f, 1.38f, 0.42f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.51f, 0.15f, 0.98f, 0.42f, 1.38f)
                lineToRelative(-4.77f, 4.77f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(2.15f, -2.15f)
                verticalLineToRelative(10.09f)
                lineToRelative(-5.71f, 5.71f)
                lineTo(0f, 23.0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.79f)
                close()
                moveTo(15.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(16.79f, 23f)
                horizontalLineToRelative(-4.29f)
                verticalLineToRelative(-4.29f)
                lineToRelative(4.29f, 4.29f)
                close()
                moveTo(11.5f, 18.71f)
                verticalLineToRelative(4.29f)
                horizontalLineToRelative(-4.29f)
                lineToRelative(4.29f, -4.29f)
                close()
            }
        }.also { _Stage = it}
