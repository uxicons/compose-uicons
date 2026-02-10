package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiamondExclamation: ImageVector? = null

val Icons.Rc.DiamondExclamation: ImageVector
    get() = _DiamondExclamation ?: UXIcon(name = "DiamondExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 13f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(22.84f, 12.54f)
                curveToRelative(-0.08f, 0.13f, -2.06f, 3.21f, -4.58f, 5.72f)
                reflectiveCurveToRelative(-5.59f, 4.5f, -5.72f, 4.58f)
                curveToRelative(-0.33f, 0.21f, -0.75f, 0.21f, -1.08f, 0f)
                curveToRelative(-0.13f, -0.08f, -3.21f, -2.06f, -5.72f, -4.58f)
                reflectiveCurveToRelative(-4.5f, -5.59f, -4.58f, -5.72f)
                curveToRelative(-0.21f, -0.33f, -0.21f, -0.75f, 0f, -1.08f)
                curveToRelative(0.08f, -0.13f, 2.06f, -3.21f, 4.58f, -5.72f)
                reflectiveCurveToRelative(5.59f, -4.5f, 5.72f, -4.58f)
                curveToRelative(0.33f, -0.21f, 0.75f, -0.21f, 1.08f, 0f)
                curveToRelative(0.13f, 0.08f, 3.21f, 2.06f, 5.72f, 4.58f)
                reflectiveCurveToRelative(4.5f, 5.59f, 4.58f, 5.72f)
                curveToRelative(0.21f, 0.33f, 0.21f, 0.75f, 0f, 1.08f)
                close()
                moveTo(20.8f, 12f)
                curveToRelative(-0.67f, -0.97f, -2.19f, -3.09f, -3.95f, -4.85f)
                reflectiveCurveToRelative(-3.88f, -3.28f, -4.85f, -3.95f)
                curveToRelative(-0.97f, 0.67f, -3.09f, 2.19f, -4.85f, 3.95f)
                reflectiveCurveToRelative(-3.28f, 3.88f, -3.95f, 4.85f)
                curveToRelative(0.67f, 0.97f, 2.19f, 3.09f, 3.95f, 4.85f)
                reflectiveCurveToRelative(3.88f, 3.28f, 4.85f, 3.95f)
                curveToRelative(0.97f, -0.67f, 3.09f, -2.19f, 4.85f, -3.95f)
                reflectiveCurveToRelative(3.28f, -3.88f, 3.95f, -4.85f)
                close()
            }
        }.also { _DiamondExclamation = it}
