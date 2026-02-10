package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookAtlas: ImageVector? = null

val Icons.Bs.BookAtlas: ImageVector
    get() = _BookAtlas ?: UXIcon(name = "BookAtlas") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 9.5f)
                curveToRelative(0f, -2.02f, 1.09f, -3.78f, 2.71f, -4.74f)
                curveToRelative(-0.34f, 0.96f, -0.55f, 2.08f, -0.65f, 3.24f)
                horizontalLineToRelative(2.01f)
                curveToRelative(0.25f, -2.5f, 1.06f, -3.94f, 1.43f, -4f)
                horizontalLineToRelative(0f)
                curveToRelative(0.37f, 0.06f, 1.18f, 1.5f, 1.43f, 4f)
                horizontalLineToRelative(2.01f)
                curveToRelative(-0.1f, -1.16f, -0.31f, -2.28f, -0.65f, -3.24f)
                curveToRelative(1.62f, 0.96f, 2.71f, 2.72f, 2.71f, 4.74f)
                reflectiveCurveToRelative(-1.09f, 3.78f, -2.71f, 4.74f)
                curveToRelative(0.34f, -0.96f, 0.55f, -2.08f, 0.65f, -3.24f)
                horizontalLineToRelative(-2.01f)
                curveToRelative(-0.25f, 2.5f, -1.06f, 3.94f, -1.43f, 4f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.37f, -0.06f, -1.18f, -1.5f, -1.43f, -4f)
                horizontalLineToRelative(-2.01f)
                curveToRelative(0.1f, 1.16f, 0.31f, 2.28f, 0.65f, 3.24f)
                curveToRelative(-1.62f, -0.96f, -2.71f, -2.72f, -2.71f, -4.74f)
                close()
                moveTo(23f, 2.5f)
                lineTo(23f, 24f)
                lineTo(5f, 24f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(1f, 4f)
                curveTo(1f, 1.79f, 2.79f, 0f, 5f, 0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(20f, 19f)
                lineTo(5f, 19f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-2f)
                close()
                moveTo(20f, 3f)
                lineTo(5f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(12.13f)
                curveToRelative(0.32f, -0.08f, 0.66f, -0.13f, 1f, -0.13f)
                horizontalLineToRelative(15f)
                lineTo(20f, 3f)
                close()
            }
        }.also { _BookAtlas = it}
