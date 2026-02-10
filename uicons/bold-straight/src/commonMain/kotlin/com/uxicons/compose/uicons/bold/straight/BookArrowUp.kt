package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookArrowUp: ImageVector? = null

val Icons.Bs.BookArrowUp: ImageVector
    get() = _BookArrowUp ?: UXIcon(name = "BookArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 14f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(3.29f, -3.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(3.29f, 3.29f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(23f, 2.5f)
                lineTo(23f, 10.67f)
                lineToRelative(-1.38f, -1.38f)
                curveToRelative(-0.46f, -0.46f, -1.03f, -0.73f, -1.62f, -0.83f)
                lineTo(20f, 3f)
                lineTo(10f, 3f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                lineTo(5f, 19f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(3f)
                lineTo(5f, 24f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(1f, 4f)
                curveTo(1f, 1.79f, 2.79f, 0f, 5f, 0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
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
        }.also { _BookArrowUp = it}
