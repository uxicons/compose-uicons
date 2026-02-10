package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Raygun: ImageVector? = null

val Icons.Bs.Raygun: ImageVector
    get() = _Raygun ?: UXIcon(name = "Raygun") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                reflectiveCurveToRelative(-1.87f, 1.02f, -4f, 1.96f)
                lineTo(20f, 2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 1f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.18f, 0f, -3.84f, 0.36f, -6.49f, 1.22f)
                curveTo(5.09f, 1.26f, 2.95f, 0.98f, 0f, 0.98f)
                curveToRelative(0f, 0f, 1.59f, 1.29f, 2.23f, 3.58f)
                curveToRelative(-1.34f, 1.04f, -2.23f, 2.34f, -2.23f, 3.94f)
                curveToRelative(0f, 1.69f, 1.0f, 3.04f, 2.46f, 4.11f)
                lineTo(0f, 20.94f)
                verticalLineToRelative(2.06f)
                horizontalLineToRelative(7.89f)
                lineToRelative(1.98f, -7.46f)
                curveToRelative(1.55f, 0.32f, 2.88f, 0.46f, 3.62f, 0.46f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.96f)
                curveToRelative(2.13f, 0.94f, 4f, 1.96f, 4f, 1.96f)
                verticalLineToRelative(-7f)
                close()
                moveTo(5.59f, 20f)
                horizontalLineToRelative(-2.18f)
                lineToRelative(1.74f, -5.9f)
                curveToRelative(0.6f, 0.25f, 1.21f, 0.48f, 1.83f, 0.68f)
                lineToRelative(-1.39f, 5.22f)
                close()
                moveTo(12f, 12.88f)
                curveToRelative(-3.59f, -0.49f, -9f, -2.44f, -9f, -4.38f)
                reflectiveCurveToRelative(5.41f, -3.9f, 9f, -4.38f)
                verticalLineToRelative(8.77f)
                close()
            }
        }.also { _Raygun = it}
