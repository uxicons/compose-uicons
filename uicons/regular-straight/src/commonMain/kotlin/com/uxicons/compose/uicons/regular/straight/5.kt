package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rs5: ImageVector? = null

val Icons.Rs.Rs5: ImageVector
    get() = _Rs5 ?: UXIcon(name = "Rs5") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 24f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                horizontalLineTo(12.5f)
                curveToRelative(1.5f, 0f, 2.9f, -0.59f, 3.95f, -1.67f)
                reflectiveCurveToRelative(1.6f, -2.5f, 1.55f, -4f)
                curveToRelative(-0.09f, -2.94f, -2.68f, -5.33f, -5.77f, -5.33f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(12f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6.23f)
                curveToRelative(4.16f, 0f, 7.65f, 3.26f, 7.77f, 7.27f)
                curveToRelative(0.06f, 2.05f, -0.69f, 3.98f, -2.11f, 5.45f)
                curveToRelative(-1.43f, 1.47f, -3.34f, 2.28f, -5.38f, 2.28f)
                close()
            }
        }.also { _Rs5 = it}
