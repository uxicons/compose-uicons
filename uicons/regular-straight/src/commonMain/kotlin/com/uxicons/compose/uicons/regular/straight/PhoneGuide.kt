package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneGuide: ImageVector? = null

val Icons.Rs.PhoneGuide: ImageVector
    get() = _PhoneGuide ?: UXIcon(name = "PhoneGuide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8.51f)
                curveToRelative(-0.4f, -0.65f, -0.73f, -1.32f, -0.99f, -2f)
                horizontalLineToRelative(-4.52f)
                lineTo(6f, 2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(11.0f)
                lineToRelative(2f, 2f)
                lineTo(20f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(12.27f)
                curveToRelative(-0.81f, -0.58f, -1.56f, -1.26f, -2.23f, -2f)
                lineTo(3f, 22f)
                close()
                moveTo(3f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.35f, 0f, -0.69f, 0.07f, -1f, 0.18f)
                lineTo(2f, 3f)
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
