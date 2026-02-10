package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilmCanister: ImageVector? = null

val Icons.Rr.FilmCanister: ImageVector
    get() = _FilmCanister ?: UXIcon(name = "FilmCanister") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(1f, 0f)
                curveTo(0.45f, 0f, 0f, 0.45f, 0f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(22f, 8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(14f, 14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(17f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(4f, 22f)
                lineTo(4f, 2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(20f)
                lineTo(4f, 22f)
                close()
                moveTo(14f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _FilmCanister = it}
