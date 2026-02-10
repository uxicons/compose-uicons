package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SealExclamation: ImageVector? = null

val Icons.Sr.SealExclamation: ImageVector
    get() = _SealExclamation ?: UXIcon(name = "SealExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.16f, 9.88f)
                lineToRelative(-2.16f, -2.16f)
                verticalLineToRelative(-1.72f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-1.72f)
                lineTo(14.12f, 0.84f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineToRelative(-2.16f, 2.16f)
                horizontalLineToRelative(-1.72f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1.72f)
                lineTo(0.84f, 9.88f)
                curveTo(0.28f, 10.45f, -0.04f, 11.2f, -0.04f, 12f)
                reflectiveCurveToRelative(0.31f, 1.55f, 0.88f, 2.12f)
                lineToRelative(2.16f, 2.16f)
                verticalLineToRelative(1.72f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(1.72f)
                lineToRelative(2.16f, 2.16f)
                curveToRelative(0.58f, 0.58f, 1.35f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.54f, -0.29f, 2.12f, -0.88f)
                lineToRelative(2.16f, -2.16f)
                horizontalLineToRelative(1.72f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1.72f)
                lineToRelative(2.16f, -2.16f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                reflectiveCurveToRelative(-0.31f, -1.55f, -0.88f, -2.12f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(13f, 13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(11f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _SealExclamation = it}
