package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedEmpty: ImageVector? = null

val Icons.Tc.BedEmpty: ImageVector
    get() = _BedEmpty ?: UXIcon(name = "BedEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.55f, 11.5f)
                curveToRelative(-0.05f, -0.01f, -5.09f, -0.5f, -10.55f, -0.5f)
                curveToRelative(-4.42f, 0f, -8.55f, 0.33f, -10f, 0.45f)
                verticalLineToRelative(-7.95f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(17f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.95f)
                curveToRelative(1.45f, 0.13f, 5.58f, 0.45f, 10f, 0.45f)
                reflectiveCurveToRelative(8.55f, -0.33f, 10f, -0.45f)
                verticalLineToRelative(1.95f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -0.26f, -0.2f, -0.47f, -0.45f, -0.5f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-4.48f, 0f, -8.66f, -0.34f, -10f, -0.46f)
                verticalLineToRelative(-5.09f)
                curveToRelative(1.34f, -0.12f, 5.52f, -0.46f, 10f, -0.46f)
                reflectiveCurveToRelative(8.65f, 0.34f, 10f, 0.46f)
                verticalLineToRelative(5.09f)
                curveToRelative(-1.34f, 0.12f, -5.52f, 0.46f, -10f, 0.46f)
                close()
            }
        }.also { _BedEmpty = it}
