package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hacker: ImageVector? = null

val Icons.Ss.Hacker: ImageVector
    get() = _Hacker ?: UXIcon(name = "Hacker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.54f, 7f)
                horizontalLineToRelative(-2.54f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                horizontalLineToRelative(-2.56f)
                curveToRelative(-0.25f, -2.24f, -2.14f, -4f, -4.45f, -4f)
                reflectiveCurveToRelative(-4.2f, 1.76f, -4.45f, 4f)
                close()
                moveTo(9.54f, 7f)
                horizontalLineToRelative(4.9f)
                curveToRelative(-0.23f, -1.14f, -1.24f, -2f, -2.45f, -2f)
                reflectiveCurveToRelative(-2.22f, 0.86f, -2.45f, 2f)
                close()
                moveTo(17f, 12f)
                lineTo(24f, 24f)
                horizontalLineToRelative(-14f)
                close()
                moveTo(18f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(18f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(22.44f, 17.35f)
                lineTo(23.08f, 9f)
                horizontalLineToRelative(-5.51f)
                lineToRelative(4.87f, 8.35f)
                close()
                moveTo(16.43f, 9f)
                horizontalLineToRelative(-15.52f)
                lineToRelative(0.77f, 10f)
                horizontalLineToRelative(-1.69f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(4.68f)
                close()
            }
        }.also { _Hacker = it}
