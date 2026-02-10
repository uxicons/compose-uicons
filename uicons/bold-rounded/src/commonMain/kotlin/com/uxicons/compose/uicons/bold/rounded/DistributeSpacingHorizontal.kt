package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DistributeSpacingHorizontal: ImageVector? = null

val Icons.Br.DistributeSpacingHorizontal: ImageVector
    get() = _DistributeSpacingHorizontal ?: UXIcon(name = "DistributeSpacingHorizontal") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(19f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            lineTo(22f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(5f, 22.5f)
            lineTo(5f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            lineTo(2f, 22.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            close()
            moveTo(17f, 16f)
            lineTo(17f, 8f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            horizontalLineToRelative(-2f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(2f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            close()
            moveTo(13f, 7f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            lineTo(10f, 8f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(2f)
            close()
        }
    }.also { _DistributeSpacingHorizontal = it }
