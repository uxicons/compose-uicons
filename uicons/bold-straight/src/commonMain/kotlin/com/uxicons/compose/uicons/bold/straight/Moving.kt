package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Moving: ImageVector? = null

val Icons.Bs.Moving: ImageVector
    get() = _Moving ?: UXIcon(name = "Moving") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(14f, 10.98f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                lineTo(7f, 4f)
                horizontalLineToRelative(1f)
                lineTo(8f, 2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6.98f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(11f, 3f)
                verticalLineToRelative(2.98f)
                horizontalLineToRelative(2f)
                lineTo(13f, 3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(2.5f, 7f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveTo(0f, 3.12f, 0f, 4.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(4.7f, 9.28f)
                lineToRelative(-0.02f, 0.01f)
                curveToRelative(-0.42f, -0.77f, -1.24f, -1.29f, -2.19f, -1.29f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.1f, -2.5f, 2.48f)
                verticalLineToRelative(7.52f)
                lineTo(1f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.55f)
                lineToRelative(-1.75f, -3.72f)
                close()
                moveTo(21.5f, 8f)
                curveToRelative(-0.95f, 0f, -1.76f, 0.52f, -2.19f, 1.29f)
                lineToRelative(-0.02f, -0.01f)
                lineToRelative(-1.75f, 3.72f)
                horizontalLineToRelative(-2.55f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7.52f)
                curveToRelative(0f, -1.38f, -1.12f, -2.48f, -2.5f, -2.48f)
                close()
            }
        }.also { _Moving = it}
