package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SlidersV: ImageVector? = null

val Icons.Sr.SlidersV: ImageVector
    get() = _SlidersV ?: UXIcon(name = "SlidersV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 4.15f)
                lineTo(5f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.15f)
                curveToRelative(-1.44f, 0.43f, -2.5f, 1.77f, -2.5f, 3.35f)
                reflectiveCurveToRelative(1.06f, 2.92f, 2.5f, 3.35f)
                verticalLineToRelative(12.15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-12.15f)
                curveToRelative(1.44f, -0.43f, 2.5f, -1.77f, 2.5f, -3.35f)
                reflectiveCurveToRelative(-1.06f, -2.92f, -2.5f, -3.35f)
                close()
                moveTo(13f, 13.15f)
                lineTo(13f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(12.15f)
                curveToRelative(-1.44f, 0.43f, -2.5f, 1.77f, -2.5f, 3.35f)
                reflectiveCurveToRelative(1.06f, 2.92f, 2.5f, 3.35f)
                verticalLineToRelative(3.15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.15f)
                curveToRelative(1.44f, -0.43f, 2.5f, -1.77f, 2.5f, -3.35f)
                reflectiveCurveToRelative(-1.06f, -2.92f, -2.5f, -3.35f)
                close()
                moveTo(23.5f, 7.5f)
                curveToRelative(0f, -1.58f, -1.06f, -2.92f, -2.5f, -3.35f)
                lineTo(21f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.15f)
                curveToRelative(-1.44f, 0.43f, -2.5f, 1.77f, -2.5f, 3.35f)
                reflectiveCurveToRelative(1.06f, 2.92f, 2.5f, 3.35f)
                verticalLineToRelative(12.15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-12.15f)
                curveToRelative(1.44f, -0.43f, 2.5f, -1.77f, 2.5f, -3.35f)
                close()
            }
        }.also { _SlidersV = it}
