package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Keynote: ImageVector? = null

val Icons.Ts.Keynote: ImageVector
    get() = _Keynote ?: UXIcon(name = "Keynote") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 18f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1.65f)
                lineToRelative(-2.5f, -7f)
                horizontalLineTo(5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1.55f)
                curveToRelative(0.23f, 1.14f, 1.24f, 2f, 2.45f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.21f, 0f, -2.22f, 0.86f, -2.45f, 2f)
                horizontalLineToRelative(-1.55f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(3.91f)
                lineToRelative(-2.35f, 6.59f)
                horizontalLineTo(0f)
                verticalLineToRelative(1f)
                horizontalLineTo(11.5f)
                verticalLineToRelative(5f)
                horizontalLineTo(7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(12.5f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(2.71f, 17f)
                lineToRelative(2.14f, -6f)
                horizontalLineToRelative(14.29f)
                lineToRelative(2.14f, 6f)
                horizontalLineTo(2.71f)
                close()
            }
        }.also { _Keynote = it}
