package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gramophone: ImageVector? = null

val Icons.Ts.Gramophone: ImageVector
    get() = _Gramophone ?: UXIcon(name = "Gramophone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 20.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3.36f)
                curveToRelative(-0.76f, -0.19f, -9.01f, -2.34f, -12.04f, -6.78f)
                lineToRelative(-0.15f, -0.22f)
                horizontalLineToRelative(-0.95f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(0.95f)
                lineToRelative(0.15f, -0.22f)
                curveToRelative(3.03f, -4.44f, 11.28f, -6.59f, 12.04f, -6.78f)
                horizontalLineToRelative(3.36f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                lineTo(4.5f, 18f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(5f, 13.29f)
                lineTo(5f, 1.71f)
                curveToRelative(2.75f, 3.12f, 7.64f, 4.98f, 10.24f, 5.79f)
                curveToRelative(-2.6f, 0.81f, -7.49f, 2.67f, -10.24f, 5.79f)
                close()
                moveTo(3f, 20.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                lineTo(3f, 23f)
                verticalLineToRelative(-2.5f)
                close()
            }
        }.also { _Gramophone = it}
