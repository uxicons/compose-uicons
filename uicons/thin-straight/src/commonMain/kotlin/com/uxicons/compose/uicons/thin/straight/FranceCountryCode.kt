package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FranceCountryCode: ImageVector? = null

val Icons.Ts.FranceCountryCode: ImageVector
    get() = _FranceCountryCode ?: UXIcon(name = "FranceCountryCode") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 3f)
                horizontalLineToRelative(-19f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 20f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(17f, 10.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.1f, 0f, 0.2f, -0.02f, 0.29f, -0.03f)
                lineToRelative(0.92f, 3.03f)
                horizontalLineToRelative(1.05f)
                lineToRelative(-1.02f, -3.35f)
                curveToRelative(0.75f, -0.43f, 1.26f, -1.23f, 1.26f, -2.15f)
                close()
                moveTo(14.5f, 12f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(7f, 8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _FranceCountryCode = it}
