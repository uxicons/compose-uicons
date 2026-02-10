package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SadCry: ImageVector? = null

val Icons.Ss.SadCry: ImageVector
    get() = _SadCry ?: UXIcon(name = "SadCry") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(0.34f, 0.03f, -4.35f, 15.05f, 5f, 21.73f)
                lineTo(5f, 13f)
                lineTo(7f, 13f)
                verticalLineToRelative(9.9f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 0f)
                lineTo(17f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8.73f)
                curveTo(28.35f, 15.05f, 23.65f, 0.02f, 12f, 0f)
                close()
                moveTo(8f, 9f)
                curveToRelative(-0.32f, 0f, -1f, 0.95f, -1f, 2f)
                lineTo(5f, 11f)
                curveToRelative(0.25f, -5.29f, 5.75f, -5.28f, 6f, 0f)
                lineTo(9f, 11f)
                curveTo(9f, 9.95f, 8.32f, 9f, 8f, 9f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-2.63f, -0.07f, -2.63f, -5.93f, 0f, -6f)
                curveTo(14.63f, 13.07f, 14.63f, 18.93f, 12f, 19f)
                close()
                moveTo(17f, 11f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                lineTo(13f, 11f)
                curveToRelative(0.25f, -5.29f, 5.75f, -5.28f, 6f, 0f)
                close()
            }
        }.also { _SadCry = it}
