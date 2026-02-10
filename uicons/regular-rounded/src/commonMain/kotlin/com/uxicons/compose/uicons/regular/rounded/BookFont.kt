package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookFont: ImageVector? = null

val Icons.Rr.BookFont: ImageVector
    get() = _BookFont ?: UXIcon(name = "BookFont") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 0f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(11f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(22f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(20f, 5f)
                verticalLineToRelative(11f)
                lineTo(8f, 16f)
                lineTo(8f, 2f)
                horizontalLineToRelative(9f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(6f, 2.18f)
                verticalLineToRelative(13.82f)
                curveToRelative(-0.73f, 0f, -1.41f, 0.21f, -2f, 0.56f)
                lineTo(4f, 5f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                close()
                moveTo(17f, 22f)
                lineTo(6f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(10.79f, 14f)
                horizontalLineToRelative(0f)
                curveToRelative(0.42f, 0f, 0.8f, -0.27f, 0.94f, -0.66f)
                lineToRelative(0.48f, -1.34f)
                horizontalLineToRelative(3.59f)
                lineToRelative(0.48f, 1.34f)
                curveToRelative(0.14f, 0.4f, 0.52f, 0.66f, 0.94f, 0.66f)
                curveToRelative(0.69f, 0f, 1.17f, -0.68f, 0.94f, -1.34f)
                lineToRelative(-2.74f, -7.69f)
                curveToRelative(-0.22f, -0.6f, -0.77f, -0.99f, -1.41f, -0.99f)
                reflectiveCurveToRelative(-1.19f, 0.39f, -1.41f, 1f)
                lineToRelative(-2.74f, 7.69f)
                curveToRelative(-0.23f, 0.65f, 0.25f, 1.34f, 0.94f, 1.34f)
                close()
                moveTo(15.09f, 10f)
                horizontalLineToRelative(-2.16f)
                lineToRelative(1.08f, -3.03f)
                lineToRelative(1.08f, 3.03f)
                close()
            }
        }.also { _BookFont = it}
