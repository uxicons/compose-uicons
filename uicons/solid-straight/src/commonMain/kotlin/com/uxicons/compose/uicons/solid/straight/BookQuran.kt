package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookQuran: ImageVector? = null

val Icons.Ss.BookQuran: ImageVector
    get() = _BookQuran ?: UXIcon(name = "BookQuran") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(2f, 24f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(22f, 3f)
                verticalLineToRelative(15.77f)
                curveToRelative(-0.55f, -0.49f, -1.26f, -0.77f, -2f, -0.77f)
                lineTo(2f, 18f)
                lineTo(2f, 2f)
                curveTo(2f, 0.9f, 2.9f, 0f, 4f, 0f)
                horizontalLineToRelative(15f)
                curveTo(20.66f, 0f, 22f, 1.34f, 22f, 3f)
                close()
                moveTo(13.68f, 13.7f)
                curveToRelative(-1.94f, -0.69f, -3.34f, -2.52f, -3.34f, -4.7f)
                reflectiveCurveToRelative(1.4f, -4.01f, 3.34f, -4.7f)
                curveToRelative(-0.53f, -0.19f, -1.09f, -0.3f, -1.68f, -0.3f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(0.59f, 0f, 1.15f, -0.11f, 1.68f, -0.3f)
                close()
                moveTo(17f, 8f)
                horizontalLineToRelative(-1.8f)
                lineToRelative(-0.49f, -1.88f)
                horizontalLineToRelative(-0.4f)
                lineToRelative(-0.49f, 1.88f)
                horizontalLineToRelative(-1.81f)
                verticalLineToRelative(0.38f)
                lineToRelative(1.38f, 0.77f)
                lineToRelative(-0.54f, 1.7f)
                lineToRelative(0.3f, 0.23f)
                lineToRelative(1.36f, -1.05f)
                lineToRelative(1.36f, 1.05f)
                lineToRelative(0.31f, -0.22f)
                lineToRelative(-0.55f, -1.68f)
                lineToRelative(1.38f, -0.8f)
                verticalLineToRelative(-0.38f)
                close()
            }
        }.also { _BookQuran = it}
