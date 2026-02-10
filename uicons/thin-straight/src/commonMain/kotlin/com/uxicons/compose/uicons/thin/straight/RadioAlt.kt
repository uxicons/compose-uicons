package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RadioAlt: ImageVector? = null

val Icons.Ts.RadioAlt: ImageVector
    get() = _RadioAlt ?: UXIcon(name = "RadioAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 6f)
                lineTo(5.53f, 6f)
                lineTo(21.15f, 0.98f)
                lineToRelative(-0.31f, -0.95f)
                lineTo(2.21f, 6.02f)
                curveToRelative(-1.25f, 0.14f, -2.21f, 1.2f, -2.21f, 2.48f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 7f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 10f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 23f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(12f)
                lineTo(1f, 23f)
                close()
                moveTo(3f, 13f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                lineTo(3f, 14f)
                verticalLineToRelative(-1f)
                close()
                moveTo(3f, 20f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                lineTo(3f, 21f)
                verticalLineToRelative(-1f)
                close()
                moveTo(3f, 16.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                lineTo(3f, 17.5f)
                verticalLineToRelative(-1f)
                close()
                moveTo(17f, 13f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(17f, 20f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _RadioAlt = it}
