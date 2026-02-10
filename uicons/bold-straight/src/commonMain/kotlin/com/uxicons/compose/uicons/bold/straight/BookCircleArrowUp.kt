package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookCircleArrowUp: ImageVector? = null

val Icons.Bs.BookCircleArrowUp: ImageVector
    get() = _BookCircleArrowUp ?: UXIcon(name = "BookCircleArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 11f)
                curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.91f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(19f, 17f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                lineToRelative(3.79f, -3.71f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(3.79f, 3.71f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(9.76f, 21f)
                horizontalLineToRelative(-5.76f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                lineTo(9f, 3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(6.14f)
                curveToRelative(1.09f, 0.19f, 2.1f, 0.59f, 3f, 1.16f)
                lineTo(22f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(4f, 0f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(8.03f)
                curveToRelative(-0.96f, -0.81f, -1.74f, -1.84f, -2.27f, -3f)
                close()
                moveTo(4f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.35f, 0f, -0.68f, 0.06f, -1f, 0.14f)
                lineTo(3f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
            }
        }.also { _BookCircleArrowUp = it}
