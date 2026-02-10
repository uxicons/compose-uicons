package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookBookmark: ImageVector? = null

val Icons.Sr.BookBookmark: ImageVector
    get() = _BookBookmark ?: UXIcon(name = "BookBookmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.39f, 16.06f)
                curveToRelative(0.2f, -0.04f, 0.4f, -0.06f, 0.6f, -0.06f)
                horizontalLineToRelative(1f)
                lineTo(6f, 0.1f)
                curveTo(3.67f, 0.57f, 2f, 2.62f, 2f, 5f)
                verticalLineToRelative(12.03f)
                curveToRelative(0.7f, -0.53f, 1.52f, -0.86f, 2.4f, -0.96f)
                close()
                moveTo(22f, 18f)
                lineTo(5f, 18f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-1f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(11f)
                lineTo(8f, 16f)
                lineTo(8f, 0f)
                horizontalLineToRelative(5f)
                lineTo(13f, 10.35f)
                curveToRelative(0f, 0.62f, 0.79f, 0.89f, 1.17f, 0.4f)
                lineToRelative(1.33f, -1.74f)
                lineToRelative(1.33f, 1.74f)
                curveToRelative(0.38f, 0.49f, 1.17f, 0.23f, 1.17f, -0.4f)
                lineTo(18f, 0.1f)
                curveToRelative(2.28f, 0.46f, 4f, 2.48f, 4f, 4.9f)
                close()
            }
        }.also { _BookBookmark = it}
