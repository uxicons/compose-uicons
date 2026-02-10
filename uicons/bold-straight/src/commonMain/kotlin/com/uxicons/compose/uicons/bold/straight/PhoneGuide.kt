package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneGuide: ImageVector? = null

val Icons.Bs.PhoneGuide: ImageVector
    get() = _PhoneGuide ?: UXIcon(name = "PhoneGuide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.2f, 21f)
                lineTo(4f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6.95f)
                curveToRelative(-0.49f, -0.99f, -0.8f, -2.0f, -0.91f, -3f)
                horizontalLineToRelative(-1.05f)
                lineTo(9.0f, 3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(11.0f)
                lineToRelative(3f, 3f)
                lineTo(22.0f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(4f, 0f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(11.27f)
                curveToRelative(-1.15f, -0.83f, -2.21f, -1.86f, -3.07f, -3f)
                close()
                moveTo(4f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.35f, 0f, -0.68f, 0.06f, -1f, 0.14f)
                lineTo(3f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(24f, 21.83f)
                lineToRelative(-1.38f, 1.38f)
                curveToRelative(-0.54f, 0.54f, -1.25f, 0.8f, -1.96f, 0.8f)
                curveToRelative(-3.63f, 0f, -8.66f, -4.75f, -8.66f, -8.66f)
                curveToRelative(0f, -0.71f, 0.26f, -1.42f, 0.8f, -1.96f)
                lineToRelative(1.38f, -1.38f)
                lineToRelative(2.71f, 2.71f)
                lineToRelative(-1.77f, 1.77f)
                curveToRelative(0.88f, 2.19f, 2.38f, 3.63f, 4.4f, 4.4f)
                lineToRelative(1.77f, -1.77f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(2.71f, 2.71f, 2.71f, 2.71f)
                close()
            }
        }.also { _PhoneGuide = it}
