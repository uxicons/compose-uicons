package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Package: ImageVector? = null

val Icons.Ts.Package: ImageVector
    get() = _Package ?: UXIcon(name = "Package") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -2.33f, -1.46f, -4.33f, -3.51f, -5.13f)
                curveToRelative(0.91f, -0.63f, 1.51f, -1.69f, 1.51f, -2.87f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 1.19f, 0.6f, 2.24f, 1.51f, 2.87f)
                curveToRelative(-2.05f, 0.8f, -3.51f, 2.8f, -3.51f, 5.13f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1f)
                lineTo(24f, 8f)
                horizontalLineToRelative(-9f)
                close()
                moveTo(19f, 9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(1f, 11.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(4.5f)
                lineTo(1f, 16f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(16f, 16f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-7f)
                close()
            }
        }.also { _Package = it}
