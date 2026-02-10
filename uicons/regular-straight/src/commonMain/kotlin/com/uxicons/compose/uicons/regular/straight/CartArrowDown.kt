package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CartArrowDown: ImageVector? = null

val Icons.Rs.CartArrowDown: ImageVector
    get() = _CartArrowDown ?: UXIcon(name = "CartArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.59f, 15f)
                lineTo(6.65f, 15f)
                lineToRelative(0.13f, 1.12f)
                curveToRelative(0.06f, 0.5f, 0.49f, 0.88f, 0.99f, 0.88f)
                horizontalLineToRelative(12.22f)
                verticalLineToRelative(2f)
                lineTo(7.78f, 19f)
                curveToRelative(-1.52f, 0f, -2.8f, -1.14f, -2.98f, -2.65f)
                lineTo(3.21f, 2.88f)
                curveToRelative(-0.06f, -0.5f, -0.49f, -0.88f, -0.99f, -0.88f)
                lineTo(0f, 2f)
                lineTo(0f, 0f)
                lineTo(2.22f, 0f)
                curveToRelative(1.52f, 0f, 2.8f, 1.14f, 2.98f, 2.65f)
                lineToRelative(0.04f, 0.35f)
                horizontalLineToRelative(4.76f)
                verticalLineToRelative(2f)
                lineTo(5.48f, 5f)
                lineToRelative(0.94f, 8f)
                horizontalLineToRelative(13.54f)
                lineToRelative(1.6f, -8f)
                horizontalLineToRelative(-5.55f)
                lineTo(16.01f, 3f)
                horizontalLineToRelative(7.99f)
                lineToRelative(-2.4f, 12f)
                close()
                moveTo(7f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(17f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(8.89f, 7.72f)
                lineToRelative(2.69f, 2.69f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                reflectiveCurveToRelative(1.02f, -0.19f, 1.41f, -0.58f)
                lineToRelative(2.68f, -2.68f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.68f, 1.68f)
                lineTo(13.99f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(11.99f, 8f)
                lineToRelative(-1.69f, -1.69f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
        }.also { _CartArrowDown = it}
