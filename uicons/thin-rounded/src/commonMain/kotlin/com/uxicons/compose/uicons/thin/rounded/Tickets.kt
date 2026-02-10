package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tickets: ImageVector? = null

val Icons.Tr.Tickets: ImageVector
    get() = _Tickets ?: UXIcon(name = "Tickets") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.01f, 21f)
                curveToRelative(0.5f, 0f, 0.93f, -0.36f, 0.99f, -0.84f)
                curveToRelative(0.17f, -1.23f, 1.23f, -2.16f, 2.48f, -2.16f)
                reflectiveCurveToRelative(2.31f, 0.93f, 2.48f, 2.16f)
                curveToRelative(0.07f, 0.48f, 0.49f, 0.84f, 0.99f, 0.84f)
                horizontalLineToRelative(0.55f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(19f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-0.55f)
                curveToRelative(-0.5f, 0f, -0.93f, 0.36f, -0.99f, 0.84f)
                curveToRelative(-0.17f, 1.23f, -1.23f, 2.16f, -2.48f, 2.16f)
                reflectiveCurveToRelative(-2.31f, -0.93f, -2.48f, -2.16f)
                curveToRelative(-0.06f, -0.48f, -0.49f, -0.84f, -0.99f, -0.84f)
                horizontalLineToRelative(-0.51f)
                curveTo(4.02f, 0f, 2f, 2.02f, 2f, 4.5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(0.51f)
                close()
                moveTo(3f, 16.5f)
                lineTo(3f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineToRelative(0.51f, -0.03f)
                curveToRelative(0.23f, 1.73f, 1.73f, 3.02f, 3.47f, 3.02f)
                reflectiveCurveToRelative(3.23f, -1.3f, 3.47f, -3f)
                horizontalLineToRelative(0.55f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineToRelative(-0.55f, 0.03f)
                curveToRelative(-0.23f, -1.73f, -1.73f, -3.02f, -3.47f, -3.02f)
                reflectiveCurveToRelative(-3.23f, 1.3f, -3.47f, 3f)
                horizontalLineToRelative(-0.51f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(22f, 5.5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                lineTo(6.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(21f, 5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _Tickets = it}
