package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Z: ImageVector? = null

val Icons.Bs.Z: ImageVector
    get() = _Z ?: UXIcon(name = "Z") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 24f)
                lineTo(4.84f, 24f)
                curveToRelative(-1.15f, 0f, -2.18f, -0.69f, -2.62f, -1.75f)
                reflectiveCurveToRelative(-0.2f, -2.28f, 0.62f, -3.09f)
                lineTo(18.77f, 3f)
                lineTo(2f, 3f)
                lineTo(2f, 0f)
                lineTo(19.16f, 0f)
                curveToRelative(1.15f, 0f, 2.18f, 0.69f, 2.62f, 1.75f)
                reflectiveCurveToRelative(0.2f, 2.28f, -0.62f, 3.09f)
                lineTo(5.23f, 21f)
                lineTo(22f, 21f)
                verticalLineToRelative(3f)
                close()
                moveTo(4.96f, 21.27f)
                horizontalLineToRelative(0f)
                close()
                moveTo(19.04f, 2.73f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _Z = it}
