package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mound: ImageVector? = null

val Icons.Tr.Mound: ImageVector
    get() = _Mound ?: UXIcon(name = "Mound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.67f, 19.83f)
                lineToRelative(-4.2f, -8.25f)
                curveToRelative(-1.44f, -2.83f, -4.3f, -4.58f, -7.47f, -4.58f)
                reflectiveCurveToRelative(-6.03f, 1.76f, -7.47f, 4.58f)
                lineTo(0.33f, 19.83f)
                curveToRelative(-0.47f, 0.89f, -0.44f, 1.93f, 0.08f, 2.8f)
                curveToRelative(0.52f, 0.86f, 1.43f, 1.38f, 2.43f, 1.38f)
                horizontalLineToRelative(18.32f)
                curveToRelative(1.0f, 0f, 1.91f, -0.51f, 2.43f, -1.38f)
                curveToRelative(0.52f, -0.86f, 0.55f, -1.91f, 0.08f, -2.79f)
                close()
                moveTo(22.73f, 22.11f)
                curveToRelative(-0.34f, 0.56f, -0.92f, 0.89f, -1.57f, 0.89f)
                lineTo(2.84f, 23f)
                curveToRelative(-0.65f, 0f, -1.24f, -0.33f, -1.57f, -0.89f)
                curveToRelative(-0.34f, -0.56f, -0.35f, -1.24f, -0.05f, -1.82f)
                curveToRelative(0f, -0.0f, 0.0f, -0.01f, 0.0f, -0.01f)
                lineToRelative(4.2f, -8.25f)
                curveToRelative(1.28f, -2.53f, 3.75f, -4.04f, 6.58f, -4.04f)
                reflectiveCurveToRelative(5.29f, 1.51f, 6.58f, 4.04f)
                lineToRelative(4.2f, 8.26f)
                curveToRelative(0.31f, 0.58f, 0.29f, 1.26f, -0.05f, 1.82f)
                close()
            }
        }.also { _Mound = it}
