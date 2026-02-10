package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LunchBox: ImageVector? = null

val Icons.Rs.LunchBox: ImageVector
    get() = _LunchBox ?: UXIcon(name = "LunchBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16f)
                horizontalLineToRelative(-1.35f)
                lineToRelative(-0.39f, -3.35f)
                curveToRelative(-0.18f, -1.51f, -1.46f, -2.65f, -2.98f, -2.65f)
                horizontalLineToRelative(-14.56f)
                curveToRelative(-1.52f, 0f, -2.8f, 1.14f, -2.98f, 2.65f)
                lineToRelative(-0.39f, 3.35f)
                horizontalLineToRelative(-1.35f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.35f)
                lineToRelative(0.39f, 3.35f)
                curveToRelative(0.18f, 1.51f, 1.46f, 2.65f, 2.98f, 2.65f)
                horizontalLineToRelative(14.56f)
                curveToRelative(1.52f, 0f, 2.8f, -1.14f, 2.98f, -2.65f)
                lineToRelative(0.39f, -3.35f)
                horizontalLineToRelative(1.35f)
                verticalLineToRelative(-2f)
                close()
                moveTo(3.73f, 12.88f)
                curveToRelative(0.06f, -0.5f, 0.49f, -0.88f, 0.99f, -0.88f)
                horizontalLineToRelative(14.56f)
                curveToRelative(0.51f, 0f, 0.94f, 0.38f, 0.99f, 0.88f)
                lineToRelative(0.37f, 3.12f)
                horizontalLineToRelative(-17.28f)
                close()
                moveTo(20.27f, 21.12f)
                curveToRelative(-0.06f, 0.5f, -0.49f, 0.88f, -0.99f, 0.88f)
                horizontalLineToRelative(-14.56f)
                curveToRelative(-0.51f, 0f, -0.94f, -0.38f, -0.99f, -0.88f)
                lineToRelative(-0.37f, -3.12f)
                horizontalLineToRelative(5.86f)
                lineToRelative(0.5f, 2f)
                horizontalLineToRelative(4.56f)
                lineToRelative(0.5f, -2f)
                horizontalLineToRelative(5.86f)
                lineToRelative(-0.37f, 3.12f)
                close()
                moveTo(8f, 8f)
                curveToRelative(1.86f, 0f, 3.41f, -1.28f, 3.86f, -3f)
                horizontalLineToRelative(10.14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-10.14f)
                curveToRelative(-0.45f, -1.72f, -2.0f, -3f, -3.86f, -3f)
                curveToRelative(-2.06f, 0f, -6f, 1.56f, -6f, 4f)
                reflectiveCurveToRelative(3.94f, 4f, 6f, 4f)
                close()
                moveTo(8f, 2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                curveToRelative(-1.5f, 0f, -4f, -1.25f, -4f, -2f)
                reflectiveCurveToRelative(2.5f, -2f, 4f, -2f)
                close()
            }
        }.also { _LunchBox = it}
