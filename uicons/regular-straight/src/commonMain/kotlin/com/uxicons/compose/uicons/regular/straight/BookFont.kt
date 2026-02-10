package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookFont: ImageVector? = null

val Icons.Rs.BookFont: ImageVector
    get() = _BookFont ?: UXIcon(name = "BookFont") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                lineTo(5f, 0f)
                curveTo(3.35f, 0f, 2f, 1.35f, 2f, 3f)
                lineTo(2f, 21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(22f, 24f)
                lineTo(22f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(20f, 18f)
                lineTo(8f, 18f)
                lineTo(8f, 2f)
                horizontalLineToRelative(12f)
                lineTo(20f, 18f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(1f)
                lineTo(6f, 18f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.35f, 0f, -0.69f, 0.06f, -1f, 0.17f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(5f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                lineTo(5f, 22f)
                close()
                moveTo(11.49f, 15.02f)
                lineToRelative(0.71f, -2f)
                horizontalLineToRelative(3.59f)
                lineToRelative(0.71f, 2f)
                horizontalLineToRelative(2.12f)
                lineToRelative(-3.22f, -9.02f)
                curveToRelative(-0.22f, -0.6f, -0.77f, -0.99f, -1.41f, -0.99f)
                reflectiveCurveToRelative(-1.19f, 0.39f, -1.41f, 1f)
                lineToRelative(-3.22f, 9.02f)
                horizontalLineToRelative(2.12f)
                close()
                moveTo(14f, 7.99f)
                lineToRelative(1.08f, 3.03f)
                horizontalLineToRelative(-2.16f)
                lineToRelative(1.08f, -3.03f)
                close()
            }
        }.also { _BookFont = it}
