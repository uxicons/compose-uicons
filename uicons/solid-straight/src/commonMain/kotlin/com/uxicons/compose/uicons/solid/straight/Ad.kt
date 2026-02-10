package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ad: ImageVector? = null

val Icons.Ss.Ad: ImageVector
    get() = _Ad ?: UXIcon(name = "Ad") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 5f)
                lineTo(24f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(12.63f, 18f)
                lineTo(8.35f, 6f)
                horizontalLineToRelative(-0.69f)
                lineTo(3.37f, 18f)
                horizontalLineToRelative(2.12f)
                lineToRelative(0.71f, -2f)
                horizontalLineToRelative(3.59f)
                lineToRelative(0.71f, 2f)
                horizontalLineToRelative(2.12f)
                close()
                moveTo(20f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5.35f)
                curveToRelative(-0.46f, -0.22f, -0.96f, -0.35f, -1.5f, -0.35f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.54f, 0f, 1.04f, -0.13f, 1.5f, -0.35f)
                verticalLineToRelative(0.35f)
                horizontalLineToRelative(2f)
                lineTo(20f, 6f)
                close()
                moveTo(6.92f, 14f)
                horizontalLineToRelative(2.16f)
                lineToRelative(-1.08f, -3.03f)
                lineToRelative(-1.08f, 3.03f)
                close()
            }
        }.also { _Ad = it}
