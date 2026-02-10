package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookCopy: ImageVector? = null

val Icons.Sr.BookCopy: ImageVector
    get() = _BookCopy ?: UXIcon(name = "BookCopy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.64f, 14f)
                horizontalLineToRelative(13.36f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-9.5f)
                curveToRelative(-1.47f, 0f, -2.64f, -1.26f, -2.49f, -2.76f)
                curveToRelative(0.13f, -1.3f, 1.32f, -2.24f, 2.63f, -2.24f)
                close()
                moveTo(10.64f, 12f)
                horizontalLineToRelative(13.36f)
                lineTo(24f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(8.81f)
                curveToRelative(0.76f, -0.51f, 1.67f, -0.81f, 2.64f, -0.81f)
                close()
                moveTo(6.03f, 17f)
                curveToRelative(-0.02f, -0.14f, -0.03f, -0.28f, -0.03f, -0.43f)
                horizontalLineToRelative(-0.0f)
                reflectiveCurveToRelative(0f, -11.57f, 0f, -11.57f)
                horizontalLineToRelative(-2f)
                curveTo(1.79f, 5f, 0f, 6.79f, 0f, 9f)
                verticalLineToRelative(8.81f)
                curveToRelative(0.76f, -0.51f, 1.67f, -0.81f, 2.64f, -0.81f)
                horizontalLineToRelative(3.39f)
                close()
                moveTo(10.5f, 21f)
                curveToRelative(-1.27f, 0f, -2.48f, -0.54f, -3.34f, -1.48f)
                curveToRelative(-0.15f, -0.16f, -0.28f, -0.34f, -0.4f, -0.52f)
                lineTo(2.64f, 19f)
                curveToRelative(-1.31f, 0f, -2.5f, 0.94f, -2.63f, 2.24f)
                curveToRelative(-0.15f, 1.5f, 1.02f, 2.76f, 2.49f, 2.76f)
                horizontalLineToRelative(9.5f)
                curveToRelative(1.86f, 0f, 3.43f, -1.27f, 3.87f, -3f)
                horizontalLineToRelative(-5.37f)
                close()
            }
        }.also { _BookCopy = it}
