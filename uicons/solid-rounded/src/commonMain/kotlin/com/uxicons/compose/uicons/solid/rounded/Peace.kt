package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Peace: ImageVector? = null

val Icons.Sr.Peace: ImageVector
    get() = _Peace ?: UXIcon(name = "Peace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 1.86f, -0.52f, 3.6f, -1.41f, 5.1f)
                lineToRelative(-7.59f, -7.59f)
                lineTo(13f, 2.05f)
                curveToRelative(5.05f, 0.5f, 9f, 4.77f, 9f, 9.95f)
                close()
                moveTo(11f, 2.05f)
                verticalLineToRelative(7.42f)
                lineToRelative(-7.6f, 7.6f)
                curveToRelative(-0.88f, -1.49f, -1.4f, -3.22f, -1.4f, -5.07f)
                curveTo(2f, 6.82f, 5.95f, 2.55f, 11f, 2.05f)
                close()
                moveTo(4.6f, 18.7f)
                lineToRelative(6.4f, -6.4f)
                verticalLineToRelative(9.65f)
                curveToRelative(-2.53f, -0.25f, -4.78f, -1.46f, -6.4f, -3.25f)
                close()
                moveTo(13f, 21.95f)
                verticalLineToRelative(-9.61f)
                lineToRelative(6.38f, 6.38f)
                curveToRelative(-1.62f, 1.78f, -3.86f, 2.98f, -6.38f, 3.23f)
                close()
            }
        }.also { _Peace = it}
