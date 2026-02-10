package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SunSalutationYoga: ImageVector? = null

val Icons.Bs.SunSalutationYoga: ImageVector
    get() = _SunSalutationYoga ?: UXIcon(name = "SunSalutationYoga") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(16.29f, 6.62f)
                lineToRelative(-1.28f, 1.75f)
                lineToRelative(-1.31f, -1.33f)
                curveToRelative(-0.69f, -0.65f, -1.66f, -1.01f, -2.61f, -1.03f)
                curveToRelative(-1.71f, 0.04f, -3.08f, 1.43f, -3.08f, 3.14f)
                verticalLineToRelative(4.85f)
                curveToRelative(0f, 1.41f, 0.67f, 2.75f, 1.8f, 3.6f)
                lineToRelative(0.2f, 0.15f)
                verticalLineToRelative(6.25f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-13.39f)
                lineToRelative(1.37f, 1.4f)
                horizontalLineToRelative(1.7f)
                lineToRelative(2.64f, -3.62f)
                lineToRelative(-2.42f, -1.77f)
                close()
            }
        }.also { _SunSalutationYoga = it}
