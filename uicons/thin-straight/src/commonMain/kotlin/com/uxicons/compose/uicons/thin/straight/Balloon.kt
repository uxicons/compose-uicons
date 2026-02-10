package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Balloon: ImageVector? = null

val Icons.Ts.Balloon: ImageVector
    get() = _Balloon ?: UXIcon(name = "Balloon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 9.28f)
                curveTo(22f, 4.16f, 17.51f, 0f, 12f, 0f)
                reflectiveCurveTo(2f, 4.16f, 2f, 9.28f)
                curveToRelative(0f, 5.52f, 3.62f, 11.65f, 8.66f, 12.59f)
                curveToRelative(-0.4f, 0.46f, -0.66f, 1.07f, -0.66f, 1.62f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.56f, -0.25f, -1.17f, -0.66f, -1.62f)
                curveToRelative(5.04f, -0.94f, 8.66f, -7.07f, 8.66f, -12.59f)
                close()
                moveTo(11.12f, 23f)
                curveToRelative(0.18f, -0.41f, 0.54f, -0.8f, 0.88f, -0.8f)
                reflectiveCurveToRelative(0.7f, 0.39f, 0.88f, 0.8f)
                horizontalLineToRelative(-1.77f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-5.07f, 0f, -9f, -6.3f, -9f, -11.72f)
                curveTo(3f, 4.72f, 7.04f, 1f, 12f, 1f)
                reflectiveCurveToRelative(9f, 3.72f, 9f, 8.28f)
                curveToRelative(0f, 5.42f, -3.93f, 11.72f, -9f, 11.72f)
                close()
                moveTo(17f, 10.02f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 2.12f, -0.92f, 4.35f, -2.39f, 5.83f)
                lineToRelative(-0.71f, -0.7f)
                curveToRelative(1.28f, -1.28f, 2.1f, -3.29f, 2.1f, -5.13f)
                close()
            }
        }.also { _Balloon = it}
