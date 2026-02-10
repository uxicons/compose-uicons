package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _R: ImageVector? = null

val Icons.Ss.R: ImageVector
    get() = _R ?: UXIcon(name = "R") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.01f, 24f)
                lineToRelative(-5.33f, -9.32f)
                curveToRelative(3.08f, -0.94f, 5.32f, -3.8f, 5.32f, -7.17f)
                curveToRelative(0f, -4.14f, -3.36f, -7.5f, -7.5f, -7.5f)
                horizontalLineTo(5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineTo(24f)
                horizontalLineToRelative(2f)
                verticalLineTo(15f)
                horizontalLineTo(14.5f)
                curveToRelative(0.02f, 0f, 0.04f, -0.0f, 0.06f, -0.0f)
                lineToRelative(5.14f, 9.0f)
                horizontalLineToRelative(2.3f)
                close()
                moveTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineTo(14.5f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                close()
            }
        }.also { _R = it}
