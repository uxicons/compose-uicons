package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Airplay: ImageVector? = null

val Icons.Rs.Airplay: ImageVector
    get() = _Airplay ?: UXIcon(name = "Airplay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-3.08f)
                lineToRelative(-1.64f, -2f)
                horizontalLineToRelative(2.72f)
                lineTo(22f, 4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2.72f)
                lineToRelative(-1.64f, 2f)
                lineTo(0f, 19f)
                lineTo(0f, 4f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(14.3f, 14.08f)
                lineToRelative(7.31f, 8.92f)
                lineTo(2.39f, 23f)
                lineToRelative(7.3f, -8.91f)
                curveToRelative(0.58f, -0.69f, 1.42f, -1.09f, 2.31f, -1.09f)
                horizontalLineToRelative(0f)
                curveToRelative(0.89f, 0f, 1.73f, 0.39f, 2.3f, 1.08f)
                close()
                moveTo(17.39f, 21f)
                lineToRelative(-4.62f, -5.65f)
                curveToRelative(-0.26f, -0.31f, -0.59f, -0.35f, -0.76f, -0.35f)
                reflectiveCurveToRelative(-0.51f, 0.05f, -0.77f, 0.36f)
                lineToRelative(-4.62f, 5.64f)
                horizontalLineToRelative(10.78f)
                close()
            }
        }.also { _Airplay = it}
