package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chip: ImageVector? = null

val Icons.Sr.Chip: ImageVector
    get() = _Chip ?: UXIcon(name = "Chip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 4.98f)
                curveTo(4.25f, 2.19f, 7.4f, 0.3f, 11f, 0f)
                lineTo(11f, 4.02f)
                curveToRelative(-2.15f, 0.27f, -4.03f, 1.39f, -5.3f, 3.02f)
                lineToRelative(-3.45f, -2.06f)
                close()
                moveTo(13f, 4.02f)
                curveToRelative(2.15f, 0.27f, 4.03f, 1.39f, 5.3f, 3.02f)
                lineToRelative(3.45f, -2.06f)
                curveTo(19.75f, 2.19f, 16.6f, 0.3f, 13f, 0f)
                lineTo(13f, 4.02f)
                close()
                moveTo(18f, 11.95f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
                moveTo(22.77f, 17.2f)
                curveToRelative(0.78f, -1.59f, 1.23f, -3.37f, 1.23f, -5.25f)
                reflectiveCurveToRelative(-0.45f, -3.66f, -1.23f, -5.25f)
                lineToRelative(-3.44f, 2.05f)
                curveToRelative(0.43f, 0.98f, 0.67f, 2.06f, 0.67f, 3.2f)
                reflectiveCurveToRelative(-0.24f, 2.22f, -0.67f, 3.2f)
                lineToRelative(3.45f, 2.05f)
                close()
                moveTo(18.3f, 16.86f)
                curveToRelative(-1.27f, 1.62f, -3.15f, 2.75f, -5.3f, 3.02f)
                verticalLineToRelative(4.02f)
                curveToRelative(3.6f, -0.3f, 6.75f, -2.19f, 8.75f, -4.98f)
                lineToRelative(-3.45f, -2.06f)
                close()
                moveTo(4.67f, 15.15f)
                curveToRelative(-0.43f, -0.98f, -0.67f, -2.06f, -0.67f, -3.2f)
                reflectiveCurveToRelative(0.24f, -2.22f, 0.67f, -3.2f)
                lineTo(1.23f, 6.7f)
                curveToRelative(-0.78f, 1.59f, -1.23f, 3.37f, -1.23f, 5.25f)
                reflectiveCurveToRelative(0.45f, 3.66f, 1.23f, 5.25f)
                lineToRelative(3.45f, -2.05f)
                close()
                moveTo(11f, 19.88f)
                curveToRelative(-2.15f, -0.27f, -4.03f, -1.39f, -5.3f, -3.02f)
                lineToRelative(-3.45f, 2.06f)
                curveToRelative(2.0f, 2.78f, 5.15f, 4.68f, 8.75f, 4.98f)
                verticalLineToRelative(-4.02f)
                close()
            }
        }.also { _Chip = it}
