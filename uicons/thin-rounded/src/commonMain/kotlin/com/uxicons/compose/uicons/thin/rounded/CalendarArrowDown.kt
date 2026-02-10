package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarArrowDown: ImageVector? = null

val Icons.Tr.CalendarArrowDown: ImageVector
    get() = _CalendarArrowDown ?: UXIcon(name = "CalendarArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 2f)
                horizontalLineToRelative(-1.5f)
                lineTo(18f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                lineTo(7f, 2f)
                lineTo(7f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                curveTo(2.02f, 2f, 0f, 4.02f, 0f, 6.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(4.5f, 3f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 8f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(19.5f, 23f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-10.5f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(15.88f, 17.14f)
                curveToRelative(0.2f, 0.19f, 0.2f, 0.51f, 0.01f, 0.71f)
                lineToRelative(-2.52f, 2.57f)
                curveToRelative(-0.39f, 0.39f, -0.89f, 0.58f, -1.4f, 0.58f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.51f, 0f, -1.01f, -0.19f, -1.39f, -0.58f)
                lineToRelative(-2.52f, -2.57f)
                curveToRelative(-0.19f, -0.2f, -0.19f, -0.51f, 0.01f, -0.71f)
                curveToRelative(0.2f, -0.19f, 0.52f, -0.19f, 0.71f, 0.01f)
                lineToRelative(2.52f, 2.57f)
                curveToRelative(0.06f, 0.06f, 0.12f, 0.1f, 0.18f, 0.14f)
                lineToRelative(0.02f, -8.37f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                lineToRelative(-0.02f, 8.36f)
                curveToRelative(0.07f, -0.04f, 0.13f, -0.09f, 0.18f, -0.14f)
                lineToRelative(2.51f, -2.57f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.2f, 0.71f, -0.01f)
                close()
            }
        }.also { _CalendarArrowDown = it}
