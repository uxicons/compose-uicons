package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarStar: ImageVector? = null

val Icons.Rr.CalendarStar: ImageVector
    get() = _CalendarStar ?: UXIcon(name = "CalendarStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                curveTo(2.24f, 2f, 0f, 4.24f, 0f, 7f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(5f, 4f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                lineTo(2f, 8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(19f, 22f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(16.4f, 15.35f)
                curveToRelative(0f, 0.38f, -0.26f, 0.7f, -0.57f, 0.87f)
                lineToRelative(-1.56f, 0.87f)
                lineToRelative(0.69f, 1.89f)
                curveToRelative(0.13f, 0.37f, 0.01f, 0.78f, -0.3f, 1.01f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.32f, 0.24f, -0.76f, 0.24f, -1.07f, -0.01f)
                lineToRelative(-1.56f, -1.2f)
                lineToRelative(-1.56f, 1.2f)
                curveToRelative(-0.32f, 0.24f, -0.76f, 0.25f, -1.07f, 0.01f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.31f, -0.23f, -0.43f, -0.65f, -0.3f, -1.01f)
                lineToRelative(0.69f, -1.89f)
                lineToRelative(-1.56f, -0.87f)
                curveToRelative(-0.3f, -0.17f, -0.57f, -0.49f, -0.57f, -0.87f)
                curveToRelative(0f, -0.32f, 0.28f, -0.68f, 0.73f, -0.68f)
                horizontalLineToRelative(2.25f)
                lineToRelative(0.6f, -2.28f)
                curveToRelative(0.09f, -0.36f, 0.42f, -0.61f, 0.79f, -0.62f)
                curveToRelative(0.37f, 0.01f, 0.7f, 0.26f, 0.79f, 0.62f)
                lineToRelative(0.6f, 2.28f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.45f, 0f, 0.73f, 0.35f, 0.73f, 0.68f)
                close()
            }
        }.also { _CalendarStar = it}
