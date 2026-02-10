package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireHydrant: ImageVector? = null

val Icons.Rr.FireHydrant: ImageVector
    get() = _FireHydrant ?: UXIcon(name = "FireHydrant") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 22f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.97f, -2.17f, -5.44f, -5f, -5.92f)
                verticalLineToRelative(-1.08f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.08f)
                curveToRelative(-2.83f, 0.48f, -5f, 2.95f, -5f, 5.92f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(12f, 4f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                horizontalLineToRelative(-8f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
                moveTo(8f, 10f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-12f)
                close()
                moveTo(13.5f, 13.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _FireHydrant = it}
