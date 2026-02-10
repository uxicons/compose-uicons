package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireExtinguisher: ImageVector? = null

val Icons.Ts.FireExtinguisher: ImageVector
    get() = _FireExtinguisher ?: UXIcon(name = "FireExtinguisher") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 0.99f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.06f)
                curveTo(3.22f, 3.18f, 1.51f, 3.73f, 0.01f, 4.72f)
                lineToRelative(0.55f, 0.83f)
                curveToRelative(1.33f, -0.88f, 2.85f, -1.38f, 4.44f, -1.51f)
                verticalLineToRelative(1.97f)
                curveToRelative(-2.8f, 0.25f, -5f, 2.61f, -5f, 5.47f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-12.5f)
                curveToRelative(0f, -2.86f, -2.2f, -5.22f, -5f, -5.47f)
                verticalLineToRelative(-2.02f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7f)
                lineTo(6.0f, 0.99f)
                close()
                moveTo(10f, 11.49f)
                verticalLineToRelative(11.5f)
                lineTo(1f, 22.99f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                lineTo(1f, 18.99f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(15f, 2.7f)
                verticalLineToRelative(1.58f)
                lineToRelative(9f, 2.7f)
                lineTo(24f, 0f)
                lineToRelative(-9f, 2.7f)
                close()
                moveTo(23f, 5.64f)
                lineToRelative(-7f, -2.1f)
                verticalLineToRelative(-0.09f)
                lineToRelative(7f, -2.1f)
                verticalLineToRelative(4.3f)
                close()
            }
        }.also { _FireExtinguisher = it}
