package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blanket: ImageVector? = null

val Icons.Rs.Blanket: ImageVector
    get() = _Blanket ?: UXIcon(name = "Blanket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 16f)
                horizontalLineToRelative(19f)
                verticalLineTo(0f)
                horizontalLineTo(6f)
                curveTo(2.69f, 0f, 0f, 2.69f, 0f, 6f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(16f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineTo(5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(2f, 6f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineTo(5f)
                curveToRelative(-1.12f, 0f, -2.16f, 0.37f, -3f, 1.0f)
                verticalLineTo(6f)
                close()
            }
        }.also { _Blanket = it}
