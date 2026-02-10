package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CustomizeComputer: ImageVector? = null

val Icons.Ss.CustomizeComputer: ImageVector
    get() = _CustomizeComputer ?: UXIcon(name = "CustomizeComputer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 9f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                horizontalLineToRelative(-5f)
                reflectiveCurveToRelative(1f, -6f, 5f, -6f)
                close()
                moveTo(17.17f, 10.25f)
                lineToRelative(6.13f, -6.13f)
                curveToRelative(0.94f, -0.94f, 0.94f, -2.47f, 0.0f, -3.41f)
                curveToRelative(-0.94f, -0.94f, -2.47f, -0.94f, -3.41f, -0.0f)
                curveToRelative(-0.03f, 0.03f, -0.06f, 0.07f, -0.09f, 0.1f)
                lineToRelative(-5.86f, 6.43f)
                curveToRelative(1.49f, 0.45f, 2.69f, 1.56f, 3.23f, 3.01f)
                close()
                moveTo(12.5f, 17f)
                horizontalLineToRelative(-7.36f)
                lineToRelative(0.39f, -2.33f)
                curveToRelative(0.43f, -2.58f, 2.12f, -6.77f, 5.78f, -7.54f)
                lineToRelative(4.66f, -5.13f)
                lineTo(3f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                lineTo(24f, 6.24f)
                lineToRelative(-6.58f, 6.58f)
                curveToRelative(-0.4f, 2.36f, -2.44f, 4.18f, -4.92f, 4.18f)
                close()
            }
        }.also { _CustomizeComputer = it}
