package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkullHeart: ImageVector? = null

val Icons.Ss.SkullHeart: ImageVector
    get() = _SkullHeart ?: UXIcon(name = "SkullHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                close()
                moveTo(14.5f, 11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(8f, 12.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(4f, 15.27f)
                curveTo(1.82f, 12.74f, 0f, 9.81f, 0f, 7.05f)
                curveTo(0f, 3.16f, 2.92f, 0f, 6.5f, 0f)
                curveToRelative(2.31f, 0f, 4.35f, 1.32f, 5.5f, 3.3f)
                curveToRelative(1.15f, -1.98f, 3.19f, -3.3f, 5.5f, -3.3f)
                curveToRelative(3.58f, 0f, 6.5f, 3.16f, 6.5f, 7.05f)
                curveToRelative(0f, 2.76f, -1.82f, 5.69f, -4f, 8.22f)
                verticalLineToRelative(-3.27f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveTo(4f, 7.59f, 4f, 12f)
                verticalLineToRelative(3.27f)
                close()
                moveTo(22.2f, 19.98f)
                lineToRelative(-5.1f, 1.02f)
                lineToRelative(5.1f, 1.02f)
                lineToRelative(-0.39f, 1.96f)
                lineToRelative(-9.8f, -1.96f)
                lineToRelative(-9.8f, 1.96f)
                lineToRelative(-0.39f, -1.96f)
                lineToRelative(5.1f, -1.02f)
                lineToRelative(-5.1f, -1.02f)
                lineToRelative(0.39f, -1.96f)
                lineToRelative(9.8f, 1.96f)
                lineToRelative(9.8f, -1.96f)
                lineToRelative(0.39f, 1.96f)
                close()
            }
        }.also { _SkullHeart = it}
