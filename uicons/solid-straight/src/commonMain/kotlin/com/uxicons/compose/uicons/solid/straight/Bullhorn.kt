package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bullhorn: ImageVector? = null

val Icons.Ss.Bullhorn: ImageVector
    get() = _Bullhorn ?: UXIcon(name = "Bullhorn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.78f, 20.19f)
                curveToRelative(0.36f, 0.8f, 0.28f, 1.78f, -0.23f, 2.56f)
                curveToRelative(-0.51f, 0.78f, -1.37f, 1.25f, -2.31f, 1.25f)
                horizontalLineToRelative(-1.44f)
                lineToRelative(-2.55f, -7f)
                horizontalLineToRelative(5.34f)
                lineToRelative(1.2f, 3.19f)
                close()
                moveTo(7f, 4f)
                lineTo(3f, 4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(4f)
                lineTo(7f, 4f)
                close()
                moveTo(22f, 7.05f)
                lineTo(22f, 0f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 2.73f, -3.88f, 4f, -6.5f, 4f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(4.5f)
                curveToRelative(2.62f, 0f, 6.5f, 1.27f, 6.5f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.05f)
                curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
                reflectiveCurveToRelative(-0.86f, -2.22f, -2f, -2.45f)
                close()
            }
        }.also { _Bullhorn = it}
