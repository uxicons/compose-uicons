package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eject: ImageVector? = null

val Icons.Rr.Eject: ImageVector
    get() = _Eject ?: UXIcon(name = "Eject") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(0.43f, 15.81f)
                curveTo(0.14f, 15.23f, -0.01f, 14.62f, -0.01f, 13.99f)
                curveToRelative(0f, -0.84f, 0.27f, -1.66f, 0.78f, -2.35f)
                lineTo(8.83f, 2.56f)
                curveToRelative(0.7f, -0.96f, 1.88f, -1.56f, 3.17f, -1.56f)
                curveToRelative(1.27f, 0f, 2.43f, 0.58f, 3.19f, 1.59f)
                lineToRelative(7.96f, 8.97f)
                curveToRelative(0.97f, 1.31f, 1.1f, 2.87f, 0.4f, 4.25f)
                curveToRelative(-0.69f, 1.37f, -2.03f, 2.19f, -3.57f, 2.19f)
                lineTo(4f, 18f)
                curveToRelative(-1.54f, 0f, -2.87f, -0.82f, -3.57f, -2.19f)
                close()
                moveTo(1.99f, 13.99f)
                curveToRelative(0f, 0.31f, 0.08f, 0.62f, 0.23f, 0.91f)
                curveToRelative(0.35f, 0.7f, 1.0f, 1.09f, 1.78f, 1.09f)
                horizontalLineToRelative(15.99f)
                curveToRelative(0.78f, 0f, 1.43f, -0.4f, 1.78f, -1.09f)
                curveToRelative(0.35f, -0.7f, 0.29f, -1.46f, -0.17f, -2.08f)
                lineTo(13.61f, 3.82f)
                curveToRelative(-0.38f, -0.52f, -0.97f, -0.82f, -1.61f, -0.82f)
                reflectiveCurveToRelative(-1.23f, 0.3f, -1.61f, 0.82f)
                lineTo(2.33f, 12.89f)
                curveToRelative(-0.2f, 0.28f, -0.34f, 0.69f, -0.34f, 1.1f)
                close()
            }
        }.also { _Eject = it}
