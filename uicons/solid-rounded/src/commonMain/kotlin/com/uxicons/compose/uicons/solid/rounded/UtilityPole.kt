package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UtilityPole: ImageVector? = null

val Icons.Sr.UtilityPole: ImageVector
    get() = _UtilityPole ?: UXIcon(name = "UtilityPole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveTo(0f, 0.45f, 0f, 1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(2.09f)
                lineToRelative(6.41f, 6.41f)
                verticalLineToRelative(12.59f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-12.59f)
                lineToRelative(6.41f, -6.41f)
                horizontalLineToRelative(2.09f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(7.41f, 4f)
                horizontalLineToRelative(3.59f)
                verticalLineToRelative(3.59f)
                lineToRelative(-3.59f, -3.59f)
                close()
                moveTo(13f, 4f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-3.59f, 3.59f)
                verticalLineToRelative(-3.59f)
                close()
            }
        }.also { _UtilityPole = it}
