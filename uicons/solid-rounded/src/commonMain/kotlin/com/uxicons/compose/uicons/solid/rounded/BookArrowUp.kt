package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookArrowUp: ImageVector? = null

val Icons.Sr.BookArrowUp: ImageVector
    get() = _BookArrowUp ?: UXIcon(name = "BookArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.39f, 16.06f)
                curveToRelative(-0.87f, 0.1f, -1.7f, 0.44f, -2.4f, 0.96f)
                lineTo(2f, 5f)
                curveToRelative(0f, -2.38f, 1.67f, -4.42f, 4f, -4.9f)
                verticalLineToRelative(15.9f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.2f, 0f, -0.41f, 0.02f, -0.6f, 0.06f)
                close()
                moveTo(2f, 21f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-6f)
                lineTo(5f, 18f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                close()
                moveTo(16f, 24f)
                horizontalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                close()
                moveTo(17f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 16f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-6.4f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.61f, -1.61f)
                curveToRelative(1.15f, -1.15f, 3.03f, -1.15f, 4.19f, 0f)
                lineToRelative(1.61f, 1.61f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.29f, -1.29f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(5f)
                lineTo(22f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _BookArrowUp = it}
