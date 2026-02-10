package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhonePlus: ImageVector? = null

val Icons.Sc.PhonePlus: ImageVector
    get() = _PhonePlus ?: UXIcon(name = "PhonePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 17.25f)
                curveToRelative(0f, 2.83f, -2.43f, 5.75f, -6.5f, 5.75f)
                curveToRelative(-2.37f, 0f, -7.04f, -2.13f, -10.21f, -5.29f)
                reflectiveCurveToRelative(-5.29f, -7.83f, -5.29f, -10.21f)
                curveToRelative(0f, -4.07f, 2.92f, -6.5f, 5.75f, -6.5f)
                curveToRelative(2.62f, 0f, 4.75f, 2.13f, 4.75f, 4.75f)
                curveToRelative(0.01f, 1.43f, -0.66f, 2.79f, -1.76f, 3.7f)
                curveToRelative(0.26f, 0.63f, 1.08f, 1.97f, 1.96f, 2.85f)
                reflectiveCurveToRelative(2.21f, 1.71f, 2.85f, 1.96f)
                curveToRelative(0.91f, -1.1f, 2.27f, -1.76f, 3.7f, -1.76f)
                curveToRelative(2.62f, 0f, 4.75f, 2.13f, 4.75f, 4.75f)
                close()
                moveTo(15.5f, 7f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }.also { _PhonePlus = it}
