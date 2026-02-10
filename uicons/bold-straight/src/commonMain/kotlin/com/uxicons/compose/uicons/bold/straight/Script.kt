package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Script: ImageVector? = null

val Icons.Bs.Script: ImageVector
    get() = _Script ?: UXIcon(name = "Script") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 9.91f)
                lineToRelative(-3f, 3f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(8f, 4f)
                curveToRelative(0f, -0.35f, -0.06f, -0.68f, -0.14f, -1f)
                horizontalLineToRelative(7.23f)
                lineToRelative(2.61f, -2.61f)
                curveToRelative(-0.52f, -0.24f, -1.09f, -0.39f, -1.7f, -0.39f)
                lineTo(4f, 0f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(11f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6.09f)
                close()
                moveTo(5f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                close()
                moveTo(21f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-7.13f)
                curveToRelative(0.08f, -0.32f, 0.13f, -0.66f, 0.13f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                close()
                moveTo(13f, 7.91f)
                lineTo(20.27f, 0.64f)
                curveToRelative(0.85f, -0.85f, 2.23f, -0.85f, 3.09f, 0f)
                reflectiveCurveToRelative(0.85f, 2.23f, 0f, 3.09f)
                lineToRelative(-7.28f, 7.28f)
                horizontalLineToRelative(-3.09f)
                verticalLineToRelative(-3.09f)
                close()
            }
        }.also { _Script = it}
