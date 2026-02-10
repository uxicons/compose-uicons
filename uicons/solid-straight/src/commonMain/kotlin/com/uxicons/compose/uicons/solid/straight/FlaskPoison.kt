package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlaskPoison: ImageVector? = null

val Icons.Ss.FlaskPoison: ImageVector
    get() = _FlaskPoison ?: UXIcon(name = "FlaskPoison") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(9f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 16.71f)
                curveToRelative(0f, 2.51f, -0.84f, 4.89f, -2.43f, 6.91f)
                lineToRelative(-0.3f, 0.38f)
                lineTo(2.73f, 24f)
                lineToRelative(-0.3f, -0.38f)
                curveToRelative(-1.59f, -2.01f, -2.43f, -4.4f, -2.43f, -6.91f)
                curveToRelative(0f, -4.54f, 2.73f, -8.56f, 7f, -10.42f)
                lineTo(7.0f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(5.0f, 0f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4.33f)
                curveToRelative(4.21f, 1.89f, 7f, 5.98f, 7f, 10.38f)
                close()
                moveTo(16f, 15f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _FlaskPoison = it}
