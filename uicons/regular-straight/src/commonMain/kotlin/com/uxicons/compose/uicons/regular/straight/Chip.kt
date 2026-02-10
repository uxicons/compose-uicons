package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chip: ImageVector? = null

val Icons.Rs.Chip: ImageVector
    get() = _Chip ?: UXIcon(name = "Chip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(18.46f, 9.31f)
                lineToRelative(2.59f, -1.54f)
                curveToRelative(0.6f, 1.29f, 0.95f, 2.71f, 0.95f, 4.23f)
                reflectiveCurveToRelative(-0.35f, 2.94f, -0.95f, 4.23f)
                lineToRelative(-2.59f, -1.54f)
                curveToRelative(0.34f, -0.83f, 0.54f, -1.73f, 0.54f, -2.69f)
                reflectiveCurveToRelative(-0.19f, -1.86f, -0.54f, -2.69f)
                close()
                moveTo(20.02f, 6.06f)
                lineToRelative(-2.59f, 1.54f)
                curveToRelative(-1.08f, -1.34f, -2.65f, -2.26f, -4.43f, -2.52f)
                lineTo(13f, 2.05f)
                curveToRelative(2.88f, 0.29f, 5.39f, 1.8f, 7.02f, 4.01f)
                close()
                moveTo(11f, 2.05f)
                verticalLineToRelative(3.03f)
                curveToRelative(-1.78f, 0.26f, -3.35f, 1.18f, -4.43f, 2.52f)
                lineToRelative(-2.59f, -1.54f)
                curveToRelative(1.64f, -2.2f, 4.15f, -3.72f, 7.02f, -4.01f)
                close()
                moveTo(2.95f, 7.77f)
                lineToRelative(2.59f, 1.54f)
                curveToRelative(-0.34f, 0.83f, -0.54f, 1.73f, -0.54f, 2.69f)
                reflectiveCurveToRelative(0.19f, 1.86f, 0.54f, 2.69f)
                lineToRelative(-2.59f, 1.54f)
                curveToRelative(-0.6f, -1.29f, -0.95f, -2.71f, -0.95f, -4.23f)
                reflectiveCurveToRelative(0.35f, -2.94f, 0.95f, -4.23f)
                close()
                moveTo(3.98f, 17.94f)
                lineToRelative(2.59f, -1.54f)
                curveToRelative(1.08f, 1.34f, 2.65f, 2.26f, 4.43f, 2.52f)
                verticalLineToRelative(3.03f)
                curveToRelative(-2.88f, -0.29f, -5.39f, -1.8f, -7.02f, -4.01f)
                close()
                moveTo(13f, 21.95f)
                verticalLineToRelative(-3.03f)
                curveToRelative(1.78f, -0.26f, 3.35f, -1.18f, 4.43f, -2.52f)
                lineToRelative(2.59f, 1.54f)
                curveToRelative(-1.64f, 2.2f, -4.15f, 3.72f, -7.02f, 4.01f)
                close()
            }
        }.also { _Chip = it}
