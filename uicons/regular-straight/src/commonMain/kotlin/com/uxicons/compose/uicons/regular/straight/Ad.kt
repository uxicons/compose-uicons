package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ad: ImageVector? = null

val Icons.Rs.Ad: ImageVector
    get() = _Ad ?: UXIcon(name = "Ad") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                lineTo(3f, 2f)
                curveTo(1.35f, 2f, 0f, 3.35f, 0f, 5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 20f)
                lineTo(2f, 20f)
                lineTo(2f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15f)
                close()
                moveTo(18f, 11.34f)
                curveToRelative(-0.46f, -0.22f, -0.96f, -0.34f, -1.5f, -0.34f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.54f, 0f, 1.04f, -0.12f, 1.5f, -0.34f)
                verticalLineToRelative(0.34f)
                horizontalLineToRelative(2f)
                lineTo(20f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5.34f)
                close()
                moveTo(16.5f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(7.65f, 6f)
                lineTo(3.37f, 18f)
                horizontalLineToRelative(2.12f)
                lineToRelative(0.71f, -2f)
                horizontalLineToRelative(3.59f)
                lineToRelative(0.71f, 2f)
                horizontalLineToRelative(2.12f)
                lineTo(8.35f, 6f)
                horizontalLineToRelative(-0.69f)
                close()
                moveTo(6.92f, 14f)
                lineToRelative(1.08f, -3.03f)
                lineToRelative(1.08f, 3.03f)
                horizontalLineToRelative(-2.16f)
                close()
            }
        }.also { _Ad = it}
