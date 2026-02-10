package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Picnic: ImageVector? = null

val Icons.Ts.Picnic: ImageVector
    get() = _Picnic ?: UXIcon(name = "Picnic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.94f, 8f)
                curveTo(20.45f, 3.51f, 16.62f, 0f, 12f, 0f)
                reflectiveCurveTo(3.56f, 3.51f, 3.06f, 8f)
                lineTo(0.01f, 8f)
                lineToRelative(1.84f, 13.83f)
                curveToRelative(0.17f, 1.24f, 1.23f, 2.17f, 2.48f, 2.17f)
                horizontalLineToRelative(15.31f)
                curveToRelative(1.25f, 0f, 2.31f, -0.93f, 2.48f, -2.17f)
                lineToRelative(1.84f, -13.83f)
                horizontalLineToRelative(-3.03f)
                close()
                moveTo(12f, 1f)
                curveToRelative(4.07f, 0f, 7.44f, 3.06f, 7.94f, 7f)
                lineTo(4.06f, 8f)
                curveToRelative(0.49f, -3.94f, 3.87f, -7f, 7.94f, -7f)
                close()
                moveTo(19.68f, 9f)
                lineToRelative(-5.68f, 5.68f)
                lineToRelative(-5.68f, -5.68f)
                horizontalLineToRelative(11.37f)
                close()
                moveTo(21.14f, 21.7f)
                curveToRelative(-0.1f, 0.74f, -0.74f, 1.3f, -1.49f, 1.3f)
                lineTo(4.34f, 23f)
                curveToRelative(-0.75f, 0f, -1.39f, -0.56f, -1.49f, -1.3f)
                lineTo(1.16f, 9f)
                lineTo(6.9f, 9f)
                lineToRelative(7.1f, 7.1f)
                lineToRelative(7.1f, -7.1f)
                horizontalLineToRelative(1.74f)
                lineToRelative(-1.69f, 12.7f)
                close()
            }
        }.also { _Picnic = it}
