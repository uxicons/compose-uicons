package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gramophone: ImageVector? = null

val Icons.Ss.Gramophone: ImageVector
    get() = _Gramophone ?: UXIcon(name = "Gramophone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 20f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.18f, -0.52f, -2.23f, -1.34f, -2.96f)
                lineToRelative(0.2f, -0.04f)
                lineToRelative(-0.31f, -0.05f)
                curveToRelative(-0.69f, -0.58f, -1.58f, -0.95f, -2.55f, -0.95f)
                horizontalLineToRelative(-2.82f)
                curveToRelative(-0.77f, -0.15f, -8.29f, -1.67f, -11.18f, -5.59f)
                lineToRelative(-0.3f, -0.41f)
                horizontalLineToRelative(-1.7f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(1.7f)
                lineToRelative(0.3f, -0.41f)
                curveToRelative(2.89f, -3.93f, 10.41f, -5.45f, 11.18f, -5.59f)
                horizontalLineToRelative(2.82f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Gramophone = it}
