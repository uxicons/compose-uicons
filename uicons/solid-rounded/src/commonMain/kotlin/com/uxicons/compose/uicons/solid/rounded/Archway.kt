package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Archway: ImageVector? = null

val Icons.Sr.Archway: ImageVector
    get() = _Archway ?: UXIcon(name = "Archway") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.34f, -2.01f, -4.21f, -4.4f, -3.98f)
                curveToRelative(-2.08f, 0.2f, -3.6f, 2.07f, -3.6f, 4.16f)
                verticalLineToRelative(5.82f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(1.59f, 6f)
                horizontalLineTo(22.41f)
                lineToRelative(0.89f, -0.88f)
                curveToRelative(0.69f, -0.69f, 0.9f, -1.72f, 0.52f, -2.63f)
                curveToRelative(-0.38f, -0.9f, -1.25f, -1.49f, -2.23f, -1.49f)
                horizontalLineTo(2.41f)
                curveTo(1.43f, 1f, 0.55f, 1.58f, 0.18f, 2.49f)
                curveTo(-0.2f, 3.39f, 0.01f, 4.42f, 0.7f, 5.12f)
                lineToRelative(0.89f, 0.88f)
                close()
            }
        }.also { _Archway = it}
