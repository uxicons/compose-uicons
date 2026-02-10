package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FranceCountryCode: ImageVector? = null

val Icons.Bs.FranceCountryCode: ImageVector
    get() = _FranceCountryCode ?: UXIcon(name = "FranceCountryCode") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 3f)
                horizontalLineToRelative(-17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 18f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                close()
                moveTo(17f, 10.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(0.78f)
                lineToRelative(0.87f, 3f)
                horizontalLineToRelative(1.74f)
                lineToRelative(-1.05f, -3.46f)
                curveToRelative(0.02f, -0.02f, 0.02f, -0.02f, 0.04f, -0.03f)
                curveToRelative(-0.02f, 0.01f, -0.03f, 0.02f, -0.06f, 0.04f)
                curveToRelative(0.64f, -0.45f, 1.07f, -1.2f, 1.07f, -2.04f)
                close()
                moveTo(14.5f, 11.4f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.5f, 0f, 0.9f, 0.4f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.4f, 0.9f, -0.9f, 0.9f)
                close()
                moveTo(7f, 8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.6f)
                close()
            }
        }.also { _FranceCountryCode = it}
