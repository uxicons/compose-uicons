package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _R: ImageVector? = null

val Icons.Ts.R: ImageVector
    get() = _R ?: UXIcon(name = "R") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.01f, 24f)
                lineToRelative(-5.78f, -10.11f)
                curveToRelative(3.27f, -0.58f, 5.77f, -3.45f, 5.77f, -6.89f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                horizontalLineTo(4.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineTo(24f)
                horizontalLineToRelative(1f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                curveToRelative(0.05f, 0f, 0.09f, 0f, 0.14f, -0.0f)
                lineToRelative(5.72f, 10.0f)
                horizontalLineToRelative(1.15f)
                close()
                moveTo(3f, 13f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineTo(15f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                horizontalLineTo(3f)
                close()
            }
        }.also { _R = it}
