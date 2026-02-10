package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupStraw: ImageVector? = null

val Icons.Tr.CupStraw: ImageVector
    get() = _CupStraw ?: UXIcon(name = "CupStraw") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 5f)
                horizontalLineToRelative(-9.06f)
                lineToRelative(0.34f, -2.69f)
                curveToRelative(0.1f, -0.75f, 0.73f, -1.31f, 1.49f, -1.31f)
                horizontalLineToRelative(4.24f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4.24f)
                curveToRelative(-1.26f, 0f, -2.32f, 0.94f, -2.48f, 2.19f)
                lineToRelative(-0.35f, 2.81f)
                lineTo(1.5f, 5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.06f)
                lineToRelative(1.66f, 14.03f)
                curveToRelative(0.27f, 2.27f, 2.19f, 3.97f, 4.47f, 3.97f)
                horizontalLineToRelative(6.64f)
                curveToRelative(2.28f, 0f, 4.2f, -1.71f, 4.47f, -3.97f)
                lineToRelative(1.66f, -14.03f)
                horizontalLineToRelative(1.06f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(18.8f, 19.91f)
                curveToRelative(-0.21f, 1.76f, -1.7f, 3.09f, -3.48f, 3.09f)
                horizontalLineToRelative(-6.64f)
                curveToRelative(-1.77f, 0f, -3.27f, -1.33f, -3.48f, -3.09f)
                lineToRelative(-1.64f, -13.91f)
                horizontalLineToRelative(16.88f)
                lineToRelative(-1.64f, 13.91f)
                close()
            }
        }.also { _CupStraw = it}
