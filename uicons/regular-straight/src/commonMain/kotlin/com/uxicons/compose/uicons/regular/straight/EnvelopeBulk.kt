package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeBulk: ImageVector? = null

val Icons.Rs.EnvelopeBulk: ImageVector
    get() = _EnvelopeBulk ?: UXIcon(name = "EnvelopeBulk") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2f)
                lineTo(19f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(6f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(3f, 11f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(10f)
                lineTo(16f, 24f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(8f)
                lineTo(24f, 9f)
                close()
                moveTo(5f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                lineTo(5f, 3f)
                close()
                moveTo(12.59f, 13f)
                lineToRelative(-3.59f, 3.59f)
                curveToRelative(-0.53f, 0.53f, -1.45f, 0.53f, -1.98f, 0f)
                lineToRelative(-3.59f, -3.59f)
                lineTo(12.59f, 13f)
                close()
                moveTo(14f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-7.6f)
                lineToRelative(3.61f, 3.61f)
                curveToRelative(0.64f, 0.64f, 1.5f, 0.99f, 2.4f, 0.99f)
                reflectiveCurveToRelative(1.76f, -0.35f, 2.4f, -0.99f)
                lineToRelative(3.59f, -3.59f)
                verticalLineToRelative(7.58f)
                close()
                moveTo(22f, 17f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(8f)
                close()
                moveTo(18f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _EnvelopeBulk = it}
