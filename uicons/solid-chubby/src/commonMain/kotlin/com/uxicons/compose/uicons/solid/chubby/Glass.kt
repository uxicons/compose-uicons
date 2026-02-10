package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Glass: ImageVector? = null

val Icons.Sc.Glass: ImageVector
    get() = _Glass ?: UXIcon(name = "Glass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.18f, 1.85f)
                curveToRelative(-0.17f, -0.04f, -4.31f, -0.85f, -9.19f, -0.85f)
                reflectiveCurveTo(2.99f, 1.82f, 2.81f, 1.85f)
                curveToRelative(-0.51f, 0.1f, -0.85f, 0.57f, -0.8f, 1.09f)
                lineToRelative(0.51f, 4.62f)
                horizontalLineTo(15.3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineTo(2.75f)
                lineToRelative(1.3f, 11.71f)
                curveToRelative(0.04f, 0.37f, 0.28f, 0.69f, 0.63f, 0.82f)
                curveToRelative(0.09f, 0.04f, 2.35f, 0.9f, 7.32f, 0.9f)
                reflectiveCurveToRelative(7.23f, -0.87f, 7.32f, -0.9f)
                curveToRelative(0.34f, -0.14f, 0.59f, -0.45f, 0.63f, -0.82f)
                lineTo(21.98f, 2.94f)
                curveToRelative(0.06f, -0.52f, -0.29f, -0.99f, -0.8f, -1.09f)
                close()
            }
        }.also { _Glass = it}
