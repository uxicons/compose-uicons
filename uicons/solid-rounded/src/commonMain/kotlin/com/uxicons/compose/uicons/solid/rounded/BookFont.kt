package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookFont: ImageVector? = null

val Icons.Sr.BookFont: ImageVector
    get() = _BookFont ?: UXIcon(name = "BookFont") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 5.97f)
                lineToRelative(1.08f, 3.03f)
                horizontalLineToRelative(-2.16f)
                lineToRelative(1.08f, -3.03f)
                close()
                moveTo(5f, 16f)
                horizontalLineToRelative(1f)
                lineTo(6f, 0.1f)
                curveTo(3.67f, 0.58f, 2f, 2.62f, 2f, 5f)
                verticalLineToRelative(12.02f)
                curveToRelative(0.7f, -0.53f, 1.53f, -0.86f, 2.4f, -0.96f)
                curveToRelative(0.2f, -0.04f, 0.4f, -0.06f, 0.6f, -0.06f)
                close()
                moveTo(2f, 21f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-1f)
                lineTo(5f, 18f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(11f)
                lineTo(8f, 16f)
                lineTo(8f, 0f)
                horizontalLineToRelative(9f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(19.16f, 11.66f)
                lineToRelative(-2.74f, -7.69f)
                curveToRelative(-0.22f, -0.6f, -0.77f, -0.99f, -1.41f, -0.99f)
                reflectiveCurveToRelative(-1.19f, 0.39f, -1.41f, 1f)
                lineToRelative(-2.74f, 7.69f)
                curveToRelative(-0.23f, 0.65f, 0.25f, 1.34f, 0.94f, 1.34f)
                horizontalLineToRelative(0f)
                curveToRelative(0.42f, 0f, 0.8f, -0.27f, 0.94f, -0.66f)
                lineToRelative(0.48f, -1.34f)
                horizontalLineToRelative(3.59f)
                lineToRelative(0.48f, 1.34f)
                curveToRelative(0.14f, 0.4f, 0.52f, 0.66f, 0.94f, 0.66f)
                curveToRelative(0.69f, 0f, 1.17f, -0.68f, 0.94f, -1.34f)
                close()
            }
        }.also { _BookFont = it}
