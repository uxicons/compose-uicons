package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comet: ImageVector? = null

val Icons.Bs.Comet: ImageVector
    get() = _Comet ?: UXIcon(name = "Comet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.49f, 24f)
                curveToRelative(-2.27f, 0f, -4.4f, -0.88f, -6.01f, -2.49f)
                reflectiveCurveTo(0f, 17.77f, 0f, 15.51f)
                curveTo(0f, 8.43f, 6.18f, 4.44f, 10.69f, 1.53f)
                lineTo(13f, 0.04f)
                lineTo(13f, 4.15f)
                curveTo(17.23f, 2.05f, 21.09f, 0.92f, 21.28f, 0.86f)
                lineTo(23.89f, 0.1f)
                lineToRelative(-0.76f, 2.62f)
                curveToRelative(-0.06f, 0.19f, -1.18f, 4.05f, -3.28f, 8.28f)
                horizontalLineToRelative(4.16f)
                lineToRelative(-1.49f, 2.31f)
                curveToRelative(-2.75f, 4.26f, -6.9f, 10.69f, -14.02f, 10.69f)
                close()
                moveTo(10f, 5.59f)
                curveToRelative(-4.0f, 2.77f, -7f, 5.67f, -7f, 9.91f)
                curveToRelative(0f, 1.47f, 0.57f, 2.85f, 1.61f, 3.89f)
                reflectiveCurveToRelative(2.42f, 1.61f, 3.89f, 1.61f)
                curveToRelative(4.25f, 0f, 7.24f, -3.1f, 9.96f, -7f)
                horizontalLineToRelative(-3.68f)
                lineToRelative(1.28f, -2.25f)
                curveToRelative(1.44f, -2.51f, 2.53f, -5.14f, 3.25f, -7.05f)
                curveToRelative(-1.92f, 0.71f, -4.55f, 1.81f, -7.05f, 3.24f)
                lineToRelative(-2.25f, 1.28f)
                verticalLineToRelative(-3.64f)
                close()
                moveTo(9f, 18f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                close()
            }
        }.also { _Comet = it}
