package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookArrowRight: ImageVector? = null

val Icons.Ss.BookArrowRight: ImageVector
    get() = _BookArrowRight ?: UXIcon(name = "BookArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 20f)
                lineTo(22f, 20f)
                verticalLineToRelative(4f)
                lineTo(4f, 24f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(6f, 18f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(15.77f)
                curveToRelative(0.55f, -0.49f, 1.26f, -0.77f, 2f, -0.77f)
                horizontalLineToRelative(2f)
                close()
                moveTo(22f, 2f)
                lineTo(22f, 18f)
                lineTo(8f, 18f)
                lineTo(8f, 0f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(19.42f, 8.59f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.3f, 2.29f)
                horizontalLineToRelative(-7.01f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7.0f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.3f, -3.3f)
                curveToRelative(0.77f, -0.78f, 0.77f, -2.04f, 0f, -2.81f)
                close()
            }
        }.also { _BookArrowRight = it}
