package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiamondExclamation: ImageVector? = null

val Icons.Sc.DiamondExclamation: ImageVector
    get() = _DiamondExclamation ?: UXIcon(name = "DiamondExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.84f, 11.46f)
                curveToRelative(-0.08f, -0.13f, -2.06f, -3.21f, -4.58f, -5.72f)
                reflectiveCurveToRelative(-5.59f, -4.5f, -5.72f, -4.58f)
                curveToRelative(-0.33f, -0.21f, -0.75f, -0.21f, -1.08f, 0f)
                curveToRelative(-0.13f, 0.08f, -3.21f, 2.06f, -5.72f, 4.58f)
                reflectiveCurveToRelative(-4.5f, 5.59f, -4.58f, 5.72f)
                curveToRelative(-0.21f, 0.33f, -0.21f, 0.75f, 0f, 1.08f)
                curveToRelative(0.08f, 0.13f, 2.06f, 3.21f, 4.58f, 5.72f)
                reflectiveCurveToRelative(5.59f, 4.5f, 5.72f, 4.58f)
                curveToRelative(0.33f, 0.21f, 0.75f, 0.21f, 1.08f, 0f)
                curveToRelative(0.13f, -0.08f, 3.21f, -2.06f, 5.72f, -4.58f)
                reflectiveCurveToRelative(4.5f, -5.59f, 4.58f, -5.72f)
                curveToRelative(0.21f, -0.33f, 0.21f, -0.75f, 0f, -1.08f)
                close()
                moveTo(11f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _DiamondExclamation = it}
