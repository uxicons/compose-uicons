package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Airplay: ImageVector? = null

val Icons.Ss.Airplay: ImageVector
    get() = _Airplay ?: UXIcon(name = "Airplay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.61f, 23f)
                horizontalLineTo(2.39f)
                lineToRelative(7.3f, -8.91f)
                curveToRelative(0.58f, -0.69f, 1.42f, -1.09f, 2.31f, -1.09f)
                horizontalLineToRelative(0f)
                curveToRelative(0.89f, 0f, 1.73f, 0.39f, 2.3f, 1.08f)
                lineToRelative(7.31f, 8.92f)
                close()
                moveTo(3.08f, 19f)
                lineToRelative(5.06f, -6.18f)
                curveToRelative(0.97f, -1.16f, 2.37f, -1.82f, 3.86f, -1.82f)
                reflectiveCurveToRelative(2.89f, 0.66f, 3.84f, 1.8f)
                lineToRelative(5.08f, 6.2f)
                horizontalLineToRelative(3.08f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineTo(3f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(3.08f)
                close()
            }
        }.also { _Airplay = it}
