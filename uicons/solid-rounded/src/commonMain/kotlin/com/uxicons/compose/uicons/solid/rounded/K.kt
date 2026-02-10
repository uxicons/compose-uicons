package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _K: ImageVector? = null

val Icons.Sr.K: ImageVector
    get() = _K ?: UXIcon(name = "K") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.78f, 22.38f)
                lineToRelative(-7.54f, -9.43f)
                lineTo(21.83f, 1.55f)
                curveToRelative(0.31f, -0.46f, 0.18f, -1.08f, -0.28f, -1.39f)
                curveToRelative(-0.46f, -0.31f, -1.08f, -0.18f, -1.39f, 0.28f)
                lineToRelative(-7.7f, 11.55f)
                horizontalLineTo(4f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineTo(12.98f)
                curveToRelative(0f, 0.01f, -0.0f, 0.01f, -0.0f, 0.02f)
                curveToRelative(0f, 0.01f, 0.0f, 0.01f, 0.0f, 0.02f)
                verticalLineToRelative(9.98f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(14f)
                horizontalLineTo(12.52f)
                lineToRelative(7.7f, 9.62f)
                curveToRelative(0.2f, 0.25f, 0.49f, 0.38f, 0.78f, 0.38f)
                curveToRelative(0.22f, 0f, 0.44f, -0.07f, 0.62f, -0.22f)
                curveToRelative(0.43f, -0.35f, 0.5f, -0.97f, 0.16f, -1.41f)
                close()
            }
        }.also { _K = it}
