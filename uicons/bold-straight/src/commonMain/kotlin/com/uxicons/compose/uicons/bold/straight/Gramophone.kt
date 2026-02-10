package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gramophone: ImageVector? = null

val Icons.Bs.Gramophone: ImageVector
    get() = _Gramophone ?: UXIcon(name = "Gramophone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 19.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.25f)
                curveToRelative(2.35f, 0f, 4.25f, -1.9f, 4.25f, -4.25f)
                reflectiveCurveToRelative(-1.9f, -4.25f, -4.25f, -4.25f)
                horizontalLineToRelative(-2.57f)
                curveToRelative(-2.14f, -0.28f, -7.91f, -1.67f, -10.28f, -4.89f)
                lineToRelative(-0.45f, -0.61f)
                horizontalLineToRelative(-2.45f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(2.45f)
                lineToRelative(0.45f, -0.61f)
                curveToRelative(2.71f, -3.69f, 9.46f, -4.77f, 10.29f, -4.89f)
                horizontalLineToRelative(2.57f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-3.25f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(7f, 9.18f)
                verticalLineToRelative(-4.35f)
                curveToRelative(1.3f, 0.94f, 2.76f, 1.64f, 4.15f, 2.17f)
                curveToRelative(-1.39f, 0.53f, -2.85f, 1.24f, -4.15f, 2.17f)
                close()
                moveTo(19f, 21f)
                lineTo(5f, 21f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _Gramophone = it}
