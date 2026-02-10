package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Z: ImageVector? = null

val Icons.Ss.Z: ImageVector
    get() = _Z ?: UXIcon(name = "Z") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 24f)
                horizontalLineTo(4.39f)
                curveToRelative(-0.98f, 0f, -1.85f, -0.58f, -2.22f, -1.48f)
                curveToRelative(-0.37f, -0.9f, -0.17f, -1.93f, 0.52f, -2.62f)
                lineTo(19.9f, 2.69f)
                curveToRelative(0.17f, -0.17f, 0.13f, -0.35f, 0.09f, -0.44f)
                reflectiveCurveToRelative(-0.14f, -0.25f, -0.37f, -0.25f)
                horizontalLineTo(2f)
                verticalLineTo(0f)
                horizontalLineTo(19.61f)
                curveToRelative(0.98f, 0f, 1.85f, 0.58f, 2.22f, 1.48f)
                curveToRelative(0.37f, 0.9f, 0.17f, 1.93f, -0.52f, 2.62f)
                lineTo(4.1f, 21.31f)
                curveToRelative(-0.17f, 0.17f, -0.13f, 0.35f, -0.09f, 0.44f)
                reflectiveCurveToRelative(0.14f, 0.25f, 0.37f, 0.25f)
                horizontalLineTo(22f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Z = it}
