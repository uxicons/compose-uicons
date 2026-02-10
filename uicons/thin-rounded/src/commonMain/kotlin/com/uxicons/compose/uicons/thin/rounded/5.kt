package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tr5: ImageVector? = null

val Icons.Tr.Tr5: ImageVector
    get() = _Tr5 ?: UXIcon(name = "Tr5") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 24f)
                horizontalLineTo(4.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineTo(13f)
                curveToRelative(1.64f, 0f, 3.17f, -0.65f, 4.31f, -1.82f)
                curveToRelative(1.14f, -1.17f, 1.74f, -2.72f, 1.69f, -4.36f)
                curveToRelative(-0.1f, -3.21f, -2.91f, -5.82f, -6.27f, -5.82f)
                horizontalLineTo(4.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(7.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(7.73f)
                curveToRelative(3.9f, 0f, 7.16f, 3.04f, 7.27f, 6.79f)
                curveToRelative(0.06f, 1.91f, -0.64f, 3.72f, -1.97f, 5.09f)
                curveToRelative(-1.33f, 1.37f, -3.11f, 2.12f, -5.02f, 2.12f)
                close()
            }
        }.also { _Tr5 = it}
