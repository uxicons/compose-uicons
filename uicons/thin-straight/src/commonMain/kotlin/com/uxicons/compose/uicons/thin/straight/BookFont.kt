package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookFont: ImageVector? = null

val Icons.Ts.BookFont: ImageVector
    get() = _BookFont ?: UXIcon(name = "BookFont") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(2f, 21.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(22f, 24f)
                lineTo(22f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(21f, 1.5f)
                lineTo(21f, 19f)
                lineTo(7f, 19f)
                lineTo(7f, 1f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(4.5f, 1f)
                horizontalLineToRelative(1.5f)
                lineTo(6f, 19f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.56f, 0f, -1.08f, 0.19f, -1.5f, 0.5f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21f, 20f)
                verticalLineToRelative(3f)
                lineTo(4.5f, 23f)
                close()
                moveTo(10.18f, 15f)
                lineToRelative(0.98f, -3f)
                horizontalLineToRelative(5.58f)
                lineToRelative(1.1f, 3f)
                horizontalLineToRelative(1.06f)
                lineToRelative(-3.17f, -8.67f)
                curveToRelative(-0.29f, -0.8f, -1.03f, -1.33f, -1.88f, -1.33f)
                reflectiveCurveToRelative(-1.59f, 0.52f, -1.88f, 1.33f)
                lineToRelative(-2.85f, 8.67f)
                horizontalLineToRelative(1.07f)
                close()
                moveTo(12.91f, 6.66f)
                curveToRelative(0.14f, -0.4f, 0.51f, -0.66f, 0.94f, -0.66f)
                reflectiveCurveToRelative(0.8f, 0.26f, 0.94f, 0.66f)
                lineToRelative(1.59f, 4.34f)
                horizontalLineToRelative(-4.89f)
                lineToRelative(1.42f, -4.34f)
                close()
            }
        }.also { _BookFont = it}
