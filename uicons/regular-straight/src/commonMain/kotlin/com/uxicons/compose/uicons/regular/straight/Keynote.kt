package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Keynote: ImageVector? = null

val Icons.Rs.Keynote: ImageVector
    get() = _Keynote ?: UXIcon(name = "Keynote") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.28f)
                lineToRelative(-2f, -6f)
                horizontalLineTo(5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(0.18f)
                curveToRelative(0.41f, 1.16f, 1.51f, 2f, 2.82f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.3f, 0f, -2.4f, 0.84f, -2.82f, 2f)
                horizontalLineToRelative(-0.18f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(3.84f)
                lineToRelative(-1.72f, 5.16f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(11f)
                verticalLineToRelative(4f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(11f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(4.72f, 12f)
                horizontalLineToRelative(14.56f)
                lineToRelative(1.33f, 4f)
                horizontalLineTo(3.39f)
                lineToRelative(1.33f, -4f)
                close()
            }
        }.also { _Keynote = it}
