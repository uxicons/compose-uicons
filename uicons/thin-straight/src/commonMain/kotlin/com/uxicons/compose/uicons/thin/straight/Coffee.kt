package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coffee: ImageVector? = null

val Icons.Ts.Coffee: ImageVector
    get() = _Coffee ?: UXIcon(name = "Coffee") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.55f)
                curveToRelative(-0.23f, -1.14f, -1.24f, -2f, -2.45f, -2f)
                lineTo(6.5f, 0f)
                curveToRelative(-1.21f, 0f, -2.22f, 0.86f, -2.45f, 2f)
                horizontalLineToRelative(-0.55f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(1.05f)
                lineToRelative(2f, 17f)
                horizontalLineToRelative(15.89f)
                lineToRelative(2f, -17f)
                horizontalLineToRelative(1.06f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(19.06f, 23f)
                lineTo(4.95f, 23f)
                lineToRelative(-0.94f, -8f)
                horizontalLineToRelative(4.52f)
                curveToRelative(0.19f, 2.25f, 1.68f, 4f, 3.48f, 4f)
                reflectiveCurveToRelative(3.28f, -1.75f, 3.48f, -4f)
                horizontalLineToRelative(4.52f)
                lineToRelative(-0.94f, 8f)
                close()
                moveTo(9.5f, 14.5f)
                curveToRelative(0f, -1.93f, 1.12f, -3.5f, 2.5f, -3.5f)
                reflectiveCurveToRelative(2.5f, 1.57f, 2.5f, 3.5f)
                reflectiveCurveToRelative(-1.12f, 3.5f, -2.5f, 3.5f)
                reflectiveCurveToRelative(-2.5f, -1.57f, -2.5f, -3.5f)
                close()
                moveTo(20.11f, 14f)
                horizontalLineToRelative(-4.64f)
                curveToRelative(-0.19f, -2.25f, -1.68f, -4f, -3.48f, -4f)
                reflectiveCurveToRelative(-3.28f, 1.75f, -3.48f, 4f)
                lineTo(3.89f, 14f)
                lineToRelative(-0.82f, -7f)
                horizontalLineToRelative(17.88f)
                lineToRelative(-0.82f, 7f)
                close()
                moveTo(22f, 6f)
                lineTo(2f, 6f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _Coffee = it}
