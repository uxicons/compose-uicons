package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeePot: ImageVector? = null

val Icons.Ts.CoffeePot: ImageVector
    get() = _CoffeePot ?: UXIcon(name = "CoffeePot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.19f, 1f)
                curveToRelative(0.57f, 1.16f, 2.81f, 6.06f, 2.81f, 12f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -7.05f, -3.08f, -12.77f, -3.2f, -13f)
                horizontalLineTo(2.27f)
                lineToRelative(2.12f, 5.45f)
                curveTo(3.68f, 6.65f, 0.47f, 12.48f, 0.0f, 21.37f)
                curveToRelative(-0.04f, 0.69f, 0.21f, 1.34f, 0.69f, 1.85f)
                curveToRelative(0.47f, 0.5f, 1.13f, 0.78f, 1.82f, 0.78f)
                horizontalLineTo(18.52f)
                curveToRelative(0.69f, 0f, 1.33f, -0.28f, 1.81f, -0.78f)
                curveToRelative(0.48f, -0.5f, 0.72f, -1.15f, 0.69f, -1.84f)
                curveToRelative(-0.42f, -9.17f, -3.51f, -15.09f, -4.02f, -16.02f)
                verticalLineTo(1f)
                horizontalLineToRelative(3.19f)
                close()
                moveTo(3.73f, 1f)
                horizontalLineToRelative(12.27f)
                verticalLineTo(5f)
                horizontalLineTo(5.29f)
                lineTo(3.73f, 1f)
                close()
                moveTo(20.02f, 21.43f)
                curveToRelative(0.02f, 0.41f, -0.13f, 0.8f, -0.41f, 1.1f)
                curveToRelative(-0.29f, 0.3f, -0.67f, 0.47f, -1.09f, 0.47f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.42f, 0f, -0.8f, -0.17f, -1.09f, -0.47f)
                curveToRelative(-0.29f, -0.3f, -0.43f, -0.69f, -0.41f, -1.11f)
                curveToRelative(0.17f, -3.24f, 0.72f, -6.08f, 1.39f, -8.42f)
                horizontalLineToRelative(14.61f)
                curveToRelative(-0.1f, -0.35f, -0.2f, -0.68f, -0.31f, -1f)
                horizontalLineTo(2.68f)
                curveToRelative(1.01f, -3.22f, 2.16f, -5.33f, 2.55f, -6f)
                horizontalLineToRelative(10.97f)
                curveToRelative(0.65f, 1.23f, 3.43f, 6.97f, 3.82f, 15.43f)
                close()
            }
        }.also { _CoffeePot = it}
