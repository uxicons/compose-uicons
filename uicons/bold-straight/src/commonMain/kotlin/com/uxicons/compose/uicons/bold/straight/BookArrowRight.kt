package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookArrowRight: ImageVector? = null

val Icons.Bs.BookArrowRight: ImageVector
    get() = _BookArrowRight ?: UXIcon(name = "BookArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 14.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2.5f)
                lineToRelative(3.29f, 3.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-3.29f, 3.29f)
                close()
                moveTo(23f, 7.67f)
                lineToRelative(-3f, -3.0f)
                verticalLineToRelative(-1.67f)
                lineTo(10f, 3.0f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(10.33f)
                lineToRelative(2.67f, -2.67f)
                verticalLineToRelative(10.67f)
                lineTo(5f, 24.0f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(1f, 4f)
                curveTo(1f, 1.79f, 2.79f, 0f, 5f, 0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                lineTo(23f, 7.67f)
                close()
                moveTo(20f, 21.0f)
                verticalLineToRelative(-2f)
                lineTo(5f, 19.0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(15f)
                close()
                moveTo(7f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(12.14f)
                curveToRelative(0.32f, -0.08f, 0.65f, -0.14f, 1f, -0.14f)
                horizontalLineToRelative(2f)
                lineTo(7f, 3f)
                close()
            }
        }.also { _BookArrowRight = it}
