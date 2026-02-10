package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CruzeiroSign: ImageVector? = null

val Icons.Bs.CruzeiroSign: ImageVector
    get() = _CruzeiroSign ?: UXIcon(name = "CruzeiroSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.35f, 17.16f)
                lineToRelative(2.67f, 1.38f)
                curveToRelative(-1.74f, 3.37f, -5.18f, 5.46f, -8.97f, 5.46f)
                horizontalLineToRelative(-0.95f)
                curveToRelative(-5.56f, 0f, -10.09f, -4.53f, -10.09f, -10.09f)
                verticalLineToRelative(-3.82f)
                curveTo(2f, 4.53f, 6.53f, 0f, 12.09f, 0f)
                horizontalLineToRelative(0.95f)
                curveToRelative(3.86f, 0f, 7.32f, 2.15f, 9.04f, 5.6f)
                lineToRelative(-2.69f, 1.34f)
                curveToRelative(-1.21f, -2.43f, -3.64f, -3.94f, -6.35f, -3.94f)
                horizontalLineToRelative(-0.95f)
                curveToRelative(-3.91f, 0f, -7.09f, 3.18f, -7.09f, 7.09f)
                verticalLineToRelative(3.82f)
                curveToRelative(0f, 2.8f, 1.63f, 5.23f, 4f, 6.38f)
                verticalLineTo(10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.02f)
                curveToRelative(1.01f, -0.65f, 2.21f, -1.02f, 3.5f, -1.02f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                reflectiveCurveToRelative(0.06f, 0f, 0.09f, 0f)
                horizontalLineToRelative(0.95f)
                curveToRelative(2.66f, 0f, 5.08f, -1.47f, 6.3f, -3.84f)
                close()
            }
        }.also { _CruzeiroSign = it}
