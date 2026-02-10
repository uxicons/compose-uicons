package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Undo: ImageVector? = null

val Icons.Tr.Undo: ImageVector
    get() = _Undo ?: UXIcon(name = "Undo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                curveTo(5.55f, 24f, 0.29f, 18.96f, 0.01f, 12.52f)
                curveToRelative(-0.01f, -0.28f, 0.2f, -0.51f, 0.48f, -0.52f)
                curveToRelative(0.27f, 0.01f, 0.51f, 0.2f, 0.52f, 0.48f)
                curveToRelative(0.25f, 5.9f, 5.08f, 10.52f, 10.99f, 10.52f)
                curveToRelative(6.07f, 0f, 11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                curveToRelative(-3.75f, 0f, -7.16f, 1.87f, -9.2f, 5f)
                horizontalLineTo(7.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineTo(0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(5.4f)
                curveTo(4.23f, 2.02f, 7.93f, 0f, 12f, 0f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                close()
            }
        }.also { _Undo = it}
