package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SuitcaseAlt: ImageVector? = null

val Icons.Ts.SuitcaseAlt: ImageVector
    get() = _SuitcaseAlt ?: UXIcon(name = "SuitcaseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 4f)
                horizontalLineToRelative(-3.5f)
                verticalLineTo(1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(7.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(6.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(7f, 1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(7f)
                verticalLineTo(1.5f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-5f)
                verticalLineTo(7f)
                horizontalLineToRelative(-1f)
                verticalLineTo(23f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineToRelative(-1f)
                verticalLineTo(23f)
                horizontalLineTo(1f)
                verticalLineTo(6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineTo(21.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineTo(23f)
                close()
            }
        }.also { _SuitcaseAlt = it}
