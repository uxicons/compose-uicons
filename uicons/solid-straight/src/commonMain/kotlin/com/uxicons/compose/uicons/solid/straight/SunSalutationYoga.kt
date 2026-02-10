package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SunSalutationYoga: ImageVector? = null

val Icons.Ss.SunSalutationYoga: ImageVector
    get() = _SunSalutationYoga ?: UXIcon(name = "SunSalutationYoga") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(17f, 7.41f)
                lineToRelative(-1.57f, 2.15f)
                lineToRelative(-2.16f, -2.66f)
                curveToRelative(-0.59f, -0.56f, -1.36f, -0.87f, -2.16f, -0.9f)
                curveToRelative(-1.71f, -0.05f, -3.11f, 1.44f, -3.11f, 3.15f)
                verticalLineToRelative(5.03f)
                curveToRelative(0f, 1.21f, 0.62f, 2.33f, 1.64f, 2.96f)
                lineToRelative(1.36f, 0.85f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-11.1f)
                lineToRelative(-1f, -1.26f)
                verticalLineToRelative(-3.15f)
                lineToRelative(2.83f, 3.5f)
                horizontalLineToRelative(1.29f)
                lineToRelative(2.49f, -3.41f)
                lineToRelative(-1.61f, -1.18f)
                close()
            }
        }.also { _SunSalutationYoga = it}
