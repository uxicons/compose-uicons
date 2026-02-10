package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Serum: ImageVector? = null

val Icons.Ss.Serum: ImageVector
    get() = _Serum ?: UXIcon(name = "Serum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 14f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(5f, 19f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.56f, -0.75f, -3.06f, -2f, -4f)
                lineToRelative(-1f, -0.75f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(1.75f)
                lineToRelative(-1f, 0.75f)
                curveToRelative(-1.25f, 0.94f, -2f, 2.44f, -2f, 4f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-5f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.46f)
                curveToRelative(0f, 0.74f, 0.4f, 1.38f, 1f, 1.72f)
                verticalLineToRelative(1.81f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.81f)
                curveToRelative(0.61f, -0.34f, 1.0f, -0.99f, 1f, -1.72f)
                verticalLineToRelative(-5.46f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                close()
                moveTo(21.41f, 20.59f)
                lineTo(20f, 19.2f)
                lineTo(18.59f, 20.59f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.59f, 1.41f, 0.59f)
                reflectiveCurveToRelative(1.02f, -0.2f, 1.41f, -0.59f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                close()
            }
        }.also { _Serum = it}
